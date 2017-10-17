package template;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:48
 */
public class Football extends AbstractGame {

    @Override
    void initialize() {
        System.out.println("Football Fame Finished");
    }

    @Override
    void startPlay() {
        System.out.println("Football AbstractGame Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football AbstractGame Started. Enjoy the game!");
    }
}
