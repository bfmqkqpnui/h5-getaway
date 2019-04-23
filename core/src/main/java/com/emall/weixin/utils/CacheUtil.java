package com.emall.weixin.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


// 缓存/Redis
public class CacheUtil {
    public static JedisPool jedisPool = null;
    public static Object jedisPoolLock = new Object();
    private static Logger logger = LoggerFactory.getLogger(CacheUtil.class);


    /**
     * 重新设置缓存时间
     *
     * @param key
     * @param second
     */
    public static void exprise(String key, int second) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedisPool.getResource().expire(key, second);
            jedis.quit();
        } finally {
            if (jedis != null) {
                jedisPool.returnResource(jedis);
            }
        }

    }


    public static void addTo(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.append(key, value);
            jedis.quit();
        } catch (Exception e) {
            logger.error("redis 报错", e);
        } finally {
            if (jedis != null) {
                jedisPool.returnResource(jedis);
            }
        }
    }

    /**
     * 缓存文本对象
     *
     * @param key
     * @param value
     * @param second
     */
    public static void set(String key, String value, int second) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
            jedis.expire(key, second);
            jedis.quit();
        } catch (Exception e) {
            logger.error("缓存文本对象失败", e);
        } finally {
            if (jedis != null) {
                jedisPool.returnResource(jedis);
            }
        }
    }

    /**
     * 获取缓存中的文本信息
     *
     * @param key
     * @return
     */
    public static String getString(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String value = jedis.get(key);
            jedis.quit();
            return value;
        } catch (Exception e) {
            logger.error("获取缓存中的文本信息报错", e);
            return null;
        } finally {
            if (jedis != null) {
                jedisPool.returnResource(jedis);
            }
        }

    }

    /**
     * 删除缓存中的文本信息
     *
     * @param key
     * @return
     */
    public static void remove(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.del(key);
            jedis.quit();
        } catch (Exception e) {
            logger.error("删除缓存中的文本信息报错", e);
        } finally {
            if (jedis != null) {
                jedisPool.returnResource(jedis);
            }
        }
    }

    /**
     * 从缓存中获取实体对象
     *
     * @param key
     * @return
     */
    public static <T> T getKey(String key) {
        byte[] bytes = getBytes(key);
        try {
            if (bytes == null) {
                return null;
            }
            return CommonUtils.byteToObject(bytes);
        } catch (Exception e) {
            logger.error("do getObject methode get Exception message " + e.getMessage() + " by key, please check the class version or remove the cache value");
            return null;
        }
    }

    public static byte[] getBytes(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            byte[] bytes = jedis.get(key.getBytes());
            jedis.quit();
            return bytes;
        } catch (Exception e) {
            logger.error("redis 报错", e);
            return null;
        } finally {
            if (jedis != null) {
                jedisPool.returnResource(jedis);
            }
        }
    }
}
