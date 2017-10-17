package j2eepattern.frontcontroller;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:31
 */
public class Dispatcher {
    public static final String IS_STUDENT = "STUDENT";

    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(IS_STUDENT.equalsIgnoreCase(request)){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
