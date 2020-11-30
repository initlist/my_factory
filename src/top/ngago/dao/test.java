package top.ngago.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_product_order;
import top.ngago.entity.t_user;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

import top.ngago.entity.t_product;

public class test {


    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        InputStream is = DruidDataSource.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();
        System.out.println(conn);

    }

    @Test
    public void a() {
        int i = 10;
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_product";
        List<t_product_order> t_product_orders = template.query(sql, new BeanPropertyRowMapper<t_product_order>(t_product_order.class));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(t_product_orders);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        for (t_product_order a : t_product_orders
        ) {
            System.out.println(a);
        }
    }

    @Test
    public void b() {
        String json = "{\"id\":123}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            t_user t_user = mapper.readValue(json, t_user.class);
            System.out.println(t_user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void c() {
        String sql = "insert into t_product(product_num,product_name,factory_id) values(:product_num,:product_name,:factory_id)";
        sql = "update t_product set product_num=:product_num,product_name=:product_name,factory_id=:factory_id where id=:id";
        t_product t_product = new t_product();
        t_product.setId(3);
        t_product.setProduct_num("244");
        t_product.setProduct_name("zhong");
        t_product.setFactory_id(123);
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(t_product);
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        int update = npjt.update(sql, sps);
        System.out.println(update);
    }

}
