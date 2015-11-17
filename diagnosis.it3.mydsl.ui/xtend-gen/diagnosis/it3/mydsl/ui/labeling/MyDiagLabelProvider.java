/**
 * generated by Xtext
 */
package diagnosis.it3.mydsl.ui.labeling;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import diagnosis.Annotation;
import diagnosis.Diagnosis;
import diagnosis.EffectF;
import diagnosis.GeneF;
import diagnosis.HgvsS;
import diagnosis.MAFF;
import diagnosis.Order;
import diagnosis.PatientData;
import diagnosis.PredictionAlgorithm;
import diagnosis.Report;
import diagnosis.ReportVariations;
import diagnosis.ScoreF;
import diagnosis.Variations;
import diagnosis.Vcf;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class MyDiagLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public MyDiagLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Diagnosis filter) {
    return "Diagnosis";
  }
  
  public String text(final PatientData patient) {
    return "Read";
  }
  
  public String text(final Variations variations) {
    return "Variations";
  }
  
  public String text(final Vcf variations) {
    return "VCF";
  }
  
  public String text(final Annotation variations) {
    return "Annotate";
  }
  
  public String text(final HgvsS hgvs) {
    return "Search by hgvs ";
  }
  
  public String text(final GeneF gene) {
    return "Filter by Gene";
  }
  
  public String text(final MAFF maf) {
    String _xifexpression = null;
    Order _order = maf.getOrder();
    boolean _equals = Objects.equal(_order, null);
    if (_equals) {
      _xifexpression = "Filter by MAF";
    } else {
      _xifexpression = "Prioritize by MAF";
    }
    return _xifexpression;
  }
  
  public String text(final EffectF prediction) {
    String _xifexpression = null;
    Order _order = prediction.getOrder();
    boolean _equals = Objects.equal(_order, null);
    if (_equals) {
      PredictionAlgorithm _algorithm = prediction.getAlgorithm();
      String _plus = ("Filter by " + _algorithm);
      String _plus_1 = (_plus + " effect");
      _xifexpression = _plus_1;
    } else {
      PredictionAlgorithm _algorithm_1 = prediction.getAlgorithm();
      String _plus_2 = ("Prioritize by " + _algorithm_1);
      String _plus_3 = (_plus_2 + " effect");
      _xifexpression = _plus_3;
    }
    return _xifexpression;
  }
  
  public String text(final ScoreF prediction) {
    String _xifexpression = null;
    Order _order = prediction.getOrder();
    boolean _equals = Objects.equal(_order, null);
    if (_equals) {
      PredictionAlgorithm _algorithm = prediction.getAlgorithm();
      String _plus = ("Filter by " + _algorithm);
      String _plus_1 = (_plus + " score");
      _xifexpression = _plus_1;
    } else {
      PredictionAlgorithm _algorithm_1 = prediction.getAlgorithm();
      String _plus_2 = ("Prioritize by " + _algorithm_1);
      String _plus_3 = (_plus_2 + " score");
      _xifexpression = _plus_3;
    }
    return _xifexpression;
  }
  
  public String text(final Order order) {
    return "Order criteria";
  }
  
  public String text(final Report report) {
    return "Report";
  }
  
  public String text(final ReportVariations report) {
    return "Variations";
  }
}