package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_product_order;

import java.sql.SQLException;
import java.util.List;

public class t_product_order_dao {
    private List<t_product_order> t_product_orders = null;

    public List<t_product_order> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_product_order where id=?";
        t_product_orders = template.query(sql, new BeanPropertyRowMapper<t_product_order>(t_product_order.class), i);
        return this.t_product_orders;
    }
}
