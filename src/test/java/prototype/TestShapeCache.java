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
        Shape cloneShape1 = ShapeCache.getShape("1");
        Shape cloneShape2 = ShapeCache.getShape("1");
        Assert.assertNotEquals(cloneShape1,cloneShape2);
    }
}
