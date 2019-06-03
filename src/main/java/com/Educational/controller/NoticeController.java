package com.Educational.controller;

import com.Educational.entity.NoticeInfo;
import com.Educational.service.NoticeInfoService;
import com.Educational.utils.RedisUtil;
import com.Educational.utils.RedisUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * @outhor Mr.Huang
 * @create 2019:05:27 9:26
 * 登陆页校园资讯
 */
@RestController
@RequestMapping("noticeInfo")
public class NoticeController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private NoticeInfoService noticeInfoService;
    @Autowired
    private RedisUtils redis;


    /**
     * show
     */

    @ResponseBody
    @RequestMapping("/noticeList")
    public Object findAll1() {
        logger.info("请求controller中NoticeController层里================");
        System.out.println("是否存在" + redis.hasKey("noticeInfoList"));
        if (!redis.hasKey("noticeInfoList")) {
            System.out.println("这里");
            Example example = new Example(NoticeInfo.class);
            example.orderBy("noticeTime").desc();
            List<NoticeInfo> list = new ArrayList<NoticeInfo>();
            list = noticeInfoService.queryEmpListByExamle(example);
            redis.lSet("noticeInfoList", JSON.toJSONString(list));
            return list;
        } else {
            System.out.println(redis.lGet("noticeInfoList", 0, -1));
            List l = redis.lGet("noticeInfoList", 0, -1);
            System.out.println("else" + l);
            return l;
        }
    }
}
