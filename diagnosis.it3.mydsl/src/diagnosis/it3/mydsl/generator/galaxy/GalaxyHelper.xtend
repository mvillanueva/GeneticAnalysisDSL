package diagnosis.it3.mydsl.generator.galaxy

class GalaxyHelper {
	private static GalaxyHelper galaxyHelper
	var int lastStep //Last step of the workflow
	var int lastWorkflowStep //Last step of the workflow that contributes to the flow
	private static Integration integration
	
	def static hgvsDna()'''HGVSDna'''
	def static hgvsCoding()'''HGVSCoding'''
	def static hgvsProtein()'''HGVSProtein'''	
	def static gene()'''Gene'''
	def static transcript()'''Transcript'''
	def static maf()'''MAF'''
	def static prediction()'''EFF_SP'''
	
		
	//Singleton
	def static getGalaxyHelper(){
		if(galaxyHelper==null){
			galaxyHelper=new GalaxyHelper()			
		}else
		return galaxyHelper
	}
	
	def void resetSteps(){
		lastStep=-1
		lastWorkflowStep=-1
	}
	//Step operations
	def void addOneStep(boolean workflow){
		lastStep=lastStep+1
		if(workflow==true){//If this step contributes to the flow
			lastWorkflowStep=lastStep
		}
	}	
	def int getLastStep(){
		return lastStep
	}
	
	def int getLastWorkflowStep(){
		return lastWorkflowStep
	}
	def static getIntegration(){
		if(integration==null){
			integration=new Integration()			
		}else
		return integration
	}
	
	
	
}