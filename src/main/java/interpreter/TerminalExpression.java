package interpreter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午10:06
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
