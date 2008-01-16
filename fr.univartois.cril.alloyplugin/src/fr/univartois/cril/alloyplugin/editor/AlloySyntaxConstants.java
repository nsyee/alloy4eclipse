package fr.univartois.cril.alloyplugin.editor;

/**
 * Alloy syntax constants.
 */
public class AlloySyntaxConstants {

    public static final String[] keywords    = { "abstract", "and", "assert",
            "but", "disj", "else", "exactly", "extends", "fact", "fun", "iden",
            "if", "iff", "implies", "in", "Int", "int", "let", "not", "or",
            "part", "pred", "set", "seq", "sig", "sum", "then", "this", "univ",
            "private"                       };

    public static final String[] quantifiers = { "all", "lone", "no", "none",
            "one", "some"                   };

    /** commands */
    public static final String[] commands    = { "run", "check", "for",
            "expect"                        };

    /** directives */
    public static final String[] directives  = { "module", "open", "as" };
}