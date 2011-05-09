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
T15 : '/' ;
T16 : 'as' ;
T17 : 'fun' ;
T18 : 'pred' ;
T19 : ':' ;
T20 : 'run' ;
T21 : 'check' ;
T22 : 'for' ;
T23 : 'but' ;
T24 : 'expect' ;
T25 : 'int' ;
T26 : 'seq' ;
T27 : '=' ;
T28 : 'sig' ;
T29 : '{' ;
T30 : ',' ;
T31 : '}' ;
T32 : 'abstract' ;
T33 : 'lone' ;
T34 : 'one' ;
T35 : 'some' ;
T36 : 'extends' ;
T37 : 'in' ;
T38 : '+' ;
T39 : '!' ;
T40 : 'not' ;
T41 : '=>' ;
T42 : 'implies' ;
T43 : 'else' ;
T44 : 'let' ;
T45 : 'none' ;
T46 : 'iden' ;
T47 : 'univ' ;
T48 : 'Int' ;
T49 : 'seq/Int' ;
T50 : '(' ;
T51 : ')' ;
T52 : '@' ;
T53 : 'this' ;
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

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7445
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7447
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7449
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7451
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7453
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7455
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7457
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7459
RULE_ANY_OTHER : .;


