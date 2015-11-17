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
public class LactoseIntolerance {
  @Inject
  private IGenerator generator;
  
  @Inject
  @Extension
  private ParseHelper<Diagnosis> parser;
  
  private Diagnosis diagnosis = null;
  
  private InMemoryFileSystemAccess fsa = null;
  
  private String filecontent = null;
  
  private String path = "src/diagnosis/it3/mydsl/tests/targetplatform/userStories/it1/";
  
  @Before
  public void testSetupOnce() {
    try {
      DiagnosisPackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Diagnose LactoseIntoleranceHGVSIt1");
      _builder.newLine();
      _builder.append("Read variations from a VCF file from input");
      _builder.newLine();
      _builder.append("Annotate variations with hgvs");
      _builder.newLine();
      _builder.append("Search variations ");
      _builder.newLine();
      _builder.append("NC_000002.11:g.136608646G>A");
      _builder.newLine();
      _builder.append("NC_000002.11:g.136616754C>A");
      _builder.newLine();
      _builder.append("Report variations with hgvs");
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
  public void testAnnotateHgvs() {
    try {
      String _concat = this.path.concat("US2_AnnotateHGVS.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "snpEff_iteration1");
      Assert.assertTrue("The workflow fragment of AnnotateHgvs is different to the generated one", _checkGeneratorGalaxy);
      String _concat_1 = this.path.concat("US2_AnnotateHGVS.ga");
      boolean _checkGeneratorGalaxy_1 = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat_1, "ensembl_iteration1");
      Assert.assertTrue("The workflow fragment of AnnotateHgvs is different to the generated one", _checkGeneratorGalaxy_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testsearchVariations() {
    try {
      String _concat = this.path.concat("US3_SearchHGVSDna.ga");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "snpSift_filter");
      Assert.assertTrue("The workflow fragment of SearchHgvsDNA is different to the generated one", _checkGeneratorGalaxy);
      String _concat_1 = this.path.concat("US4_SearchHGVSCoding.ga");
      boolean _checkGeneratorGalaxy_1 = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat_1, "snpSift_filter");
      Assert.assertTrue("The workflow fragment of SearchHgvsCoding is different to the generated one", _checkGeneratorGalaxy_1);
      String _concat_2 = this.path.concat("US5_SearchHGVSProtein.ga");
      boolean _checkGeneratorGalaxy_2 = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat_2, "filter_vep");
      Assert.assertTrue("The workflow fragment of SearchHgvsProtein is different to the generated one", _checkGeneratorGalaxy_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReportVariations() {
    try {
      String _concat = this.path.concat("US6_ReportVariations");
      boolean _checkGeneratorGalaxy = GeneratorGalaxy.checkGeneratorGalaxy(this.filecontent, _concat, "show_variations_iteration1");
      Assert.assertTrue("The workflow fragment of reportVariations is different to the generated one", _checkGeneratorGalaxy);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkFiles() {
    Map<String,Object> _allFiles = this.fsa.getAllFiles();
    int _size = _allFiles.size();
    Assert.assertEquals(1, _size);
  }
}
