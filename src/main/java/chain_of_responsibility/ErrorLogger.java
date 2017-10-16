package chain_of_responsibility;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:11
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger:" + message);
    }
}
