package builder.item;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:00
 */
public class Coke extends coldDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
