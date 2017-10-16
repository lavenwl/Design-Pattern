package decorator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 上午11:29
 */
public class Rectangle implements Shape {
    @Override
    public String draw() {
        System.out.println("Shape:Rectangle");
        return "Rectangle";
    }
}
