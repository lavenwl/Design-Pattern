package builder.item;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:00
 */
public class Pepsi extends AbstractColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
