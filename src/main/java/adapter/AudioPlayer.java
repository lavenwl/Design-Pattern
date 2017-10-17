package adapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午4:00
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    private static final String MP3 = "mp3";
    private static final String VLC = "vlc";

    @Override
    public String play(String audioType, String fileName) {
        String res = "";
        if(MP3.equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name:" + fileName);
            res = "mp3";
        }else if(VLC.equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            res = mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media type:" + audioType + " format not supported");
            res = "invalid";
        }
        return res;
    }
}
