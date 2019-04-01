package com.virgin.heaven.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jUtil {
    public static void main(String[] args) {
        PropertyConfigurator.configure(System.getProperty("log4j.configuration"));
        Logger logger = Logger.getRootLogger();
        for(int i=0; i<10000; i++){
            logger.debug("debug message 1233");
        }
    }
}
