package diagnosis.it3.mydsl.generator.analysis

import diagnosis.Filter
import diagnosis.DnaS
import diagnosis.CodingS
import diagnosis.ProteinS
import diagnosis.HgvsS
import diagnosis.it3.mydsl.generator.galaxy.GalaxyHelper
import diagnosis.GeneF
import diagnosis.Gene
import diagnosis.PredictionF
import diagnosis.EffectF
import diagnosis.ScoreF
import diagnosis.MAFF
import diagnosis.OrderCriteria
import diagnosis.Effect
import diagnosis.PredictionAlgorithm

class FilterGenerator extends AnalysisGenerator {
	GalaxyHelper galaxy=GalaxyHelper.getGalaxyHelper()
	
	/*Choose Concrete Software Artefact for each Feature */
	
	/*SearchByHGVSNotation */	
	def dispatch filterVariations(HgvsS filter)'''«
	searchByHGVSNotation(filter)
	//searchByHgvsNotationSNPSift(filter)»«	
	»'''
	/*SearchBy Dna, Coding or Protein*/	
	def dispatch searchByHGVSNotation(DnaS search){
		filterWithSNPSift(search as HgvsS)
	}
	
	def dispatch searchByHGVSNotation(CodingS search){
		filterWithSNPSift(search as HgvsS)
	}
	def dispatch searchByHGVSNotation(ProteinS search){
		filterWithVEP(search as HgvsS)
	}
	
	/*Filter by Gene */	
	def dispatch filterVariations(GeneF filter)'''«
	filterWithSNPSift(filter)»«
	»'''
	
	/*Filter/Prioritize by Prediction */
	def dispatch filterVariations(PredictionF filter)'''«
	filterWithVEP(filter)»«
	//filterWithPredictionSort()
	IF filter.order!=null»« //Prioritize by Score
		»,«filterWithPredictionSort(filter as ScoreF,false,true, filter.order.criteria)»«
	ENDIF»«
	»'''
	
	/*Filter/Prioritize by MAF */
	def dispatch filterVariations(MAFF filter)'''«
	IF filter.order==null»«//Only Filter
		filterWithMAFSort(filter, false, null)»«
	ELSE»«//Priorization (filter+order)
		filterWithMAFSort(filter, true, filter.order.criteria)»«
	ENDIF»«
	»'''
	
	
	




//------------------------------VEP_FILTER----------------------------------------//
def filterWithVEP(Filter filter)'''«
	var step=galaxy.getLastStep+1»
	"«step»": {
		"annotation": "Filter/Search Variations", 
		"id": «step», 
		"input_connections": {
			"input": {
			"id": «galaxy.getLastWorkflowStep», 
			"output_name": "output"
			}
		}, 
		"inputs": [], 
		"name": "ENSEMBL filter VEP", 
		"outputs": [
			{
			"name": "output", 
			"type": "tabular"
			}
		], 
		"position": {
			"left": «step*200», 
			"top": «step*200»
		}, 
		"post_job_actions": {
			"ChangeDatatypeActionoutput": {
				"action_arguments": {
					"newtype": "vcf"
				}, 
				"action_type": "ChangeDatatypeAction", 
				"output_name": "output"
			},
			"HideDatasetActionoutput": {
					"action_arguments": {}, 
					"action_type": "HideDatasetAction", 
					"output_name": "output"
				}
		}, 
		"tool_errors": null, 
		"tool_id": "filter_vep", 
		"tool_state": "{\"__page__\": 0, \"filterField\": \"\\\"«expressionVEP(filter)»\\\"\", \"__rerun_remap_job_id__\": null, \"input\": \"null\"}", 
		"tool_version": "latest", 
		"type": "tool", 
		"user_outputs": []
		}«
		galaxy.addOneStep(true)»'''
		
	
	/*Search by HGVS */
	def dispatch expressionVEP(HgvsS hgvs){
		expressionVEPHGVS(hgvs)
	}
	/*--Search by DNA-------VEP-------------- */
	//NOT SUPPORTED	
	/*--Search by Coding-------VEP-------------- */
	def dispatch expressionVEPHGVS(CodingS hgvs)'''«
	//Vep filter has problems with special characters included in HGVSNotation ":" and ">"
	//We only solved one with a replace ":c." to "c."
	»«FOR i:0..<hgvs.hgvscoding.size SEPARATOR ' or '»«
	»HGVSc match «hgvs.hgvscoding.get(i).reference.identifier»:c.«hgvs.hgvscoding.get(i).description»«
	ENDFOR»'''	
	/*--Search by Protein-------VEP-------------- */
	//Vep filter has problems with special characters included in HGVSNotation ":".
	//We solved it with a replace ":p." to "p."
	def dispatch expressionVEPHGVS(ProteinS hgvs)'''«
	»«FOR i:0..<hgvs.hgvsprotein.size SEPARATOR ' or '»«
	»HGVSp match «hgvs.hgvsprotein.get(i).reference.identifier»:p.«hgvs.hgvsprotein.get(i).description»«
	ENDFOR»'''
	
	/*Filter by Gene */
	def dispatch expressionVEP(GeneF gene)''''''	
	
	/*Filter by Prediction Effect */
	def dispatch expressionVEP(EffectF prediction)'''«
	FOR effect:prediction.effect SEPARATOR ' or ' »«
	»«prediction.algorithm» is «effect.vepEffect»«
	»«ENDFOR»'''
		
	/*Filter by Prediction Score */
	def dispatch expressionVEP(ScoreF prediction)'''«
	prediction.algorithm» gt «prediction.minScore» and «
	prediction.algorithm» lt «prediction.maxScore»'''	
	
	/*Vep Effects */
	def vepEffect (Effect effect){
		switch effect{
			case Effect.TOLERATED: return 'tolerated' 
			case Effect.DELETERIOUS: return 'deleterious' 
			case Effect.BENIGN: return 'benign' 
			case Effect.DAMAGING: return 'damaging' 
			case Effect.POSSIBLY_D: return 'possibly_damaging' 
			case Effect.PROBABLY_D: return 'probably_damaging' 
		}		
	}
	
	
	//---------------SNPSift----------------------------------------------------------------------//
	def filterWithSNPSift(Filter filter)'''«
	var step=galaxy.getLastStep+1»
	"«step»": {
		"annotation": "Filter Variations", 
		"id": «step», 
		"input_connections": {
			"input": {
			"id": «galaxy.getLastWorkflowStep», 
			"output_name": "output"
			}
		}, 
		"inputs": [], 
		"name": "SnpSift Filter", 
		"outputs": [
			{
			"name": "output", 
			"type": "tabular"
			}
		], 
		"position": {
			"left": «step*200», 
			"top": «step*200»
		}, 
		"post_job_actions": {
			"ChangeDatatypeActionoutput": {
				"action_arguments": {
					"newtype": "vcf"
				}, 
				"action_type": "ChangeDatatypeAction", 
				"output_name": "output"
			},
			"HideDatasetActionoutput": {
					"action_arguments": {}, 
					"action_type": "HideDatasetAction", 
					"output_name": "output"
				}
		}, 
		"tool_errors": null, 
		"tool_id": "snpSift_filter", 
		"tool_state": "{\"__page__\": 0, \"expr\": \"\\\"«expressionSNPSift(filter)»\\\"\", \"__rerun_remap_job_id__\": null, \"input\": \"null\"}", 
		"tool_version": "latest", 
		"type": "tool", 
		"user_outputs": []
		} «
		galaxy.addOneStep(true)»'''
	
	
	/*Search by HGVS */
	def dispatch expressionSNPSift(HgvsS hgvs){
		expressionSNPSiftHGVS(hgvs)
	}
	/*Filter by Gene */
	def dispatch expressionSNPSift(GeneF gene)'''«
	FOR Gene eachgene:gene.gene SEPARATOR '|'»«
	»EFF[*].GENE = '«eachgene.hgncId»' «
	ENDFOR»'''
	
	
	
	/*---------SNPSiftDNA-------------- */
	def dispatch expressionSNPSiftHGVS(DnaS hgvs)'''
	«FOR i:0..<hgvs.hgvsdna.size SEPARATOR '|'»«
		var description=hgvs.hgvsdna.get(i).description»«
		var pos=description.split("[ATGC|ins|del]").get(0)»«
		»(POS=«pos» & «
		IF description.contains("ins")
			»REF='-' & ALT='«description.replace(pos,"").replace("ins","")»'«
		ELSEIF description.contains("del")
			»REF='«description.replace(pos,"").replace("del","")»' & ALT='-'«
		ELSE»«//indel
			»«var values=description.replace(pos,"").split(">")
			»REF='«values.get(0)»' & ALT='«values.get(1)»'«
		ENDIF»)«
	ENDFOR»'''
	
	/*---------SNPSiftCoding-------------- */
	def dispatch expressionSNPSiftHGVS(CodingS hgvs)'''«
	»«FOR i:0..<hgvs.hgvscoding.size SEPARATOR '|'»«
	»(EFF[*].AA=~'c.«hgvs.hgvscoding.get(i).description»' & EFF[*].TRID=~'«hgvs.hgvscoding.get(i).reference.identifier»') «
	ENDFOR»'''
	
	/*---------SNPSiftProtein-------------- */
	def dispatch expressionSNPSiftHGVS(ProteinS hgvs)'''«
	»«FOR i:0..<hgvs.hgvsprotein.size SEPARATOR '|'»«
	»(EFF[*].AA=~'p.«hgvs.hgvsprotein.get(i).description»' & EFF[*].TRID=~ '«hgvs.hgvsprotein.get(i).reference.identifier»') «
	ENDFOR»'''
	


//------------------------------MAF_SORT Tool----------------------------------------//
def filterWithMAFSort(MAFF filter, boolean order, OrderCriteria criteria)'''«
	var step=galaxy.getLastStep+1»
	"«step»": {
		"annotation": "Filter By MAF", 
		"id": «step», 
		"input_connections": {
			"input": {
			"id": «galaxy.getLastWorkflowStep», 
			"output_name": "output"
			}
		}, 
		"inputs": [], 
            "name": "Sort MAF tool", 
            "outputs": [
                {
                    "name": "output", 
                    "type": "vcf"
                }
            ], 
             "position": {
                "left": «step*200», 
                "top": «step*200»
            }, 
            "post_job_actions": {
            	"HideDatasetActionoutput": {
					"action_arguments": {}, 
					"action_type": "HideDatasetAction", 
					"output_name": "output"
				}
			}, 
            "tool_errors": null, 
            "tool_id": "sortMAF", 
            "tool_state": "{\"sort\": \"{\\\"sort_MAF\\\": \\\"False\\\", \\\"__current_case__\\\": 1, \\\"orderCriteria\\\": \\\"asc\\\"}\", \"__page__\": 0, «
            	»\"valinitial\": \"\\\"«filter.minValue»\\\"\", \"__rerun_remap_job_id__\": null, «
            	»\"field\": \"\\\"«GalaxyHelper.maf»\\\"\", \"input\": \"null\", «
            	»\"valfinal\": \"\\\"«filter.maxValue»\\\"\"«
            »}", 
            "tool_version": "1.0.0", 
            "type": "tool", 
            "user_outputs": []
        }«
	galaxy.addOneStep(true)»'''



//------------------------------MAF_SORT Tool----------------------------------------//
def filterWithPredictionSort(ScoreF filter, boolean filterbool, boolean order, OrderCriteria criteria)'''«
	var step=galaxy.getLastStep+1»
	"«step»": {
		"annotation": "Order By Prediction", 
		"id": «step», 
		"input_connections": {
			"input": {
			"id": «galaxy.getLastWorkflowStep», 
			"output_name": "output"
			}
		}, 
		"inputs": [], 
            "name": "SiftAndPolyphen", 
            "outputs": [
                {
                    "name": "output", 
                    "type": "vcf"
                }
            ], 
             "position": {
                "left": «step*200», 
                "top": «step*200»
            }, 
            "post_job_actions": {
            	"HideDatasetActionoutput": {
					"action_arguments": {}, 
					"action_type": "HideDatasetAction", 
					"output_name": "output"
				}
			}, 
            "tool_errors": null, 
            "tool_id": "SPsort1.0", 
            "tool_state": "{«
            	»\"field\": \"\\\"«GalaxyHelper.prediction»\\\"\", « 
            	»\"algorithm\": \"\\\"«filter.algorithm»\\\"\", «
            	»\"valinitial\": \"\\\"«IF filterbool»«filter.minScore»«ELSE»0.0«ENDIF» \\\"\", «
				»\"valfinal\": \"\\\"«IF filterbool»«filter.maxScore»«ELSE»1.0«ENDIF»\\\"\", «
            	»\"sort\": \"{\\\"sort_prediction\\\": \\\"«IF order»True«ELSE»False«ENDIF»\\\", \\\"__current_case__\\\": «IF order»0«ELSE»1«ENDIF», \\\"order\\\": \\\"«criteria»\\\"}\", «
            	»\"input\": \"null\",\"__rerun_remap_job_id__\": null, \"__page__\": 0 «            	
            »}", 
            "tool_version": "1.0.0", 
            "type": "tool", 
            "user_outputs": []
        }«
	galaxy.addOneStep(true)»'''



//-------------------ERROR MANAGEMENT------------------------------------------//
def checkFilterErrors()'''«
var step=galaxy.getLastStep+1»«
var String messageNotFound="None variations found"»«
var String errorWrongHGVS="The HGVS Notation is not correct"»«
var String errorWrongGene="The Gene does not exist"»«
»"«step»": {
            "annotation": "Check Filter Errors", 
            "id": «step», 
            "input_connections": {
                "input": {
                    "id": «galaxy.getLastWorkflowStep», 
                    "output_name": "output"
                }
            }, 
            "inputs": [], 
            "name": "Custom Error Messages", 
            "outputs": [
                {
                    "name": "check_result", 
                    "type": "tabular"
                }
            ], 
            "position": {
                "left": «step*200», 
                "top": «step*200»
            }, 
            "post_job_actions": {}, 
            "tool_errors": null, 
            "tool_id": "custom_error_messages", 
            "tool_state": "{\"__page__\": 0, \"input\": \"null\", \"__rerun_remap_job_id__\": null, \"error_messages\": \"[«
            	»{\\\"__index__\\\": 0, \\\"showOption\\\": \\\"yes\\\", \\\"searchCondition\\\": {\\\"regularExpFieldname\\\": \\\"notFoundExpression\\\", \\\"searchOption\\\": \\\"regexp\\\", \\\"__current_case__\\\": 0}, «
            		»\\\"customErrorMessage\\\": \\\"«messageNotFound»\\\"}, «
            	»{\\\"__index__\\\": 1, \\\"showOption\\\": \\\"yes\\\", \\\"searchCondition\\\": {\\\"regularExpFieldname\\\": \\\"formatExpression\\\", \\\"searchOption\\\": \\\"regexp\\\", \\\"__current_case__\\\": 0}, «
            		»\\\"customErrorMessage\\\": \\\"«errorWrongHGVS»\\\"}, «
            	»{\\\"__index__\\\": 1, \\\"showOption\\\": \\\"yes\\\", \\\"searchCondition\\\": {\\\"regularExpFieldname\\\": \\\"formatExpression\\\", \\\"searchOption\\\": \\\"regexp\\\", \\\"__current_case__\\\": 0}, «
            		»\\\"customErrorMessage\\\": \\\"«errorWrongGene»\\\"}«
            	»]\"}", 
            "tool_version": "latest", 
            "type": "tool", 
            "user_outputs": []
   } «
	galaxy.addOneStep(false)»'''
	
	
		
}