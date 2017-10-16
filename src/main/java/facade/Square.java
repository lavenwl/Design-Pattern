package facade;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/9 下午5:36
 */
public class Square implements Shape {

    public String draw() {
        System.out.println("Inside Square::draw() method.");
        return "Inside Square::draw() method.";
    }
}
