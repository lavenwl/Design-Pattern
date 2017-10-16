package abstract_factory.shape;

import abstract_factory.AbstractFactory;
import abstract_factory.color.Color;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/9 下午5:37
 */
public class ShapeFactory implements AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else{
            return null;
        }
    }
}
