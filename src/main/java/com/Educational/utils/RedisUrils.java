/*
package com.Educational.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

*/
/**
 * @outhor Mr.Huang
 * @create 2019:05:25 19:20
 *//*

public class RedisUrils {
    private static volatile JedisPool jedisPool=null;
    private RedisUrils(){}

    public static JedisPool getJedisPool(){
        if(null==jedisPool){
            synchronized(RedisUrils.class){
                if(null==jedisPool){
                    JedisPoolConfig poolConfig=new JedisPoolConfig();


                    poolConfig.setMaxActive(3000);
                    poolConfig.setMaxIdle(30);
                    poolConfig.setMaxWait(100*1000);
                    poolConfig.setTestOnBorrow(true);


                    jedisPool=new JedisPool(poolConfig,"47.107.208.125",6379);
                }
            }
        }
        return jedisPool;

    }

    public static void close(JedisPool jedisPool, Jedis jedis){
        if(jedis!=null){
            jedisPool.returnResourceObject(jedis);
        }
    }

    public static void main(String[] args) {

        JedisPool redis=RedisUrils.getJedisPool();
        Jedis jredis=redis.getResource();
        System.out.println(jredis.ping());
    }
}
*/
