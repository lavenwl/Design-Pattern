package chain_of_responsibility;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/12 下午5:19
 */
public class TestChainofLoggers {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    @Test
    public void testChainLogger(){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "this is an infomation");
        loggerChain.logMessage(AbstractLogger.DEBUG, "this is a debug infomation");
        loggerChain.logMessage(AbstractLogger.ERROR, "this is an error infomation");
    }

}
