package fr.univartois.cril.xtext2.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlsLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=11;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=5;
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
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int RULE_NEGATIVE_INTEGER=6;

    // delegates
    // delegators

    public InternalAlsLexer() {;} 
    public InternalAlsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAlsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:11:7: ( 'abstract' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:11:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:12:7: ( 'lone' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:12:9: 'lone'
            {
            match("lone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:13:7: ( 'one' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:13:9: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:14:7: ( 'some' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:14:9: 'some'
            {
            match("some"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:15:7: ( 'private' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:15:9: 'private'
            {
            match("private"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:16:7: ( 'univ' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:16:9: 'univ'
            {
            match("univ"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:17:7: ( 'Int' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:17:9: 'Int'
            {
            match("Int"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:18:7: ( 'seq/Int' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:18:9: 'seq/Int'
            {
            match("seq/Int"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:19:7: ( 'this' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:19:9: 'this'
            {
            match("this"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:20:7: ( '!' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:20:9: '!'
            {
            match('!'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21:7: ( 'not' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21:9: 'not'
            {
            match("not"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:22:7: ( '=>' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:22:9: '=>'
            {
            match("=>"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:23:7: ( 'implies' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:23:9: 'implies'
            {
            match("implies"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:24:7: ( 'fun/add' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:24:9: 'fun/add'
            {
            match("fun/add"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:25:7: ( 'fun/sub' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:25:9: 'fun/sub'
            {
            match("fun/sub"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:26:7: ( 'fun/mul' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:26:9: 'fun/mul'
            {
            match("fun/mul"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:27:7: ( 'fun/div' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:27:9: 'fun/div'
            {
            match("fun/div"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:28:7: ( 'fun/rem' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:28:9: 'fun/rem'
            {
            match("fun/rem"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:29:7: ( 'fun/min' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:29:9: 'fun/min'
            {
            match("fun/min"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:30:7: ( 'fun/max' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:30:9: 'fun/max'
            {
            match("fun/max"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:31:7: ( 'fun/next' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:31:9: 'fun/next'
            {
            match("fun/next"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:32:7: ( 'all' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:32:9: 'all'
            {
            match("all"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:33:7: ( 'sum' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:33:9: 'sum'
            {
            match("sum"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:34:7: ( '||' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:34:9: '||'
            {
            match("||"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:35:7: ( 'or' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:35:9: 'or'
            {
            match("or"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:36:7: ( '&&' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:36:9: '&&'
            {
            match("&&"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:37:7: ( 'and' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:37:9: 'and'
            {
            match("and"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:38:7: ( '&' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:38:9: '&'
            {
            match('&'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:39:7: ( '<=>' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:39:9: '<=>'
            {
            match("<=>"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:40:7: ( 'iff' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:40:9: 'iff'
            {
            match("iff"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:41:7: ( '+' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:41:9: '+'
            {
            match('+'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:42:7: ( '-' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:42:9: '-'
            {
            match('-'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:43:7: ( '++' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:43:9: '++'
            {
            match("++"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:44:7: ( '<:' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:44:9: '<:'
            {
            match("<:"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:45:7: ( ':>' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:45:9: ':>'
            {
            match(":>"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:46:7: ( '<<' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:46:9: '<<'
            {
            match("<<"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:47:7: ( '>>' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:47:9: '>>'
            {
            match(">>"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:48:7: ( '>>>' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:48:9: '>>>'
            {
            match(">>>"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:49:7: ( 'set' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:49:9: 'set'
            {
            match("set"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:50:7: ( 'seq' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:50:9: 'seq'
            {
            match("seq"); 


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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:51:7: ( '#' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:51:9: '#'
            {
            match('#'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:52:7: ( '~' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:52:9: '~'
            {
            match('~'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:53:7: ( '*' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:53:9: '*'
            {
            match('*'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:54:7: ( '^' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:54:9: '^'
            {
            match('^'); 

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:55:7: ( 'no' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:55:9: 'no'
            {
            match("no"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:56:7: ( '=' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:56:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:57:7: ( 'in' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:57:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:58:7: ( '<' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:58:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:59:7: ( '>' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:59:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:60:7: ( '=<' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:60:9: '=<'
            {
            match("=<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:61:7: ( '<=' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:61:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:62:7: ( '>=' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:62:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:63:7: ( 'module' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:63:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:64:7: ( '/' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:64:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:65:7: ( 'as' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:65:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:66:7: ( 'fun' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:66:9: 'fun'
            {
            match("fun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:67:7: ( 'pred' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:67:9: 'pred'
            {
            match("pred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:68:7: ( 'sig' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:68:9: 'sig'
            {
            match("sig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:69:7: ( '{' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:69:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:70:7: ( '}' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:70:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:71:7: ( 'run' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:71:9: 'run'
            {
            match("run"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:72:7: ( ':' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:72:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:73:7: ( 'check' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:73:9: 'check'
            {
            match("check"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:74:7: ( 'extends' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:74:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:75:7: ( 'else' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:75:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:76:7: ( '[' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:76:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:77:7: ( ']' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:77:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:78:7: ( '@' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:78:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:79:7: ( 'int' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:79:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:80:7: ( 'disj' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:80:9: 'disj'
            {
            match("disj"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:81:7: ( '(' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:81:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:82:7: ( ')' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:82:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:83:7: ( '|' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:83:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:84:7: ( 'open' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:84:9: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:85:7: ( 'fact' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:85:9: 'fact'
            {
            match("fact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:86:7: ( 'assert' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:86:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:87:7: ( 'enum' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:87:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:88:7: ( 'let' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:88:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:89:7: ( 'exactly' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:89:9: 'exactly'
            {
            match("exactly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:90:7: ( ',' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:90:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:91:7: ( 'for' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:91:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:92:7: ( 'but' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:92:9: 'but'
            {
            match("but"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:93:7: ( 'expect' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:93:9: 'expect'
            {
            match("expect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:94:7: ( 'none' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:94:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:95:7: ( 'iden' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:95:9: 'iden'
            {
            match("iden"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:96:7: ( 'pred/totalOrder' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:96:9: 'pred/totalOrder'
            {
            match("pred/totalOrder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:97:7: ( '->' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:97:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:98:8: ( '.' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:98:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "RULE_NEGATIVE_INTEGER"
    public final void mRULE_NEGATIVE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_NEGATIVE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21184:23: ( '-' RULE_INT )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21184:25: '-' RULE_INT
            {
            match('-'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEGATIVE_INTEGER"

    // $ANTLR start "RULE_DOC_COMMENT"
    public final void mRULE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21186:18: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21186:20: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21186:26: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21186:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "RULE_DOC_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21188:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21188:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21188:31: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21188:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:17: ( ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? | '--' ( options {greedy=false; } : . )* '\\n' ) )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? | '--' ( options {greedy=false; } : . )* '\\n' )
            {
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? | '--' ( options {greedy=false; } : . )* '\\n' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                alt7=1;
            }
            else if ( (LA7_0=='-') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:20: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
                    {
                    match("//"); 

                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:25: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:25: ~ ( ( '\\n' | '\\r' ) )
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
                    	    break loop3;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:41: ( ( '\\r' )? '\\n' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:42: ( '\\r' )? '\\n'
                            {
                            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:42: ( '\\r' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='\r') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:42: '\\r'
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
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:55: '--' ( options {greedy=false; } : . )* '\\n'
                    {
                    match("--"); 

                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:60: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\n') ) {
                            alt6=2;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21190:88: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21192:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21192:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21192:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21194:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\'' | '\"' )* )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21194:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\'' | '\"' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21194:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:
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
            	    break loop9;
                }
            } while (true);

            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21194:69: ( '\\'' | '\"' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\"'||LA10_0=='\'') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:
            	    {
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21196:10: ( ( '0' .. '9' )+ )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21196:12: ( '0' .. '9' )+
            {
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21196:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21196:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21198:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21200:16: ( . )
            // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:21200:18: .
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
        // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_NEGATIVE_INTEGER | RULE_DOC_COMMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER )
        int alt15=97;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:430: T__83
                {
                mT__83(); 

                }
                break;
            case 72 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:436: T__84
                {
                mT__84(); 

                }
                break;
            case 73 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:442: T__85
                {
                mT__85(); 

                }
                break;
            case 74 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:448: T__86
                {
                mT__86(); 

                }
                break;
            case 75 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:454: T__87
                {
                mT__87(); 

                }
                break;
            case 76 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:460: T__88
                {
                mT__88(); 

                }
                break;
            case 77 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:466: T__89
                {
                mT__89(); 

                }
                break;
            case 78 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:472: T__90
                {
                mT__90(); 

                }
                break;
            case 79 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:478: T__91
                {
                mT__91(); 

                }
                break;
            case 80 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:484: T__92
                {
                mT__92(); 

                }
                break;
            case 81 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:490: T__93
                {
                mT__93(); 

                }
                break;
            case 82 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:496: T__94
                {
                mT__94(); 

                }
                break;
            case 83 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:502: T__95
                {
                mT__95(); 

                }
                break;
            case 84 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:508: T__96
                {
                mT__96(); 

                }
                break;
            case 85 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:514: T__97
                {
                mT__97(); 

                }
                break;
            case 86 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:520: T__98
                {
                mT__98(); 

                }
                break;
            case 87 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:526: T__99
                {
                mT__99(); 

                }
                break;
            case 88 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:532: T__100
                {
                mT__100(); 

                }
                break;
            case 89 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:539: RULE_NEGATIVE_INTEGER
                {
                mRULE_NEGATIVE_INTEGER(); 

                }
                break;
            case 90 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:561: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;
            case 91 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:578: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 92 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:594: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 93 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:610: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 94 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:618: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 95 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:626: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 96 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:635: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 97 :
                // ../fr.univartois.cril.xtext2.ui/src-gen/fr/univartois/cril/xtext2/ui/contentassist/antlr/internal/InternalAls.g:1:647: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\10\63\1\uffff\1\63\1\105\2\63\1\116\1\120\1\124\1\126\1"+
        "\131\1\134\1\137\4\uffff\1\63\1\146\2\uffff\3\63\3\uffff\1\63\3"+
        "\uffff\1\63\4\uffff\2\56\1\uffff\3\63\1\176\1\uffff\3\63\1\u0082"+
        "\11\63\1\uffff\1\u0090\3\uffff\2\63\1\u0094\4\63\4\uffff\1\u009a"+
        "\13\uffff\1\u009c\6\uffff\1\63\4\uffff\5\63\3\uffff\1\63\3\uffff"+
        "\1\63\4\uffff\1\63\1\u00aa\1\u00ab\1\63\1\uffff\1\63\1\u00ae\1\u00af"+
        "\1\uffff\2\63\1\u00b3\1\u00b4\1\u00b5\1\u00b6\3\63\1\u00ba\1\63"+
        "\1\u00bc\1\63\1\uffff\1\63\1\u00bf\1\u00c0\1\uffff\1\63\1\u00c3"+
        "\1\63\1\u00c5\4\uffff\1\63\2\uffff\1\u00c7\7\63\1\u00cf\1\63\2\uffff"+
        "\1\63\1\u00d2\2\uffff\1\u00d3\1\u00d4\5\uffff\1\63\1\u00d7\1\u00d8"+
        "\1\uffff\1\u00d9\1\uffff\1\u00da\1\63\2\uffff\1\u00dc\2\uffff\1"+
        "\u00e3\1\uffff\1\63\1\uffff\4\63\1\u00e9\1\u00ea\1\u00eb\1\uffff"+
        "\2\63\3\uffff\1\63\5\uffff\1\63\10\uffff\1\63\1\u00f4\3\63\3\uffff"+
        "\1\63\1\u00f9\2\63\3\uffff\1\u00fc\1\uffff\2\63\1\u00ff\1\63\1\uffff"+
        "\1\u0101\1\u0102\1\uffff\1\u0103\1\u0104\1\uffff\1\u0105\5\uffff";
    static final String DFA15_eofS =
        "\u0106\uffff";
    static final String DFA15_minS =
        "\1\0\1\142\1\145\1\156\1\145\1\162\2\156\1\150\1\uffff\1\157\1\74"+
        "\1\144\1\141\1\174\1\46\1\72\1\53\1\55\1\76\1\75\4\uffff\1\157\1"+
        "\52\2\uffff\1\165\1\150\1\154\3\uffff\1\151\3\uffff\1\165\4\uffff"+
        "\2\0\1\uffff\1\163\1\154\1\144\1\42\1\uffff\1\156\1\164\1\145\1"+
        "\42\1\145\1\155\1\161\1\155\1\147\1\145\1\151\1\164\1\151\1\uffff"+
        "\1\42\3\uffff\1\160\1\146\1\42\1\145\1\156\1\143\1\162\4\uffff\1"+
        "\76\13\uffff\1\76\6\uffff\1\144\1\0\3\uffff\1\156\1\145\1\141\1"+
        "\163\1\165\3\uffff\1\163\3\uffff\1\164\4\uffff\1\164\2\42\1\145"+
        "\1\uffff\1\145\2\42\1\uffff\1\156\1\145\4\42\1\166\1\144\1\166\1"+
        "\42\1\163\1\42\1\145\1\uffff\1\154\2\42\1\uffff\1\156\1\42\1\164"+
        "\1\42\4\uffff\1\165\2\uffff\1\42\1\143\1\145\1\143\2\145\1\155\1"+
        "\152\1\42\1\162\2\uffff\1\162\1\42\2\uffff\2\42\5\uffff\1\141\2"+
        "\42\1\uffff\1\42\1\uffff\1\42\1\151\2\uffff\1\42\1\141\1\uffff\1"+
        "\42\1\uffff\1\154\1\uffff\1\153\1\156\1\164\1\143\3\42\1\uffff\1"+
        "\141\1\164\3\uffff\1\164\5\uffff\1\145\3\uffff\1\141\4\uffff\1\145"+
        "\1\42\1\144\1\154\1\164\3\uffff\1\143\1\42\1\145\1\163\3\uffff\1"+
        "\42\1\uffff\1\163\1\171\1\42\1\164\1\uffff\2\42\1\uffff\2\42\1\uffff"+
        "\1\42\5\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\163\1\157\1\162\1\165\1\162\2\156\1\150\1\uffff\1\157"+
        "\1\76\1\156\1\165\1\174\1\46\1\75\1\53\3\76\4\uffff\1\157\1\57\2"+
        "\uffff\1\165\1\150\1\170\3\uffff\1\151\3\uffff\1\165\4\uffff\2\uffff"+
        "\1\uffff\1\163\1\154\1\144\1\172\1\uffff\1\156\1\164\1\145\1\172"+
        "\1\145\1\155\1\164\1\155\1\147\2\151\1\164\1\151\1\uffff\1\172\3"+
        "\uffff\1\160\1\146\1\172\1\145\1\156\1\143\1\162\4\uffff\1\76\13"+
        "\uffff\1\76\6\uffff\1\144\1\uffff\3\uffff\1\156\1\145\1\164\1\163"+
        "\1\165\3\uffff\1\163\3\uffff\1\164\4\uffff\1\164\2\172\1\145\1\uffff"+
        "\1\145\2\172\1\uffff\1\156\1\145\4\172\1\166\1\144\1\166\1\172\1"+
        "\163\1\172\1\145\1\uffff\1\154\2\172\1\uffff\1\156\1\172\1\164\1"+
        "\172\4\uffff\1\165\2\uffff\1\172\1\143\1\145\1\143\2\145\1\155\1"+
        "\152\1\172\1\162\2\uffff\1\162\1\172\2\uffff\2\172\5\uffff\1\141"+
        "\2\172\1\uffff\1\172\1\uffff\1\172\1\151\2\uffff\1\172\1\163\1\uffff"+
        "\1\172\1\uffff\1\154\1\uffff\1\153\1\156\1\164\1\143\3\172\1\uffff"+
        "\1\141\1\164\3\uffff\1\164\5\uffff\1\145\3\uffff\1\165\4\uffff\1"+
        "\145\1\172\1\144\1\154\1\164\3\uffff\1\143\1\172\1\145\1\163\3\uffff"+
        "\1\172\1\uffff\1\163\1\171\1\172\1\164\1\uffff\2\172\1\uffff\2\172"+
        "\1\uffff\1\172\5\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\12\13\uffff\1\51\1\52\1\53\1\54\2\uffff\1\73\1\74\3"+
        "\uffff\1\102\1\103\1\104\1\uffff\1\107\1\110\1\120\1\uffff\1\130"+
        "\1\135\1\136\1\137\2\uffff\1\141\4\uffff\1\136\15\uffff\1\12\1\uffff"+
        "\1\14\1\62\1\56\7\uffff\1\30\1\111\1\32\1\34\1\uffff\1\42\1\44\1"+
        "\60\1\41\1\37\1\127\1\134\1\40\1\131\1\43\1\76\1\uffff\1\64\1\61"+
        "\1\51\1\52\1\53\1\54\2\uffff\1\66\1\73\1\74\5\uffff\1\102\1\103"+
        "\1\104\1\uffff\1\107\1\110\1\120\1\uffff\1\130\1\135\1\137\1\140"+
        "\4\uffff\1\67\3\uffff\1\31\15\uffff\1\55\3\uffff\1\57\4\uffff\1"+
        "\35\1\63\1\46\1\45\1\uffff\1\132\1\133\12\uffff\1\26\1\33\2\uffff"+
        "\1\116\1\3\2\uffff\1\10\1\50\1\47\1\27\1\72\3\uffff\1\7\1\uffff"+
        "\1\13\2\uffff\1\36\1\105\2\uffff\1\70\1\uffff\1\121\1\uffff\1\75"+
        "\7\uffff\1\122\2\uffff\1\2\1\112\1\4\1\uffff\1\126\1\71\1\6\1\11"+
        "\1\124\1\uffff\1\125\1\16\1\17\1\uffff\1\21\1\22\1\25\1\113\5\uffff"+
        "\1\101\1\115\1\106\4\uffff\1\20\1\23\1\24\1\uffff\1\77\4\uffff\1"+
        "\114\2\uffff\1\65\2\uffff\1\123\1\uffff\1\5\1\15\1\100\1\117\1\1";
    static final String DFA15_specialS =
        "\1\3\53\uffff\1\2\1\1\67\uffff\1\0\u00a0\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\56\2\51\2\56\1\51\22\56\1\51\1\11\1\54\1\25\2\56\1\17\1"+
            "\55\1\44\1\45\1\27\1\21\1\46\1\22\1\50\1\32\12\53\1\23\1\56"+
            "\1\20\1\13\1\24\1\56\1\42\10\52\1\7\21\52\1\40\1\56\1\41\1\30"+
            "\1\52\1\56\1\1\1\47\1\36\1\43\1\37\1\15\2\52\1\14\2\52\1\2\1"+
            "\31\1\12\1\3\1\5\1\52\1\35\1\4\1\10\1\6\5\52\1\33\1\16\1\34"+
            "\1\26\uff81\56",
            "\1\57\11\uffff\1\60\1\uffff\1\61\4\uffff\1\62",
            "\1\65\11\uffff\1\64",
            "\1\66\1\uffff\1\70\1\uffff\1\67",
            "\1\72\3\uffff\1\74\5\uffff\1\71\5\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\1\102",
            "\1\104\1\uffff\1\103",
            "\1\111\1\uffff\1\107\6\uffff\1\106\1\110",
            "\1\113\15\uffff\1\114\5\uffff\1\112",
            "\1\115",
            "\1\117",
            "\1\122\1\uffff\1\123\1\121",
            "\1\125",
            "\1\130\2\uffff\12\132\4\uffff\1\127",
            "\1\133",
            "\1\136\1\135",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145\4\uffff\1\130",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\154\1\uffff\1\155\11\uffff\1\153",
            "",
            "",
            "",
            "\1\161",
            "",
            "",
            "",
            "\1\165",
            "",
            "",
            "",
            "",
            "\0\171",
            "\0\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\22\63\1\175\7\63",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\2\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u008a\3\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\15\63\1\u008f\5\63\1\u008e\6\63",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u0093\6\63",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d",
            "\52\u009f\1\u009e\uffd5\u009f",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a3\16\uffff\1\u00a4\3\uffff\1\u00a2",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "",
            "\1\u00a7",
            "",
            "",
            "",
            "\1\u00a8",
            "",
            "",
            "",
            "",
            "\1\u00a9",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\63\4\uffff\1\63\7\uffff\1\u00b2\12\63\7\uffff\32\63\4\uffff"+
            "\1\63\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00bb",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\u00c1",
            "\1\63\4\uffff\1\63\7\uffff\1\u00c2\12\63\7\uffff\32\63\4\uffff"+
            "\1\63\1\uffff\32\63",
            "\1\u00c4",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00d0",
            "",
            "",
            "\1\u00d1",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d5",
            "\1\63\4\uffff\1\63\7\uffff\1\u00d6\12\63\7\uffff\32\63\4\uffff"+
            "\1\63\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00db",
            "",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00dd\2\uffff\1\u00e0\10\uffff\1\u00df\1\u00e2\3\uffff\1"+
            "\u00e1\1\u00de",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "",
            "\1\u00ee",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ef",
            "",
            "",
            "",
            "\1\u00f2\7\uffff\1\u00f1\13\uffff\1\u00f0",
            "",
            "",
            "",
            "",
            "\1\u00f3",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "",
            "",
            "\1\u00f8",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\u0100",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\63\4\uffff\1\63\10\uffff\12\63\7\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_NEGATIVE_INTEGER | RULE_DOC_COMMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_101 = input.LA(1);

                        s = -1;
                        if ( (LA15_101=='*') ) {s = 158;}

                        else if ( ((LA15_101>='\u0000' && LA15_101<=')')||(LA15_101>='+' && LA15_101<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_45 = input.LA(1);

                        s = -1;
                        if ( ((LA15_45>='\u0000' && LA15_45<='\uFFFF')) ) {s = 121;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_44 = input.LA(1);

                        s = -1;
                        if ( ((LA15_44>='\u0000' && LA15_44<='\uFFFF')) ) {s = 121;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='a') ) {s = 1;}

                        else if ( (LA15_0=='l') ) {s = 2;}

                        else if ( (LA15_0=='o') ) {s = 3;}

                        else if ( (LA15_0=='s') ) {s = 4;}

                        else if ( (LA15_0=='p') ) {s = 5;}

                        else if ( (LA15_0=='u') ) {s = 6;}

                        else if ( (LA15_0=='I') ) {s = 7;}

                        else if ( (LA15_0=='t') ) {s = 8;}

                        else if ( (LA15_0=='!') ) {s = 9;}

                        else if ( (LA15_0=='n') ) {s = 10;}

                        else if ( (LA15_0=='=') ) {s = 11;}

                        else if ( (LA15_0=='i') ) {s = 12;}

                        else if ( (LA15_0=='f') ) {s = 13;}

                        else if ( (LA15_0=='|') ) {s = 14;}

                        else if ( (LA15_0=='&') ) {s = 15;}

                        else if ( (LA15_0=='<') ) {s = 16;}

                        else if ( (LA15_0=='+') ) {s = 17;}

                        else if ( (LA15_0=='-') ) {s = 18;}

                        else if ( (LA15_0==':') ) {s = 19;}

                        else if ( (LA15_0=='>') ) {s = 20;}

                        else if ( (LA15_0=='#') ) {s = 21;}

                        else if ( (LA15_0=='~') ) {s = 22;}

                        else if ( (LA15_0=='*') ) {s = 23;}

                        else if ( (LA15_0=='^') ) {s = 24;}

                        else if ( (LA15_0=='m') ) {s = 25;}

                        else if ( (LA15_0=='/') ) {s = 26;}

                        else if ( (LA15_0=='{') ) {s = 27;}

                        else if ( (LA15_0=='}') ) {s = 28;}

                        else if ( (LA15_0=='r') ) {s = 29;}

                        else if ( (LA15_0=='c') ) {s = 30;}

                        else if ( (LA15_0=='e') ) {s = 31;}

                        else if ( (LA15_0=='[') ) {s = 32;}

                        else if ( (LA15_0==']') ) {s = 33;}

                        else if ( (LA15_0=='@') ) {s = 34;}

                        else if ( (LA15_0=='d') ) {s = 35;}

                        else if ( (LA15_0=='(') ) {s = 36;}

                        else if ( (LA15_0==')') ) {s = 37;}

                        else if ( (LA15_0==',') ) {s = 38;}

                        else if ( (LA15_0=='b') ) {s = 39;}

                        else if ( (LA15_0=='.') ) {s = 40;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 41;}

                        else if ( ((LA15_0>='A' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='q'||(LA15_0>='v' && LA15_0<='z')) ) {s = 42;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 43;}

                        else if ( (LA15_0=='\"') ) {s = 44;}

                        else if ( (LA15_0=='\'') ) {s = 45;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='$' && LA15_0<='%')||LA15_0==';'||LA15_0=='?'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='\u007F' && LA15_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}