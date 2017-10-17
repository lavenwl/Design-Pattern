package abstract_factory.color;

import abstract_factory.AbstractFactory;
import abstract_factory.shape.Shape;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/10 下午6:14
 */
public class ColorFactory implements AbstractFactory {

    public static final String RED = "RED";
    public static final String GREEN = "GREEN";
    public static final String BLUE = "BLUE";

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(RED.equalsIgnoreCase(color)){
            return new Red();
        }else if(GREEN.equalsIgnoreCase(color)){
            return new Green();
        }else if(BLUE.equalsIgnoreCase(color)){
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
