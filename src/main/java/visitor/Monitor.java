package visitor;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:59
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
