package com.Educational.interceptor;

import com.Educational.security.Aes;
import com.Educational.utils.MD5Utils;
import com.Educational.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.*;

/**
 * @outhor Mr.Huang
 * @create 2019:05:29 10:10
 */
public class CheckTokenInterceptor implements HandlerInterceptor {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器中的请求路径"+request.getRequestURI());
        /*日志*/
        logger.info("收到一条请求路径========="+request.getRequestURI());
        if(request.getRequestURI().contains("login")){
            /*对登陆放行*/
            return true;
        }else if(request.getRequestURI().contains("noticeInfo/noticeList")){
            /*对获取资讯放行*/
            return true;
        }else {
            PrintWriter out =response.getWriter();
            out.print("这里是服务端");
            /*获取凭证*/
            String access_token=request.getParameter("Access-Token");
            /*解密凭证*/
            String token=Aes.aesDecrypt(access_token);
            /*判断凭证是否存在*/
            if(redisUtil.get(token)==null){
                logger.info("请求====="+request.getRequestURI()+"======的凭证失效");
                out.print("凭证失效请重新登陆");
            }else{
                /*获取签名*/
                String sign=request.getParameter("sign");
                /*服务端自签*/
                Enumeration<String> parm = request.getParameterNames();
                List<String> list=new ArrayList<String>();
                StringBuffer sb=new StringBuffer();
                while (parm.hasMoreElements()){
                    String a=parm.nextElement();
                    list.add(a+"="+request.getParameter(a));
                }
                list.sort(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                });
                for (String a:list){
                    sb.append(a);
                }
                String s=MD5Utils.calc(sb+token);
                s.toUpperCase();
                if(s.equals(sign)){
                    /*验证成功*/
                    return true;
                }else{
                    out.print("操作出现异常，如非本人操作请修改密码");
                    return false;
                }

            }


            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
