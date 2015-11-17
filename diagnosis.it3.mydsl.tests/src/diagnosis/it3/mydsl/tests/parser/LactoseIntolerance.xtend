package diagnosis.it3.mydsl.tests.parser

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
import diagnosis.Filter
import diagnosis.DnaS

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(MyDiagInjectorProvider))

class LactoseIntolerance {
	
@Inject extension ParseHelper<Diagnosis> parser
Diagnosis diagnosis=null
	
@Before 
def void testSetupOnce() {
	DiagnosisPackage.eINSTANCE.eClass();
	
	diagnosis = parser.parse (
	'''Diagnose LactoseIntolerance
	Load variations in vcf format from input
	Annotate hgvsdna
	Search NC_000002.11:g.136608646G>A
	NC_000002.11:g.136616754C>A
	Report hgvs notation
	''')
} 

@Test def checkName(){	
	Assert.assertEquals(diagnosis.disease.name, "LactoseIntolerance")
}
@Test def checkVariations(){	
Assert.assertEquals((diagnosis.analyses.get(0) as DnaS).hgvsdna.size, 2)
}
	
}