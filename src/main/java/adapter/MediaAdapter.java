package adapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午3:51
 */
public class MediaAdapter implements MediaPlayer {

    public static final String VLC = "vlc";
    public static final String MP4 = "mp4";

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public String play(String audioType, String fileName) {
        return advancedMediaPlayer.play(fileName);
    }
}
