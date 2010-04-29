lexer grammar InternalBasics;
@header {
package fr.univartois.cril.alloyplugin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'module' ;
T14 : '[' ;
T15 : 'exactly' ;
T16 : ',' ;
T17 : ']' ;
T18 : 'private' ;
T19 : 'open' ;
T20 : 'as' ;
T21 : 'fact' ;
T22 : 'assert' ;
T23 : 'fun' ;
T24 : '.' ;
T25 : '(' ;
T26 : ')' ;
T27 : ':' ;
T28 : 'pred' ;
T29 : 'run' ;
T30 : 'check' ;
T31 : 'for' ;
T32 : 'but' ;
T33 : 'expect' ;
T34 : '0' ;
T35 : '1' ;
T36 : 'int' ;
T37 : 'seq' ;
T38 : 'enum' ;
T39 : '{' ;
T40 : '}' ;
T41 : 'sig' ;
T42 : 'abstract' ;
T43 : 'lone' ;
T44 : 'one' ;
T45 : 'some' ;
T46 : 'extends' ;
T47 : 'in' ;
T48 : '+' ;
T49 : '&' ;
T50 : '-' ;
T51 : '||' ;
T52 : 'or' ;
T53 : '&&' ;
T54 : 'and' ;
T55 : '<=>' ;
T56 : 'iff' ;
T57 : '++' ;
T58 : '<:' ;
T59 : ':>' ;
T60 : '<<' ;
T61 : '>>' ;
T62 : '>>>' ;
T63 : '!' ;
T64 : 'not' ;
T65 : '=' ;
T66 : '<' ;
T67 : '>' ;
T68 : '<=' ;
T69 : '=>' ;
T70 : 'let' ;
T71 : 'all' ;
T72 : 'sum' ;
T73 : 'set' ;
T74 : '#' ;
T75 : '~' ;
T76 : '*' ;
T77 : '^' ;
T78 : 'no' ;
T79 : 'none' ;
T80 : 'iden' ;
T81 : 'univ' ;
T82 : 'Int' ;
T83 : 'seq/Int' ;
T84 : '@' ;
T85 : 'disj' ;
T86 : '->' ;
T87 : '|' ;
T88 : 'this' ;
T89 : '/' ;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3214
RULE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3216
RULE_COMMENT : '--' ( options {greedy=false;} : . )*'\n';

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3218
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* '\''*;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3220
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3222
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3224
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3226
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3228
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 3230
RULE_ANY_OTHER : .;


