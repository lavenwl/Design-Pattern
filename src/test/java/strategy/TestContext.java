package strategy;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:35
 */
public class TestContext {
    @Test
    public void testStrategy(){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
