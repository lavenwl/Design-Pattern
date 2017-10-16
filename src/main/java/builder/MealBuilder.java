package builder;

import builder.item.ChickenBurger;
import builder.item.Coke;
import builder.item.Pepsi;
import builder.item.VegBurger;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:07
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
