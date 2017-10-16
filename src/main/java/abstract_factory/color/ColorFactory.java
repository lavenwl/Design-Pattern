package abstract_factory.color;

import abstract_factory.AbstractFactory;
import abstract_factory.shape.Shape;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/10 下午6:14
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }else{
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
