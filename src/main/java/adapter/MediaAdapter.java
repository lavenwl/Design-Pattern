package adapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午3:51
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public String play(String audioType, String fileName) {
        return advancedMediaPlayer.play(fileName);
    }
}
