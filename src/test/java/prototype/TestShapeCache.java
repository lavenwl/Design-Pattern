package prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午12:03
 */
public class TestShapeCache {

    /**
     * 1.是否
     */
    @Test
    public void testGetShape(){
        ShapeCache.loadCache();
        AbstractShape cloneAbstractShape1 = ShapeCache.getShape("1");
        AbstractShape cloneAbstractShape2 = ShapeCache.getShape("1");
        Assert.assertNotEquals(cloneAbstractShape1, cloneAbstractShape2);
    }
}
