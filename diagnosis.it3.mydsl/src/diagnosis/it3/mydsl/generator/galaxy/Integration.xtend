package diagnosis.it3.mydsl.generator.galaxy

class Integration {
	
	def static Integration(){
		
	}
	
	/**
	 * Translator to annotate INFO FIELD & to read annotations from INFO FIELD (Short version, some annotations)
	 */
	def hgvsTranslator (Boolean dna, Boolean coding, Boolean protein)'''«
	»\\\"hgvsdnaOption\\\": {«
		»\\\"hgvsdnaFieldname\\\": \\\"«GalaxyHelper.hgvsDna()»\\\", «
		»\\\"hgvsdnaCheckbox\\\": \\\"«IF dna»True«ELSE»False«ENDIF»\\\", «
		»\\\"__current_case__\\\": «IF dna»0«ELSE»1«ENDIF»«
	»}, «
	»\\\"hgvscodingOption\\\": {«
		»\\\"hgvscodingFieldname\\\": \\\"«GalaxyHelper.hgvsCoding()»\\\", «
		»\\\"hgvscodingCheckbox\\\": \\\"«IF coding»True«ELSE»False«ENDIF»\\\", «
		»\\\"__current_case__\\\": «IF coding»0«ELSE»1«ENDIF»«
	»}, «
	»\\\"hgvsproteinOption\\\": {«
		»\\\"hgvsproteinFieldname\\\": \\\"«GalaxyHelper.hgvsProtein()»\\\", «
		»\\\"hgvsproteinCheckbox\\\": \\\"«IF protein»True«ELSE»False«ENDIF»\\\", «
		»\\\"__current_case__\\\": «IF protein»0«ELSE»1«ENDIF»«
	»}'''
	
	def geneTranslator (Boolean gene)'''«
	»\\\"geneOption\\\": {«
		»\\\"geneFieldname\\\": \\\"«GalaxyHelper.gene()»\\\", «
		»\\\"geneCheckbox\\\": \\\"«IF gene»True«ELSE»False«ENDIF»\\\", «
		»\\\"__current_case__\\\": «IF gene»0«ELSE»1«ENDIF»«
	»} '''
	
	/**
	 * Translator to annotate INFO FIELD & to read annotations from INFO FIELD (Long version, all)
	 */
	def transcriptTranslator (Boolean transcript)'''«
	»\\\"transcriptOption\\\": {«
		»\\\"transcriptFieldname\\\": \\\"«GalaxyHelper.transcript()»\\\", «
		»\\\"transcriptCheckbox\\\": \\\"«IF transcript»True«ELSE»False«ENDIF»\\\", «
		»\\\"__current_case__\\\": «IF transcript»0«ELSE»1«ENDIF»«
	»} '''
	
	def predictionTranslator (Boolean sift, Boolean polyphen)'''«
	»\\\"siftpolyOption\\\": {«
		»\\\"siftpolyFieldname\\\": \\\"«GalaxyHelper.prediction()»\\\", «
		»\\\"siftpolyCheckbox\\\": \\\"«IF sift|| polyphen»True«ELSE»False«ENDIF»\\\", «
		»\\\"__current_case__\\\": «IF sift|| polyphen»0«ELSE»1«ENDIF»«
	»} '''
	
	def mafTranslator(Boolean maf)'''«
		»\\\"mafFieldname\\\": \\\"«GalaxyHelper.maf»\\\",«
		»\\\"mafCheckbox\\\": \\\"«IF maf»True«ELSE»False«ENDIF»\\\", «
		» \\\"__current_case__\\\": «IF maf»0«ELSE»1«ENDIF»«
	»'''
}