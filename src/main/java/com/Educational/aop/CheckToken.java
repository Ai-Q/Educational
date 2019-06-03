package com.Educational.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;


/**
 * @outhor Mr.Huang
 * @create 2019:05:29 9:47
 */
@Component
public class CheckToken {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /*请求之前验证token和签名*/
    public void before(JoinPoint point) {
        System.out.println("Aop验证用户ToKen和签名");
        /*获取request对象*/
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        request.getParameter("name");
        request.getParameter("pass");
    }

}

