lexer grammar InternalAls;
@header {
package fr.univartois.cril.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'module' ;
T13 : 'exactly' ;
T14 : 'private' ;
T15 : 'as' ;
T16 : 'fun' ;
T17 : 'pred' ;
T18 : ':' ;
T19 : 'run' ;
T20 : 'check' ;
T21 : 'for' ;
T22 : 'but' ;
T23 : 'expect' ;
T24 : 'int' ;
T25 : 'seq' ;
T26 : '=' ;
T27 : 'sig' ;
T28 : '{' ;
T29 : ',' ;
T30 : '}' ;
T31 : 'abstract' ;
T32 : 'lone' ;
T33 : 'one' ;
T34 : 'some' ;
T35 : 'extends' ;
T36 : 'in' ;
T37 : '+' ;
T38 : '!' ;
T39 : 'not' ;
T40 : '=>' ;
T41 : 'implies' ;
T42 : 'else' ;
T43 : 'let' ;
T44 : 'none' ;
T45 : 'iden' ;
T46 : 'univ' ;
T47 : 'Int' ;
T48 : 'seq/Int' ;
T49 : '(' ;
T50 : ')' ;
T51 : '@' ;
T52 : 'this' ;
T53 : '/' ;
T54 : 'disj' ;
T55 : 'all' ;
T56 : 'sum' ;
T57 : '||' ;
T58 : 'or' ;
T59 : '&&' ;
T60 : 'and' ;
T61 : '&' ;
T62 : '<=>' ;
T63 : 'iff' ;
T64 : '-' ;
T65 : '++' ;
T66 : '<:' ;
T67 : ':>' ;
T68 : '<<' ;
T69 : '>>' ;
T70 : '>>>' ;
T71 : 'set' ;
T72 : '#' ;
T73 : '~' ;
T74 : '*' ;
T75 : '^' ;
T76 : 'no' ;
T77 : '<' ;
T78 : '>' ;
T79 : '=<' ;
T80 : '<=' ;
T81 : '>=' ;
T82 : '->' ;
T83 : '|' ;
T84 : 'open' ;
T85 : 'fact' ;
T86 : 'assert' ;
T87 : 'enum' ;
T88 : '.' ;
T89 : '[' ;
T90 : ']' ;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7336
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7338
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7340
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7342
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7344
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7346
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7348
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7350
RULE_ANY_OTHER : .;


