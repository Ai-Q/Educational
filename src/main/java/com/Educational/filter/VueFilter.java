package com.Educational.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @outhor Mr.Huang
 * @create 2019:05:26 14:47
 */
public class VueFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
        //设置response对数据的编码方式
        response.setContentType("application/json;charset=utf-8");
        //告诉浏览器解码方式
        response.setHeader("content-type", "text/html;charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with,token");

        //response.addHeader("Access-Control-Allow-Headers", "Authentication,Origin, X-Requested-With, Content-Type, Accept,token");
            filterChain.doFilter(servletRequest, servletResponse);
        }

    @Override
    public void destroy() {

    }
}
