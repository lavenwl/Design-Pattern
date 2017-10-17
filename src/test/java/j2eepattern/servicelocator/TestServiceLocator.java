package j2eepattern.servicelocator;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:57
 */
public class TestServiceLocator {
    @Test
    public void testCatch(){
        Service service = ServiceLocator.getService("Service1Impl");
        service.execute();
        service = ServiceLocator.getService("Service2Impl");
        service.execute();
        service = ServiceLocator.getService("Service1Impl");
        service.execute();
        service = ServiceLocator.getService("Service2Impl");
        service.execute();
    }
}
