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
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }else{
            return null;
        }
    }
}
