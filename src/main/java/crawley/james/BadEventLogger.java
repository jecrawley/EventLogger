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

            return new BadEventLogger();
        } else {
            return instance;
        }

    }

    public void debug (String message) {

    }

    public void info (String message) {

    }

    public void warn (String message) {

    }

    public void error (String message) {

    }

    public void setLoggingLevel (String level) {

    }

    public String getLog () {
        return null;
    }

    public void printLog () {

    }
}
