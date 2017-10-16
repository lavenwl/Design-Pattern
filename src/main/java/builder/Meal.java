package builder;

import builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:01
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item: items){
            cost += item.price();
        }
        return cost;
    }

    public List<Item> showItems(){
        for(Item item: items){
            System.out.println("Item:" + item.name() + " Packing:" + item.packing() + " Price:" + item.price());
        }
        return items;
    }
}
