package j2eepattern.businessdelegate;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午4:31
 */
public class EJBServiceImpl implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
