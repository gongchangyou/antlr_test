// Generated from java-escape by ANTLR 4.11.1

package com.mouse.antlr_test.expr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommonParser}.
 */
public interface CommonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommonParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CommonParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CommonParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(CommonParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(CommonParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIn(CommonParser.ExprInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIn(CommonParser.ExprInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLike}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLike(CommonParser.ExprLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLike}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLike(CommonParser.ExprLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(CommonParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(CommonParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(CommonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(CommonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(CommonParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(CommonParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(CommonParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(CommonParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(CommonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(CommonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(CommonParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(CommonParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CommonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CommonParser.ListContext ctx);
}