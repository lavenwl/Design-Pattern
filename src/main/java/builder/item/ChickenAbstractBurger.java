package builder.item;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午10:59
 */
public class ChickenAbstractBurger extends AbstractBurger {
    @Override
    public String name() {
        return "Chicken AbstractBurger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
