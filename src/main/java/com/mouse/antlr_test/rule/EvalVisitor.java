package com.mouse.antlr_test.rule;


public class EvalVisitor extends RuleBaseVisitor<Boolean> {

    public EvalVisitor(){
    }

    /**
     * 这个非常重要，不会解析 EOF, 防止最后返回EOF的结果null
     * @param ctx the parse tree
     * @return
     */
    @Override public Boolean visitParse(com.mouse.antlr_test.rule.RuleParser.ParseContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Boolean visitParenthesizedExpr(RuleParser.ParenthesizedExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Boolean visitAndExpr(RuleParser.AndExprContext ctx) {
        return visit(ctx.expr(0)) && visit(ctx.expr(1));
    }

    @Override
    public Boolean visitOrExpr(RuleParser.OrExprContext ctx) {
        return visit(ctx.expr(0)) || visit(ctx.expr(1));
    }

    @Override
    public Boolean visitNotExpr(RuleParser.NotExprContext ctx) {
        return !visit(ctx.expr());
    }
//    @Override
//    public Boolean visitExprIn(RuleParser.ExprInContext ctx) {
//        System.out.println(ctx);
//        return true;
//    }
    @Override public Boolean visitAtomExpr(RuleParser.AtomExprContext ctx) {
        System.out.println(ctx.getText());
        return true;
    }
    @Override public Boolean visitExprLike(RuleParser.ExprLikeContext ctx) {
        System.out.println(ctx);
        return true;
    }

    @Override public Boolean visitCompareExpr(RuleParser.CompareExprContext ctx) {
        System.out.println(ctx.atom(0).getText() + " " +ctx.atom(1).getText());

        return ctx.atom(0).getText().equals(ctx.atom(1).getText());
    }



}