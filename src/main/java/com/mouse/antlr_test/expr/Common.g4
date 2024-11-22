grammar Common;

@header {
package com.mouse.antlr_test.expr;
}

parse:   exprs EOF ;

exprs:   expr (';' expr)* ';'?;

expr:    atom IN list             # ExprIn
       | atom LIKE atom           # ExprLike
       | atom '=' atom            # CompareExpr
       | atom                     # AtomExpr
       ;

atom:    ID                       # IdentifierAtom
       | NUMBER                   # NumberAtom
       | STRING                   # StringAtom
       | '(' expr ')'             # ParenthesizedExpr
       ;

list:    '[' expr (',' expr)* ']' ;

ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER  : [0-9]+ ;
STRING  : '"' (~["\\] | '\\"' | '\\\\')* '"' ;
WS      : [ \t\r\n]+ -> skip ;
IN      : 'IN' ;
LIKE    : L I K E ;

fragment L : [lL];
fragment I : [iI];
fragment K : [kK];
fragment E : [eE];
fragment N : [nN];
fragment X : [xX];