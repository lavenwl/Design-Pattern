package builder.item;

import builder.pack.Packing;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:45
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
