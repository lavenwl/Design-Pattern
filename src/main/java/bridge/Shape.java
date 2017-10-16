package bridge;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午4:49
 */
public abstract class Shape {

    protected  DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract String draw();
}
