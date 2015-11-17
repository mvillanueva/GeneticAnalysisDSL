/*
* generated by Xtext
*/
package diagnosis.it3.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import diagnosis.it3.mydsl.services.MyDiagGrammarAccess;

public class MyDiagParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDiagGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected diagnosis.it3.mydsl.ui.contentassist.antlr.internal.InternalMyDiagParser createParser() {
		diagnosis.it3.mydsl.ui.contentassist.antlr.internal.InternalMyDiagParser result = new diagnosis.it3.mydsl.ui.contentassist.antlr.internal.InternalMyDiagParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAnalysisAccess().getAlternatives(), "rule__Analysis__Alternatives");
					put(grammarAccess.getAnnotationAccess().getAlternatives_4(), "rule__Annotation__Alternatives_4");
					put(grammarAccess.getSearchAccess().getAlternatives(), "rule__Search__Alternatives");
					put(grammarAccess.getSearchAccess().getAlternatives_1_3(), "rule__Search__Alternatives_1_3");
					put(grammarAccess.getSearchAccess().getAlternatives_2_3(), "rule__Search__Alternatives_2_3");
					put(grammarAccess.getHgvsSAccess().getAlternatives_2(), "rule__HgvsS__Alternatives_2");
					put(grammarAccess.getPredictionFAccess().getAlternatives(), "rule__PredictionF__Alternatives");
					put(grammarAccess.getReportVariationsAccess().getAlternatives_3(), "rule__ReportVariations__Alternatives_3");
					put(grammarAccess.getDataFileAccess().getAlternatives_2(), "rule__DataFile__Alternatives_2");
					put(grammarAccess.getGeneAccess().getHgncIdAlternatives_0(), "rule__Gene__HgncIdAlternatives_0");
					put(grammarAccess.getRefSeqReferenceAccess().getIdentifierAlternatives_0(), "rule__RefSeqReference__IdentifierAlternatives_0");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getPredictionAlgorithmAccess().getAlternatives(), "rule__PredictionAlgorithm__Alternatives");
					put(grammarAccess.getOrderCriteriaAccess().getAlternatives(), "rule__OrderCriteria__Alternatives");
					put(grammarAccess.getEffectEnumAccess().getAlternatives(), "rule__EffectEnum__Alternatives");
					put(grammarAccess.getDiagnosisAccess().getGroup(), "rule__Diagnosis__Group__0");
					put(grammarAccess.getPatientDataAccess().getGroup(), "rule__PatientData__Group__0");
					put(grammarAccess.getVariationsAccess().getGroup(), "rule__Variations__Group__0");
					put(grammarAccess.getSeveralPatientsAccess().getGroup(), "rule__SeveralPatients__Group__0");
					put(grammarAccess.getVcfAccess().getGroup(), "rule__Vcf__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getHgvsAAccess().getGroup(), "rule__HgvsA__Group__0");
					put(grammarAccess.getGeneAAccess().getGroup(), "rule__GeneA__Group__0");
					put(grammarAccess.getTranscriptAAccess().getGroup(), "rule__TranscriptA__Group__0");
					put(grammarAccess.getRsIdAAccess().getGroup(), "rule__RsIdA__Group__0");
					put(grammarAccess.getMafAAccess().getGroup(), "rule__MafA__Group__0");
					put(grammarAccess.getSearchAccess().getGroup_1(), "rule__Search__Group_1__0");
					put(grammarAccess.getSearchAccess().getGroup_2(), "rule__Search__Group_2__0");
					put(grammarAccess.getHgvsSAccess().getGroup(), "rule__HgvsS__Group__0");
					put(grammarAccess.getGeneFAccess().getGroup(), "rule__GeneF__Group__0");
					put(grammarAccess.getMafFAccess().getGroup(), "rule__MafF__Group__0");
					put(grammarAccess.getEffectFAccess().getGroup(), "rule__EffectF__Group__0");
					put(grammarAccess.getScoreFAccess().getGroup(), "rule__ScoreF__Group__0");
					put(grammarAccess.getReportAccess().getGroup(), "rule__Report__Group__0");
					put(grammarAccess.getReportVariationsAccess().getGroup(), "rule__ReportVariations__Group__0");
					put(grammarAccess.getHgvsRAccess().getGroup(), "rule__HgvsR__Group__0");
					put(grammarAccess.getGeneRAccess().getGroup(), "rule__GeneR__Group__0");
					put(grammarAccess.getRsIdRAccess().getGroup(), "rule__RsIdR__Group__0");
					put(grammarAccess.getTranscriptRAccess().getGroup(), "rule__TranscriptR__Group__0");
					put(grammarAccess.getMafRAccess().getGroup(), "rule__MafR__Group__0");
					put(grammarAccess.getDataFileAccess().getGroup(), "rule__DataFile__Group__0");
					put(grammarAccess.getHgvsdnaAccess().getGroup(), "rule__Hgvsdna__Group__0");
					put(grammarAccess.getHgvscodingAccess().getGroup(), "rule__Hgvscoding__Group__0");
					put(grammarAccess.getHgvsproteinAccess().getGroup(), "rule__Hgvsprotein__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getDiagnosisAccess().getDiseaseAssignment_2(), "rule__Diagnosis__DiseaseAssignment_2");
					put(grammarAccess.getDiagnosisAccess().getPatientDataAssignment_3(), "rule__Diagnosis__PatientDataAssignment_3");
					put(grammarAccess.getDiagnosisAccess().getAnalysesAssignment_4(), "rule__Diagnosis__AnalysesAssignment_4");
					put(grammarAccess.getDiagnosisAccess().getReportAssignment_5(), "rule__Diagnosis__ReportAssignment_5");
					put(grammarAccess.getPatientDataAccess().getVariationsAssignment_1(), "rule__PatientData__VariationsAssignment_1");
					put(grammarAccess.getVariationsAccess().getSeveralAssignment_1(), "rule__Variations__SeveralAssignment_1");
					put(grammarAccess.getVariationsAccess().getFormatAssignment_2(), "rule__Variations__FormatAssignment_2");
					put(grammarAccess.getVcfAccess().getDatafileAssignment_2(), "rule__Vcf__DatafileAssignment_2");
					put(grammarAccess.getAnnotationAccess().getHgvsAssignment_4_0(), "rule__Annotation__HgvsAssignment_4_0");
					put(grammarAccess.getAnnotationAccess().getGeneAssignment_4_1(), "rule__Annotation__GeneAssignment_4_1");
					put(grammarAccess.getAnnotationAccess().getRsIdAssignment_4_2(), "rule__Annotation__RsIdAssignment_4_2");
					put(grammarAccess.getAnnotationAccess().getTranscriptAssignment_4_3(), "rule__Annotation__TranscriptAssignment_4_3");
					put(grammarAccess.getAnnotationAccess().getPredictionAssignment_4_4(), "rule__Annotation__PredictionAssignment_4_4");
					put(grammarAccess.getAnnotationAccess().getMafAssignment_4_5(), "rule__Annotation__MafAssignment_4_5");
					put(grammarAccess.getPredictionAAccess().getAlgorithmAssignment(), "rule__PredictionA__AlgorithmAssignment");
					put(grammarAccess.getSearchAccess().getOrderAssignment_2_4(), "rule__Search__OrderAssignment_2_4");
					put(grammarAccess.getDnaSAccess().getHgvsdnaAssignment(), "rule__DnaS__HgvsdnaAssignment");
					put(grammarAccess.getCodingSAccess().getHgvscodingAssignment(), "rule__CodingS__HgvscodingAssignment");
					put(grammarAccess.getProteinSAccess().getHgvsproteinAssignment(), "rule__ProteinS__HgvsproteinAssignment");
					put(grammarAccess.getGeneFAccess().getGeneAssignment_1(), "rule__GeneF__GeneAssignment_1");
					put(grammarAccess.getMafFAccess().getMinValueAssignment_2(), "rule__MafF__MinValueAssignment_2");
					put(grammarAccess.getMafFAccess().getMaxValueAssignment_4(), "rule__MafF__MaxValueAssignment_4");
					put(grammarAccess.getEffectFAccess().getAlgorithmAssignment_0(), "rule__EffectF__AlgorithmAssignment_0");
					put(grammarAccess.getEffectFAccess().getEffectAssignment_2(), "rule__EffectF__EffectAssignment_2");
					put(grammarAccess.getScoreFAccess().getAlgorithmAssignment_0(), "rule__ScoreF__AlgorithmAssignment_0");
					put(grammarAccess.getScoreFAccess().getMinScoreAssignment_3(), "rule__ScoreF__MinScoreAssignment_3");
					put(grammarAccess.getScoreFAccess().getMaxScoreAssignment_5(), "rule__ScoreF__MaxScoreAssignment_5");
					put(grammarAccess.getOrderAccess().getCriteriaAssignment(), "rule__Order__CriteriaAssignment");
					put(grammarAccess.getReportAccess().getReportVariationsAssignment_1(), "rule__Report__ReportVariationsAssignment_1");
					put(grammarAccess.getReportVariationsAccess().getHgvsAssignment_3_0(), "rule__ReportVariations__HgvsAssignment_3_0");
					put(grammarAccess.getReportVariationsAccess().getGeneAssignment_3_1(), "rule__ReportVariations__GeneAssignment_3_1");
					put(grammarAccess.getReportVariationsAccess().getRsIdAssignment_3_2(), "rule__ReportVariations__RsIdAssignment_3_2");
					put(grammarAccess.getReportVariationsAccess().getTranscriptAssignment_3_3(), "rule__ReportVariations__TranscriptAssignment_3_3");
					put(grammarAccess.getReportVariationsAccess().getPredictionAssignment_3_4(), "rule__ReportVariations__PredictionAssignment_3_4");
					put(grammarAccess.getReportVariationsAccess().getMafAssignment_3_5(), "rule__ReportVariations__MafAssignment_3_5");
					put(grammarAccess.getPredictionRAccess().getAlgorithmAssignment(), "rule__PredictionR__AlgorithmAssignment");
					put(grammarAccess.getDiseaseAccess().getNameAssignment(), "rule__Disease__NameAssignment");
					put(grammarAccess.getDataFileAccess().getDynamicAssignment_2_0(), "rule__DataFile__DynamicAssignment_2_0");
					put(grammarAccess.getDataFileAccess().getPathAssignment_2_1(), "rule__DataFile__PathAssignment_2_1");
					put(grammarAccess.getHgvsdnaAccess().getReferenceAssignment_0(), "rule__Hgvsdna__ReferenceAssignment_0");
					put(grammarAccess.getHgvsdnaAccess().getDescriptionAssignment_3(), "rule__Hgvsdna__DescriptionAssignment_3");
					put(grammarAccess.getHgvscodingAccess().getReferenceAssignment_0(), "rule__Hgvscoding__ReferenceAssignment_0");
					put(grammarAccess.getHgvscodingAccess().getDescriptionAssignment_3(), "rule__Hgvscoding__DescriptionAssignment_3");
					put(grammarAccess.getHgvsproteinAccess().getReferenceAssignment_0(), "rule__Hgvsprotein__ReferenceAssignment_0");
					put(grammarAccess.getHgvsproteinAccess().getDescriptionAssignment_3(), "rule__Hgvsprotein__DescriptionAssignment_3");
					put(grammarAccess.getGeneAccess().getHgncIdAssignment(), "rule__Gene__HgncIdAssignment");
					put(grammarAccess.getRefSeqReferenceAccess().getIdentifierAssignment(), "rule__RefSeqReference__IdentifierAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			diagnosis.it3.mydsl.ui.contentassist.antlr.internal.InternalMyDiagParser typedParser = (diagnosis.it3.mydsl.ui.contentassist.antlr.internal.InternalMyDiagParser) parser;
			typedParser.entryRulediagnosis();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDiagGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDiagGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
