package top.ngago.servlet.t_product_order;

import top.ngago.dao.t_product_dao;
import top.ngago.dao.t_product_order_dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/tProductOrderServlet")
public class tProductOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建数据库操作对象
        t_product_order_dao t_product_order_dao = new t_product_order_dao();
        //将查询结果封装成json:String
        String json = t_product_order_dao.search();
        //将json数据写入响应流中
        resp.getWriter().println(json);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}