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
T57 : 'as' ;
T58 : 'fun' ;
T59 : 'pred' ;
T60 : ':' ;
T61 : 'for' ;
T62 : 'but' ;
T63 : 'expect' ;
T64 : 'exactly' ;
T65 : 'sig' ;
T66 : '{' ;
T67 : '}' ;
T68 : 'extends' ;
T69 : 'else' ;
T70 : '@' ;
T71 : 'disj' ;
T72 : '|' ;
T73 : 'module' ;
T74 : 'open' ;
T75 : 'fact' ;
T76 : 'assert' ;
T77 : 'enum' ;
T78 : '/' ;
T79 : 'run' ;
T80 : 'check' ;
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

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14019
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14021
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14023
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* '\''*;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14025
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14027
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14029
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14031
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 14033
RULE_ANY_OTHER : .;


