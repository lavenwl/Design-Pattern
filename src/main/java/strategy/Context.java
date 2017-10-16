package strategy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:33
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
