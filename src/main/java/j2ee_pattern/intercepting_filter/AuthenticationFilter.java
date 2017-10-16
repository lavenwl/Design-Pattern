package j2ee_pattern.intercepting_filter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:39
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
