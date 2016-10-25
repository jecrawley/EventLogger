package crawley.james;

/**
 * Created by jamescrawley on 10/25/16.
 */
public enum EventLogger {

    INSTANCE;

    private  StringBuilder log = new StringBuilder();
    private  String loggingLevel = "INFO";

    public static EventLogger getInstance () {
        return INSTANCE;
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
