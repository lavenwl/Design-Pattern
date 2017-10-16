package command;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:48
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
