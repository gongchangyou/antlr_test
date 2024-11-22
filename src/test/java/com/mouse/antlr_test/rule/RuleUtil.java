package com.mouse.antlr_test.rule;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

public class RuleUtil {
    public static Object visit(String str) {
        //转化为字符流
        CharStream input= CharStreams.fromString(str);
        // 创建词法分析器
        RuleLexer lexer = new RuleLexer(input);

        // 创建语法分析器
        RuleParser parser = new RuleParser(new CommonTokenStream(lexer));
        // 设置错误监听器以捕获语法错误
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol,
                                    int line,
                                    int charPositionInLine,
                                    String msg,
                                    RecognitionException e) {
                throw new RuntimeException("Syntax error on line " + line + ":" + charPositionInLine + " " + msg, e);
            }
        });
        //分析语法
        ParseTree tree=parser.parse();
        //遍历语法树，输出结果
        EvalVisitor visitor=new EvalVisitor();
        //当遍历树时如果出错，会返回空指针，在这里捕获
        try{
            Object result = visitor.visit(tree);
            return result;
        }catch (NullPointerException e){
            System.out.println("oops, we have some problem");
        }
        return null;
    }
}
