package com.virgin.heaven.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Sample {
    private static final Logger logger = LogManager.getLogger(Log4j2Sample.class);
    public static void p(){
        logger.info("info");
        logger.error("error");
    }
}
