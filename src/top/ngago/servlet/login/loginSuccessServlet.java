package top.ngago.servlet.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/user/loginSuccessServlet")
public class loginSuccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用seesion保存登录时效（30分钟）
        HttpSession session = req.getSession();
        //用Cookie保存seesion登录信息
        Cookie cookie = new Cookie("user_name", req.getParameter("user_name"));
        Cookie cookie1 = new Cookie("JSESSIONID", session.getId());
        //设置Cooki存活时间
        cookie.setMaxAge(60 * 30);
        cookie1.setMaxAge(60 * 30);
        //添加Cookie到响应
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        //处理登录成功：登录成功跳转到主页面
        resp.sendRedirect("/home.html");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
