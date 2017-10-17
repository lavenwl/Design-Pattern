package prototype;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:54
 */
public class Rectangle extends AbstractShape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("rectangle");
    }
}
