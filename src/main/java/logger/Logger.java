package logger;


public class Logger//benim Logger classsim
{

    //LOGGER CLASSINDAN OBJECT OLUSTURDUK
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Logger.class.getName());

    public static void startLog (String value)
    {
        //log.info("Test is Starting...");
        log.info("---------------------------------------------------------------------------------------");
        log.info("***********************        "+ value + " STARTED    **************************");
        log.info("---------------------------------------------------------------------------------------");
    }


    public static void endLog (String value)
    {
        //log.info("Test is Ending...");
        log.info("---------------------------------------------------------------------------------------");
        log.info("**************************     "+ value + " ENDED       **************************");
        log.info("---------------------------------------------------------------------------------------");
    }

    //Info Level
    public static void info (String message) {
        log.info(message);
    }

    //Warn Level
    public static void warn (String message) {
        log.warn(message);
    }

    //Error Level
    public static void error (String message) {
        log.error(message);
    }

    //Fatal Level
    public static void fatal (String message) {
        log.fatal(message);
    }

    //Debug Level
    public static void debug (String message) {
        log.debug(message);
    }
}
