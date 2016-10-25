package crawley.james;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 10/25/16.
 */
public class BadEventLoggerTest {

    static final BadEventLogger badLog = BadEventLogger.getInstance();

    @Test
    public void debugTest () {

        badLog.setLoggingLevel("debug");
        badLog.emptyLog();
        badLog.debug("Debug");
        badLog.info("Info");
        badLog.warn("Warn");
        badLog.error("Error");
        assertEquals("All logs should be printed","Debug\nInfo\nWarn\nError", badLog.getLog());

    }

    @Test
    public void infoTest () {

        badLog.setLoggingLevel("info");
        badLog.emptyLog();
        badLog.debug("Debug");
        badLog.info("Info");
        badLog.warn("Warn");
        badLog.error("Error");
        assertEquals("All logs above info should be printed","Info\nWarn\nError", badLog.getLog());

    }

    @Test
    public void warnTest () {

        badLog.setLoggingLevel("warn");
        badLog.emptyLog();
        badLog.debug("Debug");
        badLog.info("Info");
        badLog.warn("Warn");
        badLog.error("Error");
        assertEquals("All logs above warn should be printed","Warn\nError", badLog.getLog());

    }

    @Test
    public void errorTest () {

        badLog.setLoggingLevel("error");
        badLog.emptyLog();
        badLog.debug("Debug");
        badLog.info("Info");
        badLog.warn("Warn");
        badLog.error("Error");
        assertEquals("Only error should be printed","Error", badLog.getLog());

    }

}
