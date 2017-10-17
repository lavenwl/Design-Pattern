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

        new HexaAbstractObserver(subject);
        new OctalAbstractObserver(subject);
        new BinaryAbstractObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
