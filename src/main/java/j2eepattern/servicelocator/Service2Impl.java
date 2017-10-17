package j2eepattern.servicelocator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:55
 */
public class Service2Impl implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service2Impl");
    }

    @Override
    public String getName() {
        return "Service2Impl";
    }
}
