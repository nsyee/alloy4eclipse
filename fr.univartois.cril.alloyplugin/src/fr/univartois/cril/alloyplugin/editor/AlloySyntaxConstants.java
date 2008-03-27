package fr.univartois.cril.alloyplugin.editor;

/**
 * Alloy syntax constants.
 */
class AlloySyntaxConstants {

    // those fields are package protected since they are references to arrays.
    // they are thus vulnerable to malicious code.
    
    static final String[] keywords    = { "abstract", "and", "assert",
            "but", "disj", "else", "exactly", "extends", "fact", "fun", "iden",
            "if", "iff", "implies", "in", "Int", "int", "let", "not", "or",
            "part", "pred", "set", "seq", "sig", "sum", "then", "this", "univ",
            "private"                       };

    static final String[] quantifiers = { "all", "lone", "no", "none",
            "one", "some"                   };

    /** commands */
    static final String[] commands    = { "run", "check", "for",
            "expect"                        };

    /** directives */
    static final String[] directives  = { "module", "open", "as" };
}