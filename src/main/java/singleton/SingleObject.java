package singleton;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午9:50
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    //构造函数为私有的,这样该类不会被实例化,确保获取途径的安全
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public String showMessage(){
        return "hello";
    }
}
