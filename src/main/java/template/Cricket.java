package template;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:47
 */
public class Cricket extends AbstractGame {

    @Override
    void initialize() {
        System.out.println("Criket AbstractGame Finished");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket AbstractGame Initialized ! Start playing");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket AbstractGame Started. Enjoy the game!");
    }
}
