// Generated from java-escape by ANTLR 4.11.1

package com.mouse.antlr_test.rule;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleParser}.
 */
public interface RuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(RuleParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(RuleParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(RuleParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(RuleParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIn(RuleParser.ExprInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIn(RuleParser.ExprInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(RuleParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(RuleParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(RuleParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(RuleParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLike}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLike(RuleParser.ExprLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLike}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLike(RuleParser.ExprLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(RuleParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(RuleParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(RuleParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(RuleParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(RuleParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(RuleParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(RuleParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(RuleParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(RuleParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(RuleParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(RuleParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(RuleParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(RuleParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(RuleParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(RuleParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(RuleParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(RuleParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(RuleParser.ListContext ctx);
}