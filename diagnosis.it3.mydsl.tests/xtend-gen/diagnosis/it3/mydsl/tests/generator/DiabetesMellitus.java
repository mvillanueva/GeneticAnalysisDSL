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
public class DiabetesMellitus {
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
      _builder.append("Find putative variants for DiabetesMellitusBrca23456");
      _builder.newLine();
      _builder.append("Read variations genotypes from a VCF file from input");
      _builder.newLine();
      _builder.append("Annotate variations with gene transcript Polyphen rsId Sift samples maf");
      _builder.newLine();
      _builder.append("Filter variations by gene BRCA2 INSRR");
      _builder.newLine();
      _builder.append("Filter variations by samples maf [0.2, 1.0]");
      _builder.newLine();
      _builder.append("Filter variations by Sift effect tolerated");
      _builder.newLine();
      _builder.append("Filter variations by Polyphen effect benign");
      _builder.newLine();
      _builder.append("Report variations with gene Sift Polyphen samples maf");
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
  public void testAnnotateTranscript() {
    try {
      String _concat = this.path.concat("US2_AnnotateTranscript.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "ensembl_iteration3");
      Assert.assertTrue("The workflow fragment of AnnotateTranscript is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotateSIFTPOLY() {
    try {
      String _concat = this.path.concat("US3_4_AnnotateSIFTPOLY.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "ensembl_iteration3");
      Assert.assertTrue("The workflow fragment of AnnotateSIFTPOLY is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotateMAF() {
    try {
      String _concat = this.path.concat("US5_AnnotateMAF.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "ensembl_iteration3");
      Assert.assertTrue("The workflow fragment of AnnotateMAF is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPrioritizeMAF() {
    try {
      String _concat = this.path.concat("US5_AnnotateMAF.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "sortMAF");
      Assert.assertTrue("The workflow fragment of PriotizeMAF is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFilterPrioritizeSIFTPOLY() {
    try {
      String _concat = this.path.concat("US6_7_9_10_FilterPrioritizeSIFTPOLY_Ensembl.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "ensembl_iteration3");
      Assert.assertTrue("The workflow fragment of FilterPrioritizeSIFTPOLY is different to the generated one", _checkGeneratorGalaxy);
      String _concat_1 = this.path.concat("US6_7_9_10_FilterPrioritizeSIFTPOLY");
      boolean _checkGeneratorGalaxy_1 = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat_1, "SPsort1.0");
      Assert.assertTrue("The workflow fragment of FilterPrioritizeSIFTPOLY is different to the generated one", _checkGeneratorGalaxy_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReportVariations() {
    try {
      String _concat = this.path.concat("US11_12_13_ReportVariations.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "show_variations_iteration3");
      Assert.assertTrue("The workflow fragment of ReportVariations is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
