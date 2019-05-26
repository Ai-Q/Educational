package com.Educational.controller;

import com.Educational.entity.StudentInfo;
import com.Educational.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 *
 *
 *  用老师与学生登录功能
 * @author q
 * @create 2019- 05- 26 23:27
 */

public class LoginController {


    @Autowired
    private StudentInfoService studentInfoService;

    //登录功能
    @ResponseBody
    @RequestMapping("/login")
    public String  login(Integer type, String name, String password, HttpSession session){



        if(type == 1){//1为老师登录否者学生登录



        }else{
            StudentInfo studentInfo=new StudentInfo();
            studentInfo.setStudentNo(name);//学生已学号登录
            studentInfo.setStudentPassword(password);
            StudentInfo studentInfo1 = studentInfoService.queryOne(studentInfo);
            if(studentInfo!=null) {//登录成功
                return "loginok";
            } else{
                return "loginerror";
            }


        }
         return "";

    }



}
