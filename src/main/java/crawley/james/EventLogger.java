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
