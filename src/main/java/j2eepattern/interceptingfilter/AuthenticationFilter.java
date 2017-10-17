package j2eepattern.interceptingfilter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:39
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
