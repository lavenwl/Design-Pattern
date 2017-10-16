package builder.item;

import builder.pack.Packing;
import builder.pack.Wrapper;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:50
 */
public abstract  class Burger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
