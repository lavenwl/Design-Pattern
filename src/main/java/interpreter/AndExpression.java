package interpreter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午10:09
 */
public class AndExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
