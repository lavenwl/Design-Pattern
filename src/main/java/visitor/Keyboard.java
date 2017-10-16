package visitor;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:58
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
