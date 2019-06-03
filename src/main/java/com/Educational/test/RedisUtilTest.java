package com.Educational.test;

import com.Educational.entity.AnthortyInfo;
import com.Educational.service.AnthortyInfoService;
import com.Educational.service.impl.NoticeInfoServiceImpl;
import com.Educational.utils.RedisUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @authorshkstart
 * @create2019-05-2711:01
 */
@Component
public class RedisUtilTest {

/*
   *//* 测试String*//*
   @Test
    public void fun(){
       NoticeInfoServiceImpl bean = app.getBean(NoticeInfoServiceImpl.class);

   }*/

    /**
     * 测试hash类型
     */
    @Test
    public void fun1() {
        /*  AnthortyInfoService service=app.getBean(AnthortyInfoService.class);
         *//*  List<AnthortyInfo> anthortyInfos = service.queryAllList();
        for (AnthortyInfo anthortyInfo :anthortyInfos){
            System.out.println(anthortyInfo);
        }*//*
        AnthortyInfo anthortyInfo = service.queryByPrimaryKey(1);
        redisUtil.hset("AnthortyInfoName",anthortyInfo.getAnthortyId()+"",anthortyInfo);
        AnthortyInfo anthortyInfoName = (AnthortyInfo)redisUtil.hget("AnthortyInfoName", anthortyInfo.getAnthortyId() + "");
        System.out.println("anthortyInfoName="+anthortyInfoName);

    }*/
    }
}
