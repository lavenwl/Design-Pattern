package j2ee_pattern.intercepting_filter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:41
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
