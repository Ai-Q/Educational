package com.Educational.controller;

import com.Educational.entity.StaffInfo;
import com.Educational.entity.StudentInfo;
import com.Educational.security.Aes;
import com.Educational.service.StaffInfoService;
import com.Educational.service.StudentInfoService;
import com.Educational.utils.RedisUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.UUID;

/**
 *
 *
 *  用老师与学生登录功能
 * @author q
 * @create 2019- 05- 26 23:27
 */
@CrossOrigin
@Controller
public class LoginController {


    @Autowired
    private StudentInfoService studentInfoService;
    @Autowired
    private StaffInfoService staffInfoService;
    @Autowired
    private RedisUtil redisUtil;

    //分发登陆前的loginToken
    @ResponseBody
    @RequestMapping("/loginToken")
    public String loginToken(HttpServletResponse response) {
        String loginToken = "loginToken" + UUID.randomUUID().toString();
        /*默认保存登陆token十分钟*/
        redisUtil.set(loginToken, loginToken, 60 * 10);
        System.out.println("redisTOken=" + redisUtil.get("loginToken"));
        response.setCharacterEncoding("UTF-8");
        return Aes.aesEncrypt(loginToken);
    }


    //登录功能
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public Object login(Integer type, String name, String pass, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        System.out.println("登陆");
        System.out.println(type);
        System.out.println(name);
        System.out.println(pass);
        String arr[] = Aes.aesDecrypt(pass).split("\\|=\\|");
        /*判断用户的登陆token是否存在*/
        if (redisUtil.get(arr[1]) != null) {
            /*清除登陆token*/
            redisUtil.del(arr[1]);
            pass = arr[0];
            System.out.println(pass);
            if (type == 1) {//1为老师登录
                StaffInfo staffInfo = new StaffInfo();
                staffInfo.setUserNumber(name);
                staffInfo.setUserPassowrd(pass);
                System.out.println(staffInfo);
                StaffInfo staffInfo1queryOne = staffInfoService.queryOne(staffInfo);
                if (staffInfo1queryOne != null) {//登录成功
                    String uuid = UUID.randomUUID().toString();
                    System.out.println(uuid);
                    /*默认保存两小时*/
                    redisUtil.hset("teacher" + uuid, "teacher", staffInfo1queryOne, 60*60*2);
                    String token = Aes.aesEncrypt("teacher" + uuid);
                    return token;
                } else {
                    return "loginerror";
                }
            } else {
                StudentInfo studentInfo = new StudentInfo();
                studentInfo.setStudentNo(name);//学生以学号登录
                studentInfo.setStudentPassword(pass);
                StudentInfo studentInfoqueryOne = studentInfoService.queryOne(studentInfo);
                if (studentInfoqueryOne != null) {//登录成功
                    String uuid = UUID.randomUUID().toString();
                    System.out.println(uuid);
                    /*默认保存两小时*/
                    redisUtil.hset("student" + uuid, "student", studentInfoqueryOne, 60*60*2);
                    String token = Aes.aesEncrypt("teacher" + uuid);
                    return token;
                } else {
                    return "loginerror";
                }

            }
        } else{
            /*登陆token不存在返回*/

             return "timeout";
         }



}




}
