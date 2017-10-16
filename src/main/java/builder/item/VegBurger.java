package builder.item;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:56
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
