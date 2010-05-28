lexer grammar InternalAls;
@header {
package fr.univartois.cril.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'exactly' ;
T13 : 'private' ;
T14 : 'as' ;
T15 : 'fun' ;
T16 : 'pred' ;
T17 : ':' ;
T18 : 'run' ;
T19 : 'check' ;
T20 : 'for' ;
T21 : 'but' ;
T22 : 'expect' ;
T23 : 'int' ;
T24 : 'seq' ;
T25 : 'sig' ;
T26 : '{' ;
T27 : ',' ;
T28 : '}' ;
T29 : 'abstract' ;
T30 : 'lone' ;
T31 : 'one' ;
T32 : 'some' ;
T33 : 'extends' ;
T34 : 'in' ;
T35 : '+' ;
T36 : '!' ;
T37 : 'not' ;
T38 : '=>' ;
T39 : 'implies' ;
T40 : 'else' ;
T41 : 'let' ;
T42 : 'none' ;
T43 : 'iden' ;
T44 : 'univ' ;
T45 : 'Int' ;
T46 : 'seq/Int' ;
T47 : '(' ;
T48 : ')' ;
T49 : '@' ;
T50 : 'this' ;
T51 : 'disj' ;
T52 : '=' ;
T53 : 'all' ;
T54 : 'sum' ;
T55 : '||' ;
T56 : 'or' ;
T57 : '&&' ;
T58 : 'and' ;
T59 : '&' ;
T60 : '<=>' ;
T61 : 'iff' ;
T62 : '-' ;
T63 : '++' ;
T64 : '<:' ;
T65 : ':>' ;
T66 : '<<' ;
T67 : '>>' ;
T68 : '>>>' ;
T69 : 'set' ;
T70 : '#' ;
T71 : '~' ;
T72 : '*' ;
T73 : '^' ;
T74 : 'no' ;
T75 : '<' ;
T76 : '>' ;
T77 : '=<' ;
T78 : '<=' ;
T79 : '>=' ;
T80 : '->' ;
T81 : '|' ;
T82 : 'module' ;
T83 : 'open' ;
T84 : 'fact' ;
T85 : 'assert' ;
T86 : 'enum' ;
T87 : '/' ;
T88 : '.' ;
T89 : '[' ;
T90 : ']' ;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6611
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6613
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6615
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* '\''*;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6617
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6619
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6621
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6623
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6625
RULE_ANY_OTHER : .;


