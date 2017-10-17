package observer;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:52
 */
public class BinaryAbstractObserver extends AbstractObserver {

    public BinaryAbstractObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
    }
}
