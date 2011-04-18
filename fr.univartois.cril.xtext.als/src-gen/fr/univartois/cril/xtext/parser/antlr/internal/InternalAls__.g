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
T53 : 'disj' ;
T54 : 'all' ;
T55 : 'sum' ;
T56 : '||' ;
T57 : 'or' ;
T58 : '&&' ;
T59 : 'and' ;
T60 : '&' ;
T61 : '<=>' ;
T62 : 'iff' ;
T63 : '-' ;
T64 : '++' ;
T65 : '<:' ;
T66 : ':>' ;
T67 : '<<' ;
T68 : '>>' ;
T69 : '>>>' ;
T70 : 'set' ;
T71 : '#' ;
T72 : '~' ;
T73 : '*' ;
T74 : '^' ;
T75 : 'no' ;
T76 : '<' ;
T77 : '>' ;
T78 : '=<' ;
T79 : '<=' ;
T80 : '>=' ;
T81 : '->' ;
T82 : '|' ;
T83 : 'open' ;
T84 : 'fact' ;
T85 : 'assert' ;
T86 : 'enum' ;
T87 : '/' ;
T88 : '.' ;
T89 : '[' ;
T90 : ']' ;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7023
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7025
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7027
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7029
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7031
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7033
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7035
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7037
RULE_ANY_OTHER : .;


