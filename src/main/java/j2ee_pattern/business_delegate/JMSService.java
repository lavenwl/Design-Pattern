package j2ee_pattern.business_delegate;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午4:32
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
