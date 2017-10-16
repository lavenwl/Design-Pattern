package state;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 下午6:00
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
