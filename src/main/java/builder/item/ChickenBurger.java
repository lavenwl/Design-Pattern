package builder.item;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:59
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
