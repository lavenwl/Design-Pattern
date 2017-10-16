package adapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午3:48
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public String play(String fileName) {
        System.out.println("playing vlc file. Name:" + fileName);
        return "vlc";
    }
}
