package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:48
 */
public class Subject {
    private List<AbstractObserver> abstractObservers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(AbstractObserver abstractObserver){
        abstractObservers.add(abstractObserver);
    }

    public void notifyAllObservers(){
        for(AbstractObserver abstractObserver : abstractObservers){
            abstractObserver.update();
        }
    }
}
