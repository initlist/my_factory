package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_product;

import java.util.Date;
import java.sql.*;
import java.util.List;

public class t_product_dao {
    List<t_product> t_products = null;

    public List<t_product> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_product where id=?";
        t_products = template.query(sql, new BeanPropertyRowMapper<t_product>(t_product.class), i);
        return this.t_products;
    }

    public boolean inserter(t_product ob) throws SQLException {
        String sql = "insert into t_product values (?,?,?,?,?,?,?,?,?,?)";
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        Integer id = ob.getId();
        Integer flag = ob.getFlag();
        Date create_time = ob.getCreate_time();
        Integer create_userid = ob.getCreate_userid();
        Date update_time = ob.getUpdate_time();
        Integer update_userid = ob.getUpdate_userid();
        String product_num = ob.getProduct_num();
        String product_name = ob.getProduct_name();
        String product_img_url = ob.getProduct_img_url();
        Integer factory_id = ob.getFactory_id();
        int update = template.update(sql, create_time, create_userid, update_time, update_userid, product_num, product_name, product_img_url, factory_id);
        return false;
    }
}
