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
T26 : 'sig' ;
T27 : '{' ;
T28 : ',' ;
T29 : '}' ;
T30 : 'abstract' ;
T31 : 'lone' ;
T32 : 'one' ;
T33 : 'some' ;
T34 : 'extends' ;
T35 : 'in' ;
T36 : '+' ;
T37 : '!' ;
T38 : 'not' ;
T39 : '=>' ;
T40 : 'implies' ;
T41 : 'else' ;
T42 : 'let' ;
T43 : 'none' ;
T44 : 'iden' ;
T45 : 'univ' ;
T46 : 'Int' ;
T47 : 'seq/Int' ;
T48 : '(' ;
T49 : ')' ;
T50 : '@' ;
T51 : 'this' ;
T52 : 'disj' ;
T53 : '=' ;
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

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6602
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6604
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6606
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6608
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6610
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6612
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6614
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g" 6616
RULE_ANY_OTHER : .;


