package bridge;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午4:48
 */
public class GreenCircle implements DrawAPI {
    @Override
    public String drawCircle(int radius, int x, int y) {
        return radius + x + y + 2 + "";
    }
}
