package flyweight;

import java.util.HashMap;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午3:09
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create circle of color:" + color);
        }
        return circle;
    }
}
