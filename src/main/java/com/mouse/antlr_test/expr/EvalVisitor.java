package com.mouse.antlr_test.expr;


public class EvalVisitor extends CommonBaseVisitor<Boolean> {

    public EvalVisitor(){
    }

    /**
     * 这个非常重要，不会解析 EOF, 防止最后返回EOF的结果null
     * @param ctx the parse tree
     * @return
     */
    @Override public Boolean visitParse(CommonParser.ParseContext ctx) {
        return visit(ctx.exprs());
    }

//    @Override
//    public Boolean visitExprIn(CommonParser.ExprInContext ctx) {
//        System.out.println(ctx);
//        return true;
//    }
    @Override public Boolean visitAtomExpr(CommonParser.AtomExprContext ctx) {
        System.out.println(ctx.getText());
        return true;
    }
    @Override public Boolean visitExprLike(CommonParser.ExprLikeContext ctx) {
        System.out.println(ctx);
        return true;
    }

    @Override public Boolean visitCompareExpr(CommonParser.CompareExprContext ctx) {
        System.out.println(ctx.atom(0).getText() + " " +ctx.atom(1).getText());

        return ctx.atom(0).getText().equals(ctx.atom(1).getText());
    }



}