package com.virgin.heaven.util;

import org.apache.ibatis.logging.slf4j.Slf4jImpl;

public class Slf4jUtil {
    public static void main(String[] args) {
        Slf4jImpl slf4j = new Slf4jImpl("ko");
        System.out.println(slf4j.isDebugEnabled());
    }
}
