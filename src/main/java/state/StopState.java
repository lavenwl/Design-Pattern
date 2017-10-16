package state;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 下午6:05
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopState{}";
    }
}
