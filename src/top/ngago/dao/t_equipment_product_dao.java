package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_equipment_product;

import java.sql.SQLException;
import java.util.List;

public class t_equipment_product_dao {
    private List<t_equipment_product> t_equipment_products;

    public List<t_equipment_product> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_equipment_product where id=?";
        t_equipment_products = template.query(sql, new BeanPropertyRowMapper<t_equipment_product>(t_equipment_product.class), i);
        return this.t_equipment_products;
    }
}
