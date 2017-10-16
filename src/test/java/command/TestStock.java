package command;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午7:58
 */
public class TestStock {
    @Test
    public void testCommand(){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
