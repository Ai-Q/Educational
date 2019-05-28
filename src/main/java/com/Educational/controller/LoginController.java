package com.Educational.controller;

import com.Educational.entity.StaffInfo;
import com.Educational.entity.StudentInfo;
import com.Educational.service.StaffInfoService;
import com.Educational.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 *
 *  用老师与学生登录功能
 * @author q
 * @create 2019- 05- 26 23:27
 */

@Controller
public class LoginController {


    @Autowired
    private StudentInfoService studentInfoService;
    @Autowired
    private StaffInfoService staffInfoService;

    //登录功能
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces={"application/json;charset=utf-8"})
    public String  login(Integer type, String name, String pass, HttpSession session, HttpServletResponse response){
        response.setContentType("application/json;charset=utf-8");
        System.out.println(name+"-------------------------"+pass);
        if(type == 1){//1为老师登录否者学生登录
            StaffInfo staffInfo=new StaffInfo();
            staffInfo.setUserNumber(name);
            staffInfo.setUserPassowrd(pass);
            StaffInfo staffInfo1queryOne = staffInfoService.queryOne(staffInfo);

            if(staffInfo1queryOne!=null) {//登录成功

                session.setAttribute("staffInfo",staffInfo1queryOne);
                System.out.println(staffInfo1queryOne);
                return staffInfo1queryOne.toString();
            } else{
                return null;
            }
        }else {
            StudentInfo studentInfo = new StudentInfo();
            studentInfo.setStudentNo(name);//学生以学号登录
            studentInfo.setStudentPassword(pass);
            StudentInfo studentInfoqueryOne = studentInfoService.queryOne(studentInfo);
            if (studentInfoqueryOne != null) {//登录成功
                session.setAttribute("studentInfo",studentInfoqueryOne);
                return studentInfoqueryOne.toString();
            } else {
                return null;
            }

        }
    }



}
