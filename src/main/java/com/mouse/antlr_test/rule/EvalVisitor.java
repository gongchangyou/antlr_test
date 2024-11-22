package com.mouse.antlr_test.rule;


import java.util.List;

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


    @Override
    public Boolean visitAtomExpr(RuleParser.AtomExprContext ctx) {
        return visit(ctx.atom());
    }


    //TODO IN 前后都是表达式，无法将返回结果统一成Boolean 了
    @Override
    public Boolean visitExprIn(RuleParser.ExprInContext ctx) {
        Object left = visit(ctx.atom());
        Object right = visit(ctx.list());
        if (left instanceof Comparable<?> && right instanceof List<?>) {
            for (Object item : (List<?>) right) {
                if (item.equals(left)) {
                    return true;
                }
            }
        }
        return false;
    }
    @Override public Boolean visitExprLike(RuleParser.ExprLikeContext ctx) {
        Object left = visit(ctx.atom(0));
        Object right = visit(ctx.atom(1));
        if (left instanceof String && right instanceof String) {
            String pattern = ((String) right).replaceAll("%", ".*").replaceAll("_", ".");
            return ((String) left).matches(pattern);
        }
        return false;
    }

    @Override public Boolean visitCompareExpr(RuleParser.CompareExprContext ctx) {
        System.out.println(ctx.atom(0).getText() + " " +ctx.atom(1).getText());

        return ctx.atom(0).getText().equals(ctx.atom(1).getText());
    }



}