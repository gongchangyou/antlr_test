// Generated from java-escape by ANTLR 4.11.1

package com.mouse.antlr_test.expr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommonParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(CommonParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(CommonParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIn(CommonParser.ExprInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLike}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLike(CommonParser.ExprLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(CommonParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(CommonParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAtom(CommonParser.IdentifierAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(CommonParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(CommonParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link CommonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(CommonParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CommonParser.ListContext ctx);
}