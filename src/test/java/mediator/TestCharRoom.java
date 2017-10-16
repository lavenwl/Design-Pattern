package mediator;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:20
 */
public class TestCharRoom {
    @Test
    public void testSendMessage(){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
