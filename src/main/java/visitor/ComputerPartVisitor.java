package visitor;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午12:08
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
