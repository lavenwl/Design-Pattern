package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:49
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
