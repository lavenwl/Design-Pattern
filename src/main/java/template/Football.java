package template;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:48
 */
public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football Fame Finished");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
