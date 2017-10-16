package adapter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午4:05
 */
@RunWith(Parameterized.class)
public class TestAudioPlayer {

    private String expected;
    private String audioType;
    private String fileName;

    @Parameterized.Parameters
    public static Collection params(){
        return Arrays.asList(new Object[][]{
                {"mp3","mp3","alone.mp3"},
                {"mp4","mp4","far far away.mp4"},
                {"vlc","vlc","mind me.vlc"},
                {"invalid","avi","test.avi"}
        });
    }

    public TestAudioPlayer(String expected, String audioType, String fileName) {
        this.expected = expected;
        this.audioType = audioType;
        this.fileName = fileName;
    }

    @Test
    public void testPlay(){
        AudioPlayer audioPlayer = new AudioPlayer();
        String result = audioPlayer.play(audioType, fileName);
        Assert.assertEquals(expected, result);
    }
}
