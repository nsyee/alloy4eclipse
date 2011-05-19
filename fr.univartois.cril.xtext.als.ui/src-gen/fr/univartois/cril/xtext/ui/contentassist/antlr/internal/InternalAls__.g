lexer grammar InternalAls;
@header {
package fr.univartois.cril.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'abstract' ;
T13 : 'lone' ;
T14 : 'one' ;
T15 : 'some' ;
T16 : 'private' ;
T17 : '!' ;
T18 : 'not' ;
T19 : '=>' ;
T20 : 'implies' ;
T21 : 'fun' ;
T22 : 'pred' ;
T23 : 'this' ;
T24 : 'all' ;
T25 : 'sum' ;
T26 : '||' ;
T27 : 'or' ;
T28 : '&&' ;
T29 : 'and' ;
T30 : '&' ;
T31 : '<=>' ;
T32 : 'iff' ;
T33 : '+' ;
T34 : '-' ;
T35 : '++' ;
T36 : '<:' ;
T37 : ':>' ;
T38 : '<<' ;
T39 : '>>' ;
T40 : '>>>' ;
T41 : 'set' ;
T42 : 'seq' ;
T43 : '#' ;
T44 : '~' ;
T45 : '*' ;
T46 : '^' ;
T47 : 'no' ;
T48 : '=' ;
T49 : 'in' ;
T50 : '<' ;
T51 : '>' ;
T52 : '=<' ;
T53 : '<=' ;
T54 : '>=' ;
T55 : 'univ' ;
T56 : 'Int' ;
T57 : 'seq/Int' ;
T58 : 'module' ;
T59 : '/' ;
T60 : 'as' ;
T61 : 'run' ;
T62 : ':' ;
T63 : 'check' ;
T64 : 'sig' ;
T65 : '{' ;
T66 : '}' ;
T67 : 'extends' ;
T68 : 'else' ;
T69 : '[' ;
T70 : ']' ;
T71 : '@' ;
T72 : 'int' ;
T73 : 'disj' ;
T74 : '(' ;
T75 : ')' ;
T76 : '|' ;
T77 : 'open' ;
T78 : 'fact' ;
T79 : 'assert' ;
T80 : 'enum' ;
T81 : 'let' ;
T82 : 'exactly' ;
T83 : 'for' ;
T84 : 'but' ;
T85 : 'expect' ;
T86 : ',' ;
T87 : 'none' ;
T88 : 'iden' ;
T89 : '->' ;
T90 : '.' ;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16391
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16393
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16395
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16397
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16399
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16401
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16403
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 16405
RULE_ANY_OTHER : .;


