package top.ngago.servlet.login;

import top.ngago.dao.t_user_dao;
import top.ngago.entity.t_user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class login_servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单信息
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        //创建传入对象
        t_user t_user = new t_user();
        t_user.setUser_name(uname);
        t_user.setUser_passwd(pwd);
        //获取查询对象
        t_user_dao t_user_dao = new t_user_dao();
        //获取查询结果
        t_user user = t_user_dao.search(t_user);
        //如果user为空登录失败否则成功
        if (user == null) {
            req.getRequestDispatcher("/loginFailServlet").forward(req, resp);
        } else {
            req.getRequestDispatcher("/loginSuccessServlet").forward(req, resp);
        }

    }
}
