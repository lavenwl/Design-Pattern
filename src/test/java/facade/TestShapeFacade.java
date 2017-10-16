package facade;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午12:11
 */
public class TestShapeFacade {
    @Test
    public void testFacadeDraw(){
        ShapeFacade shapeFacade = new ShapeFacade();

        Assert.assertEquals("facade drawCircle", shapeFacade.drawCircle());
        Assert.assertEquals("facade drawRectangle", shapeFacade.drawRectangle());
        Assert.assertEquals("facade drawSquare", shapeFacade.drawSquare());
    }
}
