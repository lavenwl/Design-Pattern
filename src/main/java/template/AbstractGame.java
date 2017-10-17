package template;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午11:45
 */
public abstract class AbstractGame {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
