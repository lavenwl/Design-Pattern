package observer;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:56
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String:" + Integer.toHexString(subject.getState()));
    }
}
