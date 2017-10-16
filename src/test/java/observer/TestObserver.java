package observer;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:57
 */
public class TestObserver {
    @Test
    public void testUpdate(){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
