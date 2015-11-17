package diagnosis.it3.mydsl.generator.analysis

import diagnosis.Annotation
import diagnosis.Filter

class AnalysisGenerator{
		
	/*Annotate */
	def dispatch runAnalysis(Annotation analysis){
		var annotate=new AnnotateGenerator()
		annotate.annotateVariations(analysis)
	}
	/*Search */
	def dispatch runAnalysis(Filter analysis)'''«
		var filter=new FilterGenerator()»«
		filter.filterVariations(analysis)»,«
		filter.checkFilterErrors()
	»'''			
		
	
}