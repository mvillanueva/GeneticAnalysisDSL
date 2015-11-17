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

class DiabetesMellitusTesis {
	
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
	'''Diagnose Diabetes Mellitus Type 2 (Analysis 1)
Read Variations genotypes from VCF file Patient1.vcf
Annotate Variations with gene, transcripts, polyphen
Filter Variations by genes {ABCC8, CAPN10, KCNJ11, GCGR, SLC2A2, HNF4A, INS, INSR, PPARG, TCFl2, ADIPOQ, AKT2, PAX4, MAPK81p1, GPD2, MNTR1B}
Filter Variations by predicted effect polyphen damaging
Report Variations with gene, predicted_effect
	
	''')
	fsa= new InMemoryFileSystemAccess()
    generator.doGenerate(diagnosis.eResource, fsa)
    filecontent=fsa.getTextFiles().values().iterator().next().toString();
    
} 
@Test def testFilterPolyphenEffect(){
	Assert.assertTrue("The workflow fragment of filterByPolyphenEffect is different to the generated one", 
		GeneratorGalaxy.checkGeneratorGalaxy(filecontent, path.concat("US6_7_9_10_FilterPrioritizeSIFTPOLY_Ensembl.ga"), "ensembl_id")
	)
}



}