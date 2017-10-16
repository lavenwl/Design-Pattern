package junit;

import org.junit.Test;
import org.junit.Assert;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/9 下午10:55
 */
public class TestStringFilter {
    @Test public void wordFormat4DBNull(){
        String target = null;
        StringFilter sf = new StringFilter();
        String result = sf.stringFilter(target);

        Assert.assertNull(result);
    }

    // 测试空字符串的处理情况
    @Test public void wordFormat4DBEmpty(){
        String target = "";
        StringFilter sf = new StringFilter();
        String result = sf.stringFilter(target);
        Assert.assertEquals("", result);
    }

    // 测试当首字母大写时的情况
    @Test public void wordFormat4DBegin(){
        String target = "EmployeeInfo";
        StringFilter sf = new StringFilter();
        String result = sf.stringFilter(target);
        Assert.assertEquals("_employee_info", result);
    }

    // 测试当尾字母为大写时的情况
    @Test public void wordFormat4DBEnd(){
        String target = "employeeInfoA";
        StringFilter sf = new StringFilter();
        String result = sf.stringFilter(target);
        Assert.assertEquals("employee_info_a", result);
    }

    // 测试多个相连字母大写时的情况
    @Test public void wordFormat4DBTogether(){
        String target = "employeeAInfo";
        StringFilter sf = new StringFilter();
        String result = sf.stringFilter(target);
        Assert.assertEquals("employee_a_info", result);
    }
}
