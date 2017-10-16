package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:31
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
