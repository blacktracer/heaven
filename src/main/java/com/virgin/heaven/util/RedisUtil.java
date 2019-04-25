package com.virgin.heaven.util;

import redis.clients.jedis.Jedis;

public class RedisUtil {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.75.128", 6379);
        jedis.set("name", "fanfan");
        String name = jedis.get("name");
        System.out.println(name);
    }
}
