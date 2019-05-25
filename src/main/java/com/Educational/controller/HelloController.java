package com.Educational.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @outhor Mr.Huang
 * @create 2019:05:25 18:46
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/test")
    public String hello(){
        return "hello";
    }
}
