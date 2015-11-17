package diagnosis.it3.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import diagnosis.it3.mydsl.services.MyDiagGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDiagParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HGNCGENE", "RULE_REFSEQ", "RULE_ASSEMBLY", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_INPUT", "RULE_HGVSEXPR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sift'", "'Polyphen'", "'AlphAsc'", "'AlphDes'", "'Max2Min'", "'Min2Max'", "'tolerated'", "'deleterious'", "'benign'", "'damaging'", "'probably damaging'", "'possibly damaging'", "'Find'", "'putative variants for'", "'Read'", "'variations'", "'genotypes'", "'from'", "'a VCF file'", "'Annotate'", "'with'", "'hgvs'", "'gene'", "'transcript'", "'rsId'", "'samples maf'", "'Filter'", "'by'", "'Prioritize'", "'Search'", "'['", "','", "']'", "'effect'", "'score'", "'Report'", "':'", "'g.'", "'c.'", "'p.'", "'-'", "'.'"
    };
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INPUT=10;
    public static final int RULE_HGNCGENE=4;
    public static final int RULE_REFSEQ=5;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_HGVSEXPR=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ASSEMBLY=6;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalMyDiagParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDiagParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDiagParser.tokenNames; }
    public String getGrammarFileName() { return "../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g"; }


     
     	private MyDiagGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDiagGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulediagnosis"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:60:1: entryRulediagnosis : rulediagnosis EOF ;
    public final void entryRulediagnosis() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:61:1: ( rulediagnosis EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:62:1: rulediagnosis EOF
            {
             before(grammarAccess.getDiagnosisRule()); 
            pushFollow(FollowSets000.FOLLOW_rulediagnosis_in_entryRulediagnosis61);
            rulediagnosis();

            state._fsp--;

             after(grammarAccess.getDiagnosisRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulediagnosis68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulediagnosis"


    // $ANTLR start "rulediagnosis"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:69:1: rulediagnosis : ( ( rule__Diagnosis__Group__0 ) ) ;
    public final void rulediagnosis() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:73:2: ( ( ( rule__Diagnosis__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:74:1: ( ( rule__Diagnosis__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:74:1: ( ( rule__Diagnosis__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:75:1: ( rule__Diagnosis__Group__0 )
            {
             before(grammarAccess.getDiagnosisAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:76:1: ( rule__Diagnosis__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:76:2: rule__Diagnosis__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__0_in_rulediagnosis94);
            rule__Diagnosis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagnosisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulediagnosis"


    // $ANTLR start "entryRulepatientData"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:88:1: entryRulepatientData : rulepatientData EOF ;
    public final void entryRulepatientData() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:89:1: ( rulepatientData EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:90:1: rulepatientData EOF
            {
             before(grammarAccess.getPatientDataRule()); 
            pushFollow(FollowSets000.FOLLOW_rulepatientData_in_entryRulepatientData121);
            rulepatientData();

            state._fsp--;

             after(grammarAccess.getPatientDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulepatientData128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepatientData"


    // $ANTLR start "rulepatientData"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:97:1: rulepatientData : ( ( rule__PatientData__Group__0 ) ) ;
    public final void rulepatientData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:101:2: ( ( ( rule__PatientData__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:102:1: ( ( rule__PatientData__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:102:1: ( ( rule__PatientData__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:103:1: ( rule__PatientData__Group__0 )
            {
             before(grammarAccess.getPatientDataAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:104:1: ( rule__PatientData__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:104:2: rule__PatientData__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PatientData__Group__0_in_rulepatientData154);
            rule__PatientData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatientDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepatientData"


    // $ANTLR start "entryRulevariations"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:116:1: entryRulevariations : rulevariations EOF ;
    public final void entryRulevariations() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:117:1: ( rulevariations EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:118:1: rulevariations EOF
            {
             before(grammarAccess.getVariationsRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevariations_in_entryRulevariations181);
            rulevariations();

            state._fsp--;

             after(grammarAccess.getVariationsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevariations188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariations"


    // $ANTLR start "rulevariations"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:125:1: rulevariations : ( ( rule__Variations__Group__0 ) ) ;
    public final void rulevariations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:129:2: ( ( ( rule__Variations__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:130:1: ( ( rule__Variations__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:130:1: ( ( rule__Variations__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:131:1: ( rule__Variations__Group__0 )
            {
             before(grammarAccess.getVariationsAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:132:1: ( rule__Variations__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:132:2: rule__Variations__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variations__Group__0_in_rulevariations214);
            rule__Variations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariations"


    // $ANTLR start "entryRuleseveralPatients"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:144:1: entryRuleseveralPatients : ruleseveralPatients EOF ;
    public final void entryRuleseveralPatients() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:145:1: ( ruleseveralPatients EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:146:1: ruleseveralPatients EOF
            {
             before(grammarAccess.getSeveralPatientsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleseveralPatients_in_entryRuleseveralPatients241);
            ruleseveralPatients();

            state._fsp--;

             after(grammarAccess.getSeveralPatientsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleseveralPatients248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleseveralPatients"


    // $ANTLR start "ruleseveralPatients"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:153:1: ruleseveralPatients : ( ( rule__SeveralPatients__Group__0 ) ) ;
    public final void ruleseveralPatients() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:157:2: ( ( ( rule__SeveralPatients__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:158:1: ( ( rule__SeveralPatients__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:158:1: ( ( rule__SeveralPatients__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:159:1: ( rule__SeveralPatients__Group__0 )
            {
             before(grammarAccess.getSeveralPatientsAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:160:1: ( rule__SeveralPatients__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:160:2: rule__SeveralPatients__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SeveralPatients__Group__0_in_ruleseveralPatients274);
            rule__SeveralPatients__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeveralPatientsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleseveralPatients"


    // $ANTLR start "entryRulevcf"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:172:1: entryRulevcf : rulevcf EOF ;
    public final void entryRulevcf() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:173:1: ( rulevcf EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:174:1: rulevcf EOF
            {
             before(grammarAccess.getVcfRule()); 
            pushFollow(FollowSets000.FOLLOW_rulevcf_in_entryRulevcf301);
            rulevcf();

            state._fsp--;

             after(grammarAccess.getVcfRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevcf308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevcf"


    // $ANTLR start "rulevcf"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:181:1: rulevcf : ( ( rule__Vcf__Group__0 ) ) ;
    public final void rulevcf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:185:2: ( ( ( rule__Vcf__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:186:1: ( ( rule__Vcf__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:186:1: ( ( rule__Vcf__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:187:1: ( rule__Vcf__Group__0 )
            {
             before(grammarAccess.getVcfAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:188:1: ( rule__Vcf__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:188:2: rule__Vcf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vcf__Group__0_in_rulevcf334);
            rule__Vcf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVcfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevcf"


    // $ANTLR start "entryRuleanalysis"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:200:1: entryRuleanalysis : ruleanalysis EOF ;
    public final void entryRuleanalysis() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:201:1: ( ruleanalysis EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:202:1: ruleanalysis EOF
            {
             before(grammarAccess.getAnalysisRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleanalysis_in_entryRuleanalysis361);
            ruleanalysis();

            state._fsp--;

             after(grammarAccess.getAnalysisRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleanalysis368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleanalysis"


    // $ANTLR start "ruleanalysis"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:209:1: ruleanalysis : ( ( rule__Analysis__Alternatives ) ) ;
    public final void ruleanalysis() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:213:2: ( ( ( rule__Analysis__Alternatives ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:214:1: ( ( rule__Analysis__Alternatives ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:214:1: ( ( rule__Analysis__Alternatives ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:215:1: ( rule__Analysis__Alternatives )
            {
             before(grammarAccess.getAnalysisAccess().getAlternatives()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:216:1: ( rule__Analysis__Alternatives )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:216:2: rule__Analysis__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Analysis__Alternatives_in_ruleanalysis394);
            rule__Analysis__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleanalysis"


    // $ANTLR start "entryRuleannotation"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:228:1: entryRuleannotation : ruleannotation EOF ;
    public final void entryRuleannotation() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:229:1: ( ruleannotation EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:230:1: ruleannotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleannotation_in_entryRuleannotation421);
            ruleannotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleannotation428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleannotation"


    // $ANTLR start "ruleannotation"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:237:1: ruleannotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleannotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:241:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:242:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:242:1: ( ( rule__Annotation__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:243:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:244:1: ( rule__Annotation__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:244:2: rule__Annotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__0_in_ruleannotation454);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleannotation"


    // $ANTLR start "entryRulehgvsA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:256:1: entryRulehgvsA : rulehgvsA EOF ;
    public final void entryRulehgvsA() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:257:1: ( rulehgvsA EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:258:1: rulehgvsA EOF
            {
             before(grammarAccess.getHgvsARule()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsA_in_entryRulehgvsA481);
            rulehgvsA();

            state._fsp--;

             after(grammarAccess.getHgvsARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulehgvsA488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehgvsA"


    // $ANTLR start "rulehgvsA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:265:1: rulehgvsA : ( ( rule__HgvsA__Group__0 ) ) ;
    public final void rulehgvsA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:269:2: ( ( ( rule__HgvsA__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:270:1: ( ( rule__HgvsA__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:270:1: ( ( rule__HgvsA__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:271:1: ( rule__HgvsA__Group__0 )
            {
             before(grammarAccess.getHgvsAAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:272:1: ( rule__HgvsA__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:272:2: rule__HgvsA__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsA__Group__0_in_rulehgvsA514);
            rule__HgvsA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHgvsAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehgvsA"


    // $ANTLR start "entryRulegeneA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:284:1: entryRulegeneA : rulegeneA EOF ;
    public final void entryRulegeneA() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:285:1: ( rulegeneA EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:286:1: rulegeneA EOF
            {
             before(grammarAccess.getGeneARule()); 
            pushFollow(FollowSets000.FOLLOW_rulegeneA_in_entryRulegeneA541);
            rulegeneA();

            state._fsp--;

             after(grammarAccess.getGeneARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulegeneA548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegeneA"


    // $ANTLR start "rulegeneA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:293:1: rulegeneA : ( ( rule__GeneA__Group__0 ) ) ;
    public final void rulegeneA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:297:2: ( ( ( rule__GeneA__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:298:1: ( ( rule__GeneA__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:298:1: ( ( rule__GeneA__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:299:1: ( rule__GeneA__Group__0 )
            {
             before(grammarAccess.getGeneAAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:300:1: ( rule__GeneA__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:300:2: rule__GeneA__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneA__Group__0_in_rulegeneA574);
            rule__GeneA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegeneA"


    // $ANTLR start "entryRuletranscriptA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:312:1: entryRuletranscriptA : ruletranscriptA EOF ;
    public final void entryRuletranscriptA() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:313:1: ( ruletranscriptA EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:314:1: ruletranscriptA EOF
            {
             before(grammarAccess.getTranscriptARule()); 
            pushFollow(FollowSets000.FOLLOW_ruletranscriptA_in_entryRuletranscriptA601);
            ruletranscriptA();

            state._fsp--;

             after(grammarAccess.getTranscriptARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletranscriptA608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletranscriptA"


    // $ANTLR start "ruletranscriptA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:321:1: ruletranscriptA : ( ( rule__TranscriptA__Group__0 ) ) ;
    public final void ruletranscriptA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:325:2: ( ( ( rule__TranscriptA__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:326:1: ( ( rule__TranscriptA__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:326:1: ( ( rule__TranscriptA__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:327:1: ( rule__TranscriptA__Group__0 )
            {
             before(grammarAccess.getTranscriptAAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:328:1: ( rule__TranscriptA__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:328:2: rule__TranscriptA__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TranscriptA__Group__0_in_ruletranscriptA634);
            rule__TranscriptA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTranscriptAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletranscriptA"


    // $ANTLR start "entryRulepredictionA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:340:1: entryRulepredictionA : rulepredictionA EOF ;
    public final void entryRulepredictionA() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:341:1: ( rulepredictionA EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:342:1: rulepredictionA EOF
            {
             before(grammarAccess.getPredictionARule()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionA_in_entryRulepredictionA661);
            rulepredictionA();

            state._fsp--;

             after(grammarAccess.getPredictionARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulepredictionA668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepredictionA"


    // $ANTLR start "rulepredictionA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:349:1: rulepredictionA : ( ( rule__PredictionA__AlgorithmAssignment ) ) ;
    public final void rulepredictionA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:353:2: ( ( ( rule__PredictionA__AlgorithmAssignment ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:354:1: ( ( rule__PredictionA__AlgorithmAssignment ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:354:1: ( ( rule__PredictionA__AlgorithmAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:355:1: ( rule__PredictionA__AlgorithmAssignment )
            {
             before(grammarAccess.getPredictionAAccess().getAlgorithmAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:356:1: ( rule__PredictionA__AlgorithmAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:356:2: rule__PredictionA__AlgorithmAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__PredictionA__AlgorithmAssignment_in_rulepredictionA694);
            rule__PredictionA__AlgorithmAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPredictionAAccess().getAlgorithmAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepredictionA"


    // $ANTLR start "entryRulersIdA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:368:1: entryRulersIdA : rulersIdA EOF ;
    public final void entryRulersIdA() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:369:1: ( rulersIdA EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:370:1: rulersIdA EOF
            {
             before(grammarAccess.getRsIdARule()); 
            pushFollow(FollowSets000.FOLLOW_rulersIdA_in_entryRulersIdA721);
            rulersIdA();

            state._fsp--;

             after(grammarAccess.getRsIdARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulersIdA728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulersIdA"


    // $ANTLR start "rulersIdA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:377:1: rulersIdA : ( ( rule__RsIdA__Group__0 ) ) ;
    public final void rulersIdA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:381:2: ( ( ( rule__RsIdA__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:382:1: ( ( rule__RsIdA__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:382:1: ( ( rule__RsIdA__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:383:1: ( rule__RsIdA__Group__0 )
            {
             before(grammarAccess.getRsIdAAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:384:1: ( rule__RsIdA__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:384:2: rule__RsIdA__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RsIdA__Group__0_in_rulersIdA754);
            rule__RsIdA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRsIdAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulersIdA"


    // $ANTLR start "entryRulemafA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:396:1: entryRulemafA : rulemafA EOF ;
    public final void entryRulemafA() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:397:1: ( rulemafA EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:398:1: rulemafA EOF
            {
             before(grammarAccess.getMafARule()); 
            pushFollow(FollowSets000.FOLLOW_rulemafA_in_entryRulemafA781);
            rulemafA();

            state._fsp--;

             after(grammarAccess.getMafARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemafA788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemafA"


    // $ANTLR start "rulemafA"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:405:1: rulemafA : ( ( rule__MafA__Group__0 ) ) ;
    public final void rulemafA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:409:2: ( ( ( rule__MafA__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:410:1: ( ( rule__MafA__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:410:1: ( ( rule__MafA__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:411:1: ( rule__MafA__Group__0 )
            {
             before(grammarAccess.getMafAAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:412:1: ( rule__MafA__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:412:2: rule__MafA__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafA__Group__0_in_rulemafA814);
            rule__MafA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMafAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemafA"


    // $ANTLR start "entryRulesearch"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:424:1: entryRulesearch : rulesearch EOF ;
    public final void entryRulesearch() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:425:1: ( rulesearch EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:426:1: rulesearch EOF
            {
             before(grammarAccess.getSearchRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesearch_in_entryRulesearch841);
            rulesearch();

            state._fsp--;

             after(grammarAccess.getSearchRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesearch848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesearch"


    // $ANTLR start "rulesearch"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:433:1: rulesearch : ( ( rule__Search__Alternatives ) ) ;
    public final void rulesearch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:437:2: ( ( ( rule__Search__Alternatives ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:438:1: ( ( rule__Search__Alternatives ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:438:1: ( ( rule__Search__Alternatives ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:439:1: ( rule__Search__Alternatives )
            {
             before(grammarAccess.getSearchAccess().getAlternatives()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:440:1: ( rule__Search__Alternatives )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:440:2: rule__Search__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Alternatives_in_rulesearch874);
            rule__Search__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesearch"


    // $ANTLR start "entryRulehgvsS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:452:1: entryRulehgvsS : rulehgvsS EOF ;
    public final void entryRulehgvsS() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:453:1: ( rulehgvsS EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:454:1: rulehgvsS EOF
            {
             before(grammarAccess.getHgvsSRule()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsS_in_entryRulehgvsS901);
            rulehgvsS();

            state._fsp--;

             after(grammarAccess.getHgvsSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulehgvsS908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehgvsS"


    // $ANTLR start "rulehgvsS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:461:1: rulehgvsS : ( ( rule__HgvsS__Group__0 ) ) ;
    public final void rulehgvsS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:465:2: ( ( ( rule__HgvsS__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:466:1: ( ( rule__HgvsS__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:466:1: ( ( rule__HgvsS__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:467:1: ( rule__HgvsS__Group__0 )
            {
             before(grammarAccess.getHgvsSAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:468:1: ( rule__HgvsS__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:468:2: rule__HgvsS__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsS__Group__0_in_rulehgvsS934);
            rule__HgvsS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHgvsSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehgvsS"


    // $ANTLR start "entryRulednaS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:480:1: entryRulednaS : rulednaS EOF ;
    public final void entryRulednaS() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:481:1: ( rulednaS EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:482:1: rulednaS EOF
            {
             before(grammarAccess.getDnaSRule()); 
            pushFollow(FollowSets000.FOLLOW_rulednaS_in_entryRulednaS961);
            rulednaS();

            state._fsp--;

             after(grammarAccess.getDnaSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulednaS968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulednaS"


    // $ANTLR start "rulednaS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:489:1: rulednaS : ( ( ( rule__DnaS__HgvsdnaAssignment ) ) ( ( rule__DnaS__HgvsdnaAssignment )* ) ) ;
    public final void rulednaS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:493:2: ( ( ( ( rule__DnaS__HgvsdnaAssignment ) ) ( ( rule__DnaS__HgvsdnaAssignment )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:494:1: ( ( ( rule__DnaS__HgvsdnaAssignment ) ) ( ( rule__DnaS__HgvsdnaAssignment )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:494:1: ( ( ( rule__DnaS__HgvsdnaAssignment ) ) ( ( rule__DnaS__HgvsdnaAssignment )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:495:1: ( ( rule__DnaS__HgvsdnaAssignment ) ) ( ( rule__DnaS__HgvsdnaAssignment )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:495:1: ( ( rule__DnaS__HgvsdnaAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:496:1: ( rule__DnaS__HgvsdnaAssignment )
            {
             before(grammarAccess.getDnaSAccess().getHgvsdnaAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:497:1: ( rule__DnaS__HgvsdnaAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:497:2: rule__DnaS__HgvsdnaAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__DnaS__HgvsdnaAssignment_in_rulednaS996);
            rule__DnaS__HgvsdnaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDnaSAccess().getHgvsdnaAssignment()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:500:1: ( ( rule__DnaS__HgvsdnaAssignment )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:501:1: ( rule__DnaS__HgvsdnaAssignment )*
            {
             before(grammarAccess.getDnaSAccess().getHgvsdnaAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:502:1: ( rule__DnaS__HgvsdnaAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_REFSEQ && LA1_0<=RULE_ASSEMBLY)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:502:2: rule__DnaS__HgvsdnaAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DnaS__HgvsdnaAssignment_in_rulednaS1008);
            	    rule__DnaS__HgvsdnaAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDnaSAccess().getHgvsdnaAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulednaS"


    // $ANTLR start "entryRulecodingS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:515:1: entryRulecodingS : rulecodingS EOF ;
    public final void entryRulecodingS() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:516:1: ( rulecodingS EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:517:1: rulecodingS EOF
            {
             before(grammarAccess.getCodingSRule()); 
            pushFollow(FollowSets000.FOLLOW_rulecodingS_in_entryRulecodingS1038);
            rulecodingS();

            state._fsp--;

             after(grammarAccess.getCodingSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecodingS1045); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecodingS"


    // $ANTLR start "rulecodingS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:524:1: rulecodingS : ( ( ( rule__CodingS__HgvscodingAssignment ) ) ( ( rule__CodingS__HgvscodingAssignment )* ) ) ;
    public final void rulecodingS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:528:2: ( ( ( ( rule__CodingS__HgvscodingAssignment ) ) ( ( rule__CodingS__HgvscodingAssignment )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:529:1: ( ( ( rule__CodingS__HgvscodingAssignment ) ) ( ( rule__CodingS__HgvscodingAssignment )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:529:1: ( ( ( rule__CodingS__HgvscodingAssignment ) ) ( ( rule__CodingS__HgvscodingAssignment )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:530:1: ( ( rule__CodingS__HgvscodingAssignment ) ) ( ( rule__CodingS__HgvscodingAssignment )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:530:1: ( ( rule__CodingS__HgvscodingAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:531:1: ( rule__CodingS__HgvscodingAssignment )
            {
             before(grammarAccess.getCodingSAccess().getHgvscodingAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:532:1: ( rule__CodingS__HgvscodingAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:532:2: rule__CodingS__HgvscodingAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CodingS__HgvscodingAssignment_in_rulecodingS1073);
            rule__CodingS__HgvscodingAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCodingSAccess().getHgvscodingAssignment()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:535:1: ( ( rule__CodingS__HgvscodingAssignment )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:536:1: ( rule__CodingS__HgvscodingAssignment )*
            {
             before(grammarAccess.getCodingSAccess().getHgvscodingAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:537:1: ( rule__CodingS__HgvscodingAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_REFSEQ && LA2_0<=RULE_ASSEMBLY)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:537:2: rule__CodingS__HgvscodingAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CodingS__HgvscodingAssignment_in_rulecodingS1085);
            	    rule__CodingS__HgvscodingAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCodingSAccess().getHgvscodingAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecodingS"


    // $ANTLR start "entryRuleproteinS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:550:1: entryRuleproteinS : ruleproteinS EOF ;
    public final void entryRuleproteinS() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:551:1: ( ruleproteinS EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:552:1: ruleproteinS EOF
            {
             before(grammarAccess.getProteinSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleproteinS_in_entryRuleproteinS1115);
            ruleproteinS();

            state._fsp--;

             after(grammarAccess.getProteinSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleproteinS1122); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleproteinS"


    // $ANTLR start "ruleproteinS"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:559:1: ruleproteinS : ( ( ( rule__ProteinS__HgvsproteinAssignment ) ) ( ( rule__ProteinS__HgvsproteinAssignment )* ) ) ;
    public final void ruleproteinS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:563:2: ( ( ( ( rule__ProteinS__HgvsproteinAssignment ) ) ( ( rule__ProteinS__HgvsproteinAssignment )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:564:1: ( ( ( rule__ProteinS__HgvsproteinAssignment ) ) ( ( rule__ProteinS__HgvsproteinAssignment )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:564:1: ( ( ( rule__ProteinS__HgvsproteinAssignment ) ) ( ( rule__ProteinS__HgvsproteinAssignment )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:565:1: ( ( rule__ProteinS__HgvsproteinAssignment ) ) ( ( rule__ProteinS__HgvsproteinAssignment )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:565:1: ( ( rule__ProteinS__HgvsproteinAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:566:1: ( rule__ProteinS__HgvsproteinAssignment )
            {
             before(grammarAccess.getProteinSAccess().getHgvsproteinAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:567:1: ( rule__ProteinS__HgvsproteinAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:567:2: rule__ProteinS__HgvsproteinAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProteinS__HgvsproteinAssignment_in_ruleproteinS1150);
            rule__ProteinS__HgvsproteinAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProteinSAccess().getHgvsproteinAssignment()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:570:1: ( ( rule__ProteinS__HgvsproteinAssignment )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:571:1: ( rule__ProteinS__HgvsproteinAssignment )*
            {
             before(grammarAccess.getProteinSAccess().getHgvsproteinAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:572:1: ( rule__ProteinS__HgvsproteinAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_REFSEQ && LA3_0<=RULE_ASSEMBLY)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:572:2: rule__ProteinS__HgvsproteinAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ProteinS__HgvsproteinAssignment_in_ruleproteinS1162);
            	    rule__ProteinS__HgvsproteinAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProteinSAccess().getHgvsproteinAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleproteinS"


    // $ANTLR start "entryRulegeneF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:585:1: entryRulegeneF : rulegeneF EOF ;
    public final void entryRulegeneF() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:586:1: ( rulegeneF EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:587:1: rulegeneF EOF
            {
             before(grammarAccess.getGeneFRule()); 
            pushFollow(FollowSets000.FOLLOW_rulegeneF_in_entryRulegeneF1192);
            rulegeneF();

            state._fsp--;

             after(grammarAccess.getGeneFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulegeneF1199); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegeneF"


    // $ANTLR start "rulegeneF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:594:1: rulegeneF : ( ( rule__GeneF__Group__0 ) ) ;
    public final void rulegeneF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:598:2: ( ( ( rule__GeneF__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:599:1: ( ( rule__GeneF__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:599:1: ( ( rule__GeneF__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:600:1: ( rule__GeneF__Group__0 )
            {
             before(grammarAccess.getGeneFAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:601:1: ( rule__GeneF__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:601:2: rule__GeneF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneF__Group__0_in_rulegeneF1225);
            rule__GeneF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegeneF"


    // $ANTLR start "entryRulepredictionF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:613:1: entryRulepredictionF : rulepredictionF EOF ;
    public final void entryRulepredictionF() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:614:1: ( rulepredictionF EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:615:1: rulepredictionF EOF
            {
             before(grammarAccess.getPredictionFRule()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionF_in_entryRulepredictionF1252);
            rulepredictionF();

            state._fsp--;

             after(grammarAccess.getPredictionFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulepredictionF1259); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepredictionF"


    // $ANTLR start "rulepredictionF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:622:1: rulepredictionF : ( ( rule__PredictionF__Alternatives ) ) ;
    public final void rulepredictionF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:626:2: ( ( ( rule__PredictionF__Alternatives ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:627:1: ( ( rule__PredictionF__Alternatives ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:627:1: ( ( rule__PredictionF__Alternatives ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:628:1: ( rule__PredictionF__Alternatives )
            {
             before(grammarAccess.getPredictionFAccess().getAlternatives()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:629:1: ( rule__PredictionF__Alternatives )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:629:2: rule__PredictionF__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PredictionF__Alternatives_in_rulepredictionF1285);
            rule__PredictionF__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredictionFAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepredictionF"


    // $ANTLR start "entryRulemafF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:641:1: entryRulemafF : rulemafF EOF ;
    public final void entryRulemafF() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:642:1: ( rulemafF EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:643:1: rulemafF EOF
            {
             before(grammarAccess.getMafFRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemafF_in_entryRulemafF1312);
            rulemafF();

            state._fsp--;

             after(grammarAccess.getMafFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemafF1319); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemafF"


    // $ANTLR start "rulemafF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:650:1: rulemafF : ( ( rule__MafF__Group__0 ) ) ;
    public final void rulemafF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:654:2: ( ( ( rule__MafF__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:655:1: ( ( rule__MafF__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:655:1: ( ( rule__MafF__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:656:1: ( rule__MafF__Group__0 )
            {
             before(grammarAccess.getMafFAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:657:1: ( rule__MafF__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:657:2: rule__MafF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__0_in_rulemafF1345);
            rule__MafF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMafFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemafF"


    // $ANTLR start "entryRuleeffectF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:669:1: entryRuleeffectF : ruleeffectF EOF ;
    public final void entryRuleeffectF() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:670:1: ( ruleeffectF EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:671:1: ruleeffectF EOF
            {
             before(grammarAccess.getEffectFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleeffectF_in_entryRuleeffectF1372);
            ruleeffectF();

            state._fsp--;

             after(grammarAccess.getEffectFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleeffectF1379); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleeffectF"


    // $ANTLR start "ruleeffectF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:678:1: ruleeffectF : ( ( rule__EffectF__Group__0 ) ) ;
    public final void ruleeffectF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:682:2: ( ( ( rule__EffectF__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:683:1: ( ( rule__EffectF__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:683:1: ( ( rule__EffectF__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:684:1: ( rule__EffectF__Group__0 )
            {
             before(grammarAccess.getEffectFAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:685:1: ( rule__EffectF__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:685:2: rule__EffectF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EffectF__Group__0_in_ruleeffectF1405);
            rule__EffectF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleeffectF"


    // $ANTLR start "entryRulescoreF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:697:1: entryRulescoreF : rulescoreF EOF ;
    public final void entryRulescoreF() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:698:1: ( rulescoreF EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:699:1: rulescoreF EOF
            {
             before(grammarAccess.getScoreFRule()); 
            pushFollow(FollowSets000.FOLLOW_rulescoreF_in_entryRulescoreF1432);
            rulescoreF();

            state._fsp--;

             after(grammarAccess.getScoreFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulescoreF1439); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulescoreF"


    // $ANTLR start "rulescoreF"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:706:1: rulescoreF : ( ( rule__ScoreF__Group__0 ) ) ;
    public final void rulescoreF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:710:2: ( ( ( rule__ScoreF__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:711:1: ( ( rule__ScoreF__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:711:1: ( ( rule__ScoreF__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:712:1: ( rule__ScoreF__Group__0 )
            {
             before(grammarAccess.getScoreFAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:713:1: ( rule__ScoreF__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:713:2: rule__ScoreF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__0_in_rulescoreF1465);
            rule__ScoreF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScoreFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulescoreF"


    // $ANTLR start "entryRuleorder"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:725:1: entryRuleorder : ruleorder EOF ;
    public final void entryRuleorder() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:726:1: ( ruleorder EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:727:1: ruleorder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleorder_in_entryRuleorder1492);
            ruleorder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleorder1499); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleorder"


    // $ANTLR start "ruleorder"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:734:1: ruleorder : ( ( rule__Order__CriteriaAssignment ) ) ;
    public final void ruleorder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:738:2: ( ( ( rule__Order__CriteriaAssignment ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:739:1: ( ( rule__Order__CriteriaAssignment ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:739:1: ( ( rule__Order__CriteriaAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:740:1: ( rule__Order__CriteriaAssignment )
            {
             before(grammarAccess.getOrderAccess().getCriteriaAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:741:1: ( rule__Order__CriteriaAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:741:2: rule__Order__CriteriaAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Order__CriteriaAssignment_in_ruleorder1525);
            rule__Order__CriteriaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getCriteriaAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleorder"


    // $ANTLR start "entryRulereport"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:753:1: entryRulereport : rulereport EOF ;
    public final void entryRulereport() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:754:1: ( rulereport EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:755:1: rulereport EOF
            {
             before(grammarAccess.getReportRule()); 
            pushFollow(FollowSets000.FOLLOW_rulereport_in_entryRulereport1552);
            rulereport();

            state._fsp--;

             after(grammarAccess.getReportRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulereport1559); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulereport"


    // $ANTLR start "rulereport"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:762:1: rulereport : ( ( rule__Report__Group__0 ) ) ;
    public final void rulereport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:766:2: ( ( ( rule__Report__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:767:1: ( ( rule__Report__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:767:1: ( ( rule__Report__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:768:1: ( rule__Report__Group__0 )
            {
             before(grammarAccess.getReportAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:769:1: ( rule__Report__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:769:2: rule__Report__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Report__Group__0_in_rulereport1585);
            rule__Report__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulereport"


    // $ANTLR start "entryRulereportVariations"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:781:1: entryRulereportVariations : rulereportVariations EOF ;
    public final void entryRulereportVariations() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:782:1: ( rulereportVariations EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:783:1: rulereportVariations EOF
            {
             before(grammarAccess.getReportVariationsRule()); 
            pushFollow(FollowSets000.FOLLOW_rulereportVariations_in_entryRulereportVariations1612);
            rulereportVariations();

            state._fsp--;

             after(grammarAccess.getReportVariationsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulereportVariations1619); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulereportVariations"


    // $ANTLR start "rulereportVariations"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:790:1: rulereportVariations : ( ( rule__ReportVariations__Group__0 ) ) ;
    public final void rulereportVariations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:794:2: ( ( ( rule__ReportVariations__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:795:1: ( ( rule__ReportVariations__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:795:1: ( ( rule__ReportVariations__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:796:1: ( rule__ReportVariations__Group__0 )
            {
             before(grammarAccess.getReportVariationsAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:797:1: ( rule__ReportVariations__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:797:2: rule__ReportVariations__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__0_in_rulereportVariations1645);
            rule__ReportVariations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReportVariationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulereportVariations"


    // $ANTLR start "entryRulehgvsR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:809:1: entryRulehgvsR : rulehgvsR EOF ;
    public final void entryRulehgvsR() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:810:1: ( rulehgvsR EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:811:1: rulehgvsR EOF
            {
             before(grammarAccess.getHgvsRRule()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsR_in_entryRulehgvsR1672);
            rulehgvsR();

            state._fsp--;

             after(grammarAccess.getHgvsRRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulehgvsR1679); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehgvsR"


    // $ANTLR start "rulehgvsR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:818:1: rulehgvsR : ( ( rule__HgvsR__Group__0 ) ) ;
    public final void rulehgvsR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:822:2: ( ( ( rule__HgvsR__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:823:1: ( ( rule__HgvsR__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:823:1: ( ( rule__HgvsR__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:824:1: ( rule__HgvsR__Group__0 )
            {
             before(grammarAccess.getHgvsRAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:825:1: ( rule__HgvsR__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:825:2: rule__HgvsR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsR__Group__0_in_rulehgvsR1705);
            rule__HgvsR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHgvsRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehgvsR"


    // $ANTLR start "entryRulegeneR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:837:1: entryRulegeneR : rulegeneR EOF ;
    public final void entryRulegeneR() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:838:1: ( rulegeneR EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:839:1: rulegeneR EOF
            {
             before(grammarAccess.getGeneRRule()); 
            pushFollow(FollowSets000.FOLLOW_rulegeneR_in_entryRulegeneR1732);
            rulegeneR();

            state._fsp--;

             after(grammarAccess.getGeneRRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulegeneR1739); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegeneR"


    // $ANTLR start "rulegeneR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:846:1: rulegeneR : ( ( rule__GeneR__Group__0 ) ) ;
    public final void rulegeneR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:850:2: ( ( ( rule__GeneR__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:851:1: ( ( rule__GeneR__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:851:1: ( ( rule__GeneR__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:852:1: ( rule__GeneR__Group__0 )
            {
             before(grammarAccess.getGeneRAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:853:1: ( rule__GeneR__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:853:2: rule__GeneR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneR__Group__0_in_rulegeneR1765);
            rule__GeneR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegeneR"


    // $ANTLR start "entryRulersIdR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:865:1: entryRulersIdR : rulersIdR EOF ;
    public final void entryRulersIdR() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:866:1: ( rulersIdR EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:867:1: rulersIdR EOF
            {
             before(grammarAccess.getRsIdRRule()); 
            pushFollow(FollowSets000.FOLLOW_rulersIdR_in_entryRulersIdR1792);
            rulersIdR();

            state._fsp--;

             after(grammarAccess.getRsIdRRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulersIdR1799); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulersIdR"


    // $ANTLR start "rulersIdR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:874:1: rulersIdR : ( ( rule__RsIdR__Group__0 ) ) ;
    public final void rulersIdR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:878:2: ( ( ( rule__RsIdR__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:879:1: ( ( rule__RsIdR__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:879:1: ( ( rule__RsIdR__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:880:1: ( rule__RsIdR__Group__0 )
            {
             before(grammarAccess.getRsIdRAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:881:1: ( rule__RsIdR__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:881:2: rule__RsIdR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RsIdR__Group__0_in_rulersIdR1825);
            rule__RsIdR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRsIdRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulersIdR"


    // $ANTLR start "entryRuletranscriptR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:893:1: entryRuletranscriptR : ruletranscriptR EOF ;
    public final void entryRuletranscriptR() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:894:1: ( ruletranscriptR EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:895:1: ruletranscriptR EOF
            {
             before(grammarAccess.getTranscriptRRule()); 
            pushFollow(FollowSets000.FOLLOW_ruletranscriptR_in_entryRuletranscriptR1852);
            ruletranscriptR();

            state._fsp--;

             after(grammarAccess.getTranscriptRRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletranscriptR1859); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletranscriptR"


    // $ANTLR start "ruletranscriptR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:902:1: ruletranscriptR : ( ( rule__TranscriptR__Group__0 ) ) ;
    public final void ruletranscriptR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:906:2: ( ( ( rule__TranscriptR__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:907:1: ( ( rule__TranscriptR__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:907:1: ( ( rule__TranscriptR__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:908:1: ( rule__TranscriptR__Group__0 )
            {
             before(grammarAccess.getTranscriptRAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:909:1: ( rule__TranscriptR__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:909:2: rule__TranscriptR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TranscriptR__Group__0_in_ruletranscriptR1885);
            rule__TranscriptR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTranscriptRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletranscriptR"


    // $ANTLR start "entryRulepredictionR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:921:1: entryRulepredictionR : rulepredictionR EOF ;
    public final void entryRulepredictionR() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:922:1: ( rulepredictionR EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:923:1: rulepredictionR EOF
            {
             before(grammarAccess.getPredictionRRule()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionR_in_entryRulepredictionR1912);
            rulepredictionR();

            state._fsp--;

             after(grammarAccess.getPredictionRRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulepredictionR1919); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepredictionR"


    // $ANTLR start "rulepredictionR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:930:1: rulepredictionR : ( ( rule__PredictionR__AlgorithmAssignment ) ) ;
    public final void rulepredictionR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:934:2: ( ( ( rule__PredictionR__AlgorithmAssignment ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:935:1: ( ( rule__PredictionR__AlgorithmAssignment ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:935:1: ( ( rule__PredictionR__AlgorithmAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:936:1: ( rule__PredictionR__AlgorithmAssignment )
            {
             before(grammarAccess.getPredictionRAccess().getAlgorithmAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:937:1: ( rule__PredictionR__AlgorithmAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:937:2: rule__PredictionR__AlgorithmAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__PredictionR__AlgorithmAssignment_in_rulepredictionR1945);
            rule__PredictionR__AlgorithmAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPredictionRAccess().getAlgorithmAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepredictionR"


    // $ANTLR start "entryRulemafR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:949:1: entryRulemafR : rulemafR EOF ;
    public final void entryRulemafR() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:950:1: ( rulemafR EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:951:1: rulemafR EOF
            {
             before(grammarAccess.getMafRRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemafR_in_entryRulemafR1972);
            rulemafR();

            state._fsp--;

             after(grammarAccess.getMafRRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemafR1979); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemafR"


    // $ANTLR start "rulemafR"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:958:1: rulemafR : ( ( rule__MafR__Group__0 ) ) ;
    public final void rulemafR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:962:2: ( ( ( rule__MafR__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:963:1: ( ( rule__MafR__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:963:1: ( ( rule__MafR__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:964:1: ( rule__MafR__Group__0 )
            {
             before(grammarAccess.getMafRAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:965:1: ( rule__MafR__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:965:2: rule__MafR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafR__Group__0_in_rulemafR2005);
            rule__MafR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMafRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemafR"


    // $ANTLR start "entryRuledisease"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:977:1: entryRuledisease : ruledisease EOF ;
    public final void entryRuledisease() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:978:1: ( ruledisease EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:979:1: ruledisease EOF
            {
             before(grammarAccess.getDiseaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledisease_in_entryRuledisease2032);
            ruledisease();

            state._fsp--;

             after(grammarAccess.getDiseaseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledisease2039); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledisease"


    // $ANTLR start "ruledisease"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:986:1: ruledisease : ( ( rule__Disease__NameAssignment ) ) ;
    public final void ruledisease() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:990:2: ( ( ( rule__Disease__NameAssignment ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:991:1: ( ( rule__Disease__NameAssignment ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:991:1: ( ( rule__Disease__NameAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:992:1: ( rule__Disease__NameAssignment )
            {
             before(grammarAccess.getDiseaseAccess().getNameAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:993:1: ( rule__Disease__NameAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:993:2: rule__Disease__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Disease__NameAssignment_in_ruledisease2065);
            rule__Disease__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDiseaseAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledisease"


    // $ANTLR start "entryRuledataFile"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1005:1: entryRuledataFile : ruledataFile EOF ;
    public final void entryRuledataFile() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1006:1: ( ruledataFile EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1007:1: ruledataFile EOF
            {
             before(grammarAccess.getDataFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledataFile_in_entryRuledataFile2092);
            ruledataFile();

            state._fsp--;

             after(grammarAccess.getDataFileRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledataFile2099); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledataFile"


    // $ANTLR start "ruledataFile"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1014:1: ruledataFile : ( ( rule__DataFile__Group__0 ) ) ;
    public final void ruledataFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1018:2: ( ( ( rule__DataFile__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1019:1: ( ( rule__DataFile__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1019:1: ( ( rule__DataFile__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1020:1: ( rule__DataFile__Group__0 )
            {
             before(grammarAccess.getDataFileAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1021:1: ( rule__DataFile__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1021:2: rule__DataFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataFile__Group__0_in_ruledataFile2125);
            rule__DataFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledataFile"


    // $ANTLR start "entryRulehgvsdna"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1033:1: entryRulehgvsdna : rulehgvsdna EOF ;
    public final void entryRulehgvsdna() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1034:1: ( rulehgvsdna EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1035:1: rulehgvsdna EOF
            {
             before(grammarAccess.getHgvsdnaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsdna_in_entryRulehgvsdna2152);
            rulehgvsdna();

            state._fsp--;

             after(grammarAccess.getHgvsdnaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulehgvsdna2159); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehgvsdna"


    // $ANTLR start "rulehgvsdna"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1042:1: rulehgvsdna : ( ( rule__Hgvsdna__Group__0 ) ) ;
    public final void rulehgvsdna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1046:2: ( ( ( rule__Hgvsdna__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1047:1: ( ( rule__Hgvsdna__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1047:1: ( ( rule__Hgvsdna__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1048:1: ( rule__Hgvsdna__Group__0 )
            {
             before(grammarAccess.getHgvsdnaAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1049:1: ( rule__Hgvsdna__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1049:2: rule__Hgvsdna__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__0_in_rulehgvsdna2185);
            rule__Hgvsdna__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHgvsdnaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehgvsdna"


    // $ANTLR start "entryRulehgvscoding"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1061:1: entryRulehgvscoding : rulehgvscoding EOF ;
    public final void entryRulehgvscoding() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1062:1: ( rulehgvscoding EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1063:1: rulehgvscoding EOF
            {
             before(grammarAccess.getHgvscodingRule()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvscoding_in_entryRulehgvscoding2212);
            rulehgvscoding();

            state._fsp--;

             after(grammarAccess.getHgvscodingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulehgvscoding2219); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehgvscoding"


    // $ANTLR start "rulehgvscoding"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1070:1: rulehgvscoding : ( ( rule__Hgvscoding__Group__0 ) ) ;
    public final void rulehgvscoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1074:2: ( ( ( rule__Hgvscoding__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1075:1: ( ( rule__Hgvscoding__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1075:1: ( ( rule__Hgvscoding__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1076:1: ( rule__Hgvscoding__Group__0 )
            {
             before(grammarAccess.getHgvscodingAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1077:1: ( rule__Hgvscoding__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1077:2: rule__Hgvscoding__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__0_in_rulehgvscoding2245);
            rule__Hgvscoding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHgvscodingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehgvscoding"


    // $ANTLR start "entryRulehgvsprotein"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1089:1: entryRulehgvsprotein : rulehgvsprotein EOF ;
    public final void entryRulehgvsprotein() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1090:1: ( rulehgvsprotein EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1091:1: rulehgvsprotein EOF
            {
             before(grammarAccess.getHgvsproteinRule()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsprotein_in_entryRulehgvsprotein2272);
            rulehgvsprotein();

            state._fsp--;

             after(grammarAccess.getHgvsproteinRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulehgvsprotein2279); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehgvsprotein"


    // $ANTLR start "rulehgvsprotein"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1098:1: rulehgvsprotein : ( ( rule__Hgvsprotein__Group__0 ) ) ;
    public final void rulehgvsprotein() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1102:2: ( ( ( rule__Hgvsprotein__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1103:1: ( ( rule__Hgvsprotein__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1103:1: ( ( rule__Hgvsprotein__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1104:1: ( rule__Hgvsprotein__Group__0 )
            {
             before(grammarAccess.getHgvsproteinAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1105:1: ( rule__Hgvsprotein__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1105:2: rule__Hgvsprotein__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__0_in_rulehgvsprotein2305);
            rule__Hgvsprotein__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHgvsproteinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehgvsprotein"


    // $ANTLR start "entryRulegene"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1117:1: entryRulegene : rulegene EOF ;
    public final void entryRulegene() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1118:1: ( rulegene EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1119:1: rulegene EOF
            {
             before(grammarAccess.getGeneRule()); 
            pushFollow(FollowSets000.FOLLOW_rulegene_in_entryRulegene2332);
            rulegene();

            state._fsp--;

             after(grammarAccess.getGeneRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulegene2339); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegene"


    // $ANTLR start "rulegene"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1126:1: rulegene : ( ( rule__Gene__HgncIdAssignment ) ) ;
    public final void rulegene() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1130:2: ( ( ( rule__Gene__HgncIdAssignment ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1131:1: ( ( rule__Gene__HgncIdAssignment ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1131:1: ( ( rule__Gene__HgncIdAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1132:1: ( rule__Gene__HgncIdAssignment )
            {
             before(grammarAccess.getGeneAccess().getHgncIdAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1133:1: ( rule__Gene__HgncIdAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1133:2: rule__Gene__HgncIdAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Gene__HgncIdAssignment_in_rulegene2365);
            rule__Gene__HgncIdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGeneAccess().getHgncIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegene"


    // $ANTLR start "entryRulerefSeqReference"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1145:1: entryRulerefSeqReference : rulerefSeqReference EOF ;
    public final void entryRulerefSeqReference() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1146:1: ( rulerefSeqReference EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1147:1: rulerefSeqReference EOF
            {
             before(grammarAccess.getRefSeqReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerefSeqReference_in_entryRulerefSeqReference2392);
            rulerefSeqReference();

            state._fsp--;

             after(grammarAccess.getRefSeqReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerefSeqReference2399); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerefSeqReference"


    // $ANTLR start "rulerefSeqReference"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1154:1: rulerefSeqReference : ( ( rule__RefSeqReference__IdentifierAssignment ) ) ;
    public final void rulerefSeqReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1158:2: ( ( ( rule__RefSeqReference__IdentifierAssignment ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1159:1: ( ( rule__RefSeqReference__IdentifierAssignment ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1159:1: ( ( rule__RefSeqReference__IdentifierAssignment ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1160:1: ( rule__RefSeqReference__IdentifierAssignment )
            {
             before(grammarAccess.getRefSeqReferenceAccess().getIdentifierAssignment()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1161:1: ( rule__RefSeqReference__IdentifierAssignment )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1161:2: rule__RefSeqReference__IdentifierAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__RefSeqReference__IdentifierAssignment_in_rulerefSeqReference2425);
            rule__RefSeqReference__IdentifierAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefSeqReferenceAccess().getIdentifierAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerefSeqReference"


    // $ANTLR start "entryRuleEString"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1175:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1176:1: ( ruleEString EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1177:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2454);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2461); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1184:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1188:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1189:1: ( ( rule__EString__Alternatives ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1189:1: ( ( rule__EString__Alternatives ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1190:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1191:1: ( rule__EString__Alternatives )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1191:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString2487);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1205:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1206:1: ( ruleEDouble EOF )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1207:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2516);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2523); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1214:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1218:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1219:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1219:1: ( ( rule__EDouble__Group__0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1220:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1221:1: ( rule__EDouble__Group__0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1221:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble2549);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rulepredictionAlgorithm"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1234:1: rulepredictionAlgorithm : ( ( rule__PredictionAlgorithm__Alternatives ) ) ;
    public final void rulepredictionAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1238:1: ( ( ( rule__PredictionAlgorithm__Alternatives ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1239:1: ( ( rule__PredictionAlgorithm__Alternatives ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1239:1: ( ( rule__PredictionAlgorithm__Alternatives ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1240:1: ( rule__PredictionAlgorithm__Alternatives )
            {
             before(grammarAccess.getPredictionAlgorithmAccess().getAlternatives()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1241:1: ( rule__PredictionAlgorithm__Alternatives )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1241:2: rule__PredictionAlgorithm__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PredictionAlgorithm__Alternatives_in_rulepredictionAlgorithm2586);
            rule__PredictionAlgorithm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredictionAlgorithmAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepredictionAlgorithm"


    // $ANTLR start "ruleorderCriteria"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1253:1: ruleorderCriteria : ( ( rule__OrderCriteria__Alternatives ) ) ;
    public final void ruleorderCriteria() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1257:1: ( ( ( rule__OrderCriteria__Alternatives ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1258:1: ( ( rule__OrderCriteria__Alternatives ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1258:1: ( ( rule__OrderCriteria__Alternatives ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1259:1: ( rule__OrderCriteria__Alternatives )
            {
             before(grammarAccess.getOrderCriteriaAccess().getAlternatives()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1260:1: ( rule__OrderCriteria__Alternatives )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1260:2: rule__OrderCriteria__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderCriteria__Alternatives_in_ruleorderCriteria2622);
            rule__OrderCriteria__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderCriteriaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleorderCriteria"


    // $ANTLR start "ruleeffectEnum"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1272:1: ruleeffectEnum : ( ( rule__EffectEnum__Alternatives ) ) ;
    public final void ruleeffectEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1276:1: ( ( ( rule__EffectEnum__Alternatives ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1277:1: ( ( rule__EffectEnum__Alternatives ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1277:1: ( ( rule__EffectEnum__Alternatives ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1278:1: ( rule__EffectEnum__Alternatives )
            {
             before(grammarAccess.getEffectEnumAccess().getAlternatives()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1279:1: ( rule__EffectEnum__Alternatives )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1279:2: rule__EffectEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EffectEnum__Alternatives_in_ruleeffectEnum2658);
            rule__EffectEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleeffectEnum"


    // $ANTLR start "rule__Analysis__Alternatives"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1290:1: rule__Analysis__Alternatives : ( ( ruleannotation ) | ( rulesearch ) );
    public final void rule__Analysis__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1294:1: ( ( ruleannotation ) | ( rulesearch ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==42||(LA4_0>=44 && LA4_0<=45)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1295:1: ( ruleannotation )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1295:1: ( ruleannotation )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1296:1: ruleannotation
                    {
                     before(grammarAccess.getAnalysisAccess().getAnnotationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleannotation_in_rule__Analysis__Alternatives2693);
                    ruleannotation();

                    state._fsp--;

                     after(grammarAccess.getAnalysisAccess().getAnnotationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1301:6: ( rulesearch )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1301:6: ( rulesearch )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1302:1: rulesearch
                    {
                     before(grammarAccess.getAnalysisAccess().getSearchParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulesearch_in_rule__Analysis__Alternatives2710);
                    rulesearch();

                    state._fsp--;

                     after(grammarAccess.getAnalysisAccess().getSearchParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Analysis__Alternatives"


    // $ANTLR start "rule__Annotation__Alternatives_4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1312:1: rule__Annotation__Alternatives_4 : ( ( ( rule__Annotation__HgvsAssignment_4_0 ) ) | ( ( rule__Annotation__GeneAssignment_4_1 ) ) | ( ( rule__Annotation__RsIdAssignment_4_2 ) ) | ( ( rule__Annotation__TranscriptAssignment_4_3 ) ) | ( ( rule__Annotation__PredictionAssignment_4_4 ) ) | ( ( rule__Annotation__MafAssignment_4_5 ) ) );
    public final void rule__Annotation__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1316:1: ( ( ( rule__Annotation__HgvsAssignment_4_0 ) ) | ( ( rule__Annotation__GeneAssignment_4_1 ) ) | ( ( rule__Annotation__RsIdAssignment_4_2 ) ) | ( ( rule__Annotation__TranscriptAssignment_4_3 ) ) | ( ( rule__Annotation__PredictionAssignment_4_4 ) ) | ( ( rule__Annotation__MafAssignment_4_5 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            case 39:
                {
                alt5=4;
                }
                break;
            case 16:
            case 17:
                {
                alt5=5;
                }
                break;
            case 41:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1317:1: ( ( rule__Annotation__HgvsAssignment_4_0 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1317:1: ( ( rule__Annotation__HgvsAssignment_4_0 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1318:1: ( rule__Annotation__HgvsAssignment_4_0 )
                    {
                     before(grammarAccess.getAnnotationAccess().getHgvsAssignment_4_0()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1319:1: ( rule__Annotation__HgvsAssignment_4_0 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1319:2: rule__Annotation__HgvsAssignment_4_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__HgvsAssignment_4_0_in_rule__Annotation__Alternatives_42742);
                    rule__Annotation__HgvsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getHgvsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1323:6: ( ( rule__Annotation__GeneAssignment_4_1 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1323:6: ( ( rule__Annotation__GeneAssignment_4_1 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1324:1: ( rule__Annotation__GeneAssignment_4_1 )
                    {
                     before(grammarAccess.getAnnotationAccess().getGeneAssignment_4_1()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1325:1: ( rule__Annotation__GeneAssignment_4_1 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1325:2: rule__Annotation__GeneAssignment_4_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__GeneAssignment_4_1_in_rule__Annotation__Alternatives_42760);
                    rule__Annotation__GeneAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getGeneAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1329:6: ( ( rule__Annotation__RsIdAssignment_4_2 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1329:6: ( ( rule__Annotation__RsIdAssignment_4_2 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1330:1: ( rule__Annotation__RsIdAssignment_4_2 )
                    {
                     before(grammarAccess.getAnnotationAccess().getRsIdAssignment_4_2()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1331:1: ( rule__Annotation__RsIdAssignment_4_2 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1331:2: rule__Annotation__RsIdAssignment_4_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__RsIdAssignment_4_2_in_rule__Annotation__Alternatives_42778);
                    rule__Annotation__RsIdAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getRsIdAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1335:6: ( ( rule__Annotation__TranscriptAssignment_4_3 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1335:6: ( ( rule__Annotation__TranscriptAssignment_4_3 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1336:1: ( rule__Annotation__TranscriptAssignment_4_3 )
                    {
                     before(grammarAccess.getAnnotationAccess().getTranscriptAssignment_4_3()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1337:1: ( rule__Annotation__TranscriptAssignment_4_3 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1337:2: rule__Annotation__TranscriptAssignment_4_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__TranscriptAssignment_4_3_in_rule__Annotation__Alternatives_42796);
                    rule__Annotation__TranscriptAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getTranscriptAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1341:6: ( ( rule__Annotation__PredictionAssignment_4_4 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1341:6: ( ( rule__Annotation__PredictionAssignment_4_4 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1342:1: ( rule__Annotation__PredictionAssignment_4_4 )
                    {
                     before(grammarAccess.getAnnotationAccess().getPredictionAssignment_4_4()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1343:1: ( rule__Annotation__PredictionAssignment_4_4 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1343:2: rule__Annotation__PredictionAssignment_4_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__PredictionAssignment_4_4_in_rule__Annotation__Alternatives_42814);
                    rule__Annotation__PredictionAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getPredictionAssignment_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1347:6: ( ( rule__Annotation__MafAssignment_4_5 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1347:6: ( ( rule__Annotation__MafAssignment_4_5 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1348:1: ( rule__Annotation__MafAssignment_4_5 )
                    {
                     before(grammarAccess.getAnnotationAccess().getMafAssignment_4_5()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1349:1: ( rule__Annotation__MafAssignment_4_5 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1349:2: rule__Annotation__MafAssignment_4_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Annotation__MafAssignment_4_5_in_rule__Annotation__Alternatives_42832);
                    rule__Annotation__MafAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getMafAssignment_4_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Alternatives_4"


    // $ANTLR start "rule__Search__Alternatives"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1358:1: rule__Search__Alternatives : ( ( rulehgvsS ) | ( ( rule__Search__Group_1__0 ) ) | ( ( rule__Search__Group_2__0 ) ) );
    public final void rule__Search__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1362:1: ( ( rulehgvsS ) | ( ( rule__Search__Group_1__0 ) ) | ( ( rule__Search__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case 44:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1363:1: ( rulehgvsS )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1363:1: ( rulehgvsS )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1364:1: rulehgvsS
                    {
                     before(grammarAccess.getSearchAccess().getHgvsSParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulehgvsS_in_rule__Search__Alternatives2865);
                    rulehgvsS();

                    state._fsp--;

                     after(grammarAccess.getSearchAccess().getHgvsSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1369:6: ( ( rule__Search__Group_1__0 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1369:6: ( ( rule__Search__Group_1__0 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1370:1: ( rule__Search__Group_1__0 )
                    {
                     before(grammarAccess.getSearchAccess().getGroup_1()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1371:1: ( rule__Search__Group_1__0 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1371:2: rule__Search__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__0_in_rule__Search__Alternatives2882);
                    rule__Search__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSearchAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1375:6: ( ( rule__Search__Group_2__0 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1375:6: ( ( rule__Search__Group_2__0 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1376:1: ( rule__Search__Group_2__0 )
                    {
                     before(grammarAccess.getSearchAccess().getGroup_2()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1377:1: ( rule__Search__Group_2__0 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1377:2: rule__Search__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__0_in_rule__Search__Alternatives2900);
                    rule__Search__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSearchAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Alternatives"


    // $ANTLR start "rule__Search__Alternatives_1_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1386:1: rule__Search__Alternatives_1_3 : ( ( rulegeneF ) | ( rulepredictionF ) | ( rulemafF ) );
    public final void rule__Search__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1390:1: ( ( rulegeneF ) | ( rulepredictionF ) | ( rulemafF ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt7=1;
                }
                break;
            case 16:
            case 17:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1391:1: ( rulegeneF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1391:1: ( rulegeneF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1392:1: rulegeneF
                    {
                     before(grammarAccess.getSearchAccess().getGeneFParserRuleCall_1_3_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulegeneF_in_rule__Search__Alternatives_1_32933);
                    rulegeneF();

                    state._fsp--;

                     after(grammarAccess.getSearchAccess().getGeneFParserRuleCall_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1397:6: ( rulepredictionF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1397:6: ( rulepredictionF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1398:1: rulepredictionF
                    {
                     before(grammarAccess.getSearchAccess().getPredictionFParserRuleCall_1_3_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulepredictionF_in_rule__Search__Alternatives_1_32950);
                    rulepredictionF();

                    state._fsp--;

                     after(grammarAccess.getSearchAccess().getPredictionFParserRuleCall_1_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1403:6: ( rulemafF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1403:6: ( rulemafF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1404:1: rulemafF
                    {
                     before(grammarAccess.getSearchAccess().getMafFParserRuleCall_1_3_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemafF_in_rule__Search__Alternatives_1_32967);
                    rulemafF();

                    state._fsp--;

                     after(grammarAccess.getSearchAccess().getMafFParserRuleCall_1_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Alternatives_1_3"


    // $ANTLR start "rule__Search__Alternatives_2_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1414:1: rule__Search__Alternatives_2_3 : ( ( rulegeneF ) | ( rulepredictionF ) | ( rulemafF ) );
    public final void rule__Search__Alternatives_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1418:1: ( ( rulegeneF ) | ( rulepredictionF ) | ( rulemafF ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 16:
            case 17:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1419:1: ( rulegeneF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1419:1: ( rulegeneF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1420:1: rulegeneF
                    {
                     before(grammarAccess.getSearchAccess().getGeneFParserRuleCall_2_3_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulegeneF_in_rule__Search__Alternatives_2_32999);
                    rulegeneF();

                    state._fsp--;

                     after(grammarAccess.getSearchAccess().getGeneFParserRuleCall_2_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1425:6: ( rulepredictionF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1425:6: ( rulepredictionF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1426:1: rulepredictionF
                    {
                     before(grammarAccess.getSearchAccess().getPredictionFParserRuleCall_2_3_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulepredictionF_in_rule__Search__Alternatives_2_33016);
                    rulepredictionF();

                    state._fsp--;

                     after(grammarAccess.getSearchAccess().getPredictionFParserRuleCall_2_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1431:6: ( rulemafF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1431:6: ( rulemafF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1432:1: rulemafF
                    {
                     before(grammarAccess.getSearchAccess().getMafFParserRuleCall_2_3_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemafF_in_rule__Search__Alternatives_2_33033);
                    rulemafF();

                    state._fsp--;

                     after(grammarAccess.getSearchAccess().getMafFParserRuleCall_2_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Alternatives_2_3"


    // $ANTLR start "rule__HgvsS__Alternatives_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1442:1: rule__HgvsS__Alternatives_2 : ( ( rulednaS ) | ( rulecodingS ) | ( ruleproteinS ) );
    public final void rule__HgvsS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1446:1: ( ( rulednaS ) | ( rulecodingS ) | ( ruleproteinS ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_REFSEQ) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==52) ) {
                    switch ( input.LA(3) ) {
                    case 55:
                        {
                        alt9=3;
                        }
                        break;
                    case 54:
                        {
                        alt9=2;
                        }
                        break;
                    case 53:
                        {
                        alt9=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_ASSEMBLY) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==52) ) {
                    switch ( input.LA(3) ) {
                    case 55:
                        {
                        alt9=3;
                        }
                        break;
                    case 54:
                        {
                        alt9=2;
                        }
                        break;
                    case 53:
                        {
                        alt9=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1447:1: ( rulednaS )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1447:1: ( rulednaS )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1448:1: rulednaS
                    {
                     before(grammarAccess.getHgvsSAccess().getDnaSParserRuleCall_2_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulednaS_in_rule__HgvsS__Alternatives_23065);
                    rulednaS();

                    state._fsp--;

                     after(grammarAccess.getHgvsSAccess().getDnaSParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1453:6: ( rulecodingS )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1453:6: ( rulecodingS )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1454:1: rulecodingS
                    {
                     before(grammarAccess.getHgvsSAccess().getCodingSParserRuleCall_2_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulecodingS_in_rule__HgvsS__Alternatives_23082);
                    rulecodingS();

                    state._fsp--;

                     after(grammarAccess.getHgvsSAccess().getCodingSParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1459:6: ( ruleproteinS )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1459:6: ( ruleproteinS )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1460:1: ruleproteinS
                    {
                     before(grammarAccess.getHgvsSAccess().getProteinSParserRuleCall_2_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleproteinS_in_rule__HgvsS__Alternatives_23099);
                    ruleproteinS();

                    state._fsp--;

                     after(grammarAccess.getHgvsSAccess().getProteinSParserRuleCall_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsS__Alternatives_2"


    // $ANTLR start "rule__PredictionF__Alternatives"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1470:1: rule__PredictionF__Alternatives : ( ( ruleeffectF ) | ( rulescoreF ) );
    public final void rule__PredictionF__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1474:1: ( ( ruleeffectF ) | ( rulescoreF ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==50) ) {
                    alt10=2;
                }
                else if ( (LA10_1==49) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==17) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==50) ) {
                    alt10=2;
                }
                else if ( (LA10_2==49) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1475:1: ( ruleeffectF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1475:1: ( ruleeffectF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1476:1: ruleeffectF
                    {
                     before(grammarAccess.getPredictionFAccess().getEffectFParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleeffectF_in_rule__PredictionF__Alternatives3131);
                    ruleeffectF();

                    state._fsp--;

                     after(grammarAccess.getPredictionFAccess().getEffectFParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1481:6: ( rulescoreF )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1481:6: ( rulescoreF )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1482:1: rulescoreF
                    {
                     before(grammarAccess.getPredictionFAccess().getScoreFParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulescoreF_in_rule__PredictionF__Alternatives3148);
                    rulescoreF();

                    state._fsp--;

                     after(grammarAccess.getPredictionFAccess().getScoreFParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictionF__Alternatives"


    // $ANTLR start "rule__ReportVariations__Alternatives_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1492:1: rule__ReportVariations__Alternatives_3 : ( ( ( rule__ReportVariations__HgvsAssignment_3_0 ) ) | ( ( rule__ReportVariations__GeneAssignment_3_1 ) ) | ( ( rule__ReportVariations__RsIdAssignment_3_2 ) ) | ( ( rule__ReportVariations__TranscriptAssignment_3_3 ) ) | ( ( rule__ReportVariations__PredictionAssignment_3_4 ) ) | ( ( rule__ReportVariations__MafAssignment_3_5 ) ) );
    public final void rule__ReportVariations__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1496:1: ( ( ( rule__ReportVariations__HgvsAssignment_3_0 ) ) | ( ( rule__ReportVariations__GeneAssignment_3_1 ) ) | ( ( rule__ReportVariations__RsIdAssignment_3_2 ) ) | ( ( rule__ReportVariations__TranscriptAssignment_3_3 ) ) | ( ( rule__ReportVariations__PredictionAssignment_3_4 ) ) | ( ( rule__ReportVariations__MafAssignment_3_5 ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            case 16:
            case 17:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1497:1: ( ( rule__ReportVariations__HgvsAssignment_3_0 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1497:1: ( ( rule__ReportVariations__HgvsAssignment_3_0 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1498:1: ( rule__ReportVariations__HgvsAssignment_3_0 )
                    {
                     before(grammarAccess.getReportVariationsAccess().getHgvsAssignment_3_0()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1499:1: ( rule__ReportVariations__HgvsAssignment_3_0 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1499:2: rule__ReportVariations__HgvsAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__HgvsAssignment_3_0_in_rule__ReportVariations__Alternatives_33180);
                    rule__ReportVariations__HgvsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReportVariationsAccess().getHgvsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1503:6: ( ( rule__ReportVariations__GeneAssignment_3_1 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1503:6: ( ( rule__ReportVariations__GeneAssignment_3_1 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1504:1: ( rule__ReportVariations__GeneAssignment_3_1 )
                    {
                     before(grammarAccess.getReportVariationsAccess().getGeneAssignment_3_1()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1505:1: ( rule__ReportVariations__GeneAssignment_3_1 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1505:2: rule__ReportVariations__GeneAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__GeneAssignment_3_1_in_rule__ReportVariations__Alternatives_33198);
                    rule__ReportVariations__GeneAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReportVariationsAccess().getGeneAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1509:6: ( ( rule__ReportVariations__RsIdAssignment_3_2 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1509:6: ( ( rule__ReportVariations__RsIdAssignment_3_2 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1510:1: ( rule__ReportVariations__RsIdAssignment_3_2 )
                    {
                     before(grammarAccess.getReportVariationsAccess().getRsIdAssignment_3_2()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1511:1: ( rule__ReportVariations__RsIdAssignment_3_2 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1511:2: rule__ReportVariations__RsIdAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__RsIdAssignment_3_2_in_rule__ReportVariations__Alternatives_33216);
                    rule__ReportVariations__RsIdAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getReportVariationsAccess().getRsIdAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1515:6: ( ( rule__ReportVariations__TranscriptAssignment_3_3 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1515:6: ( ( rule__ReportVariations__TranscriptAssignment_3_3 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1516:1: ( rule__ReportVariations__TranscriptAssignment_3_3 )
                    {
                     before(grammarAccess.getReportVariationsAccess().getTranscriptAssignment_3_3()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1517:1: ( rule__ReportVariations__TranscriptAssignment_3_3 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1517:2: rule__ReportVariations__TranscriptAssignment_3_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__TranscriptAssignment_3_3_in_rule__ReportVariations__Alternatives_33234);
                    rule__ReportVariations__TranscriptAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getReportVariationsAccess().getTranscriptAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1521:6: ( ( rule__ReportVariations__PredictionAssignment_3_4 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1521:6: ( ( rule__ReportVariations__PredictionAssignment_3_4 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1522:1: ( rule__ReportVariations__PredictionAssignment_3_4 )
                    {
                     before(grammarAccess.getReportVariationsAccess().getPredictionAssignment_3_4()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1523:1: ( rule__ReportVariations__PredictionAssignment_3_4 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1523:2: rule__ReportVariations__PredictionAssignment_3_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__PredictionAssignment_3_4_in_rule__ReportVariations__Alternatives_33252);
                    rule__ReportVariations__PredictionAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getReportVariationsAccess().getPredictionAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1527:6: ( ( rule__ReportVariations__MafAssignment_3_5 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1527:6: ( ( rule__ReportVariations__MafAssignment_3_5 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1528:1: ( rule__ReportVariations__MafAssignment_3_5 )
                    {
                     before(grammarAccess.getReportVariationsAccess().getMafAssignment_3_5()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1529:1: ( rule__ReportVariations__MafAssignment_3_5 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1529:2: rule__ReportVariations__MafAssignment_3_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__MafAssignment_3_5_in_rule__ReportVariations__Alternatives_33270);
                    rule__ReportVariations__MafAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getReportVariationsAccess().getMafAssignment_3_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Alternatives_3"


    // $ANTLR start "rule__DataFile__Alternatives_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1538:1: rule__DataFile__Alternatives_2 : ( ( ( rule__DataFile__DynamicAssignment_2_0 ) ) | ( ( rule__DataFile__PathAssignment_2_1 ) ) );
    public final void rule__DataFile__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1542:1: ( ( ( rule__DataFile__DynamicAssignment_2_0 ) ) | ( ( rule__DataFile__PathAssignment_2_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INPUT) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1543:1: ( ( rule__DataFile__DynamicAssignment_2_0 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1543:1: ( ( rule__DataFile__DynamicAssignment_2_0 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1544:1: ( rule__DataFile__DynamicAssignment_2_0 )
                    {
                     before(grammarAccess.getDataFileAccess().getDynamicAssignment_2_0()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1545:1: ( rule__DataFile__DynamicAssignment_2_0 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1545:2: rule__DataFile__DynamicAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataFile__DynamicAssignment_2_0_in_rule__DataFile__Alternatives_23303);
                    rule__DataFile__DynamicAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataFileAccess().getDynamicAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1549:6: ( ( rule__DataFile__PathAssignment_2_1 ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1549:6: ( ( rule__DataFile__PathAssignment_2_1 ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1550:1: ( rule__DataFile__PathAssignment_2_1 )
                    {
                     before(grammarAccess.getDataFileAccess().getPathAssignment_2_1()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1551:1: ( rule__DataFile__PathAssignment_2_1 )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1551:2: rule__DataFile__PathAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataFile__PathAssignment_2_1_in_rule__DataFile__Alternatives_23321);
                    rule__DataFile__PathAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataFileAccess().getPathAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Alternatives_2"


    // $ANTLR start "rule__Gene__HgncIdAlternatives_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1560:1: rule__Gene__HgncIdAlternatives_0 : ( ( ruleEString ) | ( RULE_HGNCGENE ) );
    public final void rule__Gene__HgncIdAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1564:1: ( ( ruleEString ) | ( RULE_HGNCGENE ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_HGNCGENE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1565:1: ( ruleEString )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1565:1: ( ruleEString )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1566:1: ruleEString
                    {
                     before(grammarAccess.getGeneAccess().getHgncIdEStringParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Gene__HgncIdAlternatives_03354);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getGeneAccess().getHgncIdEStringParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1571:6: ( RULE_HGNCGENE )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1571:6: ( RULE_HGNCGENE )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1572:1: RULE_HGNCGENE
                    {
                     before(grammarAccess.getGeneAccess().getHgncIdHGNCGENETerminalRuleCall_0_1()); 
                    match(input,RULE_HGNCGENE,FollowSets000.FOLLOW_RULE_HGNCGENE_in_rule__Gene__HgncIdAlternatives_03371); 
                     after(grammarAccess.getGeneAccess().getHgncIdHGNCGENETerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gene__HgncIdAlternatives_0"


    // $ANTLR start "rule__RefSeqReference__IdentifierAlternatives_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1582:1: rule__RefSeqReference__IdentifierAlternatives_0 : ( ( RULE_REFSEQ ) | ( RULE_ASSEMBLY ) );
    public final void rule__RefSeqReference__IdentifierAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1586:1: ( ( RULE_REFSEQ ) | ( RULE_ASSEMBLY ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_REFSEQ) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ASSEMBLY) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1587:1: ( RULE_REFSEQ )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1587:1: ( RULE_REFSEQ )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1588:1: RULE_REFSEQ
                    {
                     before(grammarAccess.getRefSeqReferenceAccess().getIdentifierREFSEQTerminalRuleCall_0_0()); 
                    match(input,RULE_REFSEQ,FollowSets000.FOLLOW_RULE_REFSEQ_in_rule__RefSeqReference__IdentifierAlternatives_03403); 
                     after(grammarAccess.getRefSeqReferenceAccess().getIdentifierREFSEQTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1593:6: ( RULE_ASSEMBLY )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1593:6: ( RULE_ASSEMBLY )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1594:1: RULE_ASSEMBLY
                    {
                     before(grammarAccess.getRefSeqReferenceAccess().getIdentifierASSEMBLYTerminalRuleCall_0_1()); 
                    match(input,RULE_ASSEMBLY,FollowSets000.FOLLOW_RULE_ASSEMBLY_in_rule__RefSeqReference__IdentifierAlternatives_03420); 
                     after(grammarAccess.getRefSeqReferenceAccess().getIdentifierASSEMBLYTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSeqReference__IdentifierAlternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1605:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1609:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1610:1: ( RULE_STRING )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1610:1: ( RULE_STRING )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1611:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3453); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1616:6: ( RULE_ID )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1616:6: ( RULE_ID )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1617:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3470); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__PredictionAlgorithm__Alternatives"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1627:1: rule__PredictionAlgorithm__Alternatives : ( ( ( 'Sift' ) ) | ( ( 'Polyphen' ) ) );
    public final void rule__PredictionAlgorithm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1631:1: ( ( ( 'Sift' ) ) | ( ( 'Polyphen' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1632:1: ( ( 'Sift' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1632:1: ( ( 'Sift' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1633:1: ( 'Sift' )
                    {
                     before(grammarAccess.getPredictionAlgorithmAccess().getSiftEnumLiteralDeclaration_0()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1634:1: ( 'Sift' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1634:3: 'Sift'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__PredictionAlgorithm__Alternatives3503); 

                    }

                     after(grammarAccess.getPredictionAlgorithmAccess().getSiftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1639:6: ( ( 'Polyphen' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1639:6: ( ( 'Polyphen' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1640:1: ( 'Polyphen' )
                    {
                     before(grammarAccess.getPredictionAlgorithmAccess().getPolyphenEnumLiteralDeclaration_1()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1641:1: ( 'Polyphen' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1641:3: 'Polyphen'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__PredictionAlgorithm__Alternatives3524); 

                    }

                     after(grammarAccess.getPredictionAlgorithmAccess().getPolyphenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictionAlgorithm__Alternatives"


    // $ANTLR start "rule__OrderCriteria__Alternatives"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1651:1: rule__OrderCriteria__Alternatives : ( ( ( 'AlphAsc' ) ) | ( ( 'AlphDes' ) ) | ( ( 'Max2Min' ) ) | ( ( 'Min2Max' ) ) );
    public final void rule__OrderCriteria__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1655:1: ( ( ( 'AlphAsc' ) ) | ( ( 'AlphDes' ) ) | ( ( 'Max2Min' ) ) | ( ( 'Min2Max' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt17=1;
                }
                break;
            case 19:
                {
                alt17=2;
                }
                break;
            case 20:
                {
                alt17=3;
                }
                break;
            case 21:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1656:1: ( ( 'AlphAsc' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1656:1: ( ( 'AlphAsc' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1657:1: ( 'AlphAsc' )
                    {
                     before(grammarAccess.getOrderCriteriaAccess().getAlphAscEnumLiteralDeclaration_0()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1658:1: ( 'AlphAsc' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1658:3: 'AlphAsc'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__OrderCriteria__Alternatives3560); 

                    }

                     after(grammarAccess.getOrderCriteriaAccess().getAlphAscEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1663:6: ( ( 'AlphDes' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1663:6: ( ( 'AlphDes' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1664:1: ( 'AlphDes' )
                    {
                     before(grammarAccess.getOrderCriteriaAccess().getAlphDesEnumLiteralDeclaration_1()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1665:1: ( 'AlphDes' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1665:3: 'AlphDes'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__OrderCriteria__Alternatives3581); 

                    }

                     after(grammarAccess.getOrderCriteriaAccess().getAlphDesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1670:6: ( ( 'Max2Min' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1670:6: ( ( 'Max2Min' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1671:1: ( 'Max2Min' )
                    {
                     before(grammarAccess.getOrderCriteriaAccess().getMax2MinEnumLiteralDeclaration_2()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1672:1: ( 'Max2Min' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1672:3: 'Max2Min'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__OrderCriteria__Alternatives3602); 

                    }

                     after(grammarAccess.getOrderCriteriaAccess().getMax2MinEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1677:6: ( ( 'Min2Max' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1677:6: ( ( 'Min2Max' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1678:1: ( 'Min2Max' )
                    {
                     before(grammarAccess.getOrderCriteriaAccess().getMin2MaxEnumLiteralDeclaration_3()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1679:1: ( 'Min2Max' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1679:3: 'Min2Max'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__OrderCriteria__Alternatives3623); 

                    }

                     after(grammarAccess.getOrderCriteriaAccess().getMin2MaxEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderCriteria__Alternatives"


    // $ANTLR start "rule__EffectEnum__Alternatives"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1689:1: rule__EffectEnum__Alternatives : ( ( ( 'tolerated' ) ) | ( ( 'deleterious' ) ) | ( ( 'benign' ) ) | ( ( 'damaging' ) ) | ( ( 'probably damaging' ) ) | ( ( 'possibly damaging' ) ) );
    public final void rule__EffectEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1693:1: ( ( ( 'tolerated' ) ) | ( ( 'deleterious' ) ) | ( ( 'benign' ) ) | ( ( 'damaging' ) ) | ( ( 'probably damaging' ) ) | ( ( 'possibly damaging' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt18=1;
                }
                break;
            case 23:
                {
                alt18=2;
                }
                break;
            case 24:
                {
                alt18=3;
                }
                break;
            case 25:
                {
                alt18=4;
                }
                break;
            case 26:
                {
                alt18=5;
                }
                break;
            case 27:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1694:1: ( ( 'tolerated' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1694:1: ( ( 'tolerated' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1695:1: ( 'tolerated' )
                    {
                     before(grammarAccess.getEffectEnumAccess().getToleratedEnumLiteralDeclaration_0()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1696:1: ( 'tolerated' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1696:3: 'tolerated'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__EffectEnum__Alternatives3659); 

                    }

                     after(grammarAccess.getEffectEnumAccess().getToleratedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1701:6: ( ( 'deleterious' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1701:6: ( ( 'deleterious' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1702:1: ( 'deleterious' )
                    {
                     before(grammarAccess.getEffectEnumAccess().getDeleteriousEnumLiteralDeclaration_1()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1703:1: ( 'deleterious' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1703:3: 'deleterious'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__EffectEnum__Alternatives3680); 

                    }

                     after(grammarAccess.getEffectEnumAccess().getDeleteriousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1708:6: ( ( 'benign' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1708:6: ( ( 'benign' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1709:1: ( 'benign' )
                    {
                     before(grammarAccess.getEffectEnumAccess().getBenignEnumLiteralDeclaration_2()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1710:1: ( 'benign' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1710:3: 'benign'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EffectEnum__Alternatives3701); 

                    }

                     after(grammarAccess.getEffectEnumAccess().getBenignEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1715:6: ( ( 'damaging' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1715:6: ( ( 'damaging' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1716:1: ( 'damaging' )
                    {
                     before(grammarAccess.getEffectEnumAccess().getDamagingEnumLiteralDeclaration_3()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1717:1: ( 'damaging' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1717:3: 'damaging'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__EffectEnum__Alternatives3722); 

                    }

                     after(grammarAccess.getEffectEnumAccess().getDamagingEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1722:6: ( ( 'probably damaging' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1722:6: ( ( 'probably damaging' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1723:1: ( 'probably damaging' )
                    {
                     before(grammarAccess.getEffectEnumAccess().getProbablyDEnumLiteralDeclaration_4()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1724:1: ( 'probably damaging' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1724:3: 'probably damaging'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__EffectEnum__Alternatives3743); 

                    }

                     after(grammarAccess.getEffectEnumAccess().getProbablyDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1729:6: ( ( 'possibly damaging' ) )
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1729:6: ( ( 'possibly damaging' ) )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1730:1: ( 'possibly damaging' )
                    {
                     before(grammarAccess.getEffectEnumAccess().getPossiblyDEnumLiteralDeclaration_5()); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1731:1: ( 'possibly damaging' )
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1731:3: 'possibly damaging'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__EffectEnum__Alternatives3764); 

                    }

                     after(grammarAccess.getEffectEnumAccess().getPossiblyDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectEnum__Alternatives"


    // $ANTLR start "rule__Diagnosis__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1743:1: rule__Diagnosis__Group__0 : rule__Diagnosis__Group__0__Impl rule__Diagnosis__Group__1 ;
    public final void rule__Diagnosis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1747:1: ( rule__Diagnosis__Group__0__Impl rule__Diagnosis__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1748:2: rule__Diagnosis__Group__0__Impl rule__Diagnosis__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__0__Impl_in_rule__Diagnosis__Group__03797);
            rule__Diagnosis__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__1_in_rule__Diagnosis__Group__03800);
            rule__Diagnosis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__0"


    // $ANTLR start "rule__Diagnosis__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1755:1: rule__Diagnosis__Group__0__Impl : ( 'Find' ) ;
    public final void rule__Diagnosis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1759:1: ( ( 'Find' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1760:1: ( 'Find' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1760:1: ( 'Find' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1761:1: 'Find'
            {
             before(grammarAccess.getDiagnosisAccess().getFindKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Diagnosis__Group__0__Impl3828); 
             after(grammarAccess.getDiagnosisAccess().getFindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__0__Impl"


    // $ANTLR start "rule__Diagnosis__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1774:1: rule__Diagnosis__Group__1 : rule__Diagnosis__Group__1__Impl rule__Diagnosis__Group__2 ;
    public final void rule__Diagnosis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1778:1: ( rule__Diagnosis__Group__1__Impl rule__Diagnosis__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1779:2: rule__Diagnosis__Group__1__Impl rule__Diagnosis__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__1__Impl_in_rule__Diagnosis__Group__13859);
            rule__Diagnosis__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__2_in_rule__Diagnosis__Group__13862);
            rule__Diagnosis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__1"


    // $ANTLR start "rule__Diagnosis__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1786:1: rule__Diagnosis__Group__1__Impl : ( 'putative variants for' ) ;
    public final void rule__Diagnosis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1790:1: ( ( 'putative variants for' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1791:1: ( 'putative variants for' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1791:1: ( 'putative variants for' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1792:1: 'putative variants for'
            {
             before(grammarAccess.getDiagnosisAccess().getPutativeVariantsForKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Diagnosis__Group__1__Impl3890); 
             after(grammarAccess.getDiagnosisAccess().getPutativeVariantsForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__1__Impl"


    // $ANTLR start "rule__Diagnosis__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1805:1: rule__Diagnosis__Group__2 : rule__Diagnosis__Group__2__Impl rule__Diagnosis__Group__3 ;
    public final void rule__Diagnosis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1809:1: ( rule__Diagnosis__Group__2__Impl rule__Diagnosis__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1810:2: rule__Diagnosis__Group__2__Impl rule__Diagnosis__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__2__Impl_in_rule__Diagnosis__Group__23921);
            rule__Diagnosis__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__3_in_rule__Diagnosis__Group__23924);
            rule__Diagnosis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__2"


    // $ANTLR start "rule__Diagnosis__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1817:1: rule__Diagnosis__Group__2__Impl : ( ( rule__Diagnosis__DiseaseAssignment_2 ) ) ;
    public final void rule__Diagnosis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1821:1: ( ( ( rule__Diagnosis__DiseaseAssignment_2 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1822:1: ( ( rule__Diagnosis__DiseaseAssignment_2 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1822:1: ( ( rule__Diagnosis__DiseaseAssignment_2 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1823:1: ( rule__Diagnosis__DiseaseAssignment_2 )
            {
             before(grammarAccess.getDiagnosisAccess().getDiseaseAssignment_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1824:1: ( rule__Diagnosis__DiseaseAssignment_2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1824:2: rule__Diagnosis__DiseaseAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__DiseaseAssignment_2_in_rule__Diagnosis__Group__2__Impl3951);
            rule__Diagnosis__DiseaseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagnosisAccess().getDiseaseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__2__Impl"


    // $ANTLR start "rule__Diagnosis__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1834:1: rule__Diagnosis__Group__3 : rule__Diagnosis__Group__3__Impl rule__Diagnosis__Group__4 ;
    public final void rule__Diagnosis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1838:1: ( rule__Diagnosis__Group__3__Impl rule__Diagnosis__Group__4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1839:2: rule__Diagnosis__Group__3__Impl rule__Diagnosis__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__3__Impl_in_rule__Diagnosis__Group__33981);
            rule__Diagnosis__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__4_in_rule__Diagnosis__Group__33984);
            rule__Diagnosis__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__3"


    // $ANTLR start "rule__Diagnosis__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1846:1: rule__Diagnosis__Group__3__Impl : ( ( rule__Diagnosis__PatientDataAssignment_3 ) ) ;
    public final void rule__Diagnosis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1850:1: ( ( ( rule__Diagnosis__PatientDataAssignment_3 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1851:1: ( ( rule__Diagnosis__PatientDataAssignment_3 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1851:1: ( ( rule__Diagnosis__PatientDataAssignment_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1852:1: ( rule__Diagnosis__PatientDataAssignment_3 )
            {
             before(grammarAccess.getDiagnosisAccess().getPatientDataAssignment_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1853:1: ( rule__Diagnosis__PatientDataAssignment_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1853:2: rule__Diagnosis__PatientDataAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__PatientDataAssignment_3_in_rule__Diagnosis__Group__3__Impl4011);
            rule__Diagnosis__PatientDataAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDiagnosisAccess().getPatientDataAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__3__Impl"


    // $ANTLR start "rule__Diagnosis__Group__4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1863:1: rule__Diagnosis__Group__4 : rule__Diagnosis__Group__4__Impl rule__Diagnosis__Group__5 ;
    public final void rule__Diagnosis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1867:1: ( rule__Diagnosis__Group__4__Impl rule__Diagnosis__Group__5 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1868:2: rule__Diagnosis__Group__4__Impl rule__Diagnosis__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__4__Impl_in_rule__Diagnosis__Group__44041);
            rule__Diagnosis__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__5_in_rule__Diagnosis__Group__44044);
            rule__Diagnosis__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__4"


    // $ANTLR start "rule__Diagnosis__Group__4__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1875:1: rule__Diagnosis__Group__4__Impl : ( ( ( rule__Diagnosis__AnalysesAssignment_4 ) ) ( ( rule__Diagnosis__AnalysesAssignment_4 )* ) ) ;
    public final void rule__Diagnosis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1879:1: ( ( ( ( rule__Diagnosis__AnalysesAssignment_4 ) ) ( ( rule__Diagnosis__AnalysesAssignment_4 )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1880:1: ( ( ( rule__Diagnosis__AnalysesAssignment_4 ) ) ( ( rule__Diagnosis__AnalysesAssignment_4 )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1880:1: ( ( ( rule__Diagnosis__AnalysesAssignment_4 ) ) ( ( rule__Diagnosis__AnalysesAssignment_4 )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1881:1: ( ( rule__Diagnosis__AnalysesAssignment_4 ) ) ( ( rule__Diagnosis__AnalysesAssignment_4 )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1881:1: ( ( rule__Diagnosis__AnalysesAssignment_4 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1882:1: ( rule__Diagnosis__AnalysesAssignment_4 )
            {
             before(grammarAccess.getDiagnosisAccess().getAnalysesAssignment_4()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1883:1: ( rule__Diagnosis__AnalysesAssignment_4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1883:2: rule__Diagnosis__AnalysesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__AnalysesAssignment_4_in_rule__Diagnosis__Group__4__Impl4073);
            rule__Diagnosis__AnalysesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDiagnosisAccess().getAnalysesAssignment_4()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1886:1: ( ( rule__Diagnosis__AnalysesAssignment_4 )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1887:1: ( rule__Diagnosis__AnalysesAssignment_4 )*
            {
             before(grammarAccess.getDiagnosisAccess().getAnalysesAssignment_4()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1888:1: ( rule__Diagnosis__AnalysesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35||LA19_0==42||(LA19_0>=44 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1888:2: rule__Diagnosis__AnalysesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__AnalysesAssignment_4_in_rule__Diagnosis__Group__4__Impl4085);
            	    rule__Diagnosis__AnalysesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDiagnosisAccess().getAnalysesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__4__Impl"


    // $ANTLR start "rule__Diagnosis__Group__5"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1899:1: rule__Diagnosis__Group__5 : rule__Diagnosis__Group__5__Impl ;
    public final void rule__Diagnosis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1903:1: ( rule__Diagnosis__Group__5__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1904:2: rule__Diagnosis__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__Group__5__Impl_in_rule__Diagnosis__Group__54118);
            rule__Diagnosis__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__5"


    // $ANTLR start "rule__Diagnosis__Group__5__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1910:1: rule__Diagnosis__Group__5__Impl : ( ( rule__Diagnosis__ReportAssignment_5 ) ) ;
    public final void rule__Diagnosis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1914:1: ( ( ( rule__Diagnosis__ReportAssignment_5 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1915:1: ( ( rule__Diagnosis__ReportAssignment_5 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1915:1: ( ( rule__Diagnosis__ReportAssignment_5 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1916:1: ( rule__Diagnosis__ReportAssignment_5 )
            {
             before(grammarAccess.getDiagnosisAccess().getReportAssignment_5()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1917:1: ( rule__Diagnosis__ReportAssignment_5 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1917:2: rule__Diagnosis__ReportAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagnosis__ReportAssignment_5_in_rule__Diagnosis__Group__5__Impl4145);
            rule__Diagnosis__ReportAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDiagnosisAccess().getReportAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__Group__5__Impl"


    // $ANTLR start "rule__PatientData__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1939:1: rule__PatientData__Group__0 : rule__PatientData__Group__0__Impl rule__PatientData__Group__1 ;
    public final void rule__PatientData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1943:1: ( rule__PatientData__Group__0__Impl rule__PatientData__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1944:2: rule__PatientData__Group__0__Impl rule__PatientData__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PatientData__Group__0__Impl_in_rule__PatientData__Group__04187);
            rule__PatientData__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PatientData__Group__1_in_rule__PatientData__Group__04190);
            rule__PatientData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatientData__Group__0"


    // $ANTLR start "rule__PatientData__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1951:1: rule__PatientData__Group__0__Impl : ( 'Read' ) ;
    public final void rule__PatientData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1955:1: ( ( 'Read' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1956:1: ( 'Read' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1956:1: ( 'Read' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1957:1: 'Read'
            {
             before(grammarAccess.getPatientDataAccess().getReadKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PatientData__Group__0__Impl4218); 
             after(grammarAccess.getPatientDataAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatientData__Group__0__Impl"


    // $ANTLR start "rule__PatientData__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1970:1: rule__PatientData__Group__1 : rule__PatientData__Group__1__Impl ;
    public final void rule__PatientData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1974:1: ( rule__PatientData__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1975:2: rule__PatientData__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PatientData__Group__1__Impl_in_rule__PatientData__Group__14249);
            rule__PatientData__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatientData__Group__1"


    // $ANTLR start "rule__PatientData__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1981:1: rule__PatientData__Group__1__Impl : ( ( rule__PatientData__VariationsAssignment_1 ) ) ;
    public final void rule__PatientData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1985:1: ( ( ( rule__PatientData__VariationsAssignment_1 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1986:1: ( ( rule__PatientData__VariationsAssignment_1 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1986:1: ( ( rule__PatientData__VariationsAssignment_1 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1987:1: ( rule__PatientData__VariationsAssignment_1 )
            {
             before(grammarAccess.getPatientDataAccess().getVariationsAssignment_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1988:1: ( rule__PatientData__VariationsAssignment_1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1988:2: rule__PatientData__VariationsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PatientData__VariationsAssignment_1_in_rule__PatientData__Group__1__Impl4276);
            rule__PatientData__VariationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatientDataAccess().getVariationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatientData__Group__1__Impl"


    // $ANTLR start "rule__Variations__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2002:1: rule__Variations__Group__0 : rule__Variations__Group__0__Impl rule__Variations__Group__1 ;
    public final void rule__Variations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2006:1: ( rule__Variations__Group__0__Impl rule__Variations__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2007:2: rule__Variations__Group__0__Impl rule__Variations__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variations__Group__0__Impl_in_rule__Variations__Group__04310);
            rule__Variations__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variations__Group__1_in_rule__Variations__Group__04313);
            rule__Variations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__Group__0"


    // $ANTLR start "rule__Variations__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2014:1: rule__Variations__Group__0__Impl : ( 'variations' ) ;
    public final void rule__Variations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2018:1: ( ( 'variations' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2019:1: ( 'variations' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2019:1: ( 'variations' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2020:1: 'variations'
            {
             before(grammarAccess.getVariationsAccess().getVariationsKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Variations__Group__0__Impl4341); 
             after(grammarAccess.getVariationsAccess().getVariationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__Group__0__Impl"


    // $ANTLR start "rule__Variations__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2033:1: rule__Variations__Group__1 : rule__Variations__Group__1__Impl rule__Variations__Group__2 ;
    public final void rule__Variations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2037:1: ( rule__Variations__Group__1__Impl rule__Variations__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2038:2: rule__Variations__Group__1__Impl rule__Variations__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variations__Group__1__Impl_in_rule__Variations__Group__14372);
            rule__Variations__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variations__Group__2_in_rule__Variations__Group__14375);
            rule__Variations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__Group__1"


    // $ANTLR start "rule__Variations__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2045:1: rule__Variations__Group__1__Impl : ( ( rule__Variations__SeveralAssignment_1 )? ) ;
    public final void rule__Variations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2049:1: ( ( ( rule__Variations__SeveralAssignment_1 )? ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2050:1: ( ( rule__Variations__SeveralAssignment_1 )? )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2050:1: ( ( rule__Variations__SeveralAssignment_1 )? )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2051:1: ( rule__Variations__SeveralAssignment_1 )?
            {
             before(grammarAccess.getVariationsAccess().getSeveralAssignment_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2052:1: ( rule__Variations__SeveralAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2052:2: rule__Variations__SeveralAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variations__SeveralAssignment_1_in_rule__Variations__Group__1__Impl4402);
                    rule__Variations__SeveralAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariationsAccess().getSeveralAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__Group__1__Impl"


    // $ANTLR start "rule__Variations__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2062:1: rule__Variations__Group__2 : rule__Variations__Group__2__Impl ;
    public final void rule__Variations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2066:1: ( rule__Variations__Group__2__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2067:2: rule__Variations__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variations__Group__2__Impl_in_rule__Variations__Group__24433);
            rule__Variations__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__Group__2"


    // $ANTLR start "rule__Variations__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2073:1: rule__Variations__Group__2__Impl : ( ( rule__Variations__FormatAssignment_2 ) ) ;
    public final void rule__Variations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2077:1: ( ( ( rule__Variations__FormatAssignment_2 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2078:1: ( ( rule__Variations__FormatAssignment_2 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2078:1: ( ( rule__Variations__FormatAssignment_2 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2079:1: ( rule__Variations__FormatAssignment_2 )
            {
             before(grammarAccess.getVariationsAccess().getFormatAssignment_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2080:1: ( rule__Variations__FormatAssignment_2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2080:2: rule__Variations__FormatAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variations__FormatAssignment_2_in_rule__Variations__Group__2__Impl4460);
            rule__Variations__FormatAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariationsAccess().getFormatAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__Group__2__Impl"


    // $ANTLR start "rule__SeveralPatients__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2096:1: rule__SeveralPatients__Group__0 : rule__SeveralPatients__Group__0__Impl rule__SeveralPatients__Group__1 ;
    public final void rule__SeveralPatients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2100:1: ( rule__SeveralPatients__Group__0__Impl rule__SeveralPatients__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2101:2: rule__SeveralPatients__Group__0__Impl rule__SeveralPatients__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SeveralPatients__Group__0__Impl_in_rule__SeveralPatients__Group__04496);
            rule__SeveralPatients__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SeveralPatients__Group__1_in_rule__SeveralPatients__Group__04499);
            rule__SeveralPatients__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeveralPatients__Group__0"


    // $ANTLR start "rule__SeveralPatients__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2108:1: rule__SeveralPatients__Group__0__Impl : ( 'genotypes' ) ;
    public final void rule__SeveralPatients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2112:1: ( ( 'genotypes' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2113:1: ( 'genotypes' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2113:1: ( 'genotypes' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2114:1: 'genotypes'
            {
             before(grammarAccess.getSeveralPatientsAccess().getGenotypesKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SeveralPatients__Group__0__Impl4527); 
             after(grammarAccess.getSeveralPatientsAccess().getGenotypesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeveralPatients__Group__0__Impl"


    // $ANTLR start "rule__SeveralPatients__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2127:1: rule__SeveralPatients__Group__1 : rule__SeveralPatients__Group__1__Impl ;
    public final void rule__SeveralPatients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2131:1: ( rule__SeveralPatients__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2132:2: rule__SeveralPatients__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SeveralPatients__Group__1__Impl_in_rule__SeveralPatients__Group__14558);
            rule__SeveralPatients__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeveralPatients__Group__1"


    // $ANTLR start "rule__SeveralPatients__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2138:1: rule__SeveralPatients__Group__1__Impl : ( () ) ;
    public final void rule__SeveralPatients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2142:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2143:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2143:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2144:1: ()
            {
             before(grammarAccess.getSeveralPatientsAccess().getSeveralPatientsAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2145:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2147:1: 
            {
            }

             after(grammarAccess.getSeveralPatientsAccess().getSeveralPatientsAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeveralPatients__Group__1__Impl"


    // $ANTLR start "rule__Vcf__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2161:1: rule__Vcf__Group__0 : rule__Vcf__Group__0__Impl rule__Vcf__Group__1 ;
    public final void rule__Vcf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2165:1: ( rule__Vcf__Group__0__Impl rule__Vcf__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2166:2: rule__Vcf__Group__0__Impl rule__Vcf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vcf__Group__0__Impl_in_rule__Vcf__Group__04620);
            rule__Vcf__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vcf__Group__1_in_rule__Vcf__Group__04623);
            rule__Vcf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vcf__Group__0"


    // $ANTLR start "rule__Vcf__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2173:1: rule__Vcf__Group__0__Impl : ( 'from' ) ;
    public final void rule__Vcf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2177:1: ( ( 'from' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2178:1: ( 'from' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2178:1: ( 'from' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2179:1: 'from'
            {
             before(grammarAccess.getVcfAccess().getFromKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Vcf__Group__0__Impl4651); 
             after(grammarAccess.getVcfAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vcf__Group__0__Impl"


    // $ANTLR start "rule__Vcf__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2192:1: rule__Vcf__Group__1 : rule__Vcf__Group__1__Impl rule__Vcf__Group__2 ;
    public final void rule__Vcf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2196:1: ( rule__Vcf__Group__1__Impl rule__Vcf__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2197:2: rule__Vcf__Group__1__Impl rule__Vcf__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vcf__Group__1__Impl_in_rule__Vcf__Group__14682);
            rule__Vcf__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vcf__Group__2_in_rule__Vcf__Group__14685);
            rule__Vcf__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vcf__Group__1"


    // $ANTLR start "rule__Vcf__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2204:1: rule__Vcf__Group__1__Impl : ( 'a VCF file' ) ;
    public final void rule__Vcf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2208:1: ( ( 'a VCF file' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2209:1: ( 'a VCF file' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2209:1: ( 'a VCF file' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2210:1: 'a VCF file'
            {
             before(grammarAccess.getVcfAccess().getAVCFFileKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Vcf__Group__1__Impl4713); 
             after(grammarAccess.getVcfAccess().getAVCFFileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vcf__Group__1__Impl"


    // $ANTLR start "rule__Vcf__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2223:1: rule__Vcf__Group__2 : rule__Vcf__Group__2__Impl ;
    public final void rule__Vcf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2227:1: ( rule__Vcf__Group__2__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2228:2: rule__Vcf__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vcf__Group__2__Impl_in_rule__Vcf__Group__24744);
            rule__Vcf__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vcf__Group__2"


    // $ANTLR start "rule__Vcf__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2234:1: rule__Vcf__Group__2__Impl : ( ( rule__Vcf__DatafileAssignment_2 ) ) ;
    public final void rule__Vcf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2238:1: ( ( ( rule__Vcf__DatafileAssignment_2 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2239:1: ( ( rule__Vcf__DatafileAssignment_2 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2239:1: ( ( rule__Vcf__DatafileAssignment_2 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2240:1: ( rule__Vcf__DatafileAssignment_2 )
            {
             before(grammarAccess.getVcfAccess().getDatafileAssignment_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2241:1: ( rule__Vcf__DatafileAssignment_2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2241:2: rule__Vcf__DatafileAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vcf__DatafileAssignment_2_in_rule__Vcf__Group__2__Impl4771);
            rule__Vcf__DatafileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVcfAccess().getDatafileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vcf__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2257:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2261:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2262:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__04807);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__04810);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2269:1: rule__Annotation__Group__0__Impl : ( 'Annotate' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2273:1: ( ( 'Annotate' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2274:1: ( 'Annotate' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2274:1: ( 'Annotate' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2275:1: 'Annotate'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotateKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Annotation__Group__0__Impl4838); 
             after(grammarAccess.getAnnotationAccess().getAnnotateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2288:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2292:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2293:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__14869);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__14872);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2300:1: rule__Annotation__Group__1__Impl : ( 'variations' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2304:1: ( ( 'variations' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2305:1: ( 'variations' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2305:1: ( 'variations' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2306:1: 'variations'
            {
             before(grammarAccess.getAnnotationAccess().getVariationsKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Annotation__Group__1__Impl4900); 
             after(grammarAccess.getAnnotationAccess().getVariationsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2319:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2323:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2324:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__24931);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__24934);
            rule__Annotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2331:1: rule__Annotation__Group__2__Impl : ( 'with' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2335:1: ( ( 'with' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2336:1: ( 'with' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2336:1: ( 'with' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2337:1: 'with'
            {
             before(grammarAccess.getAnnotationAccess().getWithKeyword_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Annotation__Group__2__Impl4962); 
             after(grammarAccess.getAnnotationAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2350:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2354:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2355:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__34993);
            rule__Annotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__34996);
            rule__Annotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2362:1: rule__Annotation__Group__3__Impl : ( () ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2366:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2367:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2367:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2368:1: ()
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationAction_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2369:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2371:1: 
            {
            }

             after(grammarAccess.getAnnotationAccess().getAnnotationAction_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group__4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2381:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2385:1: ( rule__Annotation__Group__4__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2386:2: rule__Annotation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__45054);
            rule__Annotation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__4"


    // $ANTLR start "rule__Annotation__Group__4__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2392:1: rule__Annotation__Group__4__Impl : ( ( ( rule__Annotation__Alternatives_4 ) ) ( ( rule__Annotation__Alternatives_4 )* ) ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2396:1: ( ( ( ( rule__Annotation__Alternatives_4 ) ) ( ( rule__Annotation__Alternatives_4 )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2397:1: ( ( ( rule__Annotation__Alternatives_4 ) ) ( ( rule__Annotation__Alternatives_4 )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2397:1: ( ( ( rule__Annotation__Alternatives_4 ) ) ( ( rule__Annotation__Alternatives_4 )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2398:1: ( ( rule__Annotation__Alternatives_4 ) ) ( ( rule__Annotation__Alternatives_4 )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2398:1: ( ( rule__Annotation__Alternatives_4 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2399:1: ( rule__Annotation__Alternatives_4 )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives_4()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2400:1: ( rule__Annotation__Alternatives_4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2400:2: rule__Annotation__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_4_in_rule__Annotation__Group__4__Impl5083);
            rule__Annotation__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAlternatives_4()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2403:1: ( ( rule__Annotation__Alternatives_4 )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2404:1: ( rule__Annotation__Alternatives_4 )*
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives_4()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2405:1: ( rule__Annotation__Alternatives_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=16 && LA21_0<=17)||(LA21_0>=37 && LA21_0<=41)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2405:2: rule__Annotation__Alternatives_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_4_in_rule__Annotation__Group__4__Impl5095);
            	    rule__Annotation__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAnnotationAccess().getAlternatives_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__4__Impl"


    // $ANTLR start "rule__HgvsA__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2426:1: rule__HgvsA__Group__0 : rule__HgvsA__Group__0__Impl rule__HgvsA__Group__1 ;
    public final void rule__HgvsA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2430:1: ( rule__HgvsA__Group__0__Impl rule__HgvsA__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2431:2: rule__HgvsA__Group__0__Impl rule__HgvsA__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsA__Group__0__Impl_in_rule__HgvsA__Group__05138);
            rule__HgvsA__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HgvsA__Group__1_in_rule__HgvsA__Group__05141);
            rule__HgvsA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsA__Group__0"


    // $ANTLR start "rule__HgvsA__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2438:1: rule__HgvsA__Group__0__Impl : ( 'hgvs' ) ;
    public final void rule__HgvsA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2442:1: ( ( 'hgvs' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2443:1: ( 'hgvs' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2443:1: ( 'hgvs' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2444:1: 'hgvs'
            {
             before(grammarAccess.getHgvsAAccess().getHgvsKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__HgvsA__Group__0__Impl5169); 
             after(grammarAccess.getHgvsAAccess().getHgvsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsA__Group__0__Impl"


    // $ANTLR start "rule__HgvsA__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2457:1: rule__HgvsA__Group__1 : rule__HgvsA__Group__1__Impl ;
    public final void rule__HgvsA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2461:1: ( rule__HgvsA__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2462:2: rule__HgvsA__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsA__Group__1__Impl_in_rule__HgvsA__Group__15200);
            rule__HgvsA__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsA__Group__1"


    // $ANTLR start "rule__HgvsA__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2468:1: rule__HgvsA__Group__1__Impl : ( () ) ;
    public final void rule__HgvsA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2472:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2473:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2473:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2474:1: ()
            {
             before(grammarAccess.getHgvsAAccess().getHgvsAAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2475:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2477:1: 
            {
            }

             after(grammarAccess.getHgvsAAccess().getHgvsAAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsA__Group__1__Impl"


    // $ANTLR start "rule__GeneA__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2491:1: rule__GeneA__Group__0 : rule__GeneA__Group__0__Impl rule__GeneA__Group__1 ;
    public final void rule__GeneA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2495:1: ( rule__GeneA__Group__0__Impl rule__GeneA__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2496:2: rule__GeneA__Group__0__Impl rule__GeneA__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneA__Group__0__Impl_in_rule__GeneA__Group__05262);
            rule__GeneA__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GeneA__Group__1_in_rule__GeneA__Group__05265);
            rule__GeneA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneA__Group__0"


    // $ANTLR start "rule__GeneA__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2503:1: rule__GeneA__Group__0__Impl : ( 'gene' ) ;
    public final void rule__GeneA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2507:1: ( ( 'gene' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2508:1: ( 'gene' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2508:1: ( 'gene' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2509:1: 'gene'
            {
             before(grammarAccess.getGeneAAccess().getGeneKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__GeneA__Group__0__Impl5293); 
             after(grammarAccess.getGeneAAccess().getGeneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneA__Group__0__Impl"


    // $ANTLR start "rule__GeneA__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2522:1: rule__GeneA__Group__1 : rule__GeneA__Group__1__Impl ;
    public final void rule__GeneA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2526:1: ( rule__GeneA__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2527:2: rule__GeneA__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneA__Group__1__Impl_in_rule__GeneA__Group__15324);
            rule__GeneA__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneA__Group__1"


    // $ANTLR start "rule__GeneA__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2533:1: rule__GeneA__Group__1__Impl : ( () ) ;
    public final void rule__GeneA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2537:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2538:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2538:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2539:1: ()
            {
             before(grammarAccess.getGeneAAccess().getGeneAAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2540:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2542:1: 
            {
            }

             after(grammarAccess.getGeneAAccess().getGeneAAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneA__Group__1__Impl"


    // $ANTLR start "rule__TranscriptA__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2556:1: rule__TranscriptA__Group__0 : rule__TranscriptA__Group__0__Impl rule__TranscriptA__Group__1 ;
    public final void rule__TranscriptA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2560:1: ( rule__TranscriptA__Group__0__Impl rule__TranscriptA__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2561:2: rule__TranscriptA__Group__0__Impl rule__TranscriptA__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TranscriptA__Group__0__Impl_in_rule__TranscriptA__Group__05386);
            rule__TranscriptA__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TranscriptA__Group__1_in_rule__TranscriptA__Group__05389);
            rule__TranscriptA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptA__Group__0"


    // $ANTLR start "rule__TranscriptA__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2568:1: rule__TranscriptA__Group__0__Impl : ( 'transcript' ) ;
    public final void rule__TranscriptA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2572:1: ( ( 'transcript' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2573:1: ( 'transcript' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2573:1: ( 'transcript' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2574:1: 'transcript'
            {
             before(grammarAccess.getTranscriptAAccess().getTranscriptKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__TranscriptA__Group__0__Impl5417); 
             after(grammarAccess.getTranscriptAAccess().getTranscriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptA__Group__0__Impl"


    // $ANTLR start "rule__TranscriptA__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2587:1: rule__TranscriptA__Group__1 : rule__TranscriptA__Group__1__Impl ;
    public final void rule__TranscriptA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2591:1: ( rule__TranscriptA__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2592:2: rule__TranscriptA__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TranscriptA__Group__1__Impl_in_rule__TranscriptA__Group__15448);
            rule__TranscriptA__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptA__Group__1"


    // $ANTLR start "rule__TranscriptA__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2598:1: rule__TranscriptA__Group__1__Impl : ( () ) ;
    public final void rule__TranscriptA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2602:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2603:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2603:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2604:1: ()
            {
             before(grammarAccess.getTranscriptAAccess().getTranscriptAAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2605:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2607:1: 
            {
            }

             after(grammarAccess.getTranscriptAAccess().getTranscriptAAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptA__Group__1__Impl"


    // $ANTLR start "rule__RsIdA__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2621:1: rule__RsIdA__Group__0 : rule__RsIdA__Group__0__Impl rule__RsIdA__Group__1 ;
    public final void rule__RsIdA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2625:1: ( rule__RsIdA__Group__0__Impl rule__RsIdA__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2626:2: rule__RsIdA__Group__0__Impl rule__RsIdA__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RsIdA__Group__0__Impl_in_rule__RsIdA__Group__05510);
            rule__RsIdA__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RsIdA__Group__1_in_rule__RsIdA__Group__05513);
            rule__RsIdA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdA__Group__0"


    // $ANTLR start "rule__RsIdA__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2633:1: rule__RsIdA__Group__0__Impl : ( 'rsId' ) ;
    public final void rule__RsIdA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2637:1: ( ( 'rsId' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2638:1: ( 'rsId' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2638:1: ( 'rsId' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2639:1: 'rsId'
            {
             before(grammarAccess.getRsIdAAccess().getRsIdKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__RsIdA__Group__0__Impl5541); 
             after(grammarAccess.getRsIdAAccess().getRsIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdA__Group__0__Impl"


    // $ANTLR start "rule__RsIdA__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2652:1: rule__RsIdA__Group__1 : rule__RsIdA__Group__1__Impl ;
    public final void rule__RsIdA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2656:1: ( rule__RsIdA__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2657:2: rule__RsIdA__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RsIdA__Group__1__Impl_in_rule__RsIdA__Group__15572);
            rule__RsIdA__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdA__Group__1"


    // $ANTLR start "rule__RsIdA__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2663:1: rule__RsIdA__Group__1__Impl : ( () ) ;
    public final void rule__RsIdA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2667:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2668:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2668:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2669:1: ()
            {
             before(grammarAccess.getRsIdAAccess().getRsIdAAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2670:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2672:1: 
            {
            }

             after(grammarAccess.getRsIdAAccess().getRsIdAAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdA__Group__1__Impl"


    // $ANTLR start "rule__MafA__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2686:1: rule__MafA__Group__0 : rule__MafA__Group__0__Impl rule__MafA__Group__1 ;
    public final void rule__MafA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2690:1: ( rule__MafA__Group__0__Impl rule__MafA__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2691:2: rule__MafA__Group__0__Impl rule__MafA__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafA__Group__0__Impl_in_rule__MafA__Group__05634);
            rule__MafA__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MafA__Group__1_in_rule__MafA__Group__05637);
            rule__MafA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafA__Group__0"


    // $ANTLR start "rule__MafA__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2698:1: rule__MafA__Group__0__Impl : ( 'samples maf' ) ;
    public final void rule__MafA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2702:1: ( ( 'samples maf' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2703:1: ( 'samples maf' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2703:1: ( 'samples maf' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2704:1: 'samples maf'
            {
             before(grammarAccess.getMafAAccess().getSamplesMafKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MafA__Group__0__Impl5665); 
             after(grammarAccess.getMafAAccess().getSamplesMafKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafA__Group__0__Impl"


    // $ANTLR start "rule__MafA__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2717:1: rule__MafA__Group__1 : rule__MafA__Group__1__Impl ;
    public final void rule__MafA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2721:1: ( rule__MafA__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2722:2: rule__MafA__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafA__Group__1__Impl_in_rule__MafA__Group__15696);
            rule__MafA__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafA__Group__1"


    // $ANTLR start "rule__MafA__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2728:1: rule__MafA__Group__1__Impl : ( () ) ;
    public final void rule__MafA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2732:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2733:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2733:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2734:1: ()
            {
             before(grammarAccess.getMafAAccess().getMAFAAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2735:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2737:1: 
            {
            }

             after(grammarAccess.getMafAAccess().getMAFAAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafA__Group__1__Impl"


    // $ANTLR start "rule__Search__Group_1__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2751:1: rule__Search__Group_1__0 : rule__Search__Group_1__0__Impl rule__Search__Group_1__1 ;
    public final void rule__Search__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2755:1: ( rule__Search__Group_1__0__Impl rule__Search__Group_1__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2756:2: rule__Search__Group_1__0__Impl rule__Search__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__0__Impl_in_rule__Search__Group_1__05758);
            rule__Search__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__1_in_rule__Search__Group_1__05761);
            rule__Search__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__0"


    // $ANTLR start "rule__Search__Group_1__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2763:1: rule__Search__Group_1__0__Impl : ( 'Filter' ) ;
    public final void rule__Search__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2767:1: ( ( 'Filter' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2768:1: ( 'Filter' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2768:1: ( 'Filter' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2769:1: 'Filter'
            {
             before(grammarAccess.getSearchAccess().getFilterKeyword_1_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Search__Group_1__0__Impl5789); 
             after(grammarAccess.getSearchAccess().getFilterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__0__Impl"


    // $ANTLR start "rule__Search__Group_1__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2782:1: rule__Search__Group_1__1 : rule__Search__Group_1__1__Impl rule__Search__Group_1__2 ;
    public final void rule__Search__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2786:1: ( rule__Search__Group_1__1__Impl rule__Search__Group_1__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2787:2: rule__Search__Group_1__1__Impl rule__Search__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__1__Impl_in_rule__Search__Group_1__15820);
            rule__Search__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__2_in_rule__Search__Group_1__15823);
            rule__Search__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__1"


    // $ANTLR start "rule__Search__Group_1__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2794:1: rule__Search__Group_1__1__Impl : ( 'variations' ) ;
    public final void rule__Search__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2798:1: ( ( 'variations' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2799:1: ( 'variations' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2799:1: ( 'variations' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2800:1: 'variations'
            {
             before(grammarAccess.getSearchAccess().getVariationsKeyword_1_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Search__Group_1__1__Impl5851); 
             after(grammarAccess.getSearchAccess().getVariationsKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__1__Impl"


    // $ANTLR start "rule__Search__Group_1__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2813:1: rule__Search__Group_1__2 : rule__Search__Group_1__2__Impl rule__Search__Group_1__3 ;
    public final void rule__Search__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2817:1: ( rule__Search__Group_1__2__Impl rule__Search__Group_1__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2818:2: rule__Search__Group_1__2__Impl rule__Search__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__2__Impl_in_rule__Search__Group_1__25882);
            rule__Search__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__3_in_rule__Search__Group_1__25885);
            rule__Search__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__2"


    // $ANTLR start "rule__Search__Group_1__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2825:1: rule__Search__Group_1__2__Impl : ( 'by' ) ;
    public final void rule__Search__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2829:1: ( ( 'by' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2830:1: ( 'by' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2830:1: ( 'by' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2831:1: 'by'
            {
             before(grammarAccess.getSearchAccess().getByKeyword_1_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Search__Group_1__2__Impl5913); 
             after(grammarAccess.getSearchAccess().getByKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__2__Impl"


    // $ANTLR start "rule__Search__Group_1__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2844:1: rule__Search__Group_1__3 : rule__Search__Group_1__3__Impl ;
    public final void rule__Search__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2848:1: ( rule__Search__Group_1__3__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2849:2: rule__Search__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_1__3__Impl_in_rule__Search__Group_1__35944);
            rule__Search__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__3"


    // $ANTLR start "rule__Search__Group_1__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2855:1: rule__Search__Group_1__3__Impl : ( ( rule__Search__Alternatives_1_3 ) ) ;
    public final void rule__Search__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2859:1: ( ( ( rule__Search__Alternatives_1_3 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2860:1: ( ( rule__Search__Alternatives_1_3 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2860:1: ( ( rule__Search__Alternatives_1_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2861:1: ( rule__Search__Alternatives_1_3 )
            {
             before(grammarAccess.getSearchAccess().getAlternatives_1_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2862:1: ( rule__Search__Alternatives_1_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2862:2: rule__Search__Alternatives_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Alternatives_1_3_in_rule__Search__Group_1__3__Impl5971);
            rule__Search__Alternatives_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getAlternatives_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_1__3__Impl"


    // $ANTLR start "rule__Search__Group_2__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2880:1: rule__Search__Group_2__0 : rule__Search__Group_2__0__Impl rule__Search__Group_2__1 ;
    public final void rule__Search__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2884:1: ( rule__Search__Group_2__0__Impl rule__Search__Group_2__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2885:2: rule__Search__Group_2__0__Impl rule__Search__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__0__Impl_in_rule__Search__Group_2__06009);
            rule__Search__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__1_in_rule__Search__Group_2__06012);
            rule__Search__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__0"


    // $ANTLR start "rule__Search__Group_2__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2892:1: rule__Search__Group_2__0__Impl : ( 'Prioritize' ) ;
    public final void rule__Search__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2896:1: ( ( 'Prioritize' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2897:1: ( 'Prioritize' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2897:1: ( 'Prioritize' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2898:1: 'Prioritize'
            {
             before(grammarAccess.getSearchAccess().getPrioritizeKeyword_2_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Search__Group_2__0__Impl6040); 
             after(grammarAccess.getSearchAccess().getPrioritizeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__0__Impl"


    // $ANTLR start "rule__Search__Group_2__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2911:1: rule__Search__Group_2__1 : rule__Search__Group_2__1__Impl rule__Search__Group_2__2 ;
    public final void rule__Search__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2915:1: ( rule__Search__Group_2__1__Impl rule__Search__Group_2__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2916:2: rule__Search__Group_2__1__Impl rule__Search__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__1__Impl_in_rule__Search__Group_2__16071);
            rule__Search__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__2_in_rule__Search__Group_2__16074);
            rule__Search__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__1"


    // $ANTLR start "rule__Search__Group_2__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2923:1: rule__Search__Group_2__1__Impl : ( 'variations' ) ;
    public final void rule__Search__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2927:1: ( ( 'variations' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2928:1: ( 'variations' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2928:1: ( 'variations' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2929:1: 'variations'
            {
             before(grammarAccess.getSearchAccess().getVariationsKeyword_2_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Search__Group_2__1__Impl6102); 
             after(grammarAccess.getSearchAccess().getVariationsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__1__Impl"


    // $ANTLR start "rule__Search__Group_2__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2942:1: rule__Search__Group_2__2 : rule__Search__Group_2__2__Impl rule__Search__Group_2__3 ;
    public final void rule__Search__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2946:1: ( rule__Search__Group_2__2__Impl rule__Search__Group_2__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2947:2: rule__Search__Group_2__2__Impl rule__Search__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__2__Impl_in_rule__Search__Group_2__26133);
            rule__Search__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__3_in_rule__Search__Group_2__26136);
            rule__Search__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__2"


    // $ANTLR start "rule__Search__Group_2__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2954:1: rule__Search__Group_2__2__Impl : ( 'by' ) ;
    public final void rule__Search__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2958:1: ( ( 'by' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2959:1: ( 'by' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2959:1: ( 'by' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2960:1: 'by'
            {
             before(grammarAccess.getSearchAccess().getByKeyword_2_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Search__Group_2__2__Impl6164); 
             after(grammarAccess.getSearchAccess().getByKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__2__Impl"


    // $ANTLR start "rule__Search__Group_2__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2973:1: rule__Search__Group_2__3 : rule__Search__Group_2__3__Impl rule__Search__Group_2__4 ;
    public final void rule__Search__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2977:1: ( rule__Search__Group_2__3__Impl rule__Search__Group_2__4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2978:2: rule__Search__Group_2__3__Impl rule__Search__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__3__Impl_in_rule__Search__Group_2__36195);
            rule__Search__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__4_in_rule__Search__Group_2__36198);
            rule__Search__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__3"


    // $ANTLR start "rule__Search__Group_2__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2985:1: rule__Search__Group_2__3__Impl : ( ( rule__Search__Alternatives_2_3 ) ) ;
    public final void rule__Search__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2989:1: ( ( ( rule__Search__Alternatives_2_3 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2990:1: ( ( rule__Search__Alternatives_2_3 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2990:1: ( ( rule__Search__Alternatives_2_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2991:1: ( rule__Search__Alternatives_2_3 )
            {
             before(grammarAccess.getSearchAccess().getAlternatives_2_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2992:1: ( rule__Search__Alternatives_2_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:2992:2: rule__Search__Alternatives_2_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Alternatives_2_3_in_rule__Search__Group_2__3__Impl6225);
            rule__Search__Alternatives_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getAlternatives_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__3__Impl"


    // $ANTLR start "rule__Search__Group_2__4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3002:1: rule__Search__Group_2__4 : rule__Search__Group_2__4__Impl ;
    public final void rule__Search__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3006:1: ( rule__Search__Group_2__4__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3007:2: rule__Search__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_2__4__Impl_in_rule__Search__Group_2__46255);
            rule__Search__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__4"


    // $ANTLR start "rule__Search__Group_2__4__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3013:1: rule__Search__Group_2__4__Impl : ( ( rule__Search__OrderAssignment_2_4 ) ) ;
    public final void rule__Search__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3017:1: ( ( ( rule__Search__OrderAssignment_2_4 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3018:1: ( ( rule__Search__OrderAssignment_2_4 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3018:1: ( ( rule__Search__OrderAssignment_2_4 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3019:1: ( rule__Search__OrderAssignment_2_4 )
            {
             before(grammarAccess.getSearchAccess().getOrderAssignment_2_4()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3020:1: ( rule__Search__OrderAssignment_2_4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3020:2: rule__Search__OrderAssignment_2_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__OrderAssignment_2_4_in_rule__Search__Group_2__4__Impl6282);
            rule__Search__OrderAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getOrderAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group_2__4__Impl"


    // $ANTLR start "rule__HgvsS__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3040:1: rule__HgvsS__Group__0 : rule__HgvsS__Group__0__Impl rule__HgvsS__Group__1 ;
    public final void rule__HgvsS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3044:1: ( rule__HgvsS__Group__0__Impl rule__HgvsS__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3045:2: rule__HgvsS__Group__0__Impl rule__HgvsS__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsS__Group__0__Impl_in_rule__HgvsS__Group__06322);
            rule__HgvsS__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HgvsS__Group__1_in_rule__HgvsS__Group__06325);
            rule__HgvsS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsS__Group__0"


    // $ANTLR start "rule__HgvsS__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3052:1: rule__HgvsS__Group__0__Impl : ( 'Search' ) ;
    public final void rule__HgvsS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3056:1: ( ( 'Search' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3057:1: ( 'Search' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3057:1: ( 'Search' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3058:1: 'Search'
            {
             before(grammarAccess.getHgvsSAccess().getSearchKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__HgvsS__Group__0__Impl6353); 
             after(grammarAccess.getHgvsSAccess().getSearchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsS__Group__0__Impl"


    // $ANTLR start "rule__HgvsS__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3071:1: rule__HgvsS__Group__1 : rule__HgvsS__Group__1__Impl rule__HgvsS__Group__2 ;
    public final void rule__HgvsS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3075:1: ( rule__HgvsS__Group__1__Impl rule__HgvsS__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3076:2: rule__HgvsS__Group__1__Impl rule__HgvsS__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsS__Group__1__Impl_in_rule__HgvsS__Group__16384);
            rule__HgvsS__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HgvsS__Group__2_in_rule__HgvsS__Group__16387);
            rule__HgvsS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsS__Group__1"


    // $ANTLR start "rule__HgvsS__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3083:1: rule__HgvsS__Group__1__Impl : ( 'variations' ) ;
    public final void rule__HgvsS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3087:1: ( ( 'variations' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3088:1: ( 'variations' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3088:1: ( 'variations' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3089:1: 'variations'
            {
             before(grammarAccess.getHgvsSAccess().getVariationsKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__HgvsS__Group__1__Impl6415); 
             after(grammarAccess.getHgvsSAccess().getVariationsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsS__Group__1__Impl"


    // $ANTLR start "rule__HgvsS__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3102:1: rule__HgvsS__Group__2 : rule__HgvsS__Group__2__Impl ;
    public final void rule__HgvsS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3106:1: ( rule__HgvsS__Group__2__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3107:2: rule__HgvsS__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsS__Group__2__Impl_in_rule__HgvsS__Group__26446);
            rule__HgvsS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsS__Group__2"


    // $ANTLR start "rule__HgvsS__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3113:1: rule__HgvsS__Group__2__Impl : ( ( rule__HgvsS__Alternatives_2 ) ) ;
    public final void rule__HgvsS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3117:1: ( ( ( rule__HgvsS__Alternatives_2 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3118:1: ( ( rule__HgvsS__Alternatives_2 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3118:1: ( ( rule__HgvsS__Alternatives_2 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3119:1: ( rule__HgvsS__Alternatives_2 )
            {
             before(grammarAccess.getHgvsSAccess().getAlternatives_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3120:1: ( rule__HgvsS__Alternatives_2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3120:2: rule__HgvsS__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsS__Alternatives_2_in_rule__HgvsS__Group__2__Impl6473);
            rule__HgvsS__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getHgvsSAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsS__Group__2__Impl"


    // $ANTLR start "rule__GeneF__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3136:1: rule__GeneF__Group__0 : rule__GeneF__Group__0__Impl rule__GeneF__Group__1 ;
    public final void rule__GeneF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3140:1: ( rule__GeneF__Group__0__Impl rule__GeneF__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3141:2: rule__GeneF__Group__0__Impl rule__GeneF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneF__Group__0__Impl_in_rule__GeneF__Group__06509);
            rule__GeneF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GeneF__Group__1_in_rule__GeneF__Group__06512);
            rule__GeneF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneF__Group__0"


    // $ANTLR start "rule__GeneF__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3148:1: rule__GeneF__Group__0__Impl : ( 'gene' ) ;
    public final void rule__GeneF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3152:1: ( ( 'gene' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3153:1: ( 'gene' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3153:1: ( 'gene' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3154:1: 'gene'
            {
             before(grammarAccess.getGeneFAccess().getGeneKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__GeneF__Group__0__Impl6540); 
             after(grammarAccess.getGeneFAccess().getGeneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneF__Group__0__Impl"


    // $ANTLR start "rule__GeneF__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3167:1: rule__GeneF__Group__1 : rule__GeneF__Group__1__Impl ;
    public final void rule__GeneF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3171:1: ( rule__GeneF__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3172:2: rule__GeneF__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneF__Group__1__Impl_in_rule__GeneF__Group__16571);
            rule__GeneF__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneF__Group__1"


    // $ANTLR start "rule__GeneF__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3178:1: rule__GeneF__Group__1__Impl : ( ( ( rule__GeneF__GeneAssignment_1 ) ) ( ( rule__GeneF__GeneAssignment_1 )* ) ) ;
    public final void rule__GeneF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3182:1: ( ( ( ( rule__GeneF__GeneAssignment_1 ) ) ( ( rule__GeneF__GeneAssignment_1 )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3183:1: ( ( ( rule__GeneF__GeneAssignment_1 ) ) ( ( rule__GeneF__GeneAssignment_1 )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3183:1: ( ( ( rule__GeneF__GeneAssignment_1 ) ) ( ( rule__GeneF__GeneAssignment_1 )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3184:1: ( ( rule__GeneF__GeneAssignment_1 ) ) ( ( rule__GeneF__GeneAssignment_1 )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3184:1: ( ( rule__GeneF__GeneAssignment_1 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3185:1: ( rule__GeneF__GeneAssignment_1 )
            {
             before(grammarAccess.getGeneFAccess().getGeneAssignment_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3186:1: ( rule__GeneF__GeneAssignment_1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3186:2: rule__GeneF__GeneAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneF__GeneAssignment_1_in_rule__GeneF__Group__1__Impl6600);
            rule__GeneF__GeneAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneFAccess().getGeneAssignment_1()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3189:1: ( ( rule__GeneF__GeneAssignment_1 )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3190:1: ( rule__GeneF__GeneAssignment_1 )*
            {
             before(grammarAccess.getGeneFAccess().getGeneAssignment_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3191:1: ( rule__GeneF__GeneAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_HGNCGENE||(LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3191:2: rule__GeneF__GeneAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GeneF__GeneAssignment_1_in_rule__GeneF__Group__1__Impl6612);
            	    rule__GeneF__GeneAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getGeneFAccess().getGeneAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneF__Group__1__Impl"


    // $ANTLR start "rule__MafF__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3206:1: rule__MafF__Group__0 : rule__MafF__Group__0__Impl rule__MafF__Group__1 ;
    public final void rule__MafF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3210:1: ( rule__MafF__Group__0__Impl rule__MafF__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3211:2: rule__MafF__Group__0__Impl rule__MafF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__0__Impl_in_rule__MafF__Group__06649);
            rule__MafF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__1_in_rule__MafF__Group__06652);
            rule__MafF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__0"


    // $ANTLR start "rule__MafF__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3218:1: rule__MafF__Group__0__Impl : ( 'samples maf' ) ;
    public final void rule__MafF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3222:1: ( ( 'samples maf' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3223:1: ( 'samples maf' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3223:1: ( 'samples maf' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3224:1: 'samples maf'
            {
             before(grammarAccess.getMafFAccess().getSamplesMafKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MafF__Group__0__Impl6680); 
             after(grammarAccess.getMafFAccess().getSamplesMafKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__0__Impl"


    // $ANTLR start "rule__MafF__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3237:1: rule__MafF__Group__1 : rule__MafF__Group__1__Impl rule__MafF__Group__2 ;
    public final void rule__MafF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3241:1: ( rule__MafF__Group__1__Impl rule__MafF__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3242:2: rule__MafF__Group__1__Impl rule__MafF__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__1__Impl_in_rule__MafF__Group__16711);
            rule__MafF__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__2_in_rule__MafF__Group__16714);
            rule__MafF__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__1"


    // $ANTLR start "rule__MafF__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3249:1: rule__MafF__Group__1__Impl : ( '[' ) ;
    public final void rule__MafF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3253:1: ( ( '[' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3254:1: ( '[' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3254:1: ( '[' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3255:1: '['
            {
             before(grammarAccess.getMafFAccess().getLeftSquareBracketKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__MafF__Group__1__Impl6742); 
             after(grammarAccess.getMafFAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__1__Impl"


    // $ANTLR start "rule__MafF__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3268:1: rule__MafF__Group__2 : rule__MafF__Group__2__Impl rule__MafF__Group__3 ;
    public final void rule__MafF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3272:1: ( rule__MafF__Group__2__Impl rule__MafF__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3273:2: rule__MafF__Group__2__Impl rule__MafF__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__2__Impl_in_rule__MafF__Group__26773);
            rule__MafF__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__3_in_rule__MafF__Group__26776);
            rule__MafF__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__2"


    // $ANTLR start "rule__MafF__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3280:1: rule__MafF__Group__2__Impl : ( ( rule__MafF__MinValueAssignment_2 ) ) ;
    public final void rule__MafF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3284:1: ( ( ( rule__MafF__MinValueAssignment_2 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3285:1: ( ( rule__MafF__MinValueAssignment_2 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3285:1: ( ( rule__MafF__MinValueAssignment_2 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3286:1: ( rule__MafF__MinValueAssignment_2 )
            {
             before(grammarAccess.getMafFAccess().getMinValueAssignment_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3287:1: ( rule__MafF__MinValueAssignment_2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3287:2: rule__MafF__MinValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__MinValueAssignment_2_in_rule__MafF__Group__2__Impl6803);
            rule__MafF__MinValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMafFAccess().getMinValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__2__Impl"


    // $ANTLR start "rule__MafF__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3297:1: rule__MafF__Group__3 : rule__MafF__Group__3__Impl rule__MafF__Group__4 ;
    public final void rule__MafF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3301:1: ( rule__MafF__Group__3__Impl rule__MafF__Group__4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3302:2: rule__MafF__Group__3__Impl rule__MafF__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__3__Impl_in_rule__MafF__Group__36833);
            rule__MafF__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__4_in_rule__MafF__Group__36836);
            rule__MafF__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__3"


    // $ANTLR start "rule__MafF__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3309:1: rule__MafF__Group__3__Impl : ( ',' ) ;
    public final void rule__MafF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3313:1: ( ( ',' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3314:1: ( ',' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3314:1: ( ',' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3315:1: ','
            {
             before(grammarAccess.getMafFAccess().getCommaKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__MafF__Group__3__Impl6864); 
             after(grammarAccess.getMafFAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__3__Impl"


    // $ANTLR start "rule__MafF__Group__4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3328:1: rule__MafF__Group__4 : rule__MafF__Group__4__Impl rule__MafF__Group__5 ;
    public final void rule__MafF__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3332:1: ( rule__MafF__Group__4__Impl rule__MafF__Group__5 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3333:2: rule__MafF__Group__4__Impl rule__MafF__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__4__Impl_in_rule__MafF__Group__46895);
            rule__MafF__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__5_in_rule__MafF__Group__46898);
            rule__MafF__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__4"


    // $ANTLR start "rule__MafF__Group__4__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3340:1: rule__MafF__Group__4__Impl : ( ( rule__MafF__MaxValueAssignment_4 ) ) ;
    public final void rule__MafF__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3344:1: ( ( ( rule__MafF__MaxValueAssignment_4 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3345:1: ( ( rule__MafF__MaxValueAssignment_4 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3345:1: ( ( rule__MafF__MaxValueAssignment_4 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3346:1: ( rule__MafF__MaxValueAssignment_4 )
            {
             before(grammarAccess.getMafFAccess().getMaxValueAssignment_4()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3347:1: ( rule__MafF__MaxValueAssignment_4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3347:2: rule__MafF__MaxValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__MaxValueAssignment_4_in_rule__MafF__Group__4__Impl6925);
            rule__MafF__MaxValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMafFAccess().getMaxValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__4__Impl"


    // $ANTLR start "rule__MafF__Group__5"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3357:1: rule__MafF__Group__5 : rule__MafF__Group__5__Impl ;
    public final void rule__MafF__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3361:1: ( rule__MafF__Group__5__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3362:2: rule__MafF__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafF__Group__5__Impl_in_rule__MafF__Group__56955);
            rule__MafF__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__5"


    // $ANTLR start "rule__MafF__Group__5__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3368:1: rule__MafF__Group__5__Impl : ( ']' ) ;
    public final void rule__MafF__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3372:1: ( ( ']' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3373:1: ( ']' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3373:1: ( ']' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3374:1: ']'
            {
             before(grammarAccess.getMafFAccess().getRightSquareBracketKeyword_5()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__MafF__Group__5__Impl6983); 
             after(grammarAccess.getMafFAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__Group__5__Impl"


    // $ANTLR start "rule__EffectF__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3399:1: rule__EffectF__Group__0 : rule__EffectF__Group__0__Impl rule__EffectF__Group__1 ;
    public final void rule__EffectF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3403:1: ( rule__EffectF__Group__0__Impl rule__EffectF__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3404:2: rule__EffectF__Group__0__Impl rule__EffectF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EffectF__Group__0__Impl_in_rule__EffectF__Group__07026);
            rule__EffectF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EffectF__Group__1_in_rule__EffectF__Group__07029);
            rule__EffectF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__Group__0"


    // $ANTLR start "rule__EffectF__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3411:1: rule__EffectF__Group__0__Impl : ( ( rule__EffectF__AlgorithmAssignment_0 ) ) ;
    public final void rule__EffectF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3415:1: ( ( ( rule__EffectF__AlgorithmAssignment_0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3416:1: ( ( rule__EffectF__AlgorithmAssignment_0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3416:1: ( ( rule__EffectF__AlgorithmAssignment_0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3417:1: ( rule__EffectF__AlgorithmAssignment_0 )
            {
             before(grammarAccess.getEffectFAccess().getAlgorithmAssignment_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3418:1: ( rule__EffectF__AlgorithmAssignment_0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3418:2: rule__EffectF__AlgorithmAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EffectF__AlgorithmAssignment_0_in_rule__EffectF__Group__0__Impl7056);
            rule__EffectF__AlgorithmAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFAccess().getAlgorithmAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__Group__0__Impl"


    // $ANTLR start "rule__EffectF__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3428:1: rule__EffectF__Group__1 : rule__EffectF__Group__1__Impl rule__EffectF__Group__2 ;
    public final void rule__EffectF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3432:1: ( rule__EffectF__Group__1__Impl rule__EffectF__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3433:2: rule__EffectF__Group__1__Impl rule__EffectF__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EffectF__Group__1__Impl_in_rule__EffectF__Group__17086);
            rule__EffectF__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EffectF__Group__2_in_rule__EffectF__Group__17089);
            rule__EffectF__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__Group__1"


    // $ANTLR start "rule__EffectF__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3440:1: rule__EffectF__Group__1__Impl : ( 'effect' ) ;
    public final void rule__EffectF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3444:1: ( ( 'effect' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3445:1: ( 'effect' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3445:1: ( 'effect' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3446:1: 'effect'
            {
             before(grammarAccess.getEffectFAccess().getEffectKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__EffectF__Group__1__Impl7117); 
             after(grammarAccess.getEffectFAccess().getEffectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__Group__1__Impl"


    // $ANTLR start "rule__EffectF__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3459:1: rule__EffectF__Group__2 : rule__EffectF__Group__2__Impl ;
    public final void rule__EffectF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3463:1: ( rule__EffectF__Group__2__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3464:2: rule__EffectF__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EffectF__Group__2__Impl_in_rule__EffectF__Group__27148);
            rule__EffectF__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__Group__2"


    // $ANTLR start "rule__EffectF__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3470:1: rule__EffectF__Group__2__Impl : ( ( ( rule__EffectF__EffectAssignment_2 ) ) ( ( rule__EffectF__EffectAssignment_2 )* ) ) ;
    public final void rule__EffectF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3474:1: ( ( ( ( rule__EffectF__EffectAssignment_2 ) ) ( ( rule__EffectF__EffectAssignment_2 )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3475:1: ( ( ( rule__EffectF__EffectAssignment_2 ) ) ( ( rule__EffectF__EffectAssignment_2 )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3475:1: ( ( ( rule__EffectF__EffectAssignment_2 ) ) ( ( rule__EffectF__EffectAssignment_2 )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3476:1: ( ( rule__EffectF__EffectAssignment_2 ) ) ( ( rule__EffectF__EffectAssignment_2 )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3476:1: ( ( rule__EffectF__EffectAssignment_2 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3477:1: ( rule__EffectF__EffectAssignment_2 )
            {
             before(grammarAccess.getEffectFAccess().getEffectAssignment_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3478:1: ( rule__EffectF__EffectAssignment_2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3478:2: rule__EffectF__EffectAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EffectF__EffectAssignment_2_in_rule__EffectF__Group__2__Impl7177);
            rule__EffectF__EffectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFAccess().getEffectAssignment_2()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3481:1: ( ( rule__EffectF__EffectAssignment_2 )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3482:1: ( rule__EffectF__EffectAssignment_2 )*
            {
             before(grammarAccess.getEffectFAccess().getEffectAssignment_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3483:1: ( rule__EffectF__EffectAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=22 && LA23_0<=27)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3483:2: rule__EffectF__EffectAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EffectF__EffectAssignment_2_in_rule__EffectF__Group__2__Impl7189);
            	    rule__EffectF__EffectAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEffectFAccess().getEffectAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__Group__2__Impl"


    // $ANTLR start "rule__ScoreF__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3500:1: rule__ScoreF__Group__0 : rule__ScoreF__Group__0__Impl rule__ScoreF__Group__1 ;
    public final void rule__ScoreF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3504:1: ( rule__ScoreF__Group__0__Impl rule__ScoreF__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3505:2: rule__ScoreF__Group__0__Impl rule__ScoreF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__0__Impl_in_rule__ScoreF__Group__07228);
            rule__ScoreF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__1_in_rule__ScoreF__Group__07231);
            rule__ScoreF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__0"


    // $ANTLR start "rule__ScoreF__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3512:1: rule__ScoreF__Group__0__Impl : ( ( rule__ScoreF__AlgorithmAssignment_0 ) ) ;
    public final void rule__ScoreF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3516:1: ( ( ( rule__ScoreF__AlgorithmAssignment_0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3517:1: ( ( rule__ScoreF__AlgorithmAssignment_0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3517:1: ( ( rule__ScoreF__AlgorithmAssignment_0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3518:1: ( rule__ScoreF__AlgorithmAssignment_0 )
            {
             before(grammarAccess.getScoreFAccess().getAlgorithmAssignment_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3519:1: ( rule__ScoreF__AlgorithmAssignment_0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3519:2: rule__ScoreF__AlgorithmAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__AlgorithmAssignment_0_in_rule__ScoreF__Group__0__Impl7258);
            rule__ScoreF__AlgorithmAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScoreFAccess().getAlgorithmAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__0__Impl"


    // $ANTLR start "rule__ScoreF__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3529:1: rule__ScoreF__Group__1 : rule__ScoreF__Group__1__Impl rule__ScoreF__Group__2 ;
    public final void rule__ScoreF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3533:1: ( rule__ScoreF__Group__1__Impl rule__ScoreF__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3534:2: rule__ScoreF__Group__1__Impl rule__ScoreF__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__1__Impl_in_rule__ScoreF__Group__17288);
            rule__ScoreF__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__2_in_rule__ScoreF__Group__17291);
            rule__ScoreF__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__1"


    // $ANTLR start "rule__ScoreF__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3541:1: rule__ScoreF__Group__1__Impl : ( 'score' ) ;
    public final void rule__ScoreF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3545:1: ( ( 'score' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3546:1: ( 'score' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3546:1: ( 'score' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3547:1: 'score'
            {
             before(grammarAccess.getScoreFAccess().getScoreKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__ScoreF__Group__1__Impl7319); 
             after(grammarAccess.getScoreFAccess().getScoreKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__1__Impl"


    // $ANTLR start "rule__ScoreF__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3560:1: rule__ScoreF__Group__2 : rule__ScoreF__Group__2__Impl rule__ScoreF__Group__3 ;
    public final void rule__ScoreF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3564:1: ( rule__ScoreF__Group__2__Impl rule__ScoreF__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3565:2: rule__ScoreF__Group__2__Impl rule__ScoreF__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__2__Impl_in_rule__ScoreF__Group__27350);
            rule__ScoreF__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__3_in_rule__ScoreF__Group__27353);
            rule__ScoreF__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__2"


    // $ANTLR start "rule__ScoreF__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3572:1: rule__ScoreF__Group__2__Impl : ( '[' ) ;
    public final void rule__ScoreF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3576:1: ( ( '[' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3577:1: ( '[' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3577:1: ( '[' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3578:1: '['
            {
             before(grammarAccess.getScoreFAccess().getLeftSquareBracketKeyword_2()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__ScoreF__Group__2__Impl7381); 
             after(grammarAccess.getScoreFAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__2__Impl"


    // $ANTLR start "rule__ScoreF__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3591:1: rule__ScoreF__Group__3 : rule__ScoreF__Group__3__Impl rule__ScoreF__Group__4 ;
    public final void rule__ScoreF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3595:1: ( rule__ScoreF__Group__3__Impl rule__ScoreF__Group__4 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3596:2: rule__ScoreF__Group__3__Impl rule__ScoreF__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__3__Impl_in_rule__ScoreF__Group__37412);
            rule__ScoreF__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__4_in_rule__ScoreF__Group__37415);
            rule__ScoreF__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__3"


    // $ANTLR start "rule__ScoreF__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3603:1: rule__ScoreF__Group__3__Impl : ( ( rule__ScoreF__MinScoreAssignment_3 ) ) ;
    public final void rule__ScoreF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3607:1: ( ( ( rule__ScoreF__MinScoreAssignment_3 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3608:1: ( ( rule__ScoreF__MinScoreAssignment_3 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3608:1: ( ( rule__ScoreF__MinScoreAssignment_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3609:1: ( rule__ScoreF__MinScoreAssignment_3 )
            {
             before(grammarAccess.getScoreFAccess().getMinScoreAssignment_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3610:1: ( rule__ScoreF__MinScoreAssignment_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3610:2: rule__ScoreF__MinScoreAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__MinScoreAssignment_3_in_rule__ScoreF__Group__3__Impl7442);
            rule__ScoreF__MinScoreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScoreFAccess().getMinScoreAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__3__Impl"


    // $ANTLR start "rule__ScoreF__Group__4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3620:1: rule__ScoreF__Group__4 : rule__ScoreF__Group__4__Impl rule__ScoreF__Group__5 ;
    public final void rule__ScoreF__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3624:1: ( rule__ScoreF__Group__4__Impl rule__ScoreF__Group__5 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3625:2: rule__ScoreF__Group__4__Impl rule__ScoreF__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__4__Impl_in_rule__ScoreF__Group__47472);
            rule__ScoreF__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__5_in_rule__ScoreF__Group__47475);
            rule__ScoreF__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__4"


    // $ANTLR start "rule__ScoreF__Group__4__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3632:1: rule__ScoreF__Group__4__Impl : ( ',' ) ;
    public final void rule__ScoreF__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3636:1: ( ( ',' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3637:1: ( ',' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3637:1: ( ',' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3638:1: ','
            {
             before(grammarAccess.getScoreFAccess().getCommaKeyword_4()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__ScoreF__Group__4__Impl7503); 
             after(grammarAccess.getScoreFAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__4__Impl"


    // $ANTLR start "rule__ScoreF__Group__5"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3651:1: rule__ScoreF__Group__5 : rule__ScoreF__Group__5__Impl rule__ScoreF__Group__6 ;
    public final void rule__ScoreF__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3655:1: ( rule__ScoreF__Group__5__Impl rule__ScoreF__Group__6 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3656:2: rule__ScoreF__Group__5__Impl rule__ScoreF__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__5__Impl_in_rule__ScoreF__Group__57534);
            rule__ScoreF__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__6_in_rule__ScoreF__Group__57537);
            rule__ScoreF__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__5"


    // $ANTLR start "rule__ScoreF__Group__5__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3663:1: rule__ScoreF__Group__5__Impl : ( ( rule__ScoreF__MaxScoreAssignment_5 ) ) ;
    public final void rule__ScoreF__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3667:1: ( ( ( rule__ScoreF__MaxScoreAssignment_5 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3668:1: ( ( rule__ScoreF__MaxScoreAssignment_5 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3668:1: ( ( rule__ScoreF__MaxScoreAssignment_5 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3669:1: ( rule__ScoreF__MaxScoreAssignment_5 )
            {
             before(grammarAccess.getScoreFAccess().getMaxScoreAssignment_5()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3670:1: ( rule__ScoreF__MaxScoreAssignment_5 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3670:2: rule__ScoreF__MaxScoreAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__MaxScoreAssignment_5_in_rule__ScoreF__Group__5__Impl7564);
            rule__ScoreF__MaxScoreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScoreFAccess().getMaxScoreAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__5__Impl"


    // $ANTLR start "rule__ScoreF__Group__6"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3680:1: rule__ScoreF__Group__6 : rule__ScoreF__Group__6__Impl ;
    public final void rule__ScoreF__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3684:1: ( rule__ScoreF__Group__6__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3685:2: rule__ScoreF__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScoreF__Group__6__Impl_in_rule__ScoreF__Group__67594);
            rule__ScoreF__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__6"


    // $ANTLR start "rule__ScoreF__Group__6__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3691:1: rule__ScoreF__Group__6__Impl : ( ']' ) ;
    public final void rule__ScoreF__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3695:1: ( ( ']' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3696:1: ( ']' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3696:1: ( ']' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3697:1: ']'
            {
             before(grammarAccess.getScoreFAccess().getRightSquareBracketKeyword_6()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__ScoreF__Group__6__Impl7622); 
             after(grammarAccess.getScoreFAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__Group__6__Impl"


    // $ANTLR start "rule__Report__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3724:1: rule__Report__Group__0 : rule__Report__Group__0__Impl rule__Report__Group__1 ;
    public final void rule__Report__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3728:1: ( rule__Report__Group__0__Impl rule__Report__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3729:2: rule__Report__Group__0__Impl rule__Report__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Report__Group__0__Impl_in_rule__Report__Group__07667);
            rule__Report__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Report__Group__1_in_rule__Report__Group__07670);
            rule__Report__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__0"


    // $ANTLR start "rule__Report__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3736:1: rule__Report__Group__0__Impl : ( 'Report' ) ;
    public final void rule__Report__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3740:1: ( ( 'Report' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3741:1: ( 'Report' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3741:1: ( 'Report' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3742:1: 'Report'
            {
             before(grammarAccess.getReportAccess().getReportKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Report__Group__0__Impl7698); 
             after(grammarAccess.getReportAccess().getReportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__0__Impl"


    // $ANTLR start "rule__Report__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3755:1: rule__Report__Group__1 : rule__Report__Group__1__Impl ;
    public final void rule__Report__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3759:1: ( rule__Report__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3760:2: rule__Report__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Report__Group__1__Impl_in_rule__Report__Group__17729);
            rule__Report__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__1"


    // $ANTLR start "rule__Report__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3766:1: rule__Report__Group__1__Impl : ( ( rule__Report__ReportVariationsAssignment_1 ) ) ;
    public final void rule__Report__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3770:1: ( ( ( rule__Report__ReportVariationsAssignment_1 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3771:1: ( ( rule__Report__ReportVariationsAssignment_1 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3771:1: ( ( rule__Report__ReportVariationsAssignment_1 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3772:1: ( rule__Report__ReportVariationsAssignment_1 )
            {
             before(grammarAccess.getReportAccess().getReportVariationsAssignment_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3773:1: ( rule__Report__ReportVariationsAssignment_1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3773:2: rule__Report__ReportVariationsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Report__ReportVariationsAssignment_1_in_rule__Report__Group__1__Impl7756);
            rule__Report__ReportVariationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReportAccess().getReportVariationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__1__Impl"


    // $ANTLR start "rule__ReportVariations__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3787:1: rule__ReportVariations__Group__0 : rule__ReportVariations__Group__0__Impl rule__ReportVariations__Group__1 ;
    public final void rule__ReportVariations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3791:1: ( rule__ReportVariations__Group__0__Impl rule__ReportVariations__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3792:2: rule__ReportVariations__Group__0__Impl rule__ReportVariations__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__0__Impl_in_rule__ReportVariations__Group__07790);
            rule__ReportVariations__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__1_in_rule__ReportVariations__Group__07793);
            rule__ReportVariations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__0"


    // $ANTLR start "rule__ReportVariations__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3799:1: rule__ReportVariations__Group__0__Impl : ( 'variations' ) ;
    public final void rule__ReportVariations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3803:1: ( ( 'variations' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3804:1: ( 'variations' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3804:1: ( 'variations' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3805:1: 'variations'
            {
             before(grammarAccess.getReportVariationsAccess().getVariationsKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ReportVariations__Group__0__Impl7821); 
             after(grammarAccess.getReportVariationsAccess().getVariationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__0__Impl"


    // $ANTLR start "rule__ReportVariations__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3818:1: rule__ReportVariations__Group__1 : rule__ReportVariations__Group__1__Impl rule__ReportVariations__Group__2 ;
    public final void rule__ReportVariations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3822:1: ( rule__ReportVariations__Group__1__Impl rule__ReportVariations__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3823:2: rule__ReportVariations__Group__1__Impl rule__ReportVariations__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__1__Impl_in_rule__ReportVariations__Group__17852);
            rule__ReportVariations__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__2_in_rule__ReportVariations__Group__17855);
            rule__ReportVariations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__1"


    // $ANTLR start "rule__ReportVariations__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3830:1: rule__ReportVariations__Group__1__Impl : ( () ) ;
    public final void rule__ReportVariations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3834:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3835:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3835:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3836:1: ()
            {
             before(grammarAccess.getReportVariationsAccess().getReportVariationsAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3837:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3839:1: 
            {
            }

             after(grammarAccess.getReportVariationsAccess().getReportVariationsAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__1__Impl"


    // $ANTLR start "rule__ReportVariations__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3849:1: rule__ReportVariations__Group__2 : rule__ReportVariations__Group__2__Impl rule__ReportVariations__Group__3 ;
    public final void rule__ReportVariations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3853:1: ( rule__ReportVariations__Group__2__Impl rule__ReportVariations__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3854:2: rule__ReportVariations__Group__2__Impl rule__ReportVariations__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__2__Impl_in_rule__ReportVariations__Group__27913);
            rule__ReportVariations__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__3_in_rule__ReportVariations__Group__27916);
            rule__ReportVariations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__2"


    // $ANTLR start "rule__ReportVariations__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3861:1: rule__ReportVariations__Group__2__Impl : ( 'with' ) ;
    public final void rule__ReportVariations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3865:1: ( ( 'with' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3866:1: ( 'with' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3866:1: ( 'with' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3867:1: 'with'
            {
             before(grammarAccess.getReportVariationsAccess().getWithKeyword_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ReportVariations__Group__2__Impl7944); 
             after(grammarAccess.getReportVariationsAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__2__Impl"


    // $ANTLR start "rule__ReportVariations__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3880:1: rule__ReportVariations__Group__3 : rule__ReportVariations__Group__3__Impl ;
    public final void rule__ReportVariations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3884:1: ( rule__ReportVariations__Group__3__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3885:2: rule__ReportVariations__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Group__3__Impl_in_rule__ReportVariations__Group__37975);
            rule__ReportVariations__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__3"


    // $ANTLR start "rule__ReportVariations__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3891:1: rule__ReportVariations__Group__3__Impl : ( ( ( rule__ReportVariations__Alternatives_3 ) ) ( ( rule__ReportVariations__Alternatives_3 )* ) ) ;
    public final void rule__ReportVariations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3895:1: ( ( ( ( rule__ReportVariations__Alternatives_3 ) ) ( ( rule__ReportVariations__Alternatives_3 )* ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3896:1: ( ( ( rule__ReportVariations__Alternatives_3 ) ) ( ( rule__ReportVariations__Alternatives_3 )* ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3896:1: ( ( ( rule__ReportVariations__Alternatives_3 ) ) ( ( rule__ReportVariations__Alternatives_3 )* ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3897:1: ( ( rule__ReportVariations__Alternatives_3 ) ) ( ( rule__ReportVariations__Alternatives_3 )* )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3897:1: ( ( rule__ReportVariations__Alternatives_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3898:1: ( rule__ReportVariations__Alternatives_3 )
            {
             before(grammarAccess.getReportVariationsAccess().getAlternatives_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3899:1: ( rule__ReportVariations__Alternatives_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3899:2: rule__ReportVariations__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Alternatives_3_in_rule__ReportVariations__Group__3__Impl8004);
            rule__ReportVariations__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getReportVariationsAccess().getAlternatives_3()); 

            }

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3902:1: ( ( rule__ReportVariations__Alternatives_3 )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3903:1: ( rule__ReportVariations__Alternatives_3 )*
            {
             before(grammarAccess.getReportVariationsAccess().getAlternatives_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3904:1: ( rule__ReportVariations__Alternatives_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=16 && LA24_0<=17)||(LA24_0>=37 && LA24_0<=41)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3904:2: rule__ReportVariations__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ReportVariations__Alternatives_3_in_rule__ReportVariations__Group__3__Impl8016);
            	    rule__ReportVariations__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getReportVariationsAccess().getAlternatives_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__Group__3__Impl"


    // $ANTLR start "rule__HgvsR__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3923:1: rule__HgvsR__Group__0 : rule__HgvsR__Group__0__Impl rule__HgvsR__Group__1 ;
    public final void rule__HgvsR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3927:1: ( rule__HgvsR__Group__0__Impl rule__HgvsR__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3928:2: rule__HgvsR__Group__0__Impl rule__HgvsR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsR__Group__0__Impl_in_rule__HgvsR__Group__08057);
            rule__HgvsR__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HgvsR__Group__1_in_rule__HgvsR__Group__08060);
            rule__HgvsR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsR__Group__0"


    // $ANTLR start "rule__HgvsR__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3935:1: rule__HgvsR__Group__0__Impl : ( 'hgvs' ) ;
    public final void rule__HgvsR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3939:1: ( ( 'hgvs' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3940:1: ( 'hgvs' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3940:1: ( 'hgvs' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3941:1: 'hgvs'
            {
             before(grammarAccess.getHgvsRAccess().getHgvsKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__HgvsR__Group__0__Impl8088); 
             after(grammarAccess.getHgvsRAccess().getHgvsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsR__Group__0__Impl"


    // $ANTLR start "rule__HgvsR__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3954:1: rule__HgvsR__Group__1 : rule__HgvsR__Group__1__Impl ;
    public final void rule__HgvsR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3958:1: ( rule__HgvsR__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3959:2: rule__HgvsR__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HgvsR__Group__1__Impl_in_rule__HgvsR__Group__18119);
            rule__HgvsR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsR__Group__1"


    // $ANTLR start "rule__HgvsR__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3965:1: rule__HgvsR__Group__1__Impl : ( () ) ;
    public final void rule__HgvsR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3969:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3970:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3970:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3971:1: ()
            {
             before(grammarAccess.getHgvsRAccess().getHgvsRAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3972:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3974:1: 
            {
            }

             after(grammarAccess.getHgvsRAccess().getHgvsRAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HgvsR__Group__1__Impl"


    // $ANTLR start "rule__GeneR__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3988:1: rule__GeneR__Group__0 : rule__GeneR__Group__0__Impl rule__GeneR__Group__1 ;
    public final void rule__GeneR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3992:1: ( rule__GeneR__Group__0__Impl rule__GeneR__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:3993:2: rule__GeneR__Group__0__Impl rule__GeneR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneR__Group__0__Impl_in_rule__GeneR__Group__08181);
            rule__GeneR__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GeneR__Group__1_in_rule__GeneR__Group__08184);
            rule__GeneR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneR__Group__0"


    // $ANTLR start "rule__GeneR__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4000:1: rule__GeneR__Group__0__Impl : ( 'gene' ) ;
    public final void rule__GeneR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4004:1: ( ( 'gene' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4005:1: ( 'gene' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4005:1: ( 'gene' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4006:1: 'gene'
            {
             before(grammarAccess.getGeneRAccess().getGeneKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__GeneR__Group__0__Impl8212); 
             after(grammarAccess.getGeneRAccess().getGeneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneR__Group__0__Impl"


    // $ANTLR start "rule__GeneR__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4019:1: rule__GeneR__Group__1 : rule__GeneR__Group__1__Impl ;
    public final void rule__GeneR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4023:1: ( rule__GeneR__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4024:2: rule__GeneR__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneR__Group__1__Impl_in_rule__GeneR__Group__18243);
            rule__GeneR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneR__Group__1"


    // $ANTLR start "rule__GeneR__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4030:1: rule__GeneR__Group__1__Impl : ( () ) ;
    public final void rule__GeneR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4034:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4035:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4035:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4036:1: ()
            {
             before(grammarAccess.getGeneRAccess().getGeneRAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4037:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4039:1: 
            {
            }

             after(grammarAccess.getGeneRAccess().getGeneRAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneR__Group__1__Impl"


    // $ANTLR start "rule__RsIdR__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4053:1: rule__RsIdR__Group__0 : rule__RsIdR__Group__0__Impl rule__RsIdR__Group__1 ;
    public final void rule__RsIdR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4057:1: ( rule__RsIdR__Group__0__Impl rule__RsIdR__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4058:2: rule__RsIdR__Group__0__Impl rule__RsIdR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RsIdR__Group__0__Impl_in_rule__RsIdR__Group__08305);
            rule__RsIdR__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RsIdR__Group__1_in_rule__RsIdR__Group__08308);
            rule__RsIdR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdR__Group__0"


    // $ANTLR start "rule__RsIdR__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4065:1: rule__RsIdR__Group__0__Impl : ( 'rsId' ) ;
    public final void rule__RsIdR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4069:1: ( ( 'rsId' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4070:1: ( 'rsId' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4070:1: ( 'rsId' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4071:1: 'rsId'
            {
             before(grammarAccess.getRsIdRAccess().getRsIdKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__RsIdR__Group__0__Impl8336); 
             after(grammarAccess.getRsIdRAccess().getRsIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdR__Group__0__Impl"


    // $ANTLR start "rule__RsIdR__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4084:1: rule__RsIdR__Group__1 : rule__RsIdR__Group__1__Impl ;
    public final void rule__RsIdR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4088:1: ( rule__RsIdR__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4089:2: rule__RsIdR__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RsIdR__Group__1__Impl_in_rule__RsIdR__Group__18367);
            rule__RsIdR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdR__Group__1"


    // $ANTLR start "rule__RsIdR__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4095:1: rule__RsIdR__Group__1__Impl : ( () ) ;
    public final void rule__RsIdR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4099:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4100:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4100:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4101:1: ()
            {
             before(grammarAccess.getRsIdRAccess().getRsIdRAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4102:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4104:1: 
            {
            }

             after(grammarAccess.getRsIdRAccess().getRsIdRAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RsIdR__Group__1__Impl"


    // $ANTLR start "rule__TranscriptR__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4118:1: rule__TranscriptR__Group__0 : rule__TranscriptR__Group__0__Impl rule__TranscriptR__Group__1 ;
    public final void rule__TranscriptR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4122:1: ( rule__TranscriptR__Group__0__Impl rule__TranscriptR__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4123:2: rule__TranscriptR__Group__0__Impl rule__TranscriptR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TranscriptR__Group__0__Impl_in_rule__TranscriptR__Group__08429);
            rule__TranscriptR__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TranscriptR__Group__1_in_rule__TranscriptR__Group__08432);
            rule__TranscriptR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptR__Group__0"


    // $ANTLR start "rule__TranscriptR__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4130:1: rule__TranscriptR__Group__0__Impl : ( 'transcript' ) ;
    public final void rule__TranscriptR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4134:1: ( ( 'transcript' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4135:1: ( 'transcript' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4135:1: ( 'transcript' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4136:1: 'transcript'
            {
             before(grammarAccess.getTranscriptRAccess().getTranscriptKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__TranscriptR__Group__0__Impl8460); 
             after(grammarAccess.getTranscriptRAccess().getTranscriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptR__Group__0__Impl"


    // $ANTLR start "rule__TranscriptR__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4149:1: rule__TranscriptR__Group__1 : rule__TranscriptR__Group__1__Impl ;
    public final void rule__TranscriptR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4153:1: ( rule__TranscriptR__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4154:2: rule__TranscriptR__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TranscriptR__Group__1__Impl_in_rule__TranscriptR__Group__18491);
            rule__TranscriptR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptR__Group__1"


    // $ANTLR start "rule__TranscriptR__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4160:1: rule__TranscriptR__Group__1__Impl : ( () ) ;
    public final void rule__TranscriptR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4164:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4165:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4165:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4166:1: ()
            {
             before(grammarAccess.getTranscriptRAccess().getTranscriptRAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4167:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4169:1: 
            {
            }

             after(grammarAccess.getTranscriptRAccess().getTranscriptRAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranscriptR__Group__1__Impl"


    // $ANTLR start "rule__MafR__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4183:1: rule__MafR__Group__0 : rule__MafR__Group__0__Impl rule__MafR__Group__1 ;
    public final void rule__MafR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4187:1: ( rule__MafR__Group__0__Impl rule__MafR__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4188:2: rule__MafR__Group__0__Impl rule__MafR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafR__Group__0__Impl_in_rule__MafR__Group__08553);
            rule__MafR__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MafR__Group__1_in_rule__MafR__Group__08556);
            rule__MafR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafR__Group__0"


    // $ANTLR start "rule__MafR__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4195:1: rule__MafR__Group__0__Impl : ( 'samples maf' ) ;
    public final void rule__MafR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4199:1: ( ( 'samples maf' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4200:1: ( 'samples maf' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4200:1: ( 'samples maf' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4201:1: 'samples maf'
            {
             before(grammarAccess.getMafRAccess().getSamplesMafKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MafR__Group__0__Impl8584); 
             after(grammarAccess.getMafRAccess().getSamplesMafKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafR__Group__0__Impl"


    // $ANTLR start "rule__MafR__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4214:1: rule__MafR__Group__1 : rule__MafR__Group__1__Impl ;
    public final void rule__MafR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4218:1: ( rule__MafR__Group__1__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4219:2: rule__MafR__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MafR__Group__1__Impl_in_rule__MafR__Group__18615);
            rule__MafR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafR__Group__1"


    // $ANTLR start "rule__MafR__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4225:1: rule__MafR__Group__1__Impl : ( () ) ;
    public final void rule__MafR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4229:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4230:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4230:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4231:1: ()
            {
             before(grammarAccess.getMafRAccess().getMAFRAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4232:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4234:1: 
            {
            }

             after(grammarAccess.getMafRAccess().getMAFRAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafR__Group__1__Impl"


    // $ANTLR start "rule__DataFile__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4248:1: rule__DataFile__Group__0 : rule__DataFile__Group__0__Impl rule__DataFile__Group__1 ;
    public final void rule__DataFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4252:1: ( rule__DataFile__Group__0__Impl rule__DataFile__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4253:2: rule__DataFile__Group__0__Impl rule__DataFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataFile__Group__0__Impl_in_rule__DataFile__Group__08677);
            rule__DataFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataFile__Group__1_in_rule__DataFile__Group__08680);
            rule__DataFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__0"


    // $ANTLR start "rule__DataFile__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4260:1: rule__DataFile__Group__0__Impl : ( 'from' ) ;
    public final void rule__DataFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4264:1: ( ( 'from' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4265:1: ( 'from' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4265:1: ( 'from' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4266:1: 'from'
            {
             before(grammarAccess.getDataFileAccess().getFromKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__DataFile__Group__0__Impl8708); 
             after(grammarAccess.getDataFileAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__0__Impl"


    // $ANTLR start "rule__DataFile__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4279:1: rule__DataFile__Group__1 : rule__DataFile__Group__1__Impl rule__DataFile__Group__2 ;
    public final void rule__DataFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4283:1: ( rule__DataFile__Group__1__Impl rule__DataFile__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4284:2: rule__DataFile__Group__1__Impl rule__DataFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataFile__Group__1__Impl_in_rule__DataFile__Group__18739);
            rule__DataFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataFile__Group__2_in_rule__DataFile__Group__18742);
            rule__DataFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__1"


    // $ANTLR start "rule__DataFile__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4291:1: rule__DataFile__Group__1__Impl : ( () ) ;
    public final void rule__DataFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4295:1: ( ( () ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4296:1: ( () )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4296:1: ( () )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4297:1: ()
            {
             before(grammarAccess.getDataFileAccess().getDataFileAction_1()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4298:1: ()
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4300:1: 
            {
            }

             after(grammarAccess.getDataFileAccess().getDataFileAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__1__Impl"


    // $ANTLR start "rule__DataFile__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4310:1: rule__DataFile__Group__2 : rule__DataFile__Group__2__Impl ;
    public final void rule__DataFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4314:1: ( rule__DataFile__Group__2__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4315:2: rule__DataFile__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataFile__Group__2__Impl_in_rule__DataFile__Group__28800);
            rule__DataFile__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__2"


    // $ANTLR start "rule__DataFile__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4321:1: rule__DataFile__Group__2__Impl : ( ( rule__DataFile__Alternatives_2 ) ) ;
    public final void rule__DataFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4325:1: ( ( ( rule__DataFile__Alternatives_2 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4326:1: ( ( rule__DataFile__Alternatives_2 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4326:1: ( ( rule__DataFile__Alternatives_2 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4327:1: ( rule__DataFile__Alternatives_2 )
            {
             before(grammarAccess.getDataFileAccess().getAlternatives_2()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4328:1: ( rule__DataFile__Alternatives_2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4328:2: rule__DataFile__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataFile__Alternatives_2_in_rule__DataFile__Group__2__Impl8827);
            rule__DataFile__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getDataFileAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__Group__2__Impl"


    // $ANTLR start "rule__Hgvsdna__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4344:1: rule__Hgvsdna__Group__0 : rule__Hgvsdna__Group__0__Impl rule__Hgvsdna__Group__1 ;
    public final void rule__Hgvsdna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4348:1: ( rule__Hgvsdna__Group__0__Impl rule__Hgvsdna__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4349:2: rule__Hgvsdna__Group__0__Impl rule__Hgvsdna__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__0__Impl_in_rule__Hgvsdna__Group__08863);
            rule__Hgvsdna__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__1_in_rule__Hgvsdna__Group__08866);
            rule__Hgvsdna__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__0"


    // $ANTLR start "rule__Hgvsdna__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4356:1: rule__Hgvsdna__Group__0__Impl : ( ( rule__Hgvsdna__ReferenceAssignment_0 ) ) ;
    public final void rule__Hgvsdna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4360:1: ( ( ( rule__Hgvsdna__ReferenceAssignment_0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4361:1: ( ( rule__Hgvsdna__ReferenceAssignment_0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4361:1: ( ( rule__Hgvsdna__ReferenceAssignment_0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4362:1: ( rule__Hgvsdna__ReferenceAssignment_0 )
            {
             before(grammarAccess.getHgvsdnaAccess().getReferenceAssignment_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4363:1: ( rule__Hgvsdna__ReferenceAssignment_0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4363:2: rule__Hgvsdna__ReferenceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__ReferenceAssignment_0_in_rule__Hgvsdna__Group__0__Impl8893);
            rule__Hgvsdna__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHgvsdnaAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__0__Impl"


    // $ANTLR start "rule__Hgvsdna__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4373:1: rule__Hgvsdna__Group__1 : rule__Hgvsdna__Group__1__Impl rule__Hgvsdna__Group__2 ;
    public final void rule__Hgvsdna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4377:1: ( rule__Hgvsdna__Group__1__Impl rule__Hgvsdna__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4378:2: rule__Hgvsdna__Group__1__Impl rule__Hgvsdna__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__1__Impl_in_rule__Hgvsdna__Group__18923);
            rule__Hgvsdna__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__2_in_rule__Hgvsdna__Group__18926);
            rule__Hgvsdna__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__1"


    // $ANTLR start "rule__Hgvsdna__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4385:1: rule__Hgvsdna__Group__1__Impl : ( ':' ) ;
    public final void rule__Hgvsdna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4389:1: ( ( ':' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4390:1: ( ':' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4390:1: ( ':' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4391:1: ':'
            {
             before(grammarAccess.getHgvsdnaAccess().getColonKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Hgvsdna__Group__1__Impl8954); 
             after(grammarAccess.getHgvsdnaAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__1__Impl"


    // $ANTLR start "rule__Hgvsdna__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4404:1: rule__Hgvsdna__Group__2 : rule__Hgvsdna__Group__2__Impl rule__Hgvsdna__Group__3 ;
    public final void rule__Hgvsdna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4408:1: ( rule__Hgvsdna__Group__2__Impl rule__Hgvsdna__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4409:2: rule__Hgvsdna__Group__2__Impl rule__Hgvsdna__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__2__Impl_in_rule__Hgvsdna__Group__28985);
            rule__Hgvsdna__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__3_in_rule__Hgvsdna__Group__28988);
            rule__Hgvsdna__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__2"


    // $ANTLR start "rule__Hgvsdna__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4416:1: rule__Hgvsdna__Group__2__Impl : ( 'g.' ) ;
    public final void rule__Hgvsdna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4420:1: ( ( 'g.' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4421:1: ( 'g.' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4421:1: ( 'g.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4422:1: 'g.'
            {
             before(grammarAccess.getHgvsdnaAccess().getGKeyword_2()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Hgvsdna__Group__2__Impl9016); 
             after(grammarAccess.getHgvsdnaAccess().getGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__2__Impl"


    // $ANTLR start "rule__Hgvsdna__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4435:1: rule__Hgvsdna__Group__3 : rule__Hgvsdna__Group__3__Impl ;
    public final void rule__Hgvsdna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4439:1: ( rule__Hgvsdna__Group__3__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4440:2: rule__Hgvsdna__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__Group__3__Impl_in_rule__Hgvsdna__Group__39047);
            rule__Hgvsdna__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__3"


    // $ANTLR start "rule__Hgvsdna__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4446:1: rule__Hgvsdna__Group__3__Impl : ( ( rule__Hgvsdna__DescriptionAssignment_3 ) ) ;
    public final void rule__Hgvsdna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4450:1: ( ( ( rule__Hgvsdna__DescriptionAssignment_3 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4451:1: ( ( rule__Hgvsdna__DescriptionAssignment_3 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4451:1: ( ( rule__Hgvsdna__DescriptionAssignment_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4452:1: ( rule__Hgvsdna__DescriptionAssignment_3 )
            {
             before(grammarAccess.getHgvsdnaAccess().getDescriptionAssignment_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4453:1: ( rule__Hgvsdna__DescriptionAssignment_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4453:2: rule__Hgvsdna__DescriptionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsdna__DescriptionAssignment_3_in_rule__Hgvsdna__Group__3__Impl9074);
            rule__Hgvsdna__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHgvsdnaAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__Group__3__Impl"


    // $ANTLR start "rule__Hgvscoding__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4471:1: rule__Hgvscoding__Group__0 : rule__Hgvscoding__Group__0__Impl rule__Hgvscoding__Group__1 ;
    public final void rule__Hgvscoding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4475:1: ( rule__Hgvscoding__Group__0__Impl rule__Hgvscoding__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4476:2: rule__Hgvscoding__Group__0__Impl rule__Hgvscoding__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__0__Impl_in_rule__Hgvscoding__Group__09112);
            rule__Hgvscoding__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__1_in_rule__Hgvscoding__Group__09115);
            rule__Hgvscoding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__0"


    // $ANTLR start "rule__Hgvscoding__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4483:1: rule__Hgvscoding__Group__0__Impl : ( ( rule__Hgvscoding__ReferenceAssignment_0 ) ) ;
    public final void rule__Hgvscoding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4487:1: ( ( ( rule__Hgvscoding__ReferenceAssignment_0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4488:1: ( ( rule__Hgvscoding__ReferenceAssignment_0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4488:1: ( ( rule__Hgvscoding__ReferenceAssignment_0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4489:1: ( rule__Hgvscoding__ReferenceAssignment_0 )
            {
             before(grammarAccess.getHgvscodingAccess().getReferenceAssignment_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4490:1: ( rule__Hgvscoding__ReferenceAssignment_0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4490:2: rule__Hgvscoding__ReferenceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__ReferenceAssignment_0_in_rule__Hgvscoding__Group__0__Impl9142);
            rule__Hgvscoding__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHgvscodingAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__0__Impl"


    // $ANTLR start "rule__Hgvscoding__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4500:1: rule__Hgvscoding__Group__1 : rule__Hgvscoding__Group__1__Impl rule__Hgvscoding__Group__2 ;
    public final void rule__Hgvscoding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4504:1: ( rule__Hgvscoding__Group__1__Impl rule__Hgvscoding__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4505:2: rule__Hgvscoding__Group__1__Impl rule__Hgvscoding__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__1__Impl_in_rule__Hgvscoding__Group__19172);
            rule__Hgvscoding__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__2_in_rule__Hgvscoding__Group__19175);
            rule__Hgvscoding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__1"


    // $ANTLR start "rule__Hgvscoding__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4512:1: rule__Hgvscoding__Group__1__Impl : ( ':' ) ;
    public final void rule__Hgvscoding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4516:1: ( ( ':' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4517:1: ( ':' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4517:1: ( ':' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4518:1: ':'
            {
             before(grammarAccess.getHgvscodingAccess().getColonKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Hgvscoding__Group__1__Impl9203); 
             after(grammarAccess.getHgvscodingAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__1__Impl"


    // $ANTLR start "rule__Hgvscoding__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4531:1: rule__Hgvscoding__Group__2 : rule__Hgvscoding__Group__2__Impl rule__Hgvscoding__Group__3 ;
    public final void rule__Hgvscoding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4535:1: ( rule__Hgvscoding__Group__2__Impl rule__Hgvscoding__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4536:2: rule__Hgvscoding__Group__2__Impl rule__Hgvscoding__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__2__Impl_in_rule__Hgvscoding__Group__29234);
            rule__Hgvscoding__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__3_in_rule__Hgvscoding__Group__29237);
            rule__Hgvscoding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__2"


    // $ANTLR start "rule__Hgvscoding__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4543:1: rule__Hgvscoding__Group__2__Impl : ( 'c.' ) ;
    public final void rule__Hgvscoding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4547:1: ( ( 'c.' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4548:1: ( 'c.' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4548:1: ( 'c.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4549:1: 'c.'
            {
             before(grammarAccess.getHgvscodingAccess().getCKeyword_2()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Hgvscoding__Group__2__Impl9265); 
             after(grammarAccess.getHgvscodingAccess().getCKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__2__Impl"


    // $ANTLR start "rule__Hgvscoding__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4562:1: rule__Hgvscoding__Group__3 : rule__Hgvscoding__Group__3__Impl ;
    public final void rule__Hgvscoding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4566:1: ( rule__Hgvscoding__Group__3__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4567:2: rule__Hgvscoding__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__Group__3__Impl_in_rule__Hgvscoding__Group__39296);
            rule__Hgvscoding__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__3"


    // $ANTLR start "rule__Hgvscoding__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4573:1: rule__Hgvscoding__Group__3__Impl : ( ( rule__Hgvscoding__DescriptionAssignment_3 ) ) ;
    public final void rule__Hgvscoding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4577:1: ( ( ( rule__Hgvscoding__DescriptionAssignment_3 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4578:1: ( ( rule__Hgvscoding__DescriptionAssignment_3 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4578:1: ( ( rule__Hgvscoding__DescriptionAssignment_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4579:1: ( rule__Hgvscoding__DescriptionAssignment_3 )
            {
             before(grammarAccess.getHgvscodingAccess().getDescriptionAssignment_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4580:1: ( rule__Hgvscoding__DescriptionAssignment_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4580:2: rule__Hgvscoding__DescriptionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvscoding__DescriptionAssignment_3_in_rule__Hgvscoding__Group__3__Impl9323);
            rule__Hgvscoding__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHgvscodingAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__Group__3__Impl"


    // $ANTLR start "rule__Hgvsprotein__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4598:1: rule__Hgvsprotein__Group__0 : rule__Hgvsprotein__Group__0__Impl rule__Hgvsprotein__Group__1 ;
    public final void rule__Hgvsprotein__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4602:1: ( rule__Hgvsprotein__Group__0__Impl rule__Hgvsprotein__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4603:2: rule__Hgvsprotein__Group__0__Impl rule__Hgvsprotein__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__0__Impl_in_rule__Hgvsprotein__Group__09361);
            rule__Hgvsprotein__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__1_in_rule__Hgvsprotein__Group__09364);
            rule__Hgvsprotein__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__0"


    // $ANTLR start "rule__Hgvsprotein__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4610:1: rule__Hgvsprotein__Group__0__Impl : ( ( rule__Hgvsprotein__ReferenceAssignment_0 ) ) ;
    public final void rule__Hgvsprotein__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4614:1: ( ( ( rule__Hgvsprotein__ReferenceAssignment_0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4615:1: ( ( rule__Hgvsprotein__ReferenceAssignment_0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4615:1: ( ( rule__Hgvsprotein__ReferenceAssignment_0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4616:1: ( rule__Hgvsprotein__ReferenceAssignment_0 )
            {
             before(grammarAccess.getHgvsproteinAccess().getReferenceAssignment_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4617:1: ( rule__Hgvsprotein__ReferenceAssignment_0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4617:2: rule__Hgvsprotein__ReferenceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__ReferenceAssignment_0_in_rule__Hgvsprotein__Group__0__Impl9391);
            rule__Hgvsprotein__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHgvsproteinAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__0__Impl"


    // $ANTLR start "rule__Hgvsprotein__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4627:1: rule__Hgvsprotein__Group__1 : rule__Hgvsprotein__Group__1__Impl rule__Hgvsprotein__Group__2 ;
    public final void rule__Hgvsprotein__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4631:1: ( rule__Hgvsprotein__Group__1__Impl rule__Hgvsprotein__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4632:2: rule__Hgvsprotein__Group__1__Impl rule__Hgvsprotein__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__1__Impl_in_rule__Hgvsprotein__Group__19421);
            rule__Hgvsprotein__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__2_in_rule__Hgvsprotein__Group__19424);
            rule__Hgvsprotein__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__1"


    // $ANTLR start "rule__Hgvsprotein__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4639:1: rule__Hgvsprotein__Group__1__Impl : ( ':' ) ;
    public final void rule__Hgvsprotein__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4643:1: ( ( ':' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4644:1: ( ':' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4644:1: ( ':' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4645:1: ':'
            {
             before(grammarAccess.getHgvsproteinAccess().getColonKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Hgvsprotein__Group__1__Impl9452); 
             after(grammarAccess.getHgvsproteinAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__1__Impl"


    // $ANTLR start "rule__Hgvsprotein__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4658:1: rule__Hgvsprotein__Group__2 : rule__Hgvsprotein__Group__2__Impl rule__Hgvsprotein__Group__3 ;
    public final void rule__Hgvsprotein__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4662:1: ( rule__Hgvsprotein__Group__2__Impl rule__Hgvsprotein__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4663:2: rule__Hgvsprotein__Group__2__Impl rule__Hgvsprotein__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__2__Impl_in_rule__Hgvsprotein__Group__29483);
            rule__Hgvsprotein__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__3_in_rule__Hgvsprotein__Group__29486);
            rule__Hgvsprotein__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__2"


    // $ANTLR start "rule__Hgvsprotein__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4670:1: rule__Hgvsprotein__Group__2__Impl : ( 'p.' ) ;
    public final void rule__Hgvsprotein__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4674:1: ( ( 'p.' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4675:1: ( 'p.' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4675:1: ( 'p.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4676:1: 'p.'
            {
             before(grammarAccess.getHgvsproteinAccess().getPKeyword_2()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Hgvsprotein__Group__2__Impl9514); 
             after(grammarAccess.getHgvsproteinAccess().getPKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__2__Impl"


    // $ANTLR start "rule__Hgvsprotein__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4689:1: rule__Hgvsprotein__Group__3 : rule__Hgvsprotein__Group__3__Impl ;
    public final void rule__Hgvsprotein__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4693:1: ( rule__Hgvsprotein__Group__3__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4694:2: rule__Hgvsprotein__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__Group__3__Impl_in_rule__Hgvsprotein__Group__39545);
            rule__Hgvsprotein__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__3"


    // $ANTLR start "rule__Hgvsprotein__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4700:1: rule__Hgvsprotein__Group__3__Impl : ( ( rule__Hgvsprotein__DescriptionAssignment_3 ) ) ;
    public final void rule__Hgvsprotein__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4704:1: ( ( ( rule__Hgvsprotein__DescriptionAssignment_3 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4705:1: ( ( rule__Hgvsprotein__DescriptionAssignment_3 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4705:1: ( ( rule__Hgvsprotein__DescriptionAssignment_3 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4706:1: ( rule__Hgvsprotein__DescriptionAssignment_3 )
            {
             before(grammarAccess.getHgvsproteinAccess().getDescriptionAssignment_3()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4707:1: ( rule__Hgvsprotein__DescriptionAssignment_3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4707:2: rule__Hgvsprotein__DescriptionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hgvsprotein__DescriptionAssignment_3_in_rule__Hgvsprotein__Group__3__Impl9572);
            rule__Hgvsprotein__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHgvsproteinAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4726:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4730:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4731:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09611);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09614);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4738:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4742:1: ( ( ( '-' )? ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4743:1: ( ( '-' )? )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4743:1: ( ( '-' )? )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4744:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4745:1: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==56) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4746:2: '-'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_rule__EDouble__Group__0__Impl9643); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4757:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4761:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4762:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19676);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19679);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4769:1: rule__EDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4773:1: ( ( RULE_INT ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4774:1: ( RULE_INT )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4774:1: ( RULE_INT )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4775:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl9706); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4786:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4790:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4791:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29735);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__29738);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4798:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4802:1: ( ( '.' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4803:1: ( '.' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4803:1: ( '.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4804:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__EDouble__Group__2__Impl9766); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4817:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4821:1: ( rule__EDouble__Group__3__Impl )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4822:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39797);
            rule__EDouble__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4828:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4832:1: ( ( RULE_INT ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4833:1: ( RULE_INT )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4833:1: ( RULE_INT )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4834:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl9824); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__Diagnosis__DiseaseAssignment_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4854:1: rule__Diagnosis__DiseaseAssignment_2 : ( ruledisease ) ;
    public final void rule__Diagnosis__DiseaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4858:1: ( ( ruledisease ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4859:1: ( ruledisease )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4859:1: ( ruledisease )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4860:1: ruledisease
            {
             before(grammarAccess.getDiagnosisAccess().getDiseaseDiseaseParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruledisease_in_rule__Diagnosis__DiseaseAssignment_29866);
            ruledisease();

            state._fsp--;

             after(grammarAccess.getDiagnosisAccess().getDiseaseDiseaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__DiseaseAssignment_2"


    // $ANTLR start "rule__Diagnosis__PatientDataAssignment_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4869:1: rule__Diagnosis__PatientDataAssignment_3 : ( rulepatientData ) ;
    public final void rule__Diagnosis__PatientDataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4873:1: ( ( rulepatientData ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4874:1: ( rulepatientData )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4874:1: ( rulepatientData )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4875:1: rulepatientData
            {
             before(grammarAccess.getDiagnosisAccess().getPatientDataPatientDataParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulepatientData_in_rule__Diagnosis__PatientDataAssignment_39897);
            rulepatientData();

            state._fsp--;

             after(grammarAccess.getDiagnosisAccess().getPatientDataPatientDataParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__PatientDataAssignment_3"


    // $ANTLR start "rule__Diagnosis__AnalysesAssignment_4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4884:1: rule__Diagnosis__AnalysesAssignment_4 : ( ruleanalysis ) ;
    public final void rule__Diagnosis__AnalysesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4888:1: ( ( ruleanalysis ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4889:1: ( ruleanalysis )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4889:1: ( ruleanalysis )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4890:1: ruleanalysis
            {
             before(grammarAccess.getDiagnosisAccess().getAnalysesAnalysisParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleanalysis_in_rule__Diagnosis__AnalysesAssignment_49928);
            ruleanalysis();

            state._fsp--;

             after(grammarAccess.getDiagnosisAccess().getAnalysesAnalysisParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__AnalysesAssignment_4"


    // $ANTLR start "rule__Diagnosis__ReportAssignment_5"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4899:1: rule__Diagnosis__ReportAssignment_5 : ( rulereport ) ;
    public final void rule__Diagnosis__ReportAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4903:1: ( ( rulereport ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4904:1: ( rulereport )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4904:1: ( rulereport )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4905:1: rulereport
            {
             before(grammarAccess.getDiagnosisAccess().getReportReportParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulereport_in_rule__Diagnosis__ReportAssignment_59959);
            rulereport();

            state._fsp--;

             after(grammarAccess.getDiagnosisAccess().getReportReportParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagnosis__ReportAssignment_5"


    // $ANTLR start "rule__PatientData__VariationsAssignment_1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4914:1: rule__PatientData__VariationsAssignment_1 : ( rulevariations ) ;
    public final void rule__PatientData__VariationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4918:1: ( ( rulevariations ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4919:1: ( rulevariations )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4919:1: ( rulevariations )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4920:1: rulevariations
            {
             before(grammarAccess.getPatientDataAccess().getVariationsVariationsParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevariations_in_rule__PatientData__VariationsAssignment_19990);
            rulevariations();

            state._fsp--;

             after(grammarAccess.getPatientDataAccess().getVariationsVariationsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatientData__VariationsAssignment_1"


    // $ANTLR start "rule__Variations__SeveralAssignment_1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4929:1: rule__Variations__SeveralAssignment_1 : ( ruleseveralPatients ) ;
    public final void rule__Variations__SeveralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4933:1: ( ( ruleseveralPatients ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4934:1: ( ruleseveralPatients )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4934:1: ( ruleseveralPatients )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4935:1: ruleseveralPatients
            {
             before(grammarAccess.getVariationsAccess().getSeveralSeveralPatientsParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleseveralPatients_in_rule__Variations__SeveralAssignment_110021);
            ruleseveralPatients();

            state._fsp--;

             after(grammarAccess.getVariationsAccess().getSeveralSeveralPatientsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__SeveralAssignment_1"


    // $ANTLR start "rule__Variations__FormatAssignment_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4944:1: rule__Variations__FormatAssignment_2 : ( rulevcf ) ;
    public final void rule__Variations__FormatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4948:1: ( ( rulevcf ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4949:1: ( rulevcf )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4949:1: ( rulevcf )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4950:1: rulevcf
            {
             before(grammarAccess.getVariationsAccess().getFormatVcfParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulevcf_in_rule__Variations__FormatAssignment_210052);
            rulevcf();

            state._fsp--;

             after(grammarAccess.getVariationsAccess().getFormatVcfParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variations__FormatAssignment_2"


    // $ANTLR start "rule__Vcf__DatafileAssignment_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4959:1: rule__Vcf__DatafileAssignment_2 : ( ruledataFile ) ;
    public final void rule__Vcf__DatafileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4963:1: ( ( ruledataFile ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4964:1: ( ruledataFile )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4964:1: ( ruledataFile )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4965:1: ruledataFile
            {
             before(grammarAccess.getVcfAccess().getDatafileDataFileParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruledataFile_in_rule__Vcf__DatafileAssignment_210083);
            ruledataFile();

            state._fsp--;

             after(grammarAccess.getVcfAccess().getDatafileDataFileParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vcf__DatafileAssignment_2"


    // $ANTLR start "rule__Annotation__HgvsAssignment_4_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4974:1: rule__Annotation__HgvsAssignment_4_0 : ( rulehgvsA ) ;
    public final void rule__Annotation__HgvsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4978:1: ( ( rulehgvsA ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4979:1: ( rulehgvsA )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4979:1: ( rulehgvsA )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4980:1: rulehgvsA
            {
             before(grammarAccess.getAnnotationAccess().getHgvsHgvsAParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsA_in_rule__Annotation__HgvsAssignment_4_010114);
            rulehgvsA();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getHgvsHgvsAParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__HgvsAssignment_4_0"


    // $ANTLR start "rule__Annotation__GeneAssignment_4_1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4989:1: rule__Annotation__GeneAssignment_4_1 : ( rulegeneA ) ;
    public final void rule__Annotation__GeneAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4993:1: ( ( rulegeneA ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4994:1: ( rulegeneA )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4994:1: ( rulegeneA )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:4995:1: rulegeneA
            {
             before(grammarAccess.getAnnotationAccess().getGeneGeneAParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulegeneA_in_rule__Annotation__GeneAssignment_4_110145);
            rulegeneA();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getGeneGeneAParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__GeneAssignment_4_1"


    // $ANTLR start "rule__Annotation__RsIdAssignment_4_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5004:1: rule__Annotation__RsIdAssignment_4_2 : ( rulersIdA ) ;
    public final void rule__Annotation__RsIdAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5008:1: ( ( rulersIdA ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5009:1: ( rulersIdA )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5009:1: ( rulersIdA )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5010:1: rulersIdA
            {
             before(grammarAccess.getAnnotationAccess().getRsIdRsIdAParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulersIdA_in_rule__Annotation__RsIdAssignment_4_210176);
            rulersIdA();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getRsIdRsIdAParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__RsIdAssignment_4_2"


    // $ANTLR start "rule__Annotation__TranscriptAssignment_4_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5019:1: rule__Annotation__TranscriptAssignment_4_3 : ( ruletranscriptA ) ;
    public final void rule__Annotation__TranscriptAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5023:1: ( ( ruletranscriptA ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5024:1: ( ruletranscriptA )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5024:1: ( ruletranscriptA )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5025:1: ruletranscriptA
            {
             before(grammarAccess.getAnnotationAccess().getTranscriptTranscriptAParserRuleCall_4_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruletranscriptA_in_rule__Annotation__TranscriptAssignment_4_310207);
            ruletranscriptA();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getTranscriptTranscriptAParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__TranscriptAssignment_4_3"


    // $ANTLR start "rule__Annotation__PredictionAssignment_4_4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5034:1: rule__Annotation__PredictionAssignment_4_4 : ( rulepredictionA ) ;
    public final void rule__Annotation__PredictionAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5038:1: ( ( rulepredictionA ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5039:1: ( rulepredictionA )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5039:1: ( rulepredictionA )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5040:1: rulepredictionA
            {
             before(grammarAccess.getAnnotationAccess().getPredictionPredictionAParserRuleCall_4_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionA_in_rule__Annotation__PredictionAssignment_4_410238);
            rulepredictionA();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getPredictionPredictionAParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__PredictionAssignment_4_4"


    // $ANTLR start "rule__Annotation__MafAssignment_4_5"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5049:1: rule__Annotation__MafAssignment_4_5 : ( rulemafA ) ;
    public final void rule__Annotation__MafAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5053:1: ( ( rulemafA ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5054:1: ( rulemafA )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5054:1: ( rulemafA )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5055:1: rulemafA
            {
             before(grammarAccess.getAnnotationAccess().getMafMafAParserRuleCall_4_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemafA_in_rule__Annotation__MafAssignment_4_510269);
            rulemafA();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getMafMafAParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__MafAssignment_4_5"


    // $ANTLR start "rule__PredictionA__AlgorithmAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5064:1: rule__PredictionA__AlgorithmAssignment : ( rulepredictionAlgorithm ) ;
    public final void rule__PredictionA__AlgorithmAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5068:1: ( ( rulepredictionAlgorithm ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5069:1: ( rulepredictionAlgorithm )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5069:1: ( rulepredictionAlgorithm )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5070:1: rulepredictionAlgorithm
            {
             before(grammarAccess.getPredictionAAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionAlgorithm_in_rule__PredictionA__AlgorithmAssignment10300);
            rulepredictionAlgorithm();

            state._fsp--;

             after(grammarAccess.getPredictionAAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictionA__AlgorithmAssignment"


    // $ANTLR start "rule__Search__OrderAssignment_2_4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5079:1: rule__Search__OrderAssignment_2_4 : ( ruleorder ) ;
    public final void rule__Search__OrderAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5083:1: ( ( ruleorder ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5084:1: ( ruleorder )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5084:1: ( ruleorder )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5085:1: ruleorder
            {
             before(grammarAccess.getSearchAccess().getOrderOrderParserRuleCall_2_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleorder_in_rule__Search__OrderAssignment_2_410331);
            ruleorder();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getOrderOrderParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__OrderAssignment_2_4"


    // $ANTLR start "rule__DnaS__HgvsdnaAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5094:1: rule__DnaS__HgvsdnaAssignment : ( rulehgvsdna ) ;
    public final void rule__DnaS__HgvsdnaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5098:1: ( ( rulehgvsdna ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5099:1: ( rulehgvsdna )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5099:1: ( rulehgvsdna )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5100:1: rulehgvsdna
            {
             before(grammarAccess.getDnaSAccess().getHgvsdnaHgvsdnaParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsdna_in_rule__DnaS__HgvsdnaAssignment10362);
            rulehgvsdna();

            state._fsp--;

             after(grammarAccess.getDnaSAccess().getHgvsdnaHgvsdnaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DnaS__HgvsdnaAssignment"


    // $ANTLR start "rule__CodingS__HgvscodingAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5109:1: rule__CodingS__HgvscodingAssignment : ( rulehgvscoding ) ;
    public final void rule__CodingS__HgvscodingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5113:1: ( ( rulehgvscoding ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5114:1: ( rulehgvscoding )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5114:1: ( rulehgvscoding )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5115:1: rulehgvscoding
            {
             before(grammarAccess.getCodingSAccess().getHgvscodingHgvscodingParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvscoding_in_rule__CodingS__HgvscodingAssignment10393);
            rulehgvscoding();

            state._fsp--;

             after(grammarAccess.getCodingSAccess().getHgvscodingHgvscodingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodingS__HgvscodingAssignment"


    // $ANTLR start "rule__ProteinS__HgvsproteinAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5124:1: rule__ProteinS__HgvsproteinAssignment : ( rulehgvsprotein ) ;
    public final void rule__ProteinS__HgvsproteinAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5128:1: ( ( rulehgvsprotein ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5129:1: ( rulehgvsprotein )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5129:1: ( rulehgvsprotein )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5130:1: rulehgvsprotein
            {
             before(grammarAccess.getProteinSAccess().getHgvsproteinHgvsproteinParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsprotein_in_rule__ProteinS__HgvsproteinAssignment10424);
            rulehgvsprotein();

            state._fsp--;

             after(grammarAccess.getProteinSAccess().getHgvsproteinHgvsproteinParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProteinS__HgvsproteinAssignment"


    // $ANTLR start "rule__GeneF__GeneAssignment_1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5139:1: rule__GeneF__GeneAssignment_1 : ( rulegene ) ;
    public final void rule__GeneF__GeneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5143:1: ( ( rulegene ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5144:1: ( rulegene )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5144:1: ( rulegene )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5145:1: rulegene
            {
             before(grammarAccess.getGeneFAccess().getGeneGeneParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulegene_in_rule__GeneF__GeneAssignment_110455);
            rulegene();

            state._fsp--;

             after(grammarAccess.getGeneFAccess().getGeneGeneParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneF__GeneAssignment_1"


    // $ANTLR start "rule__MafF__MinValueAssignment_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5154:1: rule__MafF__MinValueAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MafF__MinValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5158:1: ( ( ruleEDouble ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5159:1: ( ruleEDouble )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5159:1: ( ruleEDouble )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5160:1: ruleEDouble
            {
             before(grammarAccess.getMafFAccess().getMinValueEDoubleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__MafF__MinValueAssignment_210486);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMafFAccess().getMinValueEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__MinValueAssignment_2"


    // $ANTLR start "rule__MafF__MaxValueAssignment_4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5169:1: rule__MafF__MaxValueAssignment_4 : ( ruleEDouble ) ;
    public final void rule__MafF__MaxValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5173:1: ( ( ruleEDouble ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5174:1: ( ruleEDouble )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5174:1: ( ruleEDouble )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5175:1: ruleEDouble
            {
             before(grammarAccess.getMafFAccess().getMaxValueEDoubleParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__MafF__MaxValueAssignment_410517);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMafFAccess().getMaxValueEDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MafF__MaxValueAssignment_4"


    // $ANTLR start "rule__EffectF__AlgorithmAssignment_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5184:1: rule__EffectF__AlgorithmAssignment_0 : ( rulepredictionAlgorithm ) ;
    public final void rule__EffectF__AlgorithmAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5188:1: ( ( rulepredictionAlgorithm ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5189:1: ( rulepredictionAlgorithm )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5189:1: ( rulepredictionAlgorithm )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5190:1: rulepredictionAlgorithm
            {
             before(grammarAccess.getEffectFAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionAlgorithm_in_rule__EffectF__AlgorithmAssignment_010548);
            rulepredictionAlgorithm();

            state._fsp--;

             after(grammarAccess.getEffectFAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__AlgorithmAssignment_0"


    // $ANTLR start "rule__EffectF__EffectAssignment_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5199:1: rule__EffectF__EffectAssignment_2 : ( ruleeffectEnum ) ;
    public final void rule__EffectF__EffectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5203:1: ( ( ruleeffectEnum ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5204:1: ( ruleeffectEnum )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5204:1: ( ruleeffectEnum )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5205:1: ruleeffectEnum
            {
             before(grammarAccess.getEffectFAccess().getEffectEffectEnumEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleeffectEnum_in_rule__EffectF__EffectAssignment_210579);
            ruleeffectEnum();

            state._fsp--;

             after(grammarAccess.getEffectFAccess().getEffectEffectEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectF__EffectAssignment_2"


    // $ANTLR start "rule__ScoreF__AlgorithmAssignment_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5214:1: rule__ScoreF__AlgorithmAssignment_0 : ( rulepredictionAlgorithm ) ;
    public final void rule__ScoreF__AlgorithmAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5218:1: ( ( rulepredictionAlgorithm ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5219:1: ( rulepredictionAlgorithm )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5219:1: ( rulepredictionAlgorithm )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5220:1: rulepredictionAlgorithm
            {
             before(grammarAccess.getScoreFAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionAlgorithm_in_rule__ScoreF__AlgorithmAssignment_010610);
            rulepredictionAlgorithm();

            state._fsp--;

             after(grammarAccess.getScoreFAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__AlgorithmAssignment_0"


    // $ANTLR start "rule__ScoreF__MinScoreAssignment_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5229:1: rule__ScoreF__MinScoreAssignment_3 : ( ruleEDouble ) ;
    public final void rule__ScoreF__MinScoreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5233:1: ( ( ruleEDouble ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5234:1: ( ruleEDouble )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5234:1: ( ruleEDouble )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5235:1: ruleEDouble
            {
             before(grammarAccess.getScoreFAccess().getMinScoreEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__ScoreF__MinScoreAssignment_310641);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getScoreFAccess().getMinScoreEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__MinScoreAssignment_3"


    // $ANTLR start "rule__ScoreF__MaxScoreAssignment_5"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5244:1: rule__ScoreF__MaxScoreAssignment_5 : ( ruleEDouble ) ;
    public final void rule__ScoreF__MaxScoreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5248:1: ( ( ruleEDouble ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5249:1: ( ruleEDouble )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5249:1: ( ruleEDouble )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5250:1: ruleEDouble
            {
             before(grammarAccess.getScoreFAccess().getMaxScoreEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__ScoreF__MaxScoreAssignment_510672);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getScoreFAccess().getMaxScoreEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreF__MaxScoreAssignment_5"


    // $ANTLR start "rule__Order__CriteriaAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5259:1: rule__Order__CriteriaAssignment : ( ruleorderCriteria ) ;
    public final void rule__Order__CriteriaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5263:1: ( ( ruleorderCriteria ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5264:1: ( ruleorderCriteria )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5264:1: ( ruleorderCriteria )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5265:1: ruleorderCriteria
            {
             before(grammarAccess.getOrderAccess().getCriteriaOrderCriteriaEnumRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleorderCriteria_in_rule__Order__CriteriaAssignment10703);
            ruleorderCriteria();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getCriteriaOrderCriteriaEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__CriteriaAssignment"


    // $ANTLR start "rule__Report__ReportVariationsAssignment_1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5274:1: rule__Report__ReportVariationsAssignment_1 : ( rulereportVariations ) ;
    public final void rule__Report__ReportVariationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5278:1: ( ( rulereportVariations ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5279:1: ( rulereportVariations )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5279:1: ( rulereportVariations )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5280:1: rulereportVariations
            {
             before(grammarAccess.getReportAccess().getReportVariationsReportVariationsParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulereportVariations_in_rule__Report__ReportVariationsAssignment_110734);
            rulereportVariations();

            state._fsp--;

             after(grammarAccess.getReportAccess().getReportVariationsReportVariationsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__ReportVariationsAssignment_1"


    // $ANTLR start "rule__ReportVariations__HgvsAssignment_3_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5289:1: rule__ReportVariations__HgvsAssignment_3_0 : ( rulehgvsR ) ;
    public final void rule__ReportVariations__HgvsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5293:1: ( ( rulehgvsR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5294:1: ( rulehgvsR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5294:1: ( rulehgvsR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5295:1: rulehgvsR
            {
             before(grammarAccess.getReportVariationsAccess().getHgvsHgvsRParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulehgvsR_in_rule__ReportVariations__HgvsAssignment_3_010765);
            rulehgvsR();

            state._fsp--;

             after(grammarAccess.getReportVariationsAccess().getHgvsHgvsRParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__HgvsAssignment_3_0"


    // $ANTLR start "rule__ReportVariations__GeneAssignment_3_1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5304:1: rule__ReportVariations__GeneAssignment_3_1 : ( rulegeneR ) ;
    public final void rule__ReportVariations__GeneAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5308:1: ( ( rulegeneR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5309:1: ( rulegeneR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5309:1: ( rulegeneR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5310:1: rulegeneR
            {
             before(grammarAccess.getReportVariationsAccess().getGeneGeneRParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulegeneR_in_rule__ReportVariations__GeneAssignment_3_110796);
            rulegeneR();

            state._fsp--;

             after(grammarAccess.getReportVariationsAccess().getGeneGeneRParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__GeneAssignment_3_1"


    // $ANTLR start "rule__ReportVariations__RsIdAssignment_3_2"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5319:1: rule__ReportVariations__RsIdAssignment_3_2 : ( rulersIdR ) ;
    public final void rule__ReportVariations__RsIdAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5323:1: ( ( rulersIdR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5324:1: ( rulersIdR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5324:1: ( rulersIdR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5325:1: rulersIdR
            {
             before(grammarAccess.getReportVariationsAccess().getRsIdRsIdRParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulersIdR_in_rule__ReportVariations__RsIdAssignment_3_210827);
            rulersIdR();

            state._fsp--;

             after(grammarAccess.getReportVariationsAccess().getRsIdRsIdRParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__RsIdAssignment_3_2"


    // $ANTLR start "rule__ReportVariations__TranscriptAssignment_3_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5334:1: rule__ReportVariations__TranscriptAssignment_3_3 : ( ruletranscriptR ) ;
    public final void rule__ReportVariations__TranscriptAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5338:1: ( ( ruletranscriptR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5339:1: ( ruletranscriptR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5339:1: ( ruletranscriptR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5340:1: ruletranscriptR
            {
             before(grammarAccess.getReportVariationsAccess().getTranscriptTranscriptRParserRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruletranscriptR_in_rule__ReportVariations__TranscriptAssignment_3_310858);
            ruletranscriptR();

            state._fsp--;

             after(grammarAccess.getReportVariationsAccess().getTranscriptTranscriptRParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__TranscriptAssignment_3_3"


    // $ANTLR start "rule__ReportVariations__PredictionAssignment_3_4"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5349:1: rule__ReportVariations__PredictionAssignment_3_4 : ( rulepredictionR ) ;
    public final void rule__ReportVariations__PredictionAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5353:1: ( ( rulepredictionR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5354:1: ( rulepredictionR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5354:1: ( rulepredictionR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5355:1: rulepredictionR
            {
             before(grammarAccess.getReportVariationsAccess().getPredictionPredictionRParserRuleCall_3_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionR_in_rule__ReportVariations__PredictionAssignment_3_410889);
            rulepredictionR();

            state._fsp--;

             after(grammarAccess.getReportVariationsAccess().getPredictionPredictionRParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__PredictionAssignment_3_4"


    // $ANTLR start "rule__ReportVariations__MafAssignment_3_5"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5364:1: rule__ReportVariations__MafAssignment_3_5 : ( rulemafR ) ;
    public final void rule__ReportVariations__MafAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5368:1: ( ( rulemafR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5369:1: ( rulemafR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5369:1: ( rulemafR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5370:1: rulemafR
            {
             before(grammarAccess.getReportVariationsAccess().getMafMafRParserRuleCall_3_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemafR_in_rule__ReportVariations__MafAssignment_3_510920);
            rulemafR();

            state._fsp--;

             after(grammarAccess.getReportVariationsAccess().getMafMafRParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportVariations__MafAssignment_3_5"


    // $ANTLR start "rule__PredictionR__AlgorithmAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5379:1: rule__PredictionR__AlgorithmAssignment : ( rulepredictionAlgorithm ) ;
    public final void rule__PredictionR__AlgorithmAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5383:1: ( ( rulepredictionAlgorithm ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5384:1: ( rulepredictionAlgorithm )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5384:1: ( rulepredictionAlgorithm )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5385:1: rulepredictionAlgorithm
            {
             before(grammarAccess.getPredictionRAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulepredictionAlgorithm_in_rule__PredictionR__AlgorithmAssignment10951);
            rulepredictionAlgorithm();

            state._fsp--;

             after(grammarAccess.getPredictionRAccess().getAlgorithmPredictionAlgorithmEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictionR__AlgorithmAssignment"


    // $ANTLR start "rule__Disease__NameAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5394:1: rule__Disease__NameAssignment : ( ruleEString ) ;
    public final void rule__Disease__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5398:1: ( ( ruleEString ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5399:1: ( ruleEString )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5399:1: ( ruleEString )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5400:1: ruleEString
            {
             before(grammarAccess.getDiseaseAccess().getNameEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Disease__NameAssignment10982);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDiseaseAccess().getNameEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disease__NameAssignment"


    // $ANTLR start "rule__DataFile__DynamicAssignment_2_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5409:1: rule__DataFile__DynamicAssignment_2_0 : ( RULE_INPUT ) ;
    public final void rule__DataFile__DynamicAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5413:1: ( ( RULE_INPUT ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5414:1: ( RULE_INPUT )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5414:1: ( RULE_INPUT )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5415:1: RULE_INPUT
            {
             before(grammarAccess.getDataFileAccess().getDynamicINPUTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INPUT,FollowSets000.FOLLOW_RULE_INPUT_in_rule__DataFile__DynamicAssignment_2_011013); 
             after(grammarAccess.getDataFileAccess().getDynamicINPUTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__DynamicAssignment_2_0"


    // $ANTLR start "rule__DataFile__PathAssignment_2_1"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5424:1: rule__DataFile__PathAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DataFile__PathAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5428:1: ( ( ruleEString ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5429:1: ( ruleEString )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5429:1: ( ruleEString )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5430:1: ruleEString
            {
             before(grammarAccess.getDataFileAccess().getPathEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DataFile__PathAssignment_2_111044);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataFileAccess().getPathEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFile__PathAssignment_2_1"


    // $ANTLR start "rule__Hgvsdna__ReferenceAssignment_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5439:1: rule__Hgvsdna__ReferenceAssignment_0 : ( rulerefSeqReference ) ;
    public final void rule__Hgvsdna__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5443:1: ( ( rulerefSeqReference ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5444:1: ( rulerefSeqReference )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5444:1: ( rulerefSeqReference )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5445:1: rulerefSeqReference
            {
             before(grammarAccess.getHgvsdnaAccess().getReferenceRefSeqReferenceParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulerefSeqReference_in_rule__Hgvsdna__ReferenceAssignment_011075);
            rulerefSeqReference();

            state._fsp--;

             after(grammarAccess.getHgvsdnaAccess().getReferenceRefSeqReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__ReferenceAssignment_0"


    // $ANTLR start "rule__Hgvsdna__DescriptionAssignment_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5454:1: rule__Hgvsdna__DescriptionAssignment_3 : ( RULE_HGVSEXPR ) ;
    public final void rule__Hgvsdna__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5458:1: ( ( RULE_HGVSEXPR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5459:1: ( RULE_HGVSEXPR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5459:1: ( RULE_HGVSEXPR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5460:1: RULE_HGVSEXPR
            {
             before(grammarAccess.getHgvsdnaAccess().getDescriptionHGVSEXPRTerminalRuleCall_3_0()); 
            match(input,RULE_HGVSEXPR,FollowSets000.FOLLOW_RULE_HGVSEXPR_in_rule__Hgvsdna__DescriptionAssignment_311106); 
             after(grammarAccess.getHgvsdnaAccess().getDescriptionHGVSEXPRTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsdna__DescriptionAssignment_3"


    // $ANTLR start "rule__Hgvscoding__ReferenceAssignment_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5469:1: rule__Hgvscoding__ReferenceAssignment_0 : ( rulerefSeqReference ) ;
    public final void rule__Hgvscoding__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5473:1: ( ( rulerefSeqReference ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5474:1: ( rulerefSeqReference )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5474:1: ( rulerefSeqReference )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5475:1: rulerefSeqReference
            {
             before(grammarAccess.getHgvscodingAccess().getReferenceRefSeqReferenceParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulerefSeqReference_in_rule__Hgvscoding__ReferenceAssignment_011137);
            rulerefSeqReference();

            state._fsp--;

             after(grammarAccess.getHgvscodingAccess().getReferenceRefSeqReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__ReferenceAssignment_0"


    // $ANTLR start "rule__Hgvscoding__DescriptionAssignment_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5484:1: rule__Hgvscoding__DescriptionAssignment_3 : ( RULE_HGVSEXPR ) ;
    public final void rule__Hgvscoding__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5488:1: ( ( RULE_HGVSEXPR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5489:1: ( RULE_HGVSEXPR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5489:1: ( RULE_HGVSEXPR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5490:1: RULE_HGVSEXPR
            {
             before(grammarAccess.getHgvscodingAccess().getDescriptionHGVSEXPRTerminalRuleCall_3_0()); 
            match(input,RULE_HGVSEXPR,FollowSets000.FOLLOW_RULE_HGVSEXPR_in_rule__Hgvscoding__DescriptionAssignment_311168); 
             after(grammarAccess.getHgvscodingAccess().getDescriptionHGVSEXPRTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvscoding__DescriptionAssignment_3"


    // $ANTLR start "rule__Hgvsprotein__ReferenceAssignment_0"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5499:1: rule__Hgvsprotein__ReferenceAssignment_0 : ( rulerefSeqReference ) ;
    public final void rule__Hgvsprotein__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5503:1: ( ( rulerefSeqReference ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5504:1: ( rulerefSeqReference )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5504:1: ( rulerefSeqReference )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5505:1: rulerefSeqReference
            {
             before(grammarAccess.getHgvsproteinAccess().getReferenceRefSeqReferenceParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulerefSeqReference_in_rule__Hgvsprotein__ReferenceAssignment_011199);
            rulerefSeqReference();

            state._fsp--;

             after(grammarAccess.getHgvsproteinAccess().getReferenceRefSeqReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__ReferenceAssignment_0"


    // $ANTLR start "rule__Hgvsprotein__DescriptionAssignment_3"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5514:1: rule__Hgvsprotein__DescriptionAssignment_3 : ( RULE_HGVSEXPR ) ;
    public final void rule__Hgvsprotein__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5518:1: ( ( RULE_HGVSEXPR ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5519:1: ( RULE_HGVSEXPR )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5519:1: ( RULE_HGVSEXPR )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5520:1: RULE_HGVSEXPR
            {
             before(grammarAccess.getHgvsproteinAccess().getDescriptionHGVSEXPRTerminalRuleCall_3_0()); 
            match(input,RULE_HGVSEXPR,FollowSets000.FOLLOW_RULE_HGVSEXPR_in_rule__Hgvsprotein__DescriptionAssignment_311230); 
             after(grammarAccess.getHgvsproteinAccess().getDescriptionHGVSEXPRTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hgvsprotein__DescriptionAssignment_3"


    // $ANTLR start "rule__Gene__HgncIdAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5529:1: rule__Gene__HgncIdAssignment : ( ( rule__Gene__HgncIdAlternatives_0 ) ) ;
    public final void rule__Gene__HgncIdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5533:1: ( ( ( rule__Gene__HgncIdAlternatives_0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5534:1: ( ( rule__Gene__HgncIdAlternatives_0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5534:1: ( ( rule__Gene__HgncIdAlternatives_0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5535:1: ( rule__Gene__HgncIdAlternatives_0 )
            {
             before(grammarAccess.getGeneAccess().getHgncIdAlternatives_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5536:1: ( rule__Gene__HgncIdAlternatives_0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5536:2: rule__Gene__HgncIdAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Gene__HgncIdAlternatives_0_in_rule__Gene__HgncIdAssignment11261);
            rule__Gene__HgncIdAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneAccess().getHgncIdAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gene__HgncIdAssignment"


    // $ANTLR start "rule__RefSeqReference__IdentifierAssignment"
    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5545:1: rule__RefSeqReference__IdentifierAssignment : ( ( rule__RefSeqReference__IdentifierAlternatives_0 ) ) ;
    public final void rule__RefSeqReference__IdentifierAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5549:1: ( ( ( rule__RefSeqReference__IdentifierAlternatives_0 ) ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5550:1: ( ( rule__RefSeqReference__IdentifierAlternatives_0 ) )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5550:1: ( ( rule__RefSeqReference__IdentifierAlternatives_0 ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5551:1: ( rule__RefSeqReference__IdentifierAlternatives_0 )
            {
             before(grammarAccess.getRefSeqReferenceAccess().getIdentifierAlternatives_0()); 
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5552:1: ( rule__RefSeqReference__IdentifierAlternatives_0 )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5552:2: rule__RefSeqReference__IdentifierAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RefSeqReference__IdentifierAlternatives_0_in_rule__RefSeqReference__IdentifierAssignment11294);
            rule__RefSeqReference__IdentifierAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRefSeqReferenceAccess().getIdentifierAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSeqReference__IdentifierAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulediagnosis_in_entryRulediagnosis61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulediagnosis68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__0_in_rulediagnosis94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepatientData_in_entryRulepatientData121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulepatientData128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PatientData__Group__0_in_rulepatientData154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevariations_in_entryRulevariations181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevariations188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variations__Group__0_in_rulevariations214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleseveralPatients_in_entryRuleseveralPatients241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleseveralPatients248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SeveralPatients__Group__0_in_ruleseveralPatients274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevcf_in_entryRulevcf301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevcf308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vcf__Group__0_in_rulevcf334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleanalysis_in_entryRuleanalysis361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleanalysis368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Analysis__Alternatives_in_ruleanalysis394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleannotation_in_entryRuleannotation421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleannotation428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleannotation454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsA_in_entryRulehgvsA481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulehgvsA488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsA__Group__0_in_rulehgvsA514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegeneA_in_entryRulegeneA541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulegeneA548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneA__Group__0_in_rulegeneA574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletranscriptA_in_entryRuletranscriptA601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletranscriptA608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TranscriptA__Group__0_in_ruletranscriptA634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionA_in_entryRulepredictionA661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulepredictionA668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PredictionA__AlgorithmAssignment_in_rulepredictionA694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulersIdA_in_entryRulersIdA721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulersIdA728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RsIdA__Group__0_in_rulersIdA754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemafA_in_entryRulemafA781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemafA788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafA__Group__0_in_rulemafA814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesearch_in_entryRulesearch841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesearch848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Alternatives_in_rulesearch874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsS_in_entryRulehgvsS901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulehgvsS908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsS__Group__0_in_rulehgvsS934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulednaS_in_entryRulednaS961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulednaS968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DnaS__HgvsdnaAssignment_in_rulednaS996 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_rule__DnaS__HgvsdnaAssignment_in_rulednaS1008 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_rulecodingS_in_entryRulecodingS1038 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecodingS1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CodingS__HgvscodingAssignment_in_rulecodingS1073 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_rule__CodingS__HgvscodingAssignment_in_rulecodingS1085 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_ruleproteinS_in_entryRuleproteinS1115 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleproteinS1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProteinS__HgvsproteinAssignment_in_ruleproteinS1150 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_rule__ProteinS__HgvsproteinAssignment_in_ruleproteinS1162 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_rulegeneF_in_entryRulegeneF1192 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulegeneF1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneF__Group__0_in_rulegeneF1225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionF_in_entryRulepredictionF1252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulepredictionF1259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PredictionF__Alternatives_in_rulepredictionF1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemafF_in_entryRulemafF1312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemafF1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__Group__0_in_rulemafF1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleeffectF_in_entryRuleeffectF1372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleeffectF1379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EffectF__Group__0_in_ruleeffectF1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulescoreF_in_entryRulescoreF1432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulescoreF1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__0_in_rulescoreF1465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleorder_in_entryRuleorder1492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleorder1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Order__CriteriaAssignment_in_ruleorder1525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereport_in_entryRulereport1552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulereport1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Report__Group__0_in_rulereport1585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereportVariations_in_entryRulereportVariations1612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulereportVariations1619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__0_in_rulereportVariations1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsR_in_entryRulehgvsR1672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulehgvsR1679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsR__Group__0_in_rulehgvsR1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegeneR_in_entryRulegeneR1732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulegeneR1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneR__Group__0_in_rulegeneR1765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulersIdR_in_entryRulersIdR1792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulersIdR1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RsIdR__Group__0_in_rulersIdR1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletranscriptR_in_entryRuletranscriptR1852 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletranscriptR1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TranscriptR__Group__0_in_ruletranscriptR1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionR_in_entryRulepredictionR1912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulepredictionR1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PredictionR__AlgorithmAssignment_in_rulepredictionR1945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemafR_in_entryRulemafR1972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemafR1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafR__Group__0_in_rulemafR2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledisease_in_entryRuledisease2032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledisease2039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Disease__NameAssignment_in_ruledisease2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledataFile_in_entryRuledataFile2092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledataFile2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataFile__Group__0_in_ruledataFile2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsdna_in_entryRulehgvsdna2152 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulehgvsdna2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__0_in_rulehgvsdna2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvscoding_in_entryRulehgvscoding2212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulehgvscoding2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__0_in_rulehgvscoding2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsprotein_in_entryRulehgvsprotein2272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulehgvsprotein2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__0_in_rulehgvsprotein2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegene_in_entryRulegene2332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulegene2339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Gene__HgncIdAssignment_in_rulegene2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerefSeqReference_in_entryRulerefSeqReference2392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerefSeqReference2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RefSeqReference__IdentifierAssignment_in_rulerefSeqReference2425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2516 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PredictionAlgorithm__Alternatives_in_rulepredictionAlgorithm2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderCriteria__Alternatives_in_ruleorderCriteria2622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EffectEnum__Alternatives_in_ruleeffectEnum2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleannotation_in_rule__Analysis__Alternatives2693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesearch_in_rule__Analysis__Alternatives2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__HgvsAssignment_4_0_in_rule__Annotation__Alternatives_42742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__GeneAssignment_4_1_in_rule__Annotation__Alternatives_42760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__RsIdAssignment_4_2_in_rule__Annotation__Alternatives_42778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__TranscriptAssignment_4_3_in_rule__Annotation__Alternatives_42796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__PredictionAssignment_4_4_in_rule__Annotation__Alternatives_42814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__MafAssignment_4_5_in_rule__Annotation__Alternatives_42832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsS_in_rule__Search__Alternatives2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_1__0_in_rule__Search__Alternatives2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_2__0_in_rule__Search__Alternatives2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegeneF_in_rule__Search__Alternatives_1_32933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionF_in_rule__Search__Alternatives_1_32950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemafF_in_rule__Search__Alternatives_1_32967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegeneF_in_rule__Search__Alternatives_2_32999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionF_in_rule__Search__Alternatives_2_33016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemafF_in_rule__Search__Alternatives_2_33033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulednaS_in_rule__HgvsS__Alternatives_23065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecodingS_in_rule__HgvsS__Alternatives_23082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleproteinS_in_rule__HgvsS__Alternatives_23099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleeffectF_in_rule__PredictionF__Alternatives3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulescoreF_in_rule__PredictionF__Alternatives3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__HgvsAssignment_3_0_in_rule__ReportVariations__Alternatives_33180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__GeneAssignment_3_1_in_rule__ReportVariations__Alternatives_33198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__RsIdAssignment_3_2_in_rule__ReportVariations__Alternatives_33216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__TranscriptAssignment_3_3_in_rule__ReportVariations__Alternatives_33234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__PredictionAssignment_3_4_in_rule__ReportVariations__Alternatives_33252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__MafAssignment_3_5_in_rule__ReportVariations__Alternatives_33270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataFile__DynamicAssignment_2_0_in_rule__DataFile__Alternatives_23303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataFile__PathAssignment_2_1_in_rule__DataFile__Alternatives_23321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Gene__HgncIdAlternatives_03354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HGNCGENE_in_rule__Gene__HgncIdAlternatives_03371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_REFSEQ_in_rule__RefSeqReference__IdentifierAlternatives_03403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ASSEMBLY_in_rule__RefSeqReference__IdentifierAlternatives_03420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PredictionAlgorithm__Alternatives3503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PredictionAlgorithm__Alternatives3524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrderCriteria__Alternatives3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrderCriteria__Alternatives3581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__OrderCriteria__Alternatives3602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OrderCriteria__Alternatives3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EffectEnum__Alternatives3659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EffectEnum__Alternatives3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EffectEnum__Alternatives3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__EffectEnum__Alternatives3722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__EffectEnum__Alternatives3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__EffectEnum__Alternatives3764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__0__Impl_in_rule__Diagnosis__Group__03797 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__1_in_rule__Diagnosis__Group__03800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Diagnosis__Group__0__Impl3828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__1__Impl_in_rule__Diagnosis__Group__13859 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__2_in_rule__Diagnosis__Group__13862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Diagnosis__Group__1__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__2__Impl_in_rule__Diagnosis__Group__23921 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__3_in_rule__Diagnosis__Group__23924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__DiseaseAssignment_2_in_rule__Diagnosis__Group__2__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__3__Impl_in_rule__Diagnosis__Group__33981 = new BitSet(new long[]{0x0000340800000000L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__4_in_rule__Diagnosis__Group__33984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__PatientDataAssignment_3_in_rule__Diagnosis__Group__3__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__4__Impl_in_rule__Diagnosis__Group__44041 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__5_in_rule__Diagnosis__Group__44044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__AnalysesAssignment_4_in_rule__Diagnosis__Group__4__Impl4073 = new BitSet(new long[]{0x0000340800000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__AnalysesAssignment_4_in_rule__Diagnosis__Group__4__Impl4085 = new BitSet(new long[]{0x0000340800000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__Group__5__Impl_in_rule__Diagnosis__Group__54118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagnosis__ReportAssignment_5_in_rule__Diagnosis__Group__5__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PatientData__Group__0__Impl_in_rule__PatientData__Group__04187 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PatientData__Group__1_in_rule__PatientData__Group__04190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PatientData__Group__0__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PatientData__Group__1__Impl_in_rule__PatientData__Group__14249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PatientData__VariationsAssignment_1_in_rule__PatientData__Group__1__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variations__Group__0__Impl_in_rule__Variations__Group__04310 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__Variations__Group__1_in_rule__Variations__Group__04313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Variations__Group__0__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variations__Group__1__Impl_in_rule__Variations__Group__14372 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__Variations__Group__2_in_rule__Variations__Group__14375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variations__SeveralAssignment_1_in_rule__Variations__Group__1__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variations__Group__2__Impl_in_rule__Variations__Group__24433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variations__FormatAssignment_2_in_rule__Variations__Group__2__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SeveralPatients__Group__0__Impl_in_rule__SeveralPatients__Group__04496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__SeveralPatients__Group__1_in_rule__SeveralPatients__Group__04499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SeveralPatients__Group__0__Impl4527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SeveralPatients__Group__1__Impl_in_rule__SeveralPatients__Group__14558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vcf__Group__0__Impl_in_rule__Vcf__Group__04620 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Vcf__Group__1_in_rule__Vcf__Group__04623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Vcf__Group__0__Impl4651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vcf__Group__1__Impl_in_rule__Vcf__Group__14682 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Vcf__Group__2_in_rule__Vcf__Group__14685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Vcf__Group__1__Impl4713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vcf__Group__2__Impl_in_rule__Vcf__Group__24744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vcf__DatafileAssignment_2_in_rule__Vcf__Group__2__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__04807 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__04810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Annotation__Group__0__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__14869 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__14872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Annotation__Group__1__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__24931 = new BitSet(new long[]{0x000003E000030000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__24934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Annotation__Group__2__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__34993 = new BitSet(new long[]{0x000003E000030000L});
        public static final BitSet FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__34996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__45054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_4_in_rule__Annotation__Group__4__Impl5083 = new BitSet(new long[]{0x000003E000030002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_4_in_rule__Annotation__Group__4__Impl5095 = new BitSet(new long[]{0x000003E000030002L});
        public static final BitSet FOLLOW_rule__HgvsA__Group__0__Impl_in_rule__HgvsA__Group__05138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__HgvsA__Group__1_in_rule__HgvsA__Group__05141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__HgvsA__Group__0__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsA__Group__1__Impl_in_rule__HgvsA__Group__15200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneA__Group__0__Impl_in_rule__GeneA__Group__05262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__GeneA__Group__1_in_rule__GeneA__Group__05265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__GeneA__Group__0__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneA__Group__1__Impl_in_rule__GeneA__Group__15324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TranscriptA__Group__0__Impl_in_rule__TranscriptA__Group__05386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__TranscriptA__Group__1_in_rule__TranscriptA__Group__05389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__TranscriptA__Group__0__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TranscriptA__Group__1__Impl_in_rule__TranscriptA__Group__15448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RsIdA__Group__0__Impl_in_rule__RsIdA__Group__05510 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__RsIdA__Group__1_in_rule__RsIdA__Group__05513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__RsIdA__Group__0__Impl5541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RsIdA__Group__1__Impl_in_rule__RsIdA__Group__15572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafA__Group__0__Impl_in_rule__MafA__Group__05634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__MafA__Group__1_in_rule__MafA__Group__05637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MafA__Group__0__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafA__Group__1__Impl_in_rule__MafA__Group__15696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_1__0__Impl_in_rule__Search__Group_1__05758 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Search__Group_1__1_in_rule__Search__Group_1__05761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Search__Group_1__0__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_1__1__Impl_in_rule__Search__Group_1__15820 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Search__Group_1__2_in_rule__Search__Group_1__15823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Search__Group_1__1__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_1__2__Impl_in_rule__Search__Group_1__25882 = new BitSet(new long[]{0x0000024000030000L});
        public static final BitSet FOLLOW_rule__Search__Group_1__3_in_rule__Search__Group_1__25885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Search__Group_1__2__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_1__3__Impl_in_rule__Search__Group_1__35944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Alternatives_1_3_in_rule__Search__Group_1__3__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_2__0__Impl_in_rule__Search__Group_2__06009 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Search__Group_2__1_in_rule__Search__Group_2__06012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Search__Group_2__0__Impl6040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_2__1__Impl_in_rule__Search__Group_2__16071 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Search__Group_2__2_in_rule__Search__Group_2__16074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Search__Group_2__1__Impl6102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_2__2__Impl_in_rule__Search__Group_2__26133 = new BitSet(new long[]{0x0000024000030000L});
        public static final BitSet FOLLOW_rule__Search__Group_2__3_in_rule__Search__Group_2__26136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Search__Group_2__2__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_2__3__Impl_in_rule__Search__Group_2__36195 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__Search__Group_2__4_in_rule__Search__Group_2__36198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Alternatives_2_3_in_rule__Search__Group_2__3__Impl6225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_2__4__Impl_in_rule__Search__Group_2__46255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__OrderAssignment_2_4_in_rule__Search__Group_2__4__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsS__Group__0__Impl_in_rule__HgvsS__Group__06322 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__HgvsS__Group__1_in_rule__HgvsS__Group__06325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__HgvsS__Group__0__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsS__Group__1__Impl_in_rule__HgvsS__Group__16384 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__HgvsS__Group__2_in_rule__HgvsS__Group__16387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__HgvsS__Group__1__Impl6415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsS__Group__2__Impl_in_rule__HgvsS__Group__26446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsS__Alternatives_2_in_rule__HgvsS__Group__2__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneF__Group__0__Impl_in_rule__GeneF__Group__06509 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_rule__GeneF__Group__1_in_rule__GeneF__Group__06512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__GeneF__Group__0__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneF__Group__1__Impl_in_rule__GeneF__Group__16571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneF__GeneAssignment_1_in_rule__GeneF__Group__1__Impl6600 = new BitSet(new long[]{0x0000000000000192L});
        public static final BitSet FOLLOW_rule__GeneF__GeneAssignment_1_in_rule__GeneF__Group__1__Impl6612 = new BitSet(new long[]{0x0000000000000192L});
        public static final BitSet FOLLOW_rule__MafF__Group__0__Impl_in_rule__MafF__Group__06649 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__MafF__Group__1_in_rule__MafF__Group__06652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MafF__Group__0__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__Group__1__Impl_in_rule__MafF__Group__16711 = new BitSet(new long[]{0x0100000000000200L});
        public static final BitSet FOLLOW_rule__MafF__Group__2_in_rule__MafF__Group__16714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__MafF__Group__1__Impl6742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__Group__2__Impl_in_rule__MafF__Group__26773 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__MafF__Group__3_in_rule__MafF__Group__26776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__MinValueAssignment_2_in_rule__MafF__Group__2__Impl6803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__Group__3__Impl_in_rule__MafF__Group__36833 = new BitSet(new long[]{0x0100000000000200L});
        public static final BitSet FOLLOW_rule__MafF__Group__4_in_rule__MafF__Group__36836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__MafF__Group__3__Impl6864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__Group__4__Impl_in_rule__MafF__Group__46895 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__MafF__Group__5_in_rule__MafF__Group__46898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__MaxValueAssignment_4_in_rule__MafF__Group__4__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafF__Group__5__Impl_in_rule__MafF__Group__56955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__MafF__Group__5__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EffectF__Group__0__Impl_in_rule__EffectF__Group__07026 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__EffectF__Group__1_in_rule__EffectF__Group__07029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EffectF__AlgorithmAssignment_0_in_rule__EffectF__Group__0__Impl7056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EffectF__Group__1__Impl_in_rule__EffectF__Group__17086 = new BitSet(new long[]{0x000000000FC00000L});
        public static final BitSet FOLLOW_rule__EffectF__Group__2_in_rule__EffectF__Group__17089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__EffectF__Group__1__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EffectF__Group__2__Impl_in_rule__EffectF__Group__27148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EffectF__EffectAssignment_2_in_rule__EffectF__Group__2__Impl7177 = new BitSet(new long[]{0x000000000FC00002L});
        public static final BitSet FOLLOW_rule__EffectF__EffectAssignment_2_in_rule__EffectF__Group__2__Impl7189 = new BitSet(new long[]{0x000000000FC00002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__0__Impl_in_rule__ScoreF__Group__07228 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__1_in_rule__ScoreF__Group__07231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__AlgorithmAssignment_0_in_rule__ScoreF__Group__0__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__1__Impl_in_rule__ScoreF__Group__17288 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__2_in_rule__ScoreF__Group__17291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__ScoreF__Group__1__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__2__Impl_in_rule__ScoreF__Group__27350 = new BitSet(new long[]{0x0100000000000200L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__3_in_rule__ScoreF__Group__27353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__ScoreF__Group__2__Impl7381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__3__Impl_in_rule__ScoreF__Group__37412 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__4_in_rule__ScoreF__Group__37415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__MinScoreAssignment_3_in_rule__ScoreF__Group__3__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__4__Impl_in_rule__ScoreF__Group__47472 = new BitSet(new long[]{0x0100000000000200L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__5_in_rule__ScoreF__Group__47475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__ScoreF__Group__4__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__5__Impl_in_rule__ScoreF__Group__57534 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__6_in_rule__ScoreF__Group__57537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__MaxScoreAssignment_5_in_rule__ScoreF__Group__5__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScoreF__Group__6__Impl_in_rule__ScoreF__Group__67594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__ScoreF__Group__6__Impl7622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Report__Group__0__Impl_in_rule__Report__Group__07667 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Report__Group__1_in_rule__Report__Group__07670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Report__Group__0__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Report__Group__1__Impl_in_rule__Report__Group__17729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Report__ReportVariationsAssignment_1_in_rule__Report__Group__1__Impl7756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__0__Impl_in_rule__ReportVariations__Group__07790 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__1_in_rule__ReportVariations__Group__07793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ReportVariations__Group__0__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__1__Impl_in_rule__ReportVariations__Group__17852 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__2_in_rule__ReportVariations__Group__17855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__2__Impl_in_rule__ReportVariations__Group__27913 = new BitSet(new long[]{0x000003E000030000L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__3_in_rule__ReportVariations__Group__27916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ReportVariations__Group__2__Impl7944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__Group__3__Impl_in_rule__ReportVariations__Group__37975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReportVariations__Alternatives_3_in_rule__ReportVariations__Group__3__Impl8004 = new BitSet(new long[]{0x000003E000030002L});
        public static final BitSet FOLLOW_rule__ReportVariations__Alternatives_3_in_rule__ReportVariations__Group__3__Impl8016 = new BitSet(new long[]{0x000003E000030002L});
        public static final BitSet FOLLOW_rule__HgvsR__Group__0__Impl_in_rule__HgvsR__Group__08057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__HgvsR__Group__1_in_rule__HgvsR__Group__08060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__HgvsR__Group__0__Impl8088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HgvsR__Group__1__Impl_in_rule__HgvsR__Group__18119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneR__Group__0__Impl_in_rule__GeneR__Group__08181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__GeneR__Group__1_in_rule__GeneR__Group__08184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__GeneR__Group__0__Impl8212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneR__Group__1__Impl_in_rule__GeneR__Group__18243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RsIdR__Group__0__Impl_in_rule__RsIdR__Group__08305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__RsIdR__Group__1_in_rule__RsIdR__Group__08308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__RsIdR__Group__0__Impl8336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RsIdR__Group__1__Impl_in_rule__RsIdR__Group__18367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TranscriptR__Group__0__Impl_in_rule__TranscriptR__Group__08429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__TranscriptR__Group__1_in_rule__TranscriptR__Group__08432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__TranscriptR__Group__0__Impl8460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TranscriptR__Group__1__Impl_in_rule__TranscriptR__Group__18491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafR__Group__0__Impl_in_rule__MafR__Group__08553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__MafR__Group__1_in_rule__MafR__Group__08556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MafR__Group__0__Impl8584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MafR__Group__1__Impl_in_rule__MafR__Group__18615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataFile__Group__0__Impl_in_rule__DataFile__Group__08677 = new BitSet(new long[]{0x0000000000000580L});
        public static final BitSet FOLLOW_rule__DataFile__Group__1_in_rule__DataFile__Group__08680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__DataFile__Group__0__Impl8708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataFile__Group__1__Impl_in_rule__DataFile__Group__18739 = new BitSet(new long[]{0x0000000000000580L});
        public static final BitSet FOLLOW_rule__DataFile__Group__2_in_rule__DataFile__Group__18742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataFile__Group__2__Impl_in_rule__DataFile__Group__28800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataFile__Alternatives_2_in_rule__DataFile__Group__2__Impl8827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__0__Impl_in_rule__Hgvsdna__Group__08863 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__1_in_rule__Hgvsdna__Group__08866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsdna__ReferenceAssignment_0_in_rule__Hgvsdna__Group__0__Impl8893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__1__Impl_in_rule__Hgvsdna__Group__18923 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__2_in_rule__Hgvsdna__Group__18926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Hgvsdna__Group__1__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__2__Impl_in_rule__Hgvsdna__Group__28985 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__3_in_rule__Hgvsdna__Group__28988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Hgvsdna__Group__2__Impl9016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsdna__Group__3__Impl_in_rule__Hgvsdna__Group__39047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsdna__DescriptionAssignment_3_in_rule__Hgvsdna__Group__3__Impl9074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__0__Impl_in_rule__Hgvscoding__Group__09112 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__1_in_rule__Hgvscoding__Group__09115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvscoding__ReferenceAssignment_0_in_rule__Hgvscoding__Group__0__Impl9142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__1__Impl_in_rule__Hgvscoding__Group__19172 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__2_in_rule__Hgvscoding__Group__19175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Hgvscoding__Group__1__Impl9203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__2__Impl_in_rule__Hgvscoding__Group__29234 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__3_in_rule__Hgvscoding__Group__29237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Hgvscoding__Group__2__Impl9265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvscoding__Group__3__Impl_in_rule__Hgvscoding__Group__39296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvscoding__DescriptionAssignment_3_in_rule__Hgvscoding__Group__3__Impl9323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__0__Impl_in_rule__Hgvsprotein__Group__09361 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__1_in_rule__Hgvsprotein__Group__09364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__ReferenceAssignment_0_in_rule__Hgvsprotein__Group__0__Impl9391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__1__Impl_in_rule__Hgvsprotein__Group__19421 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__2_in_rule__Hgvsprotein__Group__19424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Hgvsprotein__Group__1__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__2__Impl_in_rule__Hgvsprotein__Group__29483 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__3_in_rule__Hgvsprotein__Group__29486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Hgvsprotein__Group__2__Impl9514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__Group__3__Impl_in_rule__Hgvsprotein__Group__39545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hgvsprotein__DescriptionAssignment_3_in_rule__Hgvsprotein__Group__3__Impl9572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09611 = new BitSet(new long[]{0x0100000000000200L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__EDouble__Group__0__Impl9643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19676 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl9706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29735 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__29738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__EDouble__Group__2__Impl9766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl9824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledisease_in_rule__Diagnosis__DiseaseAssignment_29866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepatientData_in_rule__Diagnosis__PatientDataAssignment_39897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleanalysis_in_rule__Diagnosis__AnalysesAssignment_49928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereport_in_rule__Diagnosis__ReportAssignment_59959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevariations_in_rule__PatientData__VariationsAssignment_19990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleseveralPatients_in_rule__Variations__SeveralAssignment_110021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevcf_in_rule__Variations__FormatAssignment_210052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledataFile_in_rule__Vcf__DatafileAssignment_210083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsA_in_rule__Annotation__HgvsAssignment_4_010114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegeneA_in_rule__Annotation__GeneAssignment_4_110145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulersIdA_in_rule__Annotation__RsIdAssignment_4_210176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletranscriptA_in_rule__Annotation__TranscriptAssignment_4_310207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionA_in_rule__Annotation__PredictionAssignment_4_410238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemafA_in_rule__Annotation__MafAssignment_4_510269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionAlgorithm_in_rule__PredictionA__AlgorithmAssignment10300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleorder_in_rule__Search__OrderAssignment_2_410331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsdna_in_rule__DnaS__HgvsdnaAssignment10362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvscoding_in_rule__CodingS__HgvscodingAssignment10393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsprotein_in_rule__ProteinS__HgvsproteinAssignment10424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegene_in_rule__GeneF__GeneAssignment_110455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__MafF__MinValueAssignment_210486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__MafF__MaxValueAssignment_410517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionAlgorithm_in_rule__EffectF__AlgorithmAssignment_010548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleeffectEnum_in_rule__EffectF__EffectAssignment_210579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionAlgorithm_in_rule__ScoreF__AlgorithmAssignment_010610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__ScoreF__MinScoreAssignment_310641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__ScoreF__MaxScoreAssignment_510672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleorderCriteria_in_rule__Order__CriteriaAssignment10703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereportVariations_in_rule__Report__ReportVariationsAssignment_110734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulehgvsR_in_rule__ReportVariations__HgvsAssignment_3_010765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulegeneR_in_rule__ReportVariations__GeneAssignment_3_110796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulersIdR_in_rule__ReportVariations__RsIdAssignment_3_210827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletranscriptR_in_rule__ReportVariations__TranscriptAssignment_3_310858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionR_in_rule__ReportVariations__PredictionAssignment_3_410889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemafR_in_rule__ReportVariations__MafAssignment_3_510920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepredictionAlgorithm_in_rule__PredictionR__AlgorithmAssignment10951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Disease__NameAssignment10982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INPUT_in_rule__DataFile__DynamicAssignment_2_011013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DataFile__PathAssignment_2_111044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerefSeqReference_in_rule__Hgvsdna__ReferenceAssignment_011075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HGVSEXPR_in_rule__Hgvsdna__DescriptionAssignment_311106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerefSeqReference_in_rule__Hgvscoding__ReferenceAssignment_011137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HGVSEXPR_in_rule__Hgvscoding__DescriptionAssignment_311168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerefSeqReference_in_rule__Hgvsprotein__ReferenceAssignment_011199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HGVSEXPR_in_rule__Hgvsprotein__DescriptionAssignment_311230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Gene__HgncIdAlternatives_0_in_rule__Gene__HgncIdAssignment11261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RefSeqReference__IdentifierAlternatives_0_in_rule__RefSeqReference__IdentifierAssignment11294 = new BitSet(new long[]{0x0000000000000002L});
    }


}