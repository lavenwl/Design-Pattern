package observer;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:55
 */
public class OctalAbstractObserver extends AbstractObserver {

    public OctalAbstractObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String:" + Integer.toOctalString(subject.getState()));
    }
}
