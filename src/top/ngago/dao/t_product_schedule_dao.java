package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_product_schedule;

import java.sql.SQLException;
import java.util.List;

public class t_product_schedule_dao {
    List<t_product_schedule> t_product_schedules = null;

    public List<t_product_schedule> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_product_schedule where id=?";
        List<t_product_schedule> t_product_schedules = template.query(sql, new BeanPropertyRowMapper<t_product_schedule>(t_product_schedule.class));
        return this.t_product_schedules;
    }
}
