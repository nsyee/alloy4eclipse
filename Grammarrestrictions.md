# Differences between Alloy grammar and our grammar #

To be a bit more precise and obtain a useful context assist, the grammar used by XText had to be a bit changed.


# Modifications #

  * In a Run Statement, only predicates can be called, contrary to the Alloy grammar, where any name could be found.
  * The Open Statement must contain the path of a file in the project folder to be included , not its module name.