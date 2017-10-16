package visitor;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午12:05
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
