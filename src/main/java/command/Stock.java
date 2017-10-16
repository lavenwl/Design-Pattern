package command;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:41
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [name:" + name + ", Quantity:" + quantity + "] bought");
    }

    public void sell(){
        System.out.println("Stock [name:" + name + ", Quantity:" + quantity + "] sold");
    }
}
