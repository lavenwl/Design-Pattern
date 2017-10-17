package prototype;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:55
 */
public class Circle extends AbstractShape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("circle");
    }
}
