grammar Rule;

@header {
package com.mouse.antlr_test.rule;
}

parse:   expr EOF ;

expr:    expr 'AND' expr              # AndExpr
       | expr 'OR' expr               # OrExpr
       | NOT expr                   # NotExpr
       | '(' expr ')'               # ParenthesizedExpr
       | atom IN list               # ExprIn
       | atom LIKE atom             # ExprLike
       | atom COMPARISON atom         # CompareExpr
       | atom                       # AtomExpr
       ;

atom:    ID                         # IdentifierAtom
       | NUMBER                     # NumberAtom
       | STRING                     # StringAtom
       | TRUE                       # TrueAtom
       | FALSE                      # FalseAtom
       ;

list:    '[' expr (',' expr)* ']' ;

COMPARISON : '>' | '<' | '>=' | '<=' | '=' | '<>';

ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER  : [0-9]+ ;
STRING  : '"' (~["\\] | '\\"' | '\\\\')* '"' ;
TRUE    : T R U E ;
FALSE   : F A L S E ;
AND     : A N D ;
OR      : O R ;
NOT     : N O T ;
IN      : I N ;
LIKE    : L I K E ;

WS      : [ \t\r\n]+ -> skip ;

fragment T : [tT];
fragment R : [rR];
fragment U : [uU];
fragment E : [eE];
fragment A : [aA];
fragment N : [nN];
fragment O : [oO];
fragment F : [fF];
fragment L : [lL];
fragment I : [iI];
fragment K : [kK];
fragment S : [sK];
fragment D : [dD];