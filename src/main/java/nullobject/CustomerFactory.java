package nullobject;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午10:50
 */
public class CustomerFactory {
    public static final String[] NAMES = {"Rob","Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for(int i = 0; i < NAMES.length; i++){
            if(NAMES[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
