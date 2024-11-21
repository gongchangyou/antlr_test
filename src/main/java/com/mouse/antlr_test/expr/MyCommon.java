package com.mouse.antlr_test.expr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class MyCommon {
    public static void main(String[] args) throws IOException {
        String file="commontest.txt";
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(file);
        //创建输入文件流
//        FileInputStream inputStream=new FileInputStream(file);
        //转化为字符流
        CharStream input= CharStreams.fromStream(is);
        // 创建词法分析器
        CommonLexer lexer = new CommonLexer(input);

        // 创建语法分析器
        CommonParser parser = new CommonParser(new CommonTokenStream(lexer));
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
            System.out.println(result);
        }catch (NullPointerException e){
            System.out.println("oops, we have some problem");
        }
    }
}