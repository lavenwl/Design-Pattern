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
        AbstractGame abstractGame = new Cricket();
        abstractGame.play();
        System.out.println();
        abstractGame = new Football();
        abstractGame.play();
    }
}
