package template;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:47
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Criket Game Finished");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized ! Start playing");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
