package com.Educational.test;

import com.Educational.entity.AnthortyInfo;
import com.Educational.service.AnthortyInfoService;
import com.Educational.utils.RedisUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @authorshkstart
 * @create2019-05-2711:01
 */
public class RedisUtilTest {
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContent.xml","spring_redis.xml");

   RedisUtil redis=(RedisUtil) app.getBean("redisUtil");
   /*
   * 测试String*/
   @Test
    public void fun(){
       System.out.println("redis="+redis);
        redis.set("name","wuwenjian");
        String name = (String)redis.get("name");
        System.out.println("name="+name);
    }

    /**
     * 测试hash类型
     */
    @Test
    public void fun1(){
        AnthortyInfoService service=app.getBean(AnthortyInfoService.class);
      /*  List<AnthortyInfo> anthortyInfos = service.queryAllList();
        for (AnthortyInfo anthortyInfo :anthortyInfos){
            System.out.println(anthortyInfo);
        }*/
        AnthortyInfo anthortyInfo = service.queryByPrimaryKey(1);
        redis.hset("AnthortyInfoName",anthortyInfo.getAnthortyId()+"",anthortyInfo);
        AnthortyInfo anthortyInfoName = (AnthortyInfo)redis.hget("AnthortyInfoName", anthortyInfo.getAnthortyId() + "");
        System.out.println("anthortyInfoName="+anthortyInfoName);

    }
}
