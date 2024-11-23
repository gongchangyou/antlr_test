package com.mouse.antlr_test.rule;


import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Object left = ctx.atom().getText();
        for (ParseTree pt : ctx.list().children) {
            if (pt instanceof RuleParser.AtomExprContext) {
                boolean match = ((RuleParser.AtomExprContext) pt).atom().getText().equals(left);
                if (match) {
                    return match;
                }
            }
        }

        return false;
    }
    private static final Map<String, Pattern> patternCache = new HashMap<>();

    @Override public Boolean visitExprLike(RuleParser.ExprLikeContext ctx) {
        String left = ctx.atom(0).getText();
        String right = ctx.atom(1).getText();
        // 检查缓存中是否存在编译后的正则表达式
        Pattern compiledPattern = patternCache.get(right);

        if (compiledPattern == null) {
            // 如果不存在，编译新的正则表达式并存入缓存
            String regex = right.replace("%", ".*");
            compiledPattern = Pattern.compile(regex);
            patternCache.put(right, compiledPattern);
        }
        // 创建 Matcher 对象
        Matcher matcher = compiledPattern.matcher(left);

        // 返回匹配结果
        return matcher.matches();
    }

    @Override public Boolean visitCompareExpr(RuleParser.CompareExprContext ctx) {
        return ctx.atom(0).getText().equals(ctx.atom(1).getText());
    }



}