package j2ee_pattern.service_locator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:55
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
