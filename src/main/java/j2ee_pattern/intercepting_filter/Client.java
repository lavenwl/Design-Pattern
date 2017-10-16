package j2ee_pattern.intercepting_filter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:41
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
