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
T23 : 'fun' ;
T24 : 'pred' ;
T25 : 'this' ;
T26 : 'all' ;
T27 : 'sum' ;
T28 : '||' ;
T29 : 'or' ;
T30 : '&&' ;
T31 : 'and' ;
T32 : '&' ;
T33 : '<=>' ;
T34 : 'iff' ;
T35 : '+' ;
T36 : '-' ;
T37 : '++' ;
T38 : '<:' ;
T39 : ':>' ;
T40 : '<<' ;
T41 : '>>' ;
T42 : '>>>' ;
T43 : 'set' ;
T44 : '#' ;
T45 : '~' ;
T46 : '*' ;
T47 : '^' ;
T48 : 'no' ;
T49 : '=' ;
T50 : 'in' ;
T51 : '<' ;
T52 : '>' ;
T53 : '=<' ;
T54 : '<=' ;
T55 : '>=' ;
T56 : 'univ' ;
T57 : 'Int' ;
T58 : 'seq/Int' ;
T59 : 'module' ;
T60 : 'as' ;
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
T74 : '/' ;
T75 : 'disj' ;
T76 : '|' ;
T77 : 'open' ;
T78 : 'fact' ;
T79 : 'assert' ;
T80 : 'enum' ;
T81 : 'let' ;
T82 : ',' ;
T83 : 'none' ;
T84 : 'iden' ;
T85 : '(' ;
T86 : ')' ;
T87 : '->' ;
T88 : '.' ;
T89 : '[' ;
T90 : ']' ;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15386
RULE_NEGATIVE_INTEGER : '-' RULE_INT;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15388
RULE_SL_COMMENT : ('//' ~(('\n'|'\r'))* ('\r'? '\n')?|'--' ( options {greedy=false;} : . )*'\n');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15390
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('\''|'"')*;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15392
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15394
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15396
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15398
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.xtext.als.ui/src-gen/fr/univartois/cril/xtext/ui/contentassist/antlr/internal/InternalAls.g" 15400
RULE_ANY_OTHER : .;


