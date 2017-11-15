package org.csu.coderlee.util;

/**
 * @author by bixi.lx
 * @created on 2017 11 15 16:13
 */
public class IdFactory {
    private static final SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(2L, 2L);

    public IdFactory() {
    }

    public static SnowflakeIdWorker getSnowflakeIdWorker() {
        return snowflakeIdWorker;
    }
}
