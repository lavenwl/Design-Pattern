package j2ee_pattern.business_delegate;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午4:34
 */
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }


}
