package abstract_factory;

import abstract_factory.color.Color;
import abstract_factory.shape.Shape;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/10 下午3:43
 */
public interface AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
