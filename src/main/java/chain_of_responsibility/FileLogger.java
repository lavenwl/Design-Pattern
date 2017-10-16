package chain_of_responsibility;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:13
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger:" + message);
    }
}
