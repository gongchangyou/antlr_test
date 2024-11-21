package com.mouse.antlr_test.expr;


import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CommonBaseVisitor<Object> {

    public EvalVisitor(){
    }

    @Override
    public Object visitExprIn(CommonParser.ExprInContext ctx) {
        System.out.println(ctx);
        return visitChildren(ctx);
    }
    @Override public Object visitAtomExpr(CommonParser.AtomExprContext ctx) {
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }
    @Override public Object visitExprLike(CommonParser.ExprLikeContext ctx) {
        System.out.println(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitCompareExpr(CommonParser.CompareExprContext ctx) {
        System.out.println(ctx.atom(0).getText() + " " +ctx.atom(1).getText());
        return visitChildren(ctx);
    }



}