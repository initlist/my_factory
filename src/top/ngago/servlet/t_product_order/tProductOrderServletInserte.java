package top.ngago.servlet.t_product_order;

import com.fasterxml.jackson.databind.ObjectMapper;
import top.ngago.dao.t_product_dao;
import top.ngago.dao.t_product_order_dao;
import top.ngago.entity.t_product;
import top.ngago.entity.t_product_order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/tProductOrderServletInserte")
public class tProductOrderServletInserte extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建核心文件
        ObjectMapper mapper = new ObjectMapper();
        //获取数据库操作对象啊
        t_product_order_dao t_product_order_dao = new t_product_order_dao();
        //获取前端传来的json对象
        String obj = req.getParameter("obj");
        //后端打印json对象
        System.out.println("this is json:" + obj);
        //把前端传来的json转为实体类对象
        t_product_order t_product_order = mapper.readValue(obj, t_product_order.class);
        System.out.println(t_product_order);
        //执行update操作
        int inserter = t_product_order_dao.inserter(t_product_order);
        System.out.println(inserter);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
