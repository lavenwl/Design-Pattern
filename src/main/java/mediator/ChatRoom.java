package mediator;

import java.util.Date;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午11:16
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
