package abstract_factory;

import abstract_factory.color.ColorFactory;
import abstract_factory.shape.ShapeFactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/10 下午11:05
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }else{
            return null;
        }
    }
}
