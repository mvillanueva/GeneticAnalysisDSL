package diagnosis.it3.mydsl.tests.generator
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.junit.Test
import org.junit.Assert

import org.eclipse.xtext.junit4.util.ParseHelper
import com.google.inject.Inject
import diagnosis.it3.mydsl.MyDiagInjectorProvider
import diagnosis.DiagnosisPackage
import diagnosis.Diagnosis
import org.junit.Before
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import java.util.Collection
import diagnosis.it3.mydsl.tests.targetplatform.GeneratorGalaxy

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(MyDiagInjectorProvider))

class BreastCancer {
	
	@Inject IGenerator generator
	@Inject extension ParseHelper<Diagnosis> parser
	Diagnosis diagnosis=null
	InMemoryFileSystemAccess fsa=null
	String filecontent=null
	String path="src/diagnosis/it3/mydsl/tests/targetplatform/userStories/it2/"
@Before 
def void testSetupOnce() {
	DiagnosisPackage.eINSTANCE.eClass();
	
	diagnosis = parser.parse (
	'''Diagnose BreastCancerAll
Read variations from a VCF file from input
Annotate variations with hgvs gene rsId
Filter variations by gene BRCA1 BRCA2
Report variations with hgvs gene rsId
	''')
	fsa= new InMemoryFileSystemAccess()
    generator.doGenerate(diagnosis.eResource, fsa)
    filecontent=fsa.getTextFiles().values().iterator().next().toString()
} 

@Test def testAnnotateGene(){
	Assert.assertTrue("The workflow fragment of AnnotateGene is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US1_AnnotateGene.ga"), "snpeff_iteration2")
	)
	Assert.assertTrue("The workflow fragment of AnnotateGene is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US1_AnnotateGene.ga"), "ensembl_iteration2")
	)
}

@Test def testAnnotateRsId(){
	Assert.assertTrue("The workflow fragment of AnnotateRrsId is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US2_AnnotatersId.ga"), "snpSift_annotate")
	)
}

@Test def testFilterByGene(){
	Assert.assertTrue("The workflow fragment of FilterGene is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US3_FilterByGene.ga"), "snpSift_filter")
	)

}

@Test def testReportVariations(){
	Assert.assertTrue("The workflow fragment of ReportVariations is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US4_5_ReportVariations.ga"), "show_variations_iteration2")
	)

}

}