package j2eepattern.businessdelegate;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午4:33
 */
public class BusinessLookUp {

    private static final String IS_EJB = "EJB";

    public BusinessService getBusinessService(String serviceType){
        if(IS_EJB.equalsIgnoreCase(serviceType)){
            return new EJBServiceImpl();
        }else{
            return new JMSServiceImpl();
        }
    }
}
