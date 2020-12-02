package top.ngago.servlet.t_factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import top.ngago.dao.t_factory_dao;
import top.ngago.dao.t_product_order_dao;
import top.ngago.entity.t_factory;
import top.ngago.entity.t_product_order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/tFactoryServletInserte")
public class tFactoryServletInserte extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建核心文件
        ObjectMapper mapper = new ObjectMapper();
        //获取数据库操作对象啊
        t_factory_dao t_factory_dao = new t_factory_dao();
        //获取前端传来的json对象
        String obj = req.getParameter("obj");
        //后端打印json对象
        System.out.println("this is json:" + obj);
        //把前端传来的json转为实体类对象
        t_factory t_factory = mapper.readValue(obj, t_factory.class);
        System.out.println(t_factory);
        //执行update操作
        int inserter = t_factory_dao.inserter(t_factory);
        System.out.println(inserter);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
