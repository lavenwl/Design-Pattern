package bridge;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午4:47
 */
public class RedCircle implements DrawAPI {
    @Override
    public String drawCircle(int radius, int x, int y) {
        return radius + x + y + 1 + "";
    }
}
