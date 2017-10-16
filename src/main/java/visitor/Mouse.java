package visitor;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午12:00
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
