package observer;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:51
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
