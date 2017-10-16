package template;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:49
 */
public class TestTemplate {
    @Test
    public void testPlay(){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
