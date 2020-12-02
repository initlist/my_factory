package top.ngago.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录验证的过滤器
 */
@WebFilter(value = {"/user/*", "/home.html", "/t_product.html", "/t_product_order.html", "/t_product_schedule.html", "/t_product_plan.html", "/t_factory.html"}, dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.REQUEST})
public class IsorNotLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        //判断登录
        Object user_name = request.getSession().getAttribute("user_name");
        //输出运行信息
        System.out.println("IsorNotLoginFilter is run");
        //如果没有登录则跳转登录页面
        if (user_name == null) {
            response.sendRedirect("/login.html");
        } else {//如果登录则放行
            chain.doFilter(req, resp);
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
