package bridge;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午4:52
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String draw() {
        return drawAPI.drawCircle(radius, x, y);
    }
}
