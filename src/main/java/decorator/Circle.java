package decorator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 上午11:30
 */
public class Circle implements Shape {
    @Override
    public String draw() {
        System.out.println("AbstractShape:Circle");
        return "Circle";
    }
}
