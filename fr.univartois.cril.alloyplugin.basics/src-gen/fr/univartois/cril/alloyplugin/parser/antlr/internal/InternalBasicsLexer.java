package fr.univartois.cril.alloyplugin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBasicsLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=5;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=12;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=4;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int RULE_COMMENT=7;
    public static final int T43=43;
    public static final int Tokens=90;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int T88=88;
    public static final int T89=89;
    public static final int RULE_STRING=8;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T81=81;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=11;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T83=83;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T82=82;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int RULE_INTEGER=6;
    public static final int T58=58;
    public static final int T57=57;
    public InternalBasicsLexer() {;} 
    public InternalBasicsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:10:5: ( 'module' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:10:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:11:5: ( '[' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:11:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:12:5: ( 'exactly' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:12:7: 'exactly'
            {
            match("exactly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:13:5: ( ',' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:13:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:14:5: ( ']' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:14:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:15:5: ( 'private' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:15:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:16:5: ( 'open' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:16:7: 'open'
            {
            match("open"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:17:5: ( 'as' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:17:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:18:5: ( 'fact' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:18:7: 'fact'
            {
            match("fact"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:19:5: ( 'assert' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:19:7: 'assert'
            {
            match("assert"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:20:5: ( 'fun' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:20:7: 'fun'
            {
            match("fun"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:21:5: ( '.' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:21:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:22:5: ( '(' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:22:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:23:5: ( ')' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:23:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:24:5: ( ':' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:24:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:25:5: ( 'pred' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:25:7: 'pred'
            {
            match("pred"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:26:5: ( 'run' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:26:7: 'run'
            {
            match("run"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:27:5: ( 'check' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:27:7: 'check'
            {
            match("check"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:28:5: ( 'for' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:28:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:29:5: ( 'but' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:29:7: 'but'
            {
            match("but"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:30:5: ( 'expect' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:30:7: 'expect'
            {
            match("expect"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:31:5: ( '0' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:31:7: '0'
            {
            match('0'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:32:5: ( '1' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:32:7: '1'
            {
            match('1'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:33:5: ( 'int' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:33:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:34:5: ( 'seq' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:34:7: 'seq'
            {
            match("seq"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:35:5: ( 'enum' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:35:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:36:5: ( '{' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:36:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:37:5: ( '}' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:37:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:38:5: ( 'sig' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:38:7: 'sig'
            {
            match("sig"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:39:5: ( 'abstract' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:39:7: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:40:5: ( 'lone' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:40:7: 'lone'
            {
            match("lone"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:41:5: ( 'one' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:41:7: 'one'
            {
            match("one"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:42:5: ( 'some' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:42:7: 'some'
            {
            match("some"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:43:5: ( 'extends' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:43:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:44:5: ( 'in' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:44:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:45:5: ( '+' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:45:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:46:5: ( '&' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:46:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:47:5: ( '-' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:47:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:48:5: ( '||' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:48:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:49:5: ( 'or' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:49:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:50:5: ( '&&' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:50:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:51:5: ( 'and' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:51:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:52:5: ( '<=>' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:52:7: '<=>'
            {
            match("<=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:53:5: ( 'iff' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:53:7: 'iff'
            {
            match("iff"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:54:5: ( '++' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:54:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:55:5: ( '<:' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:55:7: '<:'
            {
            match("<:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:56:5: ( ':>' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:56:7: ':>'
            {
            match(":>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:57:5: ( '<<' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:57:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:58:5: ( '>>' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:58:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:59:5: ( '>>>' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:59:7: '>>>'
            {
            match(">>>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:60:5: ( '!' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:60:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:61:5: ( 'not' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:61:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:62:5: ( '=' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:62:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:63:5: ( '<' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:63:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:64:5: ( '>' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:64:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:65:5: ( '<=' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:65:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:66:5: ( '=>' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:66:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:67:5: ( 'let' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:67:7: 'let'
            {
            match("let"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:68:5: ( 'all' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:68:7: 'all'
            {
            match("all"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:69:5: ( 'sum' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:69:7: 'sum'
            {
            match("sum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:70:5: ( 'set' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:70:7: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:71:5: ( '#' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:71:7: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:72:5: ( '~' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:72:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:73:5: ( '*' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:73:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:74:5: ( '^' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:74:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:75:5: ( 'no' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:75:7: 'no'
            {
            match("no"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:76:5: ( 'none' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:76:7: 'none'
            {
            match("none"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:77:5: ( 'iden' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:77:7: 'iden'
            {
            match("iden"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:78:5: ( 'univ' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:78:7: 'univ'
            {
            match("univ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:79:5: ( 'Int' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:79:7: 'Int'
            {
            match("Int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:80:5: ( 'seq/Int' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:80:7: 'seq/Int'
            {
            match("seq/Int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:81:5: ( '@' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:81:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:82:5: ( 'disj' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:82:7: 'disj'
            {
            match("disj"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:83:5: ( '->' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:83:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:84:5: ( '|' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:84:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:85:5: ( 'this' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:85:7: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:86:5: ( '/' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:86:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start RULE_INTEGER
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3214:14: ( '-' RULE_INT )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3214:16: '-' RULE_INT
            {
            match('-'); 
            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INTEGER

    // $ANTLR start RULE_COMMENT
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3216:14: ( '--' ( options {greedy=false; } : . )* '\\n' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3216:16: '--' ( options {greedy=false; } : . )* '\\n'
            {
            match("--"); 

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3216:21: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3216:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMENT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3218:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\'' )* )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3218:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\'' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3218:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3218:69: ( '\\'' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3218:69: '\\''
            	    {
            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3220:10: ( ( '0' .. '9' )+ )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3220:12: ( '0' .. '9' )+
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3220:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3220:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3222:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3222:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3224:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3224:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3224:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3224:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3226:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3228:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3230:16: ( . )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3230:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | RULE_INTEGER | RULE_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=86;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='m') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='o') ) {
                int LA13_49 = input.LA(3);

                if ( (LA13_49=='d') ) {
                    int LA13_123 = input.LA(4);

                    if ( (LA13_123=='u') ) {
                        int LA13_166 = input.LA(5);

                        if ( (LA13_166=='l') ) {
                            int LA13_202 = input.LA(6);

                            if ( (LA13_202=='e') ) {
                                int LA13_221 = input.LA(7);

                                if ( (LA13_221=='\''||(LA13_221>='0' && LA13_221<='9')||(LA13_221>='A' && LA13_221<='Z')||LA13_221=='_'||(LA13_221>='a' && LA13_221<='z')) ) {
                                    alt13=80;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=80;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='[') ) {
            alt13=2;
        }
        else if ( (LA13_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA13_124 = input.LA(4);

                    if ( (LA13_124=='c') ) {
                        int LA13_167 = input.LA(5);

                        if ( (LA13_167=='t') ) {
                            int LA13_203 = input.LA(6);

                            if ( (LA13_203=='l') ) {
                                int LA13_222 = input.LA(7);

                                if ( (LA13_222=='y') ) {
                                    int LA13_230 = input.LA(8);

                                    if ( (LA13_230=='\''||(LA13_230>='0' && LA13_230<='9')||(LA13_230>='A' && LA13_230<='Z')||LA13_230=='_'||(LA13_230>='a' && LA13_230<='z')) ) {
                                        alt13=80;
                                    }
                                    else {
                                        alt13=3;}
                                }
                                else {
                                    alt13=80;}
                            }
                            else {
                                alt13=80;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                    }
                    break;
                case 't':
                    {
                    int LA13_125 = input.LA(4);

                    if ( (LA13_125=='e') ) {
                        int LA13_168 = input.LA(5);

                        if ( (LA13_168=='n') ) {
                            int LA13_204 = input.LA(6);

                            if ( (LA13_204=='d') ) {
                                int LA13_223 = input.LA(7);

                                if ( (LA13_223=='s') ) {
                                    int LA13_231 = input.LA(8);

                                    if ( (LA13_231=='\''||(LA13_231>='0' && LA13_231<='9')||(LA13_231>='A' && LA13_231<='Z')||LA13_231=='_'||(LA13_231>='a' && LA13_231<='z')) ) {
                                        alt13=80;
                                    }
                                    else {
                                        alt13=34;}
                                }
                                else {
                                    alt13=80;}
                            }
                            else {
                                alt13=80;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                    }
                    break;
                case 'p':
                    {
                    int LA13_126 = input.LA(4);

                    if ( (LA13_126=='e') ) {
                        int LA13_169 = input.LA(5);

                        if ( (LA13_169=='c') ) {
                            int LA13_205 = input.LA(6);

                            if ( (LA13_205=='t') ) {
                                int LA13_224 = input.LA(7);

                                if ( (LA13_224=='\''||(LA13_224>='0' && LA13_224<='9')||(LA13_224>='A' && LA13_224<='Z')||LA13_224=='_'||(LA13_224>='a' && LA13_224<='z')) ) {
                                    alt13=80;
                                }
                                else {
                                    alt13=21;}
                            }
                            else {
                                alt13=80;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                    }
                    break;
                default:
                    alt13=80;}

                }
                break;
            case 'n':
                {
                int LA13_53 = input.LA(3);

                if ( (LA13_53=='u') ) {
                    int LA13_127 = input.LA(4);

                    if ( (LA13_127=='m') ) {
                        int LA13_170 = input.LA(5);

                        if ( (LA13_170=='\''||(LA13_170>='0' && LA13_170<='9')||(LA13_170>='A' && LA13_170<='Z')||LA13_170=='_'||(LA13_170>='a' && LA13_170<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=26;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
                }
                break;
            default:
                alt13=80;}

        }
        else if ( (LA13_0==',') ) {
            alt13=4;
        }
        else if ( (LA13_0==']') ) {
            alt13=5;
        }
        else if ( (LA13_0=='p') ) {
            int LA13_6 = input.LA(2);

            if ( (LA13_6=='r') ) {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA13_128 = input.LA(4);

                    if ( (LA13_128=='v') ) {
                        int LA13_171 = input.LA(5);

                        if ( (LA13_171=='a') ) {
                            int LA13_207 = input.LA(6);

                            if ( (LA13_207=='t') ) {
                                int LA13_225 = input.LA(7);

                                if ( (LA13_225=='e') ) {
                                    int LA13_233 = input.LA(8);

                                    if ( (LA13_233=='\''||(LA13_233>='0' && LA13_233<='9')||(LA13_233>='A' && LA13_233<='Z')||LA13_233=='_'||(LA13_233>='a' && LA13_233<='z')) ) {
                                        alt13=80;
                                    }
                                    else {
                                        alt13=6;}
                                }
                                else {
                                    alt13=80;}
                            }
                            else {
                                alt13=80;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                    }
                    break;
                case 'e':
                    {
                    int LA13_129 = input.LA(4);

                    if ( (LA13_129=='d') ) {
                        int LA13_172 = input.LA(5);

                        if ( (LA13_172=='\''||(LA13_172>='0' && LA13_172<='9')||(LA13_172>='A' && LA13_172<='Z')||LA13_172=='_'||(LA13_172>='a' && LA13_172<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=16;}
                    }
                    else {
                        alt13=80;}
                    }
                    break;
                default:
                    alt13=80;}

            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA13_57 = input.LA(3);

                if ( (LA13_57=='e') ) {
                    int LA13_130 = input.LA(4);

                    if ( (LA13_130=='\''||(LA13_130>='0' && LA13_130<='9')||(LA13_130>='A' && LA13_130<='Z')||LA13_130=='_'||(LA13_130>='a' && LA13_130<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=32;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'r':
                {
                int LA13_58 = input.LA(3);

                if ( (LA13_58=='\''||(LA13_58>='0' && LA13_58<='9')||(LA13_58>='A' && LA13_58<='Z')||LA13_58=='_'||(LA13_58>='a' && LA13_58<='z')) ) {
                    alt13=80;
                }
                else {
                    alt13=40;}
                }
                break;
            case 'p':
                {
                int LA13_59 = input.LA(3);

                if ( (LA13_59=='e') ) {
                    int LA13_132 = input.LA(4);

                    if ( (LA13_132=='n') ) {
                        int LA13_174 = input.LA(5);

                        if ( (LA13_174=='\''||(LA13_174>='0' && LA13_174<='9')||(LA13_174>='A' && LA13_174<='Z')||LA13_174=='_'||(LA13_174>='a' && LA13_174<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=7;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
                }
                break;
            default:
                alt13=80;}

        }
        else if ( (LA13_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA13_60 = input.LA(3);

                if ( (LA13_60=='s') ) {
                    int LA13_133 = input.LA(4);

                    if ( (LA13_133=='t') ) {
                        int LA13_175 = input.LA(5);

                        if ( (LA13_175=='r') ) {
                            int LA13_210 = input.LA(6);

                            if ( (LA13_210=='a') ) {
                                int LA13_226 = input.LA(7);

                                if ( (LA13_226=='c') ) {
                                    int LA13_234 = input.LA(8);

                                    if ( (LA13_234=='t') ) {
                                        int LA13_239 = input.LA(9);

                                        if ( (LA13_239=='\''||(LA13_239>='0' && LA13_239<='9')||(LA13_239>='A' && LA13_239<='Z')||LA13_239=='_'||(LA13_239>='a' && LA13_239<='z')) ) {
                                            alt13=80;
                                        }
                                        else {
                                            alt13=30;}
                                    }
                                    else {
                                        alt13=80;}
                                }
                                else {
                                    alt13=80;}
                            }
                            else {
                                alt13=80;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'n':
                {
                int LA13_61 = input.LA(3);

                if ( (LA13_61=='d') ) {
                    int LA13_134 = input.LA(4);

                    if ( (LA13_134=='\''||(LA13_134>='0' && LA13_134<='9')||(LA13_134>='A' && LA13_134<='Z')||LA13_134=='_'||(LA13_134>='a' && LA13_134<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=42;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'l':
                {
                int LA13_62 = input.LA(3);

                if ( (LA13_62=='l') ) {
                    int LA13_135 = input.LA(4);

                    if ( (LA13_135=='\''||(LA13_135>='0' && LA13_135<='9')||(LA13_135>='A' && LA13_135<='Z')||LA13_135=='_'||(LA13_135>='a' && LA13_135<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=59;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 's':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA13_136 = input.LA(4);

                    if ( (LA13_136=='e') ) {
                        int LA13_178 = input.LA(5);

                        if ( (LA13_178=='r') ) {
                            int LA13_211 = input.LA(6);

                            if ( (LA13_211=='t') ) {
                                int LA13_227 = input.LA(7);

                                if ( (LA13_227=='\''||(LA13_227>='0' && LA13_227<='9')||(LA13_227>='A' && LA13_227<='Z')||LA13_227=='_'||(LA13_227>='a' && LA13_227<='z')) ) {
                                    alt13=80;
                                }
                                else {
                                    alt13=10;}
                            }
                            else {
                                alt13=80;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                    }
                    break;
                case '\'':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=80;
                    }
                    break;
                default:
                    alt13=8;}

                }
                break;
            default:
                alt13=80;}

        }
        else if ( (LA13_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA13_64 = input.LA(3);

                if ( (LA13_64=='n') ) {
                    int LA13_138 = input.LA(4);

                    if ( (LA13_138=='\''||(LA13_138>='0' && LA13_138<='9')||(LA13_138>='A' && LA13_138<='Z')||LA13_138=='_'||(LA13_138>='a' && LA13_138<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=11;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'a':
                {
                int LA13_65 = input.LA(3);

                if ( (LA13_65=='c') ) {
                    int LA13_139 = input.LA(4);

                    if ( (LA13_139=='t') ) {
                        int LA13_180 = input.LA(5);

                        if ( (LA13_180=='\''||(LA13_180>='0' && LA13_180<='9')||(LA13_180>='A' && LA13_180<='Z')||LA13_180=='_'||(LA13_180>='a' && LA13_180<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=9;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'o':
                {
                int LA13_66 = input.LA(3);

                if ( (LA13_66=='r') ) {
                    int LA13_140 = input.LA(4);

                    if ( (LA13_140=='\''||(LA13_140>='0' && LA13_140<='9')||(LA13_140>='A' && LA13_140<='Z')||LA13_140=='_'||(LA13_140>='a' && LA13_140<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=80;}
                }
                break;
            default:
                alt13=80;}

        }
        else if ( (LA13_0=='.') ) {
            alt13=12;
        }
        else if ( (LA13_0=='(') ) {
            alt13=13;
        }
        else if ( (LA13_0==')') ) {
            alt13=14;
        }
        else if ( (LA13_0==':') ) {
            int LA13_13 = input.LA(2);

            if ( (LA13_13=='>') ) {
                alt13=47;
            }
            else {
                alt13=15;}
        }
        else if ( (LA13_0=='r') ) {
            int LA13_14 = input.LA(2);

            if ( (LA13_14=='u') ) {
                int LA13_72 = input.LA(3);

                if ( (LA13_72=='n') ) {
                    int LA13_141 = input.LA(4);

                    if ( (LA13_141=='\''||(LA13_141>='0' && LA13_141<='9')||(LA13_141>='A' && LA13_141<='Z')||LA13_141=='_'||(LA13_141>='a' && LA13_141<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=17;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='c') ) {
            int LA13_15 = input.LA(2);

            if ( (LA13_15=='h') ) {
                int LA13_73 = input.LA(3);

                if ( (LA13_73=='e') ) {
                    int LA13_142 = input.LA(4);

                    if ( (LA13_142=='c') ) {
                        int LA13_183 = input.LA(5);

                        if ( (LA13_183=='k') ) {
                            int LA13_213 = input.LA(6);

                            if ( (LA13_213=='\''||(LA13_213>='0' && LA13_213<='9')||(LA13_213>='A' && LA13_213<='Z')||LA13_213=='_'||(LA13_213>='a' && LA13_213<='z')) ) {
                                alt13=80;
                            }
                            else {
                                alt13=18;}
                        }
                        else {
                            alt13=80;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='b') ) {
            int LA13_16 = input.LA(2);

            if ( (LA13_16=='u') ) {
                int LA13_74 = input.LA(3);

                if ( (LA13_74=='t') ) {
                    int LA13_143 = input.LA(4);

                    if ( (LA13_143=='\''||(LA13_143>='0' && LA13_143<='9')||(LA13_143>='A' && LA13_143<='Z')||LA13_143=='_'||(LA13_143>='a' && LA13_143<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=20;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='0') ) {
            int LA13_17 = input.LA(2);

            if ( ((LA13_17>='0' && LA13_17<='9')) ) {
                alt13=81;
            }
            else {
                alt13=22;}
        }
        else if ( (LA13_0=='1') ) {
            int LA13_18 = input.LA(2);

            if ( ((LA13_18>='0' && LA13_18<='9')) ) {
                alt13=81;
            }
            else {
                alt13=23;}
        }
        else if ( (LA13_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA13_144 = input.LA(4);

                    if ( (LA13_144=='\''||(LA13_144>='0' && LA13_144<='9')||(LA13_144>='A' && LA13_144<='Z')||LA13_144=='_'||(LA13_144>='a' && LA13_144<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=24;}
                    }
                    break;
                case '\'':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=80;
                    }
                    break;
                default:
                    alt13=35;}

                }
                break;
            case 'f':
                {
                int LA13_79 = input.LA(3);

                if ( (LA13_79=='f') ) {
                    int LA13_146 = input.LA(4);

                    if ( (LA13_146=='\''||(LA13_146>='0' && LA13_146<='9')||(LA13_146>='A' && LA13_146<='Z')||LA13_146=='_'||(LA13_146>='a' && LA13_146<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=44;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'd':
                {
                int LA13_80 = input.LA(3);

                if ( (LA13_80=='e') ) {
                    int LA13_147 = input.LA(4);

                    if ( (LA13_147=='n') ) {
                        int LA13_187 = input.LA(5);

                        if ( (LA13_187=='\''||(LA13_187>='0' && LA13_187<='9')||(LA13_187>='A' && LA13_187<='Z')||LA13_187=='_'||(LA13_187>='a' && LA13_187<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=68;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
                }
                break;
            default:
                alt13=80;}

        }
        else if ( (LA13_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA13_81 = input.LA(3);

                if ( (LA13_81=='m') ) {
                    int LA13_148 = input.LA(4);

                    if ( (LA13_148=='e') ) {
                        int LA13_188 = input.LA(5);

                        if ( (LA13_188=='\''||(LA13_188>='0' && LA13_188<='9')||(LA13_188>='A' && LA13_188<='Z')||LA13_188=='_'||(LA13_188>='a' && LA13_188<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=33;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'q':
                    {
                    switch ( input.LA(4) ) {
                    case '/':
                        {
                        alt13=71;
                        }
                        break;
                    case '\'':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt13=80;
                        }
                        break;
                    default:
                        alt13=25;}

                    }
                    break;
                case 't':
                    {
                    int LA13_150 = input.LA(4);

                    if ( (LA13_150=='\''||(LA13_150>='0' && LA13_150<='9')||(LA13_150>='A' && LA13_150<='Z')||LA13_150=='_'||(LA13_150>='a' && LA13_150<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=61;}
                    }
                    break;
                default:
                    alt13=80;}

                }
                break;
            case 'i':
                {
                int LA13_83 = input.LA(3);

                if ( (LA13_83=='g') ) {
                    int LA13_151 = input.LA(4);

                    if ( (LA13_151=='\''||(LA13_151>='0' && LA13_151<='9')||(LA13_151>='A' && LA13_151<='Z')||LA13_151=='_'||(LA13_151>='a' && LA13_151<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=29;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'u':
                {
                int LA13_84 = input.LA(3);

                if ( (LA13_84=='m') ) {
                    int LA13_152 = input.LA(4);

                    if ( (LA13_152=='\''||(LA13_152>='0' && LA13_152<='9')||(LA13_152>='A' && LA13_152<='Z')||LA13_152=='_'||(LA13_152>='a' && LA13_152<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=60;}
                }
                else {
                    alt13=80;}
                }
                break;
            default:
                alt13=80;}

        }
        else if ( (LA13_0=='{') ) {
            alt13=27;
        }
        else if ( (LA13_0=='}') ) {
            alt13=28;
        }
        else if ( (LA13_0=='l') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA13_87 = input.LA(3);

                if ( (LA13_87=='n') ) {
                    int LA13_153 = input.LA(4);

                    if ( (LA13_153=='e') ) {
                        int LA13_194 = input.LA(5);

                        if ( (LA13_194=='\''||(LA13_194>='0' && LA13_194<='9')||(LA13_194>='A' && LA13_194<='Z')||LA13_194=='_'||(LA13_194>='a' && LA13_194<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=31;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
                }
                break;
            case 'e':
                {
                int LA13_88 = input.LA(3);

                if ( (LA13_88=='t') ) {
                    int LA13_154 = input.LA(4);

                    if ( (LA13_154=='\''||(LA13_154>='0' && LA13_154<='9')||(LA13_154>='A' && LA13_154<='Z')||LA13_154=='_'||(LA13_154>='a' && LA13_154<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=58;}
                }
                else {
                    alt13=80;}
                }
                break;
            default:
                alt13=80;}

        }
        else if ( (LA13_0=='+') ) {
            int LA13_24 = input.LA(2);

            if ( (LA13_24=='+') ) {
                alt13=45;
            }
            else {
                alt13=36;}
        }
        else if ( (LA13_0=='&') ) {
            int LA13_25 = input.LA(2);

            if ( (LA13_25=='&') ) {
                alt13=41;
            }
            else {
                alt13=37;}
        }
        else if ( (LA13_0=='-') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt13=74;
                }
                break;
            case '-':
                {
                alt13=79;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt13=78;
                }
                break;
            default:
                alt13=38;}

        }
        else if ( (LA13_0=='|') ) {
            int LA13_27 = input.LA(2);

            if ( (LA13_27=='|') ) {
                alt13=39;
            }
            else {
                alt13=75;}
        }
        else if ( (LA13_0=='<') ) {
            switch ( input.LA(2) ) {
            case '=':
                {
                int LA13_99 = input.LA(3);

                if ( (LA13_99=='>') ) {
                    alt13=43;
                }
                else {
                    alt13=56;}
                }
                break;
            case ':':
                {
                alt13=46;
                }
                break;
            case '<':
                {
                alt13=48;
                }
                break;
            default:
                alt13=54;}

        }
        else if ( (LA13_0=='>') ) {
            int LA13_29 = input.LA(2);

            if ( (LA13_29=='>') ) {
                int LA13_103 = input.LA(3);

                if ( (LA13_103=='>') ) {
                    alt13=50;
                }
                else {
                    alt13=49;}
            }
            else {
                alt13=55;}
        }
        else if ( (LA13_0=='!') ) {
            alt13=51;
        }
        else if ( (LA13_0=='n') ) {
            int LA13_31 = input.LA(2);

            if ( (LA13_31=='o') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA13_159 = input.LA(4);

                    if ( (LA13_159=='\''||(LA13_159>='0' && LA13_159<='9')||(LA13_159>='A' && LA13_159<='Z')||LA13_159=='_'||(LA13_159>='a' && LA13_159<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=52;}
                    }
                    break;
                case 'n':
                    {
                    int LA13_160 = input.LA(4);

                    if ( (LA13_160=='e') ) {
                        int LA13_197 = input.LA(5);

                        if ( (LA13_197=='\''||(LA13_197>='0' && LA13_197<='9')||(LA13_197>='A' && LA13_197<='Z')||LA13_197=='_'||(LA13_197>='a' && LA13_197<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=67;}
                    }
                    else {
                        alt13=80;}
                    }
                    break;
                case '\'':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=80;
                    }
                    break;
                default:
                    alt13=66;}

            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='=') ) {
            int LA13_32 = input.LA(2);

            if ( (LA13_32=='>') ) {
                alt13=57;
            }
            else {
                alt13=53;}
        }
        else if ( (LA13_0=='#') ) {
            alt13=62;
        }
        else if ( (LA13_0=='~') ) {
            alt13=63;
        }
        else if ( (LA13_0=='*') ) {
            alt13=64;
        }
        else if ( (LA13_0=='^') ) {
            alt13=65;
        }
        else if ( (LA13_0=='u') ) {
            int LA13_37 = input.LA(2);

            if ( (LA13_37=='n') ) {
                int LA13_113 = input.LA(3);

                if ( (LA13_113=='i') ) {
                    int LA13_162 = input.LA(4);

                    if ( (LA13_162=='v') ) {
                        int LA13_198 = input.LA(5);

                        if ( (LA13_198=='\''||(LA13_198>='0' && LA13_198<='9')||(LA13_198>='A' && LA13_198<='Z')||LA13_198=='_'||(LA13_198>='a' && LA13_198<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=69;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='I') ) {
            int LA13_38 = input.LA(2);

            if ( (LA13_38=='n') ) {
                int LA13_114 = input.LA(3);

                if ( (LA13_114=='t') ) {
                    int LA13_163 = input.LA(4);

                    if ( (LA13_163=='\''||(LA13_163>='0' && LA13_163<='9')||(LA13_163>='A' && LA13_163<='Z')||LA13_163=='_'||(LA13_163>='a' && LA13_163<='z')) ) {
                        alt13=80;
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='@') ) {
            alt13=72;
        }
        else if ( (LA13_0=='d') ) {
            int LA13_40 = input.LA(2);

            if ( (LA13_40=='i') ) {
                int LA13_116 = input.LA(3);

                if ( (LA13_116=='s') ) {
                    int LA13_164 = input.LA(4);

                    if ( (LA13_164=='j') ) {
                        int LA13_200 = input.LA(5);

                        if ( (LA13_200=='\''||(LA13_200>='0' && LA13_200<='9')||(LA13_200>='A' && LA13_200<='Z')||LA13_200=='_'||(LA13_200>='a' && LA13_200<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=73;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='t') ) {
            int LA13_41 = input.LA(2);

            if ( (LA13_41=='h') ) {
                int LA13_117 = input.LA(3);

                if ( (LA13_117=='i') ) {
                    int LA13_165 = input.LA(4);

                    if ( (LA13_165=='s') ) {
                        int LA13_201 = input.LA(5);

                        if ( (LA13_201=='\''||(LA13_201>='0' && LA13_201<='9')||(LA13_201>='A' && LA13_201<='Z')||LA13_201=='_'||(LA13_201>='a' && LA13_201<='z')) ) {
                            alt13=80;
                        }
                        else {
                            alt13=76;}
                    }
                    else {
                        alt13=80;}
                }
                else {
                    alt13=80;}
            }
            else {
                alt13=80;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt13=84;
                }
                break;
            case '*':
                {
                alt13=83;
                }
                break;
            default:
                alt13=77;}

        }
        else if ( ((LA13_0>='A' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='q'||(LA13_0>='v' && LA13_0<='z')) ) {
            alt13=80;
        }
        else if ( ((LA13_0>='2' && LA13_0<='9')) ) {
            alt13=81;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_45 = input.LA(2);

            if ( ((LA13_45>='\u0000' && LA13_45<='\uFFFE')) ) {
                alt13=82;
            }
            else {
                alt13=86;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_46 = input.LA(2);

            if ( ((LA13_46>='\u0000' && LA13_46<='\uFFFE')) ) {
                alt13=82;
            }
            else {
                alt13=86;}
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=85;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='$' && LA13_0<='%')||LA13_0==';'||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='\u007F' && LA13_0<='\uFFFE')) ) {
            alt13=86;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | RULE_INTEGER | RULE_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:154: T49
                {
                mT49(); 

                }
                break;
            case 38 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:158: T50
                {
                mT50(); 

                }
                break;
            case 39 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:162: T51
                {
                mT51(); 

                }
                break;
            case 40 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:166: T52
                {
                mT52(); 

                }
                break;
            case 41 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:170: T53
                {
                mT53(); 

                }
                break;
            case 42 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:174: T54
                {
                mT54(); 

                }
                break;
            case 43 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:178: T55
                {
                mT55(); 

                }
                break;
            case 44 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:182: T56
                {
                mT56(); 

                }
                break;
            case 45 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:186: T57
                {
                mT57(); 

                }
                break;
            case 46 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:190: T58
                {
                mT58(); 

                }
                break;
            case 47 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:194: T59
                {
                mT59(); 

                }
                break;
            case 48 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:198: T60
                {
                mT60(); 

                }
                break;
            case 49 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:202: T61
                {
                mT61(); 

                }
                break;
            case 50 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:206: T62
                {
                mT62(); 

                }
                break;
            case 51 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:210: T63
                {
                mT63(); 

                }
                break;
            case 52 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:214: T64
                {
                mT64(); 

                }
                break;
            case 53 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:218: T65
                {
                mT65(); 

                }
                break;
            case 54 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:222: T66
                {
                mT66(); 

                }
                break;
            case 55 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:226: T67
                {
                mT67(); 

                }
                break;
            case 56 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:230: T68
                {
                mT68(); 

                }
                break;
            case 57 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:234: T69
                {
                mT69(); 

                }
                break;
            case 58 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:238: T70
                {
                mT70(); 

                }
                break;
            case 59 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:242: T71
                {
                mT71(); 

                }
                break;
            case 60 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:246: T72
                {
                mT72(); 

                }
                break;
            case 61 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:250: T73
                {
                mT73(); 

                }
                break;
            case 62 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:254: T74
                {
                mT74(); 

                }
                break;
            case 63 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:258: T75
                {
                mT75(); 

                }
                break;
            case 64 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:262: T76
                {
                mT76(); 

                }
                break;
            case 65 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:266: T77
                {
                mT77(); 

                }
                break;
            case 66 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:270: T78
                {
                mT78(); 

                }
                break;
            case 67 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:274: T79
                {
                mT79(); 

                }
                break;
            case 68 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:278: T80
                {
                mT80(); 

                }
                break;
            case 69 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:282: T81
                {
                mT81(); 

                }
                break;
            case 70 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:286: T82
                {
                mT82(); 

                }
                break;
            case 71 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:290: T83
                {
                mT83(); 

                }
                break;
            case 72 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:294: T84
                {
                mT84(); 

                }
                break;
            case 73 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:298: T85
                {
                mT85(); 

                }
                break;
            case 74 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:302: T86
                {
                mT86(); 

                }
                break;
            case 75 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:306: T87
                {
                mT87(); 

                }
                break;
            case 76 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:310: T88
                {
                mT88(); 

                }
                break;
            case 77 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:314: T89
                {
                mT89(); 

                }
                break;
            case 78 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:318: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 79 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:331: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 80 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:344: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:352: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 82 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:361: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 83 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:373: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 84 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:389: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 85 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:405: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 86 :
                // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1:413: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}