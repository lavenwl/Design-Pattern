package adapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午3:50
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public String play(String fileName) {
        System.out.println("playing mp4 file. Name:" + fileName);
        return "mp4";
    }
}
