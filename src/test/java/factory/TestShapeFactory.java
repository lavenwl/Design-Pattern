package factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/10 上午10:56
 */
@RunWith(Parameterized.class)
public class TestShapeFactory {

    private String target;

    private String expected;

    @Parameterized.Parameters
    public static Collection params(){
        return Arrays.asList(new Object[][]{
                {"Inside Circle::draw() method.", "CIRCLE"},
                {"Inside Square::draw() method.", "SQUARE"},
                {"Inside Rectangle::draw() method.", "Rectangle"}
        });
    }

    public TestShapeFactory(String expected, String target){
        this.expected = expected;
        this.target = target;
    }

    @Test
    public void testGetShape() {
        ShapeFactory sf = new ShapeFactory();
        Assert.assertEquals(expected,new ShapeFactory().getShape(target).draw());
    }

}
