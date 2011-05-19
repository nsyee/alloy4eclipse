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
T25 : 'this' ;
T26 : 'int' ;
T27 : 'seq' ;
T28 : '=' ;
T29 : 'sig' ;
T30 : '{' ;
T31 : ',' ;
T32 : '}' ;
T33 : 'abstract' ;
T34 : 'lone' ;
T35 : 'one' ;
T36 : 'some' ;
T37 : 'extends' ;
T38 : 'in' ;
T39 : '+' ;
T40 : '!' ;
T41 : 'not' ;
T42 : '=>' ;
T43 : 'implies' ;
T44 : 'else' ;
T45 : '[' ;
T46 : ']' ;
T47 : '(' ;
T48 : ')' ;
T49 : 'let' ;
T50 : 'none' ;
T51 : 'iden' ;
T52 : 'univ' ;
T53 : 'Int' ;
T54 : 'seq/Int' ;
T55 : '@' ;
T56 : 'disj' ;
T57 : 'all' ;
T58 : 'sum' ;
T59 : '||' ;
T60 : 'or' ;
T61 : '&&' ;
T62 : 'and' ;
T63 : '&' ;
T64 : '<=>' ;
T65 : 'iff' ;
T66 : '-' ;
T67 : '++' ;
T68 : '<:' ;
T69 : ':>' ;
T70 : '<<' ;
T71 : '>>' ;
T72 : '>>>' ;
T73 : 'set' ;
T74 : '#' ;
T75 : '~' ;
T76 : '*' ;
T77 : '^' ;
T78 : 'no' ;
T79 : '<' ;
T80 : '>' ;
T81 : '=<' ;
T82 : '<=' ;
T83 : '>=' ;
T84 : '->' ;
T85 : '|' ;
T86 : 'open' ;
T87 : 'fact' ;
T88 : 'assert' ;
T89 : 'enum' ;
T90 : '.' ;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7526
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7528
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7530
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7532
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7534
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7536
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7538
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 7540
RULE_ANY_OTHER : .;


