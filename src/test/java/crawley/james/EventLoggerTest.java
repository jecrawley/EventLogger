package crawley.james;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamescrawley on 10/25/16.
 */
public class EventLoggerTest {

    static final EventLogger log = EventLogger.getInstance();

    @Test
    public void debugTest () {

        log.setLoggingLevel("debug");
        log.emptyLog();
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        assertEquals("All logs should be printed","Debug\nInfo\nWarn\nError", log.getLog());

    }

    @Test
    public void infoTest () {

        log.setLoggingLevel("info");
        log.emptyLog();
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        assertEquals("All logs above info should be printed","Info\nWarn\nError", log.getLog());

    }

    @Test
    public void warnTest () {

        log.setLoggingLevel("warn");
        log.emptyLog();
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        assertEquals("All logs above warn should be printed","Warn\nError", log.getLog());

    }

    @Test
    public void errorTest () {

        log.setLoggingLevel("error");
        log.emptyLog();
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        assertEquals("Only error should be printed","Error", log.getLog());

    }
}
