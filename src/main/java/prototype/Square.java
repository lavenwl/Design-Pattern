package prototype;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:55
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("square");
    }
}
