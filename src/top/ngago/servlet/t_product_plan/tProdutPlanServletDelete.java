package top.ngago.servlet.t_product_plan;

import com.fasterxml.jackson.databind.ObjectMapper;
import top.ngago.dao.t_product_order_dao;
import top.ngago.dao.t_product_plan_dao;
import top.ngago.entity.t_product_order;
import top.ngago.entity.t_product_plan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/tProdutPlanServletDelete")
public class tProdutPlanServletDelete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建核心文件
        ObjectMapper mapper = new ObjectMapper();
        //获取数据库操作对象啊
        t_product_plan_dao t_product_plan_dao = new t_product_plan_dao();
        //获取前端传来的json对象
        String obj = req.getParameter("obj");
        //后端打印json对象
        System.out.println("this is json:" + obj);
        //把前端传来的json转为实体类对象
        t_product_plan t_product_plan = mapper.readValue(obj, t_product_plan.class);
        //执行update操作
        t_product_plan_dao.delete(t_product_plan);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
