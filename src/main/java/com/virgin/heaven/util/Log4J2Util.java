package com.virgin.heaven.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2Util {
    private static Logger logger = LogManager.getLogger(Log4J2Util.class);
    public static void main(String[] args) {
        logger.info("Hello World");
    }
}
