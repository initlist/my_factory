package top.ngago.servlet.t_factory;

import top.ngago.dao.t_factory_dao;
import top.ngago.dao.t_product_order_dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user/tFactoryServlet")
public class tFactoryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建数据库操作对象
        t_factory_dao t_factory_dao = new t_factory_dao();
        //将查询结果封装成json:String
        String json = null;
        try {
            json = t_factory_dao.search();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //将json数据写入响应流中
        resp.getWriter().println(json);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}