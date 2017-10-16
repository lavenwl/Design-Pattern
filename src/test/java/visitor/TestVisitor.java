package visitor;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午12:10
 */
public class TestVisitor {
    @Test
    public void testAccept(){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
