package top.ngago.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_product;
import top.ngago.entity.t_product_order;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
        String sql = "select * from t_product_order where ?";
        List<t_product_order> t_product_orders = template.query(sql, new BeanPropertyRowMapper<t_product_order>(t_product_order.class), i);
        for (t_product_order a : t_product_orders
        ) {
            System.out.println(a);
        }
    }
}
