package com.mouse.antlr_test.expr;


import org.apache.commons.io.FilenameUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    @Override
    public Boolean visitExprIn(CommonParser.ExprInContext ctx) {
        System.out.println(ctx);
        return true;
    }
    @Override public Boolean visitAtomExpr(CommonParser.AtomExprContext ctx) {
        System.out.println(ctx.getText());
        return true;
    }

    private static final Map<String, Pattern> patternCache = new HashMap<>();
    @Override public Boolean visitExprLike(CommonParser.ExprLikeContext ctx) {
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

    @Override public Boolean visitCompareExpr(CommonParser.CompareExprContext ctx) {
        System.out.println(ctx.atom(0).getText() + " " +ctx.atom(1).getText());

        return ctx.atom(0).getText().equals(ctx.atom(1).getText());
    }



}