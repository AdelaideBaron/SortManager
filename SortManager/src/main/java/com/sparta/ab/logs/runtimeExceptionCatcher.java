package com.sparta.ab.logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class runtimeExceptionCatcher {

    public static Logger logger = Logger.getLogger("my logger");


    private static void runtimeExceptionCatcher() {
        try {
            Handler fileHandler = new FileHandler("src/main/java/com/sparta/ab/logs/myLog.log");
            logger.addHandler(fileHandler);
            // logger.setFilter(//to-do);
            fileHandler.setFormatter(new CustomFormat());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
