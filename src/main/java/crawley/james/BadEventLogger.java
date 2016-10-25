package crawley.james;

/**
 * Created by jamescrawley on 10/25/16.
 */
public class BadEventLogger {

    private static BadEventLogger instance;
    private  StringBuilder log = new StringBuilder();
    private  String loggingLevel = "INFO";

    private BadEventLogger () {

    }

    public static BadEventLogger getInstance () {

        if (instance == null) {

            instance = new BadEventLogger();

        }

        return instance;

    }

    public void debug (String message) {

        if (loggingLevel.equals("debug")) {
            log.append(message);
            log.append("\n");
        }

    }

    public void info (String message) {

        if (loggingLevel.equals("debug") || loggingLevel.equals("info")) {
            log.append(message);
            log.append("\n");
        }
    }

    public void warn (String message) {

        if (!loggingLevel.equals("error")) {
            log.append(message);
            log.append("\n");
        }

    }

    public void error (String message) {

        log.append(message);
        log.append("\n");
    }

    public void setLoggingLevel (String level) {

        loggingLevel = level;
    }

    public String getLog () {
        int length = log.length();
        return log.delete(length - 1, length).toString();
    }

    public void emptyLog () {
        log = new StringBuilder();
    }

    public void printLog () {


        System.out.println(log.toString());

    }
}
