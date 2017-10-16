package builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:13
 */
public class TestMealBuilder {

    @Test
    public void testPrepareVegMeal(){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        Assert.assertNotNull(vegMeal);
        Assert.assertEquals(2,vegMeal.showItems().size());
        Assert.assertEquals(55.0f,vegMeal.getCost(),1);
    }
}
