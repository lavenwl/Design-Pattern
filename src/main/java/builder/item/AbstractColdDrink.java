package builder.item;

import builder.pack.Bottle;
import builder.pack.Packing;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:54
 */
public abstract class AbstractColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    /**
     *@Description: output price
     *
     *@Params: No such property: code for class: Script1
     *@Author: laven
     *@Date: 2017/10/17 下午5:25
     */
    @Override
    public abstract float price();
}
