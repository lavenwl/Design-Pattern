package j2ee_pattern.business_delegate;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午4:33
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }
}
