package diagnosis.it3.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDiagLexer extends Lexer {
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=15;
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
    public static final int T__32=32;
    public static final int RULE_STRING=7;
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

    public InternalMyDiagLexer() {;} 
    public InternalMyDiagLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDiagLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:11:7: ( 'Sift' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:11:9: 'Sift'
            {
            match("Sift"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:12:7: ( 'Polyphen' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:12:9: 'Polyphen'
            {
            match("Polyphen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:13:7: ( 'AlphAsc' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:13:9: 'AlphAsc'
            {
            match("AlphAsc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:14:7: ( 'AlphDes' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:14:9: 'AlphDes'
            {
            match("AlphDes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:15:7: ( 'Max2Min' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:15:9: 'Max2Min'
            {
            match("Max2Min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:16:7: ( 'Min2Max' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:16:9: 'Min2Max'
            {
            match("Min2Max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:17:7: ( 'tolerated' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:17:9: 'tolerated'
            {
            match("tolerated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:18:7: ( 'deleterious' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:18:9: 'deleterious'
            {
            match("deleterious"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:19:7: ( 'benign' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:19:9: 'benign'
            {
            match("benign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:20:7: ( 'damaging' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:20:9: 'damaging'
            {
            match("damaging"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:21:7: ( 'probably damaging' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:21:9: 'probably damaging'
            {
            match("probably damaging"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:22:7: ( 'possibly damaging' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:22:9: 'possibly damaging'
            {
            match("possibly damaging"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:23:7: ( 'Find' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:23:9: 'Find'
            {
            match("Find"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:24:7: ( 'putative variants for' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:24:9: 'putative variants for'
            {
            match("putative variants for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:25:7: ( 'Read' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:25:9: 'Read'
            {
            match("Read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:26:7: ( 'variations' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:26:9: 'variations'
            {
            match("variations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:27:7: ( 'genotypes' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:27:9: 'genotypes'
            {
            match("genotypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:28:7: ( 'from' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:28:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:29:7: ( 'a VCF file' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:29:9: 'a VCF file'
            {
            match("a VCF file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:30:7: ( 'Annotate' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:30:9: 'Annotate'
            {
            match("Annotate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:31:7: ( 'with' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:31:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:32:7: ( 'hgvs' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:32:9: 'hgvs'
            {
            match("hgvs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:33:7: ( 'gene' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:33:9: 'gene'
            {
            match("gene"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:34:7: ( 'transcript' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:34:9: 'transcript'
            {
            match("transcript"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:35:7: ( 'rsId' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:35:9: 'rsId'
            {
            match("rsId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:36:7: ( 'samples maf' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:36:9: 'samples maf'
            {
            match("samples maf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:37:7: ( 'Filter' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:37:9: 'Filter'
            {
            match("Filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:38:7: ( 'by' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:38:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:39:7: ( 'Prioritize' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:39:9: 'Prioritize'
            {
            match("Prioritize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:40:7: ( 'Search' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:40:9: 'Search'
            {
            match("Search"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:41:7: ( '[' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:41:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:42:7: ( ',' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:42:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:43:7: ( ']' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:44:7: ( 'effect' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:44:9: 'effect'
            {
            match("effect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:45:7: ( 'score' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:45:9: 'score'
            {
            match("score"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:46:7: ( 'Report' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:46:9: 'Report'
            {
            match("Report"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:47:7: ( ':' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:47:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:48:7: ( 'g.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:48:9: 'g.'
            {
            match("g."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:49:7: ( 'c.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:49:9: 'c.'
            {
            match("c."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:50:7: ( 'p.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:50:9: 'p.'
            {
            match("p."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:51:7: ( '-' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:51:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:52:7: ( '.' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:52:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_HGNCGENE"
    public final void mRULE_HGNCGENE() throws RecognitionException {
        try {
            int _type = RULE_HGNCGENE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:15: ( ( 'A' .. 'Z' )+ ( ( ( '0' .. '9' )+ ( 'A' .. 'Z' )+ )* | ( '0' .. '9' )+ ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:17: ( 'A' .. 'Z' )+ ( ( ( '0' .. '9' )+ ( 'A' .. 'Z' )+ )* | ( '0' .. '9' )+ )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:17: ( 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:18: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:29: ( ( ( '0' .. '9' )+ ( 'A' .. 'Z' )+ )* | ( '0' .. '9' )+ )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:30: ( ( '0' .. '9' )+ ( 'A' .. 'Z' )+ )*
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:30: ( ( '0' .. '9' )+ ( 'A' .. 'Z' )+ )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:31: ( '0' .. '9' )+ ( 'A' .. 'Z' )+
                    	    {
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:31: ( '0' .. '9' )+
                    	    int cnt2=0;
                    	    loop2:
                    	    do {
                    	        int alt2=2;
                    	        int LA2_0 = input.LA(1);

                    	        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    	            alt2=1;
                    	        }


                    	        switch (alt2) {
                    	    	case 1 :
                    	    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:32: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt2 >= 1 ) break loop2;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(2, input);
                    	                throw eee;
                    	        }
                    	        cnt2++;
                    	    } while (true);

                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:43: ( 'A' .. 'Z' )+
                    	    int cnt3=0;
                    	    loop3:
                    	    do {
                    	        int alt3=2;
                    	        int LA3_0 = input.LA(1);

                    	        if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                    	            alt3=1;
                    	        }


                    	        switch (alt3) {
                    	    	case 1 :
                    	    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:44: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt3 >= 1 ) break loop3;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(3, input);
                    	                throw eee;
                    	        }
                    	        cnt3++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:57: ( '0' .. '9' )+
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:57: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5562:58: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HGNCGENE"

    // $ANTLR start "RULE_INPUT"
    public final void mRULE_INPUT() throws RecognitionException {
        try {
            int _type = RULE_INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5564:12: ( 'input' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5564:14: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INPUT"

    // $ANTLR start "RULE_REFSEQ"
    public final void mRULE_REFSEQ() throws RecognitionException {
        try {
            int _type = RULE_REFSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5566:13: ( 'N' ( 'C' | 'G' | 'M' | 'P' ) '_' RULE_INT '.' RULE_INT )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5566:15: 'N' ( 'C' | 'G' | 'M' | 'P' ) '_' RULE_INT '.' RULE_INT
            {
            match('N'); 
            if ( input.LA(1)=='C'||input.LA(1)=='G'||input.LA(1)=='M'||input.LA(1)=='P' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REFSEQ"

    // $ANTLR start "RULE_ASSEMBLY"
    public final void mRULE_ASSEMBLY() throws RecognitionException {
        try {
            int _type = RULE_ASSEMBLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5568:15: ( ( 'Hg' RULE_INT | 'NCBI' RULE_INT ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5568:17: ( 'Hg' RULE_INT | 'NCBI' RULE_INT )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5568:17: ( 'Hg' RULE_INT | 'NCBI' RULE_INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='H') ) {
                alt7=1;
            }
            else if ( (LA7_0=='N') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5568:18: 'Hg' RULE_INT
                    {
                    match("Hg"); 

                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5568:32: 'NCBI' RULE_INT
                    {
                    match("NCBI"); 

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSEMBLY"

    // $ANTLR start "RULE_HGVSEXPR"
    public final void mRULE_HGVSEXPR() throws RecognitionException {
        try {
            int _type = RULE_HGVSEXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:15: ( ( RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'ins' | 'del' ) ( 'A' | 'T' | 'G' | 'C' )+ | RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'A' | 'T' | 'G' | 'C' )+ '>' ( 'A' | 'T' | 'G' | 'C' )+ | ( 'A' .. 'Z' | 'a' .. 'z' )+ RULE_INT ( 'A' .. 'Z' | 'a' .. 'z' )+ ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:17: ( RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'ins' | 'del' ) ( 'A' | 'T' | 'G' | 'C' )+ | RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'A' | 'T' | 'G' | 'C' )+ '>' ( 'A' | 'T' | 'G' | 'C' )+ | ( 'A' .. 'Z' | 'a' .. 'z' )+ RULE_INT ( 'A' .. 'Z' | 'a' .. 'z' )+ )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:17: ( RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'ins' | 'del' ) ( 'A' | 'T' | 'G' | 'C' )+ | RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'A' | 'T' | 'G' | 'C' )+ '>' ( 'A' | 'T' | 'G' | 'C' )+ | ( 'A' .. 'Z' | 'a' .. 'z' )+ RULE_INT ( 'A' .. 'Z' | 'a' .. 'z' )+ )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:18: RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'ins' | 'del' ) ( 'A' | 'T' | 'G' | 'C' )+
                    {
                    mRULE_INT(); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:27: ( ( '+' | '-' ) RULE_INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:28: ( '+' | '-' ) RULE_INT
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_INT(); 

                            }
                            break;

                    }

                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:49: ( 'ins' | 'del' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='i') ) {
                        alt9=1;
                    }
                    else if ( (LA9_0=='d') ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:50: 'ins'
                            {
                            match("ins"); 


                            }
                            break;
                        case 2 :
                            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:56: 'del'
                            {
                            match("del"); 


                            }
                            break;

                    }

                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:63: ( 'A' | 'T' | 'G' | 'C' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='A'||LA10_0=='C'||LA10_0=='G'||LA10_0=='T') ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:
                    	    {
                    	    if ( input.LA(1)=='A'||input.LA(1)=='C'||input.LA(1)=='G'||input.LA(1)=='T' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:82: RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'A' | 'T' | 'G' | 'C' )+ '>' ( 'A' | 'T' | 'G' | 'C' )+
                    {
                    mRULE_INT(); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:91: ( ( '+' | '-' ) RULE_INT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='+'||LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:92: ( '+' | '-' ) RULE_INT
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_INT(); 

                            }
                            break;

                    }

                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:113: ( 'A' | 'T' | 'G' | 'C' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='A'||LA12_0=='C'||LA12_0=='G'||LA12_0=='T') ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:
                    	    {
                    	    if ( input.LA(1)=='A'||input.LA(1)=='C'||input.LA(1)=='G'||input.LA(1)=='T' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    match('>'); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:136: ( 'A' | 'T' | 'G' | 'C' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='A'||LA13_0=='C'||LA13_0=='G'||LA13_0=='T') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:
                    	    {
                    	    if ( input.LA(1)=='A'||input.LA(1)=='C'||input.LA(1)=='G'||input.LA(1)=='T' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:155: ( 'A' .. 'Z' | 'a' .. 'z' )+ RULE_INT ( 'A' .. 'Z' | 'a' .. 'z' )+
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:155: ( 'A' .. 'Z' | 'a' .. 'z' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:
                    	    {
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    mRULE_INT(); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5570:185: ( 'A' .. 'Z' | 'a' .. 'z' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:
                    	    {
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HGVSEXPR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5572:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5572:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5572:11: ( '^' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='^') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5572:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5572:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5574:10: ( ( '0' .. '9' )+ )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5574:12: ( '0' .. '9' )+
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5574:12: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5574:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\"') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\'') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5576:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5578:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5578:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5578:24: ( options {greedy=false; } : . )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='*') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='/') ) {
                        alt23=2;
                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='.')||(LA23_1>='0' && LA23_1<='\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<=')')||(LA23_0>='+' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5578:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:40: ( ( '\\r' )? '\\n' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:41: ( '\\r' )? '\\n'
                    {
                    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:41: ( '\\r' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5580:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5582:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5582:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5582:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5584:16: ( . )
            // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:5584:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_HGNCGENE | RULE_INPUT | RULE_REFSEQ | RULE_ASSEMBLY | RULE_HGVSEXPR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=54;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:262: RULE_HGNCGENE
                {
                mRULE_HGNCGENE(); 

                }
                break;
            case 44 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:276: RULE_INPUT
                {
                mRULE_INPUT(); 

                }
                break;
            case 45 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:287: RULE_REFSEQ
                {
                mRULE_REFSEQ(); 

                }
                break;
            case 46 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:299: RULE_ASSEMBLY
                {
                mRULE_ASSEMBLY(); 

                }
                break;
            case 47 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:313: RULE_HGVSEXPR
                {
                mRULE_HGVSEXPR(); 

                }
                break;
            case 48 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:327: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:335: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:344: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:356: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:372: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:388: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../diagnosis.it3.mydsl.ui/src-gen/diagnosis/it3/mydsl/ui/contentassist/antlr/internal/InternalMyDiag.g:1:396: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA6_eotS =
        "\1\2\1\3\2\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\60\2\uffff";
    static final String DFA6_maxS =
        "\1\71\1\132\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1",
            "\12\1\7\uffff\32\2",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    static class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "5562:29: ( ( ( '0' .. '9' )+ ( 'A' .. 'Z' )+ )* | ( '0' .. '9' )+ )";
        }
    }
    static final String DFA16_eotS =
        "\7\uffff";
    static final String DFA16_eofS =
        "\7\uffff";
    static final String DFA16_minS =
        "\1\60\1\53\1\uffff\1\60\2\uffff\1\60";
    static final String DFA16_maxS =
        "\1\172\1\151\1\uffff\1\71\2\uffff\1\151";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\1\uffff\1\1\1\2\1\uffff";
    static final String DFA16_specialS =
        "\7\uffff}>";
    static final String[] DFA16_transitionS = {
            "\12\1\7\uffff\32\2\6\uffff\32\2",
            "\1\3\1\uffff\1\3\2\uffff\12\1\7\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\1\5\14\uffff\1\5\17\uffff\1\4\4\uffff\1\4",
            "",
            "\12\6",
            "",
            "",
            "\12\6\7\uffff\1\5\1\uffff\1\5\3\uffff\1\5\14\uffff\1\5\17"+
            "\uffff\1\4\4\uffff\1\4"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "5570:17: ( RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'ins' | 'del' ) ( 'A' | 'T' | 'G' | 'C' )+ | RULE_INT ( ( '+' | '-' ) RULE_INT )? ( 'A' | 'T' | 'G' | 'C' )+ '>' ( 'A' | 'T' | 'G' | 'C' )+ | ( 'A' .. 'Z' | 'a' .. 'z' )+ RULE_INT ( 'A' .. 'Z' | 'a' .. 'z' )+ )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\4\53\4\56\2\53\10\56\3\uffff\1\56\1\uffff\1\56\2\uffff"+
        "\1\53\1\56\2\53\1\130\1\56\1\47\1\uffff\3\47\2\uffff\2\56\1\53\1"+
        "\uffff\1\53\1\56\1\uffff\14\56\1\156\3\56\1\uffff\4\56\1\uffff\1"+
        "\56\1\uffff\5\56\3\uffff\1\56\4\uffff\2\53\2\56\2\uffff\1\130\4"+
        "\uffff\2\56\1\53\1\131\13\56\1\uffff\21\56\1\53\1\56\1\u00a5\1\u00a6"+
        "\20\56\1\u00b8\1\56\1\u00ba\3\56\1\u00be\1\u00bf\1\u00c0\1\u00c1"+
        "\1\u00c2\4\56\1\53\1\56\2\uffff\1\56\1\53\5\56\2\131\10\56\1\uffff"+
        "\1\56\1\uffff\3\56\5\uffff\1\56\1\u00de\1\56\1\uffff\1\53\1\u00e0"+
        "\1\u00e1\5\56\2\131\4\56\1\u00ed\3\56\1\u00f1\1\u00f2\3\56\1\uffff"+
        "\1\u00f6\2\uffff\2\56\1\u00f9\1\u00fa\1\56\1\u00fc\1\u00fd\4\56"+
        "\1\uffff\3\56\2\uffff\3\56\1\uffff\1\u0108\1\56\2\uffff\1\u010a"+
        "\2\uffff\3\56\1\u010e\5\56\2\uffff\1\56\1\uffff\1\u0115\2\56\4\uffff"+
        "\1\56\1\u0119\1\u011a\1\uffff\1\u011b\1\56\1\u011d\3\uffff\1\u011e"+
        "\2\uffff";
    static final String DFA28_eofS =
        "\u011f\uffff";
    static final String DFA28_minS =
        "\1\0\7\60\1\56\3\60\1\56\1\60\1\40\4\60\3\uffff\1\60\1\uffff\1"+
        "\56\2\uffff\4\60\1\53\1\60\1\101\1\uffff\2\0\1\52\2\uffff\3\60\1"+
        "\uffff\2\60\1\uffff\20\60\1\uffff\4\60\1\uffff\1\60\1\uffff\5\60"+
        "\3\uffff\1\60\4\uffff\4\60\2\uffff\1\53\4\uffff\17\60\1\uffff\63"+
        "\60\1\56\2\60\2\uffff\21\60\1\uffff\1\60\1\uffff\3\60\5\uffff\3"+
        "\60\1\uffff\27\60\1\uffff\1\60\2\uffff\13\60\1\uffff\3\60\2\uffff"+
        "\2\60\1\40\1\uffff\2\60\2\uffff\1\60\2\uffff\4\60\3\40\2\60\2\uffff"+
        "\1\60\1\uffff\3\60\4\uffff\3\60\1\uffff\3\60\3\uffff\1\60\2\uffff";
    static final String DFA28_maxS =
        "\1\uffff\22\172\3\uffff\1\172\1\uffff\1\172\2\uffff\4\172\1\151"+
        "\2\172\1\uffff\2\uffff\1\57\2\uffff\3\172\1\uffff\2\172\1\uffff"+
        "\20\172\1\uffff\4\172\1\uffff\1\172\1\uffff\5\172\3\uffff\1\172"+
        "\4\uffff\4\172\2\uffff\1\151\4\uffff\17\172\1\uffff\20\172\1\71"+
        "\5\172\1\132\34\172\1\71\2\172\2\uffff\21\172\1\uffff\1\172\1\uffff"+
        "\3\172\5\uffff\3\172\1\uffff\27\172\1\uffff\1\172\2\uffff\13\172"+
        "\1\uffff\3\172\2\uffff\3\172\1\uffff\2\172\2\uffff\1\172\2\uffff"+
        "\11\172\2\uffff\1\172\1\uffff\3\172\4\uffff\3\172\1\uffff\3\172"+
        "\3\uffff\1\172\2\uffff";
    static final String DFA28_acceptS =
        "\23\uffff\1\37\1\40\1\41\1\uffff\1\45\1\uffff\1\51\1\52\7\uffff"+
        "\1\60\3\uffff\1\65\1\66\3\uffff\1\53\2\uffff\1\60\20\uffff\1\50"+
        "\4\uffff\1\46\1\uffff\1\23\5\uffff\1\37\1\40\1\41\1\uffff\1\45\1"+
        "\47\1\51\1\52\4\uffff\1\61\1\57\1\uffff\1\62\1\63\1\64\1\65\17\uffff"+
        "\1\34\66\uffff\1\56\1\1\21\uffff\1\15\1\uffff\1\17\3\uffff\1\27"+
        "\1\22\1\25\1\26\1\31\3\uffff\1\55\27\uffff\1\43\1\uffff\1\54\1\36"+
        "\13\uffff\1\11\3\uffff\1\33\1\44\3\uffff\1\42\2\uffff\1\3\1\4\1"+
        "\uffff\1\5\1\6\11\uffff\1\32\1\2\1\uffff\1\24\3\uffff\1\12\1\13"+
        "\1\14\1\16\3\uffff\1\7\3\uffff\1\21\1\35\1\30\1\uffff\1\20\1\10";
    static final String DFA28_specialS =
        "\1\1\42\uffff\1\0\1\2\u00fa\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\43\4\47\1\44\4\47\1"+
            "\24\1\31\1\32\1\45\12\37\1\27\6\47\1\3\4\36\1\11\1\36\1\35\4"+
            "\36\1\4\1\33\1\36\1\2\1\36\1\12\1\1\7\36\1\23\1\47\1\25\1\41"+
            "\1\42\1\47\1\16\1\7\1\30\1\6\1\26\1\15\1\14\1\20\1\34\6\40\1"+
            "\10\1\40\1\21\1\22\1\5\1\40\1\13\1\17\3\40\uff85\47",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\4\55\1\51\3\55\1"+
            "\50\21\55",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\16\55\1\57\2\55"+
            "\1\60\10\55",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\13\55\1\61\1\55"+
            "\1\62\14\55",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\1\63\7\55\1\64\21"+
            "\55",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\65\2\55\1\66\10\55",
            "\12\67\7\uffff\32\55\6\uffff\1\71\3\55\1\70\25\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\72\23\55\1\73\1\55",
            "\1\77\1\uffff\12\67\7\uffff\32\55\6\uffff\16\55\1\75\2\55"+
            "\1\74\2\55\1\76\5\55",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\10\55\1\100\21\55",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\4\55\1\101\25\55",
            "\12\67\7\uffff\32\55\6\uffff\1\102\31\55",
            "\1\104\1\uffff\12\67\7\uffff\32\55\6\uffff\4\55\1\103\25\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\105\10\55",
            "\1\106\17\uffff\12\67\7\uffff\32\55\6\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\107\21\55",
            "\12\67\7\uffff\32\55\6\uffff\6\55\1\110\23\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\111\7\55",
            "\12\67\7\uffff\32\55\6\uffff\1\112\1\55\1\113\27\55",
            "",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\5\55\1\117\24\55",
            "",
            "\1\121\1\uffff\12\67\7\uffff\32\55\6\uffff\32\55",
            "",
            "",
            "\12\52\7\uffff\2\54\1\124\3\54\1\125\5\54\1\125\2\54\1\125"+
            "\12\54\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\126\14\55",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\6\55\1\127\23\55",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\32\55",
            "\1\131\1\uffff\1\131\2\uffff\12\132\7\uffff\1\131\1\uffff"+
            "\1\131\3\uffff\1\131\14\uffff\1\131\17\uffff\1\131\4\uffff\1"+
            "\131",
            "\12\67\7\uffff\32\55\6\uffff\32\55",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\0\133",
            "\0\133",
            "\1\134\4\uffff\1\135",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\5\55\1\137\24\55",
            "\12\67\7\uffff\32\55\6\uffff\1\140\31\55",
            "\12\52\7\uffff\32\141\4\uffff\1\56\1\uffff\32\142",
            "",
            "\12\52\7\uffff\32\54\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\32\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\13\55\1\143\16\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\144\21\55",
            "\12\67\7\uffff\32\55\6\uffff\17\55\1\145\12\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\146\14\55",
            "\12\67\7\uffff\32\55\6\uffff\27\55\1\147\2\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\150\14\55",
            "\12\67\7\uffff\32\55\6\uffff\13\55\1\151\16\55",
            "\12\67\7\uffff\32\55\6\uffff\1\152\31\55",
            "\12\67\7\uffff\32\142\6\uffff\32\142",
            "\12\67\7\uffff\32\55\6\uffff\13\55\1\153\16\55",
            "\12\67\7\uffff\32\55\6\uffff\14\55\1\154\15\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\155\14\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\157\13\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\160\7\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\161\6\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\13\55\1\163\1\55\1\162\14\55",
            "\12\67\7\uffff\32\55\6\uffff\1\164\16\55\1\165\12\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\166\10\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\167\14\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\170\13\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\171\6\55",
            "\12\67\7\uffff\32\55\6\uffff\25\55\1\172\4\55",
            "\12\67\7\uffff\10\55\1\173\21\55\6\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\14\55\1\174\15\55",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\175\13\55",
            "",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\5\55\1\176\24\55",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\1\54\1\u0080\30\54\4\uffff\1\177\1\uffff\32"+
            "\55",
            "\12\52\7\uffff\32\54\4\uffff\1\177\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\17\55\1\u0081\12\55",
            "\12\u0082\7\uffff\32\55\6\uffff\32\55",
            "",
            "",
            "\1\131\1\uffff\1\131\2\uffff\12\132\7\uffff\1\131\1\uffff"+
            "\1\131\3\uffff\1\131\14\uffff\1\131\17\uffff\1\131\4\uffff\1"+
            "\131",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u0083\6\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u0084\10\55",
            "\12\u0085\7\uffff\32\141\4\uffff\1\56\1\uffff\32\142",
            "\12\56\7\uffff\32\142\4\uffff\1\56\1\uffff\32\142",
            "\12\67\7\uffff\32\55\6\uffff\30\55\1\u0086\1\55",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\u0087\13\55",
            "\12\67\7\uffff\32\55\6\uffff\7\55\1\u0088\22\55",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\u0089\13\55",
            "\2\67\1\u008a\7\67\7\uffff\32\55\6\uffff\32\55",
            "\2\67\1\u008b\7\67\7\uffff\32\55\6\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u008c\25\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\u008d\14\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u008e\25\55",
            "\12\67\7\uffff\32\55\6\uffff\1\u008f\31\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u0090\21\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\1\55\1\u0091\30\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u0092\7\55",
            "\12\67\7\uffff\32\55\6\uffff\1\u0093\31\55",
            "\12\67\7\uffff\32\55\6\uffff\3\55\1\u0094\26\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u0095\6\55",
            "\12\67\7\uffff\32\55\6\uffff\3\55\1\u0096\26\55",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\u0097\13\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u0098\21\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u009a\11\55\1\u0099\13"+
            "\55",
            "\12\67\7\uffff\32\55\6\uffff\14\55\1\u009b\15\55",
            "\12\67\7\uffff\32\55\6\uffff\7\55\1\u009c\22\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u009d\7\55",
            "\12\67\7\uffff\32\55\6\uffff\3\55\1\u009e\26\55",
            "\12\67\7\uffff\32\55\6\uffff\17\55\1\u009f\12\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u00a0\10\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00a1\25\55",
            "\12\u00a2",
            "\12\52\7\uffff\10\54\1\u00a3\21\54\4\uffff\1\56\1\uffff\32"+
            "\55",
            "\12\67\7\uffff\32\55\6\uffff\24\55\1\u00a4\5\55",
            "\12\u0082\7\uffff\32\142\4\uffff\1\56\1\uffff\32\142",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\2\55\1\u00a7\27\55",
            "\12\u0085\7\uffff\32\u00a8",
            "\12\67\7\uffff\32\55\6\uffff\17\55\1\u00a9\12\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u00aa\10\55",
            "\12\67\7\uffff\1\u00ab\2\55\1\u00ac\26\55\6\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00ad\6\55",
            "\12\67\7\uffff\14\142\1\u00ae\15\142\6\uffff\32\142",
            "\12\67\7\uffff\14\142\1\u00af\15\142\6\uffff\32\142",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u00b0\10\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u00b1\7\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00b2\6\55",
            "\12\67\7\uffff\32\55\6\uffff\6\55\1\u00b3\23\55",
            "\12\67\7\uffff\32\55\6\uffff\6\55\1\u00b4\23\55",
            "\12\67\7\uffff\32\55\6\uffff\1\u00b5\31\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u00b6\21\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00b7\6\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00b9\25\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u00bb\10\55",
            "\12\67\7\uffff\32\55\6\uffff\1\u00bc\31\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00bd\6\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\13\55\1\u00c3\16\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00c4\25\55",
            "\12\67\7\uffff\32\55\6\uffff\2\55\1\u00c5\27\55",
            "\1\u00c6\1\uffff\12\u00a2",
            "\12\u00c7\7\uffff\32\54\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00c8\6\55",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\7\55\1\u00c9\22\55",
            "\12\u0085\7\uffff\32\u00a8\4\uffff\1\56\1\uffff\32\56",
            "\12\67\7\uffff\32\55\6\uffff\7\55\1\u00ca\22\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u00cb\21\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u00cc\7\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00cd\25\55",
            "\12\67\7\uffff\32\55\6\uffff\1\u00ce\31\55",
            "\12\56\7\uffff\32\142\4\uffff\1\56\1\uffff\10\142\1\u00cf"+
            "\21\142",
            "\12\56\7\uffff\32\142\4\uffff\1\56\1\uffff\1\u00d0\31\142",
            "\12\67\7\uffff\32\55\6\uffff\1\u00d1\31\55",
            "\12\67\7\uffff\32\55\6\uffff\2\55\1\u00d2\27\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00d3\25\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u00d4\21\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\u00d5\14\55",
            "\12\67\7\uffff\32\55\6\uffff\1\55\1\u00d6\30\55",
            "\12\67\7\uffff\32\55\6\uffff\1\55\1\u00d7\30\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u00d8\21\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u00d9\10\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00da\6\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00db\6\55",
            "\12\67\7\uffff\32\55\6\uffff\30\55\1\u00dc\1\55",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00dd\25\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00df\6\55",
            "",
            "\12\u00c7\7\uffff\32\141\4\uffff\1\56\1\uffff\32\142",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00e2\25\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00e3\6\55",
            "\12\67\7\uffff\32\55\6\uffff\2\55\1\u00e4\27\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u00e5\7\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00e6\6\55",
            "\12\56\7\uffff\32\142\4\uffff\1\56\1\uffff\15\142\1\u00e7"+
            "\14\142",
            "\12\56\7\uffff\32\142\4\uffff\1\56\1\uffff\27\142\1\u00e8"+
            "\2\142",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u00e9\6\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u00ea\10\55",
            "\12\67\7\uffff\32\55\6\uffff\21\55\1\u00eb\10\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\u00ec\14\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\13\55\1\u00ee\16\55",
            "\12\67\7\uffff\32\55\6\uffff\13\55\1\u00ef\16\55",
            "\12\67\7\uffff\32\55\6\uffff\25\55\1\u00f0\4\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u00f3\21\55",
            "\12\67\7\uffff\32\55\6\uffff\17\55\1\u00f4\12\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u00f5\7\55",
            "",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\u00f7\14\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u00f8\21\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00fb\25\55",
            "\12\56\7\uffff\32\142\4\uffff\1\56\1\uffff\32\142",
            "\12\56\7\uffff\32\142\4\uffff\1\56\1\uffff\32\142",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u00fe\25\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u00ff\21\55",
            "\12\67\7\uffff\32\55\6\uffff\10\55\1\u0100\21\55",
            "\12\67\7\uffff\32\55\6\uffff\6\55\1\u0101\23\55",
            "",
            "\12\67\7\uffff\32\55\6\uffff\30\55\1\u0102\1\55",
            "\12\67\7\uffff\32\55\6\uffff\30\55\1\u0103\1\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u0104\25\55",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\u0105\13\55",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u0106\25\55",
            "\1\u0107\17\uffff\12\67\7\uffff\32\55\6\uffff\32\55",
            "",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\31\55\1\u0109",
            "",
            "",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\3\55\1\u010b\26\55",
            "\12\67\7\uffff\32\55\6\uffff\17\55\1\u010c\12\55",
            "\12\67\7\uffff\32\55\6\uffff\16\55\1\u010d\13\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\1\u010f\17\uffff\12\67\7\uffff\32\55\6\uffff\32\55",
            "\1\u0110\17\uffff\12\67\7\uffff\32\55\6\uffff\32\55",
            "\1\u0111\17\uffff\12\67\7\uffff\32\55\6\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\15\55\1\u0112\14\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u0113\7\55",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\4\55\1\u0114\25\55",
            "",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\23\55\1\u0116\6\55",
            "\12\67\7\uffff\32\55\6\uffff\24\55\1\u0117\5\55",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u0118\7\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "\12\67\7\uffff\32\55\6\uffff\22\55\1\u011c\7\55",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "",
            "",
            "",
            "\12\67\7\uffff\32\55\4\uffff\1\56\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_HGNCGENE | RULE_INPUT | RULE_REFSEQ | RULE_ASSEMBLY | RULE_HGVSEXPR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_35 = input.LA(1);

                        s = -1;
                        if ( ((LA28_35>='\u0000' && LA28_35<='\uFFFF')) ) {s = 91;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='S') ) {s = 1;}

                        else if ( (LA28_0=='P') ) {s = 2;}

                        else if ( (LA28_0=='A') ) {s = 3;}

                        else if ( (LA28_0=='M') ) {s = 4;}

                        else if ( (LA28_0=='t') ) {s = 5;}

                        else if ( (LA28_0=='d') ) {s = 6;}

                        else if ( (LA28_0=='b') ) {s = 7;}

                        else if ( (LA28_0=='p') ) {s = 8;}

                        else if ( (LA28_0=='F') ) {s = 9;}

                        else if ( (LA28_0=='R') ) {s = 10;}

                        else if ( (LA28_0=='v') ) {s = 11;}

                        else if ( (LA28_0=='g') ) {s = 12;}

                        else if ( (LA28_0=='f') ) {s = 13;}

                        else if ( (LA28_0=='a') ) {s = 14;}

                        else if ( (LA28_0=='w') ) {s = 15;}

                        else if ( (LA28_0=='h') ) {s = 16;}

                        else if ( (LA28_0=='r') ) {s = 17;}

                        else if ( (LA28_0=='s') ) {s = 18;}

                        else if ( (LA28_0=='[') ) {s = 19;}

                        else if ( (LA28_0==',') ) {s = 20;}

                        else if ( (LA28_0==']') ) {s = 21;}

                        else if ( (LA28_0=='e') ) {s = 22;}

                        else if ( (LA28_0==':') ) {s = 23;}

                        else if ( (LA28_0=='c') ) {s = 24;}

                        else if ( (LA28_0=='-') ) {s = 25;}

                        else if ( (LA28_0=='.') ) {s = 26;}

                        else if ( (LA28_0=='N') ) {s = 27;}

                        else if ( (LA28_0=='i') ) {s = 28;}

                        else if ( (LA28_0=='H') ) {s = 29;}

                        else if ( ((LA28_0>='B' && LA28_0<='E')||LA28_0=='G'||(LA28_0>='I' && LA28_0<='L')||LA28_0=='O'||LA28_0=='Q'||(LA28_0>='T' && LA28_0<='Z')) ) {s = 30;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 31;}

                        else if ( ((LA28_0>='j' && LA28_0<='o')||LA28_0=='q'||LA28_0=='u'||(LA28_0>='x' && LA28_0<='z')) ) {s = 32;}

                        else if ( (LA28_0=='^') ) {s = 33;}

                        else if ( (LA28_0=='_') ) {s = 34;}

                        else if ( (LA28_0=='\"') ) {s = 35;}

                        else if ( (LA28_0=='\'') ) {s = 36;}

                        else if ( (LA28_0=='/') ) {s = 37;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 38;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='!'||(LA28_0>='#' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='+')||(LA28_0>=';' && LA28_0<='@')||LA28_0=='\\'||LA28_0=='`'||(LA28_0>='{' && LA28_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( ((LA28_36>='\u0000' && LA28_36<='\uFFFF')) ) {s = 91;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}