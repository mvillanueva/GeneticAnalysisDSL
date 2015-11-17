package diagnosis.it3.mydsl.generator.patientdata


import org.eclipse.emf.ecore.resource.Resource
import diagnosis.Vcf
import diagnosis.PatientData
import diagnosis.it3.mydsl.generator.galaxy.GalaxyHelper

class PatientDataGenerator {
	GalaxyHelper galaxy=GalaxyHelper.getGalaxyHelper()	
	
	
	def readPatientData(PatientData patientData)'''
	«IF patientData.variations.format instanceof Vcf»«
		//Read VCF
		readVCF()»«
		galaxy.addOneStep(true)»«
		//Check VCFErrors
		checkVCFErrors()»«
		galaxy.addOneStep(false)»«		
	ENDIF»
	'''	
	
	def readVCF ()'''
	"0": {
			"annotation": "Choose a VCF File", 
			"id": 0,
			"input_connections": {}, 
			"inputs": [
				{
				"description": "", 
				"name": "input"
				}
			],
			"name": "Input dataset",
			"outputs": [], 
			"position": {
				"left": 20, 
				"top": 100
			 }, 
			"tool_errors": null, 
			"tool_id": null, 
			"tool_state": "{\"name\": \"input\"}", 
			"tool_version": null, 
			"type": "data_input", 
			"user_outputs": []
		},
	'''
	def checkVCFErrors ()'''
	«var String errorColumns="The file has not all the required data columns"»«
	var String errorFormat="Wrong format"»«
	var String errorOutside="The variation is outside the chromosome"»
	"1": {
            "annotation": "Check VCF Errors", 
            "id": 1, 
            "input_connections": {
                "input": {
                    "id": 0, 
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
                "left": 200, 
                "top": 100
            }, 
            "post_job_actions": {}, 
            "tool_errors": null, 
            "tool_id": "custom_error_messages", 
            "tool_state": "{\"__page__\": 0, \"input\": \"null\", \"__rerun_remap_job_id__\": null, \"error_messages\": \"[«
            	»{\\\"__index__\\\": 0, \\\"showOption\\\": \\\"yes\\\", \\\"searchCondition\\\": {\\\"regularExpFieldname\\\": \\\"columnsExpression\\\", \\\"searchOption\\\": \\\"regexp\\\", \\\"__current_case__\\\": 0}, «
            		»\\\"customErrorMessage\\\": \\\"«errorColumns»\\\"}, «
            	»{\\\"__index__\\\": 1, \\\"showOption\\\": \\\"yes\\\", \\\"searchCondition\\\": {\\\"regularExpFieldname\\\": \\\"formatExpression\\\", \\\"searchOption\\\": \\\"regexp\\\", \\\"__current_case__\\\": 0}, «
            		»\\\"customErrorMessage\\\": \\\"«errorFormat»\\\"}, «
            	»{\\\"__index__\\\": 2, \\\"showOption\\\": \\\"yes\\\", \\\"searchCondition\\\": {\\\"regularExpFieldname\\\": \\\"positionExpression\\\", \\\"searchOption\\\": \\\"regexp\\\", \\\"__current_case__\\\": 0}, «
            		»\\\"customErrorMessage\\\": \\\"«errorOutside»\\\"«
            »}]\"}", 
            "tool_version": "latest", 
            "type": "tool", 
            "user_outputs": []
        }, 
	'''
	
	
	
}