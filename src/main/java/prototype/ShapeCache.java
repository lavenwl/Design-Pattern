package prototype;

import java.util.Hashtable;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:57
 */
public class ShapeCache {

    private static Hashtable<String, AbstractShape> shapeMap = new Hashtable<String, AbstractShape>();

    public static AbstractShape getShape(String shapeId){
        AbstractShape cacheAbstractShape = shapeMap.get(shapeId);
        return (AbstractShape) cacheAbstractShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
