package top.ngago.servlet.t_product_plan;

import top.ngago.dao.t_product_order_dao;
import top.ngago.dao.t_product_plan_dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user/tProductPlanServlet")
public class tProductPlanServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建数据库操作对象
        t_product_plan_dao t_product_plan_dao = new t_product_plan_dao();
        //将查询结果封装成json:String
        String json = null;
        try {
            json = t_product_plan_dao.search();
            resp.getWriter().println(json);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //将json数据写入响应流中

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}