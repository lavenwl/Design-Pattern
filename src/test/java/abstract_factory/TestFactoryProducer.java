package abstract_factory;

import abstract_factory.color.Color;
import abstract_factory.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/10 下午11:07
 */
@RunWith(Parameterized.class)
public class TestFactoryProducer {

    private String factoryName;
    private String productName;
    private String expected;

    @Parameterized.Parameters
    public static Collection params(){
        return Arrays.asList(new Object[][]{
                {"COLOR","RED","red"},
                {"COLOR","GREEN","green"},
                {"COLOR","BLUE","blue"},
                {"COLOR",null,null},
                {"SHAPE",null,null},
                {"SHAPE","CIRCLE","Inside Circle::draw() method."},
                {"SHAPE","SQUARE","Inside Square::draw() method."},
                {"SHAPE","RECTANGLE","Inside Rectangle::draw() method."}
        });
    }

    public TestFactoryProducer(String factoryName, String productName, String expected) {
        this.factoryName = factoryName;
        this.productName = productName;
        this.expected = expected;
    }

    @Test
    public void testGetFactory(){
        AbstractFactory factory = FactoryProducer.getFactory(factoryName);
        if(factoryName.equalsIgnoreCase("COLOR")){
            Color color = factory.getColor(productName);
            if(productName == null){
                Assert.assertNull(color);
            }else{
                String result = color.fill();
                Assert.assertEquals(expected,result);
            }
        }else if(factoryName.equalsIgnoreCase("SHAPE")){
            Shape shape = factory.getShape(productName);
            if(productName == null){
                Assert.assertNull(shape);
            }else{
                String result = shape.draw();
                Assert.assertEquals(expected, result);
            }
        }
//        Assert.assertEquals(expected,FactoryProducer.getFactory(factoryName).getShape(productName));
    }
}
