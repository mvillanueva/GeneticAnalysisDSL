package diagnosis.it3.mydsl.generator.report

import diagnosis.ReportVariations
import diagnosis.it3.mydsl.generator.galaxy.GalaxyHelper
import diagnosis.PredictionAlgorithm

class ReportGenerator{
	GalaxyHelper galaxy=GalaxyHelper.getGalaxyHelper()
	
	def generateReport(ReportVariations reportData)	{
		var hgvs=false
		var gene=false
		var transcript=false
		var maf=false
		var sift=false
		var polyphen=false
		//Chose annotations to include in the report
		if (reportData.hgvs!=null) hgvs=true
		if (reportData.gene!=null) gene=true
		if (reportData.transcript!=null) transcript=true
		if (reportData.maf!=null) maf=true
		for (prediction:reportData.prediction){
			if(prediction.algorithm.equals(PredictionAlgorithm.SIFT)) sift=true
			else if (prediction.algorithm.equals(PredictionAlgorithm.POLYPHEN)) polyphen=true
		}
		
		generateReport(hgvs, gene, transcript, maf, sift, polyphen)
	}
	def generateReport( boolean hgvs, boolean gene, boolean transcript, boolean maf, boolean sift, boolean polyphen)'''«
	var step=galaxy.getLastStep+1»«
	»"«step»":{
		"annotation": "Show Variations List", 
		"id": «step»,
		"input_connections": {
			"input": {
		        "id": «galaxy.getLastWorkflowStep», 
		        "output_name": "output"
		     }
	     }, 
	     "inputs": [], 
	     "name": "Show variations [Iteration 3]", 
	     "outputs": [
	     	  {
		      "name": "output_html", 
		      "type": "html"
		      }
	      ], 
	      "position": {
			"left": «step*200», 
			"top": «step*200»
		  }, 
		  "post_job_actions": {}, 
	      "tool_errors": null, 
	      "tool_id": "show_variations_iteration3", 
	      "tool_state": "{\"input\": \"null\", \"__rerun_remap_job_id__\": null, «
	      	»\"translationOption\": \"{«
					»\\\"translation\\\": \\\"True\\\", \\\"__current_case__\\\": 0, «
					GalaxyHelper.getIntegration.hgvsTranslator(hgvs,hgvs,hgvs)»,«
                    »«GalaxyHelper.getIntegration.geneTranslator(gene)»,«
                    »«GalaxyHelper.getIntegration.transcriptTranslator(transcript)»,«
                    »«GalaxyHelper.getIntegration.predictionTranslator(sift,polyphen)»,«
                    »\\\"mafOption\\\":{«GalaxyHelper.getIntegration.mafTranslator(maf)»}«
				»}\",  \"__page__\": 0}",
	      "tool_version": "1.0.0", 
	      "type": "tool", 
	      "user_outputs": []
	}«
	galaxy.addOneStep(true)»'''
	
}