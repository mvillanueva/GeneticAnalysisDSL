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

class DiabetesMellitus {
	
	@Inject IGenerator generator
	@Inject extension ParseHelper<Diagnosis> parser
	Diagnosis diagnosis=null
	InMemoryFileSystemAccess fsa=null
	String filecontent=null;
	String path="src/diagnosis/it3/mydsl/tests/targetplatform/userStories/it3/"
@Before 
def void testSetupOnce() {
	DiagnosisPackage.eINSTANCE.eClass();
	
	diagnosis = parser.parse (
	'''Find putative variants for DiabetesMellitusBrca23456
Read variations genotypes from a VCF file from input
Annotate variations with gene transcript Polyphen rsId Sift samples maf
Filter variations by gene BRCA2 INSRR
Filter variations by samples maf [0.2, 1.0]
Filter variations by Sift effect tolerated
Filter variations by Polyphen effect benign
Report variations with gene Sift Polyphen samples maf
	''')
	fsa= new InMemoryFileSystemAccess()
    generator.doGenerate(diagnosis.eResource, fsa)
    filecontent=fsa.getTextFiles().values().iterator().next().toString();
    
} 


@Test def testAnnotateTranscript(){
	Assert.assertTrue("The workflow fragment of AnnotateTranscript is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US2_AnnotateTranscript.ga"), "ensembl_iteration3")
	)
}

@Test def testAnnotateSIFTPOLY(){
	Assert.assertTrue("The workflow fragment of AnnotateSIFTPOLY is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US3_4_AnnotateSIFTPOLY.ga"), "ensembl_iteration3")
	)
}

@Test def testAnnotateMAF(){
	Assert.assertTrue("The workflow fragment of AnnotateMAF is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US5_AnnotateMAF.ga"), "ensembl_iteration3")
	)
}

@Test def testPrioritizeMAF(){
	Assert.assertTrue("The workflow fragment of PriotizeMAF is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US5_AnnotateMAF.ga"), "sortMAF")
	)
}
@Test def testFilterPrioritizeSIFTPOLY(){
	Assert.assertTrue("The workflow fragment of FilterPrioritizeSIFTPOLY is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US6_7_9_10_FilterPrioritizeSIFTPOLY_Ensembl.ga"), "ensembl_iteration3")
	)
	Assert.assertTrue("The workflow fragment of FilterPrioritizeSIFTPOLY is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US6_7_9_10_FilterPrioritizeSIFTPOLY"), "SPsort1.0")
	)
}

@Test def testReportVariations(){
	Assert.assertTrue("The workflow fragment of ReportVariations is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US11_12_13_ReportVariations.ga"), "show_variations_iteration3")
	)
}
}