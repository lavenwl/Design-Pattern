package strategy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:31
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
