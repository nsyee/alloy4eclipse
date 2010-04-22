lexer grammar InternalBasics;
@header {
package fr.univartois.cril.alloyplugin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : 'type' ;
T13 : 'entity' ;
T14 : 'extends' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'property' ;
T18 : ':' ;
T19 : '[]' ;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 445
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 447
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 449
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 451
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 453
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 455
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g" 457
RULE_ANY_OTHER : .;


