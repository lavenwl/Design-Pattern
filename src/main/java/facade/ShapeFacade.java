package facade;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午12:08
 */
public class ShapeFacade {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public String drawCircle(){
        System.out.println("facade drawCircle");
        return "facade drawCircle";
    }

    public String drawRectangle(){
        System.out.println("facade drawRectangle");
        return "facade drawRectangle";
    }

    public String drawSquare(){
        System.out.println("facade drawSquare");
        return "facade drawSquare";
    }
}
