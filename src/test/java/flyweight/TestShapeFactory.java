package flyweight;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午3:13
 */
public class TestShapeFactory {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
    @Test
    public void testGetShape(){
        for(int i = 0; i < 20; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
            Assert.assertEquals(1,1);
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
