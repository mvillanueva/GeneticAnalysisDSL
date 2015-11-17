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
import diagnosis.it3.mydsl.tests.targetplatform.GeneratorGalaxy

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(MyDiagInjectorProvider))

class LactoseIntolerance {
	
	@Inject IGenerator generator
	@Inject extension ParseHelper<Diagnosis> parser
	Diagnosis diagnosis=null
	InMemoryFileSystemAccess fsa=null
	String filecontent=null
	String path="src/diagnosis/it3/mydsl/tests/targetplatform/userStories/it1/"
@Before 
def void testSetupOnce() {
	DiagnosisPackage.eINSTANCE.eClass();
	
	diagnosis = parser.parse (
	'''Diagnose LactoseIntoleranceHGVSIt1
Read variations from a VCF file from input
Annotate variations with hgvs
Search variations 
NC_000002.11:g.136608646G>A
NC_000002.11:g.136616754C>A
Report variations with hgvs
	''')
	fsa= new InMemoryFileSystemAccess()
    generator.doGenerate(diagnosis.eResource, fsa)
    filecontent=fsa.getTextFiles().values().iterator().next().toString()
    
} 

@Test def testAnnotateHgvs(){
	Assert.assertTrue("The workflow fragment of AnnotateHgvs is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US2_AnnotateHGVS.ga"), "snpEff_iteration1")
	)
	Assert.assertTrue("The workflow fragment of AnnotateHgvs is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US2_AnnotateHGVS.ga"), "ensembl_iteration1")
	)
}
@Test def testsearchVariations(){
	Assert.assertTrue("The workflow fragment of SearchHgvsDNA is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US3_SearchHGVSDna.ga"), "snpSift_filter")
	)
	Assert.assertTrue("The workflow fragment of SearchHgvsCoding is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US4_SearchHGVSCoding.ga"), "snpSift_filter")
	)
	Assert.assertTrue("The workflow fragment of SearchHgvsProtein is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US5_SearchHGVSProtein.ga"), "filter_vep")
	)
}
@Test def testReportVariations(){
	Assert.assertTrue("The workflow fragment of reportVariations is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US6_ReportVariations"), "show_variations_iteration1")
	)
}

@Test def checkFiles(){	
	Assert.assertEquals(1,fsa.getAllFiles().size)
}


}