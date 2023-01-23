package com.mouse.antlr_test.impl;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2023/1/23 21:20
 */
public class CalException extends Exception {
    private int line;
    private int column;
    private String msg;

    public CalException(int line,int column,String msg){
        this.line=line;
        this.column=column;
        this.msg=msg;
    }

    @Override
    public String toString() {
        return msg+",line:"+line+",column:"+column;
    }
}
