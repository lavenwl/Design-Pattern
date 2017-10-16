package adapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午4:00
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public String play(String audioType, String fileName) {
        String res = "";
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name:" + fileName);
            res = "mp3";
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            res = mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media type:" + audioType + " format not supported");
            res = "invalid";
        }
        return res;
    }
}
