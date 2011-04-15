lexer grammar InternalAls;
@header {
package fr.univartois.cril.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'int' ;
T13 : 'seq' ;
T14 : 'abstract' ;
T15 : 'lone' ;
T16 : 'one' ;
T17 : 'some' ;
T18 : 'private' ;
T19 : '!' ;
T20 : 'not' ;
T21 : '=>' ;
T22 : 'implies' ;
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
T42 : '#' ;
T43 : '~' ;
T44 : '*' ;
T45 : '^' ;
T46 : 'no' ;
T47 : '=' ;
T48 : 'in' ;
T49 : '<' ;
T50 : '>' ;
T51 : '=<' ;
T52 : '<=' ;
T53 : '>=' ;
T54 : 'univ' ;
T55 : 'Int' ;
T56 : 'seq/Int' ;
T57 : 'module' ;
T58 : 'as' ;
T59 : 'fun' ;
T60 : 'pred' ;
T61 : 'run' ;
T62 : ':' ;
T63 : 'check' ;
T64 : 'for' ;
T65 : 'but' ;
T66 : 'expect' ;
T67 : 'exactly' ;
T68 : 'sig' ;
T69 : '{' ;
T70 : '}' ;
T71 : 'extends' ;
T72 : 'else' ;
T73 : '@' ;
T74 : 'disj' ;
T75 : '|' ;
T76 : 'open' ;
T77 : 'fact' ;
T78 : 'assert' ;
T79 : 'enum' ;
T80 : '/' ;
T81 : ',' ;
T82 : 'let' ;
T83 : 'none' ;
T84 : 'iden' ;
T85 : '(' ;
T86 : ')' ;
T87 : '->' ;
T88 : '.' ;
T89 : '[' ;
T90 : ']' ;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14014
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14016
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14018
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14020
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14022
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14024
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14026
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14028
RULE_ANY_OTHER : .;


