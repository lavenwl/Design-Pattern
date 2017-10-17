package abstract_factory;

import abstract_factory.color.ColorFactory;
import abstract_factory.shape.ShapeFactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/10 下午11:05
 */
public class FactoryProducer {

    public static final String SHAPE = "SHAPE";
    public static final String COLOR = "COLOR";

    public static AbstractFactory getFactory(String choice){
        if("SHAPE".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }else{
            return null;
        }
    }
}
