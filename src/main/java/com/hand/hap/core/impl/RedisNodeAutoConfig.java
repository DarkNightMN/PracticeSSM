package com.hand.hap.core.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.connection.RedisNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @ Author: xin
 * @ Date: 2018/11/13 9:55
 */
public class RedisNodeAutoConfig extends ArrayList<RedisNode> {

    private String sentinels;

    public RedisNodeAutoConfig() {
    }

//    public void setSentinels(String sentinels) {
//        String[] s=sentinels.split(",");
//        for(String ss:s){
//            String[] sss = ss.split(":");
//            RedisNode redisNode = new RedisNode(sss[0].trim(), Integer.parseInt(sss[1].trim()));
//            this.add(redisNode);
//        }
//    }

    public void setSentinels(String[] sentinels) {
        String[] var2 = sentinels;
        int var3 = sentinels.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String s = var2[var4];
            if (!StringUtils.isBlank(s) && !s.contains("$")) {
                String[] ss = s.split(":");
                RedisNode redisNode = new RedisNode(ss[0].trim(), Integer.parseInt(ss[1].trim()));
                this.add(redisNode);
            }
        }

    }
}

