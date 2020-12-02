package top.ngago.servlet.login;

import top.ngago.dao.t_user_dao;
import top.ngago.entity.t_user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class login_servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单信息
        String user_name = req.getParameter("user_name");
        String user_passwd = req.getParameter("user_passwd");
        //创建传入对象
        t_user t_user = new t_user();
        t_user.setUser_name(user_name);
        t_user.setUser_passwd(user_passwd);
        //获取查询对象
        t_user_dao t_user_dao = new t_user_dao();
        //获取查询结果
        t_user user = t_user_dao.search(t_user);
        //如果user为空登录失败否则成功
        if (user == null) {
            req.getRequestDispatcher("/user/loginFailServlet").forward(req, resp);
        } else {
            HttpSession session = req.getSession();
            session.setAttribute("user_name", user_name);
            System.out.println(req.getContextPath());
            req.getRequestDispatcher("/user/loginSuccessServlet").forward(req, resp);
        }

    }
}
