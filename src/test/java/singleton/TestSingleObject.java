package singleton;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午9:53
 */
public class TestSingleObject {
    /*
    * 1.除了此类外其他类无法实例化此类(编译报错)
    * 2.使用此类实例化两个对象后是用一个对象
    * 3.使用此类调用普通方法
    * */
    @Test(expected = Exception.class)
    @Ignore
    public void testInit(){
//        SingleObject so = new SingleObject();
    }

    @Test
    public void singleton(){
        SingleObject so1 = SingleObject.getInstance();
        SingleObject so2 = SingleObject.getInstance();
        Assert.assertEquals(so1,so2);
    }

    @Test
    public void SingletonMethod(){
        String expected = "hello";
        Assert.assertEquals(expected,SingleObject.getInstance().showMessage());
    }
}
