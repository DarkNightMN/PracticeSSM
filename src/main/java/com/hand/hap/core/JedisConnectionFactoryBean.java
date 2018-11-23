package com.hand.hap.core;

/**
 * @ Author: xin
 * @ Date: 2018/11/6 13:56
 */

import org.springframework.beans.factory.FactoryBean;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.JedisPoolConfig;

public class JedisConnectionFactoryBean implements FactoryBean<JedisConnectionFactory> {
    private boolean useSentinel = false;
    private RedisSentinelConfiguration sentinelConfiguration;
    private String hostName;
    private int port;
    private int database = 0;
    private JedisPoolConfig poolConfig;
    private volatile JedisConnectionFactory cacheObject;

    public JedisConnectionFactoryBean() {
    }

    public JedisConnectionFactory getObject() throws Exception {
        if (this.cacheObject == null) {
            synchronized(this) {
                if (this.cacheObject == null) {
                    this.doCreate();
                }
            }
        }

        return this.cacheObject;
    }

    private void doCreate() {
        if (this.useSentinel) {
            this.cacheObject = new JedisConnectionFactory(this.sentinelConfiguration);
        } else {
            this.cacheObject = new JedisConnectionFactory();
            this.cacheObject.setHostName(this.hostName);
            this.cacheObject.setPort(this.port);
        }

        this.cacheObject.setDatabase(this.database);
        this.cacheObject.setUsePool(true);
        this.cacheObject.setPoolConfig(this.poolConfig);
        this.cacheObject.afterPropertiesSet();
    }

    public Class<?> getObjectType() {
        return JedisConnectionFactory.class;
    }

    public boolean isSingleton() {
        return true;
    }

    public boolean isUseSentinel() {
        return this.useSentinel;
    }

    public void setUseSentinel(boolean useSentinel) {
        this.useSentinel = useSentinel;
    }

    public RedisSentinelConfiguration getSentinelConfiguration() {
        return this.sentinelConfiguration;
    }

    public void setSentinelConfiguration(RedisSentinelConfiguration sentinelConfiguration) {
        this.sentinelConfiguration = sentinelConfiguration;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getDatabase() {
        return this.database;
    }

    public void setDatabase(int database) {
        this.database = database;
    }

    public JedisPoolConfig getPoolConfig() {
        return this.poolConfig;
    }

    public void setPoolConfig(JedisPoolConfig poolConfig) {
        this.poolConfig = poolConfig;
    }
}

