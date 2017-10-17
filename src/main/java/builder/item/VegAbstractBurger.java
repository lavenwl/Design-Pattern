package builder.item;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:56
 */
public class VegAbstractBurger extends AbstractBurger {
    @Override
    public String name() {
        return "Veg AbstractBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
