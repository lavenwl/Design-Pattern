package builder.item;

import builder.pack.Packing;
import builder.pack.Wrapper;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:50
 */
public abstract  class AbstractBurger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }


    /**
     *@Description: output price
     *
     *@Params: No such property: code for class: Script1
     *@Author: laven
     *@Date: 2017/10/17 下午5:22
     */
    @Override
    public abstract float price();
}
