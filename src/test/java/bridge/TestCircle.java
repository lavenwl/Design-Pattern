package bridge;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午5:04
 */
public class TestCircle {
    @Test
    public void redCircle(){
        AbstractShape redCircle = new Circle(100, 100, 10, new RedCircle());
        Assert.assertEquals(100 + 100 + 10 + 1 + "", redCircle.draw());
    }
}
