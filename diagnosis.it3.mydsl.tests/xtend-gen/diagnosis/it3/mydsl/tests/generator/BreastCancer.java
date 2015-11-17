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
public class BreastCancer {
  @Inject
  private IGenerator generator;
  
  @Inject
  @Extension
  private ParseHelper<Diagnosis> parser;
  
  private Diagnosis diagnosis = null;
  
  private InMemoryFileSystemAccess fsa = null;
  
  private String filecontent = null;
  
  private String path = "src/diagnosis/it3/mydsl/tests/targetplatform/userStories/it2/";
  
  @Before
  public void testSetupOnce() {
    try {
      DiagnosisPackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Diagnose BreastCancerAll");
      _builder.newLine();
      _builder.append("Read variations from a VCF file from input");
      _builder.newLine();
      _builder.append("Annotate variations with hgvs gene rsId");
      _builder.newLine();
      _builder.append("Filter variations by gene BRCA1 BRCA2");
      _builder.newLine();
      _builder.append("Report variations with hgvs gene rsId");
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
  public void testAnnotateGene() {
    try {
      String _concat = this.path.concat("US1_AnnotateGene.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "snpeff_iteration2");
      Assert.assertTrue("The workflow fragment of AnnotateGene is different to the generated one", _checkGeneratorGalaxy);
      String _concat_1 = this.path.concat("US1_AnnotateGene.ga");
      boolean _checkGeneratorGalaxy_1 = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat_1, "ensembl_iteration2");
      Assert.assertTrue("The workflow fragment of AnnotateGene is different to the generated one", _checkGeneratorGalaxy_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotateRsId() {
    try {
      String _concat = this.path.concat("US2_AnnotatersId.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "snpSift_annotate");
      Assert.assertTrue("The workflow fragment of AnnotateRrsId is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFilterByGene() {
    try {
      String _concat = this.path.concat("US3_FilterByGene.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "snpSift_filter");
      Assert.assertTrue("The workflow fragment of FilterGene is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReportVariations() {
    try {
      String _concat = this.path.concat("US4_5_ReportVariations.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "show_variations_iteration2");
      Assert.assertTrue("The workflow fragment of ReportVariations is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
