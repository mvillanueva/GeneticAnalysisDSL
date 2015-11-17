package diagnosis.it3.mydsl.tests.parser;

import com.google.inject.Inject;
import diagnosis.Analysis;
import diagnosis.Diagnosis;
import diagnosis.DiagnosisPackage;
import diagnosis.Disease;
import diagnosis.DnaS;
import diagnosis.HgvsDna;
import diagnosis.it3.mydsl.MyDiagInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
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
  @Extension
  private ParseHelper<Diagnosis> parser;
  
  private Diagnosis diagnosis = null;
  
  @Before
  public void testSetupOnce() {
    try {
      DiagnosisPackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Diagnose LactoseIntolerance");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Load variations in vcf format from input");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Annotate hgvsdna");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Search NC_000002.11:g.136608646G>A");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("NC_000002.11:g.136616754C>A");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Report hgvs notation");
      _builder.newLine();
      Diagnosis _parse = this.parser.parse(_builder);
      this.diagnosis = _parse;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkName() {
    Disease _disease = this.diagnosis.getDisease();
    String _name = _disease.getName();
    Assert.assertEquals(_name, "LactoseIntolerance");
  }
  
  @Test
  public void checkVariations() {
    EList<Analysis> _analyses = this.diagnosis.getAnalyses();
    Analysis _get = _analyses.get(0);
    EList<HgvsDna> _hgvsdna = ((DnaS) _get).getHgvsdna();
    int _size = _hgvsdna.size();
    Assert.assertEquals(_size, 2);
  }
}
