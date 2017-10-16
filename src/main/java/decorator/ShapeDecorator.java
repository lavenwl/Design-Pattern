package decorator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 上午11:34
 */
public abstract class ShapeDecorator implements Shape {

    protected  Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public String draw() {
        return decoratedShape.draw();
    }
}
