package command;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:44
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
