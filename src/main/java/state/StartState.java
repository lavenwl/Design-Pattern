package state;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 下午6:02
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
