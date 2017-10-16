package proxy;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午4:35
 */
public class TestProxyImage {
    @Test
    public void testDisplay(){
        Image image = new ProxyImage("test.jpg");

        image.display();
        image.display();
    }
}
