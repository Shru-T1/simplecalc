// Generated from SimpleCalc.g4 by ANTLR 4.8
package simplecalc.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCalcParser}.
 */
public interface SimpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(SimpleCalcParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(SimpleCalcParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(SimpleCalcParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(SimpleCalcParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(SimpleCalcParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(SimpleCalcParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(SimpleCalcParser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(SimpleCalcParser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(SimpleCalcParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(SimpleCalcParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(SimpleCalcParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(SimpleCalcParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SimpleCalcParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SimpleCalcParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(SimpleCalcParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(SimpleCalcParser.AddSubExprContext ctx);
}