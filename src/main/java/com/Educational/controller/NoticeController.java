package com.Educational.controller;

import com.Educational.entity.NoticeInfo;
import com.Educational.service.NoticeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @outhor Mr.Huang
 * @create 2019:05:27 9:26
 * 登陆页校园资讯
 */
@Controller
@RequestMapping("NoticeInfo")
public class NoticeController {

   /* @Autowired
    private NoticeInfoService noticeInfoService;
    @Autowired
    private RedisTemplate redis;*/

    /**
     * show
   /*  *//*
    @RequestMapping("login")
    public List<NoticeInfo> findAll(){
        NoticeInfo noticeInfo =new NoticeInfo();

        NoticeInfo NoticeInfo1 =(NoticeInfo)redis.opsForHash().get("notice");
        NoticeInfo info=new NoticeInfo();
        noticeInfoService.queryList();
    }*/
}
