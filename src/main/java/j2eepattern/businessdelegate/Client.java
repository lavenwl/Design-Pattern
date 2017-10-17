package j2eepattern.businessdelegate;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午4:37
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
