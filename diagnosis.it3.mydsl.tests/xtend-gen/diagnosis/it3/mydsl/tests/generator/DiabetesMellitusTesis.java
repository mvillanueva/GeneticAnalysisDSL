package diagnosis.it3.mydsl.tests.generator;

import com.google.inject.Inject;
import diagnosis.Diagnosis;
import diagnosis.DiagnosisPackage;
import diagnosis.it3.mydsl.MyDiagInjectorProvider;
import diagnosis.it3.mydsl.tests.targetplatform.GeneratorGalaxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(MyDiagInjectorProvider.class)
@SuppressWarnings("all")
public class DiabetesMellitusTesis {
  @Inject
  private IGenerator generator;
  
  @Inject
  @Extension
  private ParseHelper<Diagnosis> parser;
  
  private Diagnosis diagnosis = null;
  
  private InMemoryFileSystemAccess fsa = null;
  
  private String filecontent = null;
  
  private String path = "src/diagnosis/it3/mydsl/tests/targetplatform/userStories/it3/";
  
  @Before
  public void testSetupOnce() {
    try {
      DiagnosisPackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Diagnose Diabetes Mellitus Type 2 (Analysis 1)");
      _builder.newLine();
      _builder.append("Read Variations genotypes from VCF file Patient1.vcf");
      _builder.newLine();
      _builder.append("Annotate Variations with gene, transcripts, polyphen");
      _builder.newLine();
      _builder.append("Filter Variations by genes {ABCC8, CAPN10, KCNJ11, GCGR, SLC2A2, HNF4A, INS, INSR, PPARG, TCFl2, ADIPOQ, AKT2, PAX4, MAPK81p1, GPD2, MNTR1B}");
      _builder.newLine();
      _builder.append("Filter Variations by predicted effect polyphen damaging");
      _builder.newLine();
      _builder.append("Report Variations with gene, predicted_effect");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      Diagnosis _parse = this.parser.parse(_builder);
      this.diagnosis = _parse;
      InMemoryFileSystemAccess _inMemoryFileSystemAccess = new InMemoryFileSystemAccess();
      this.fsa = _inMemoryFileSystemAccess;
      Resource _eResource = this.diagnosis.eResource();
      this.generator.doGenerate(_eResource, this.fsa);
      Map<String,CharSequence> _textFiles = this.fsa.getTextFiles();
      Collection<CharSequence> _values = _textFiles.values();
      Iterator<CharSequence> _iterator = _values.iterator();
      CharSequence _next = _iterator.next();
      String _string = _next.toString();
      this.filecontent = _string;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFilterPolyphenEffect() {
    try {
      String _concat = this.path.concat("US6_7_9_10_FilterPrioritizeSIFTPOLY_Ensembl.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "ensembl_id");
      Assert.assertTrue("The workflow fragment of filterByPolyphenEffect is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
