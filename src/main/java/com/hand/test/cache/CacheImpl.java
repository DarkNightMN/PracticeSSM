package com.hand.test.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * @ Author: xin
 * @ Date: 2018/11/6 15:16
 */
@Component
public class CacheImpl {

    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    public boolean setString(String key, Serializable value) {
        try {
            redisTemplate.opsForValue().set(key, value,10,TimeUnit.MINUTES);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public Object getString(String key) {
        try {
            return redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
        }
        return null;
    }
}
