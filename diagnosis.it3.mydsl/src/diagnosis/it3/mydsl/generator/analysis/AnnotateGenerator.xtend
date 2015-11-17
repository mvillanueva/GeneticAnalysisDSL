package diagnosis.it3.mydsl.generator.analysis

import diagnosis.Annotation
import diagnosis.it3.mydsl.generator.galaxy.GalaxyHelper
import diagnosis.PredictionAlgorithm

class AnnotateGenerator {
	GalaxyHelper galaxy=GalaxyHelper.getGalaxyHelper()
	
	def annotateVariations(Annotation annotation){
		/*Annotations */
		var hgvs=false
		var gene=false
		var rsId=false
		var transcript=false
		var maf=false
		var sift=false
		var polyphen=false
		
		if(annotation.hgvs!=null) hgvs=true
		if(annotation.gene!=null) gene=true
		if(annotation.rsId!=null) rsId=true
		if(annotation.transcript!=null) transcript=true
		if(annotation.maf!=null) maf=true
		for (prediction:annotation.prediction){
			if(prediction.algorithm.equals(PredictionAlgorithm.SIFT)) sift=true
			else if (prediction.algorithm.equals(PredictionAlgorithm.POLYPHEN)) polyphen=true
		}
		chooseAnnotationArtefacts(hgvs, gene, rsId, transcript,maf,sift, polyphen)
	}
	
	
	/*Choose the tool that annotates each annotation: 
		 * - false means that the tool is able to annotate the annotation 
		 	but we don't use it at the moment
	*/
	def chooseAnnotationArtefacts(boolean hgvs, boolean gene, boolean rsId, boolean transcript,
		boolean maf, boolean sift, boolean polyphen)'''«
		
		//Dna, Coding and gene
		IF hgvs || gene»« 
			annotateVariationsSNPEFF(hgvs,hgvs,false, gene)»«
		ENDIF»«
		
		//Protein
		IF hgvs || transcript || sift ||polyphen»«
			//Separator between tools
			IF hgvs ||gene»,«ENDIF»«
			annotateVariationsVEP(false, false, hgvs, false, transcript, sift, polyphen)»«
		ENDIF»«
				
		//rsId
		IF rsId»«
			//Separator between tools
			IF hgvs|| gene || transcript || sift ||polyphen »,«ENDIF»«	
			annotateVariationsSnpSift(rsId)»«
		ENDIF»«
		
		//MAF		
		IF maf»«
			//Separator between tools
			IF hgvs|| gene || transcript || sift ||polyphen || rsId»,«ENDIF»«
			annotateVaritionsWithVCFTools(maf)»«
		ENDIF		
		»'''
		
	
	
		
	
//-------------------SNPEFF--------------------------------------------------------------------------------------//
	def annotateVariationsSNPEFF(boolean dna, boolean coding, boolean protein, boolean gene)'''«
	var step=galaxy.getLastStep+1»
		"«step»": {
			"annotation": " Annotate HGVS Notation (Dna&Coding)/Gene", 
			"id": «step», 
			"input_connections": {
				"input": {
				"id": «galaxy.getLastWorkflowStep», 
				"output_name": "output"
				}
			}, 
			"inputs": [], 
			"name": "SnpEff [Iteration 2]", 
			"outputs": [
			{
			"name": "output", 
			"type": "tabular"
			}, 
			{
			"name": "statsFile", 
			"type": "html"
			}
			], 
			"position": {
			"left": «(step)*200», 
			"top": «(step)*200»
			}, 
			"post_job_actions": {
				"HideDatasetActionoutput": {
					"action_arguments": {}, 
					"action_type": "HideDatasetAction", 
					"output_name": "output"
				},
				"HideDatasetActionstatsFile": {
					"action_arguments": {}, 
					"action_type": "HideDatasetAction", 
					"output_name": "statsFile"
				}
			}, 
			"tool_errors": null, 
			"tool_id": "snpEff_iteration2", 
			"tool_state": "{\"__page__\": 0, \"outputFormat\": \"\\\"vcf\\\"\", \"lof\": \"\\\"False\\\"\", \"inputFormat\": \"\\\"vcf\\\"\", \"canon\": \"\\\"False\\\"\", \"motif\": \"\\\"False\\\"\", \"udLength\": \"\\\"5000\\\"\", \"genomeVersion\": \"\\\"hg19 \\\"\", \"generate_stats\": \"\\\"False\\\"\", \"input\": \"null\", «
				»\"hgvs\": \"\\\"«IF dna||coding||protein»True«ELSE»False«ENDIF»\\\"\",«
				»\"translation\": \"\\\"True\\\"\",«
				»\"translationOption\": \"{«
					»\\\"translation\\\": \\\"True\\\", \\\"__current_case__\\\": 0, «
					»«GalaxyHelper.getIntegration.hgvsTranslator(dna,coding,protein)»,«
                    »«GalaxyHelper.getIntegration.geneTranslator(gene)»«
         		»}\", «
         		»\"__rerun_remap_job_id__\": null}", 
			"tool_version": "latest", 
			"type": "tool", 
			"user_outputs": []
		}«
		galaxy.addOneStep(true)»'''
			
	
//-------------------VEP--------------------------------//	
def annotateVariationsVEP(boolean dna, boolean coding, boolean protein, boolean gene, boolean transcript,boolean sift, boolean polyphen)'''«	
	var step=galaxy.getLastStep+1»
	"«step»": {
            "annotation": "Annotate HGVS/Transcript/Effect", 
            "id": «step», 
            "input_connections": {
                "input": {
                    "id": «galaxy.getLastWorkflowStep», 
                    "output_name": "output"
                }
            }, 
            "inputs": [], 
            "name": "ENSEMBL variant effect predictor [Iteration 3]", 
            "outputs": [
                {
                    "name": "output", 
                    "type": "tabular"
                }, 
                {
                    "name": "output", 
                    "type": "vcf"
                }
            ], 
            "position": {
			"left": «(step)*200», 
			"top": «(step)*200»
			},
            "post_job_actions": {
				"HideDatasetActionoutput": {
					"action_arguments": {}, 
					"action_type": "HideDatasetAction", 
					"output_name": "output"
				}
			}, 
            "tool_errors": null, 
            "tool_id": "ensembl_iteration3", 
            "tool_state": "{«
            	»\"database_options\": \"{«
                    »\\\"useRefseq\\\": {«
                        »\\\"use_refseq\\\": \\\"True\\\", \\\"__current_case__\\\": 0«
                    »}, «
                    »\\\"annotateHGVS\\\": {«
                    	»\\\"annotate_hgvs\\\": \\\"«IF dna||coding||protein»True«ELSE»False«ENDIF»\\\", «
                    	»\\\"__current_case__\\\": «IF dna||coding||protein»0«ELSE»1«ENDIF»«
                    	»},« 
                    »\\\"annotateGene\\\": {«
                        »\\\"annotate_gene\\\": \\\"«IF gene»True«ELSE»False«ENDIF»\\\", «
                        »\\\"__current_case__\\\": «IF gene»0«ELSE»1«ENDIF»«
                        »}, «
                    »\\\"annotateSiftPoly\\\": {« 
                   		»\\\"annotate_siftpoly\\\": \\\"«IF sift||polyphen»True«ELSE»False«ENDIF»\\\", «
                   		»\\\"__current_case__\\\": «IF sift||polyphen»0«ELSE»1«ENDIF»«
                   		»},«
                    »\\\"database_options_selector\\\": \\\"offline\\\", \\\"__current_case__\\\": 0,«
                    »\\\"outputFormat\\\": {«
                        »\\\"annotateOptions\\\": {«
                        	»«GalaxyHelper.getIntegration().hgvsTranslator(dna,coding,protein)»,«
                        	»«GalaxyHelper.getIntegration.geneTranslator(gene)»,«
                        	»«GalaxyHelper.getIntegration.transcriptTranslator(transcript)»,«
                        	»«GalaxyHelper.getIntegration.predictionTranslator(sift, polyphen)»,«
                        	»\\\"annotate_vcf\\\": \\\"True\\\", \\\"__current_case__\\\": 0«
                        »},«
                        »\\\"__current_case__\\\": 0,« 
                        »\\\"outputFormatOption\\\": \\\"vcf\\\"«
                    »}«                   
                »}\",«
            	»\"input\": \"null\", \"__rerun_remap_job_id__\": null, \"species\": \"\\\"homo_sapiens\\\"\", \"__page__\": 0«
            »}",            
            "tool_version": "1.0.0", 
            "type": "tool", 
            "user_outputs": []
        }«
      galaxy.addOneStep(true)
»'''


//-------------------SNP_SIFT Annotate--------------------------------//	
def annotateVariationsSnpSift(boolean rsId)'''«
	var step=galaxy.getLastStep+1»
	"«step»": {
	        "annotation": "Annotate rsId", 
	        "id": «step», 
	        "input_connections": {
	        	"input": {
	            	"id": «galaxy.getLastWorkflowStep», 
	                "output_name": "output"
	        	}
	         }, 
			"inputs": [], 
            "name": "SnpSift Annotate", 
            "outputs": [
                {
                    "name": "output", 
                    "type": "vcf"
                }
            ], 
            "position": {
				"left": «(step)*200», 
				"top": «(step)*200»
			},
            "post_job_actions": {
                "HideDatasetActionoutput": {
                    "action_arguments": {}, 
                    "action_type": "HideDatasetAction", 
                    "output_name": "output"
                }
            }, 
            "tool_errors": null, 
            "tool_id": "snpSift_annotate", 
            "tool_state": "{\"input\": \"null\", \"dbSnp\": \"null\", \"__rerun_remap_job_id__\": null, \"id\": \"\\\"False\\\"\", \"__page__\": 0}", 
            "tool_version": "latest", 
            "type": "tool", 
            "user_outputs": []
        }«
     galaxy.addOneStep(true)
»'''

//-------------------VCF_Tools--------------------------------//	
def annotateVaritionsWithVCFTools(boolean maf)'''«
	var step=galaxy.getLastStep+1»
	"«step»": {
	        "annotation": "Annotate MAF", 
	        "id": «step», 
	        "input_connections": {
	        	"input": {
	            	"id": «galaxy.getLastWorkflowStep», 
	                "output_name": "output"
	        	}
	         }, 
			"inputs": [], 
            "name": "Allele Frequencies", 
            "outputs": [
                {
                    "name": "output1", 
                    "type": "tabular"
                }, 
                {
                    "name": "output", 
                    "type": "vcf"
                }
            ], 
            "position": {
				"left": «(step)*200», 
				"top": «(step)*200»
			},
            "post_job_actions": {
                "HideDatasetActionoutput": {
                    "action_arguments": {}, 
                    "action_type": "HideDatasetAction", 
                    "output_name": "output"
                }
            }, 
            "tool_errors": null, 
            "tool_id": "allele_frequencies", 
            "tool_state": "{«
            	»\"__page__\": 0, \"input\": \"null\", \"__rerun_remap_job_id__\": null, «
            	»\"mafOption\": \"{«GalaxyHelper.getIntegration().mafTranslator(maf)»}\"«
            	»}", 
            "tool_version": "latest", 
            "type": "tool", 
            "user_outputs": []
        }«
     galaxy.addOneStep(true)
»'''	
	
	




		
	}