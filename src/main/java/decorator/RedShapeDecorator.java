package decorator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 上午11:38
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public String draw(){
        setRedBorder(decoratedShape);
        return decoratedShape.draw();
    }

    public void setRedBorder(Shape decoratedShape){
        System.out.println("border color: red");
    }
}
