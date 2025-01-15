package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog() {
        //Given
        //When
        logger = Logger.INSTANCE;
        logger.log("Wykonywanie operacji numer 1");
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("Wykonywanie operacji numer 1", lastLog);
    }

}
