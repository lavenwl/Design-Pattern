package chainofresponsibility;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:09
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:" + message);
    }
}
