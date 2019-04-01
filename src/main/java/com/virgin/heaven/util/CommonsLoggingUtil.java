package com.virgin.heaven.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingUtil {
    public static void main(String[] args) {
        //PropertyConfigurator.configure(System.getProperty("log4j.configuration"));
        Log log = LogFactory.getLog(CommonsLoggingUtil.class);
        System.out.println(log.getClass());
        log.error("Hello World");
    }
}
