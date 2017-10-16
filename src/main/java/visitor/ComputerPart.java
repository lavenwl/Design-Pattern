package visitor;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:57
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
