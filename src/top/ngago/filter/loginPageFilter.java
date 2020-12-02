package top.ngago.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录页面登录验证
 */
//@WebFilter("/login.html")
public class loginPageFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        //判断登录
        Object user_name = request.getSession().getAttribute("user_name");
        //输出运行信息
        System.out.println("loginPageFilter is run");
        //如果没有登录则跳转登录页面
        if (user_name == null) {
            chain.doFilter(req, resp);
        } else {//如果登录则放行
            response.sendRedirect("/home.html");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
