package decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 上午11:55
 */
public class TestShapeDecorator {
    @Test
    public void testDraw(){
        Shape redCircle = new RedAbstractShapeDecorator(new Circle());
        Assert.assertEquals("Circle", redCircle.draw());
    }
}
