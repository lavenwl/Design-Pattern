package j2eepattern.servicelocator;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:55
 */
public class InitialContext {

    public static final String SERVICE1 = "SERVICE1";
    public static final String SERVICE2 = "SERVICE2";

    public Object lookup(String jndiName){
        if(SERVICE1.equalsIgnoreCase(jndiName)){
            System.out.println("Looking up and creating a new Service1Impl object");
            return new Service1Impl();
        }else if (SERVICE2.equalsIgnoreCase(jndiName)){
            System.out.println("Looking up and creating a new Service2Impl object");
            return new Service2Impl();
        }
        return null;
    }
}
