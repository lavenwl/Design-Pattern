package j2ee_pattern.composite_entity;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:09
 */
public class TestCompositeEntity {
    @Test
    public void testClient(){
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
