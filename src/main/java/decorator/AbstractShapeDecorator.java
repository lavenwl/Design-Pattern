package decorator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 上午11:34
 */
public abstract class AbstractShapeDecorator implements Shape {

    protected  Shape decoratedShape;

    public AbstractShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public String draw() {
        return decoratedShape.draw();
    }
}
