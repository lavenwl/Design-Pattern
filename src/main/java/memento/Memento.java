package memento;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:28
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
