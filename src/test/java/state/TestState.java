package state;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午10:10
 */
public class TestState {
    @Test
    public void testContext(){
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
