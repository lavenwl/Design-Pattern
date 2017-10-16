package builder.item;

import builder.pack.Bottle;
import builder.pack.Packing;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:54
 */
public abstract class coldDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
