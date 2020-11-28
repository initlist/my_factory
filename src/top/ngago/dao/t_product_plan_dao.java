package top.ngago.dao;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_product_plan;

import java.sql.*;
import java.util.List;

public class t_product_plan_dao {
    List<t_product_plan> t_product_plans = null;

    public List<t_product_plan> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_product_plan where id=?";
        t_product_plans = template.query(sql, new BeanPropertyRowMapper<t_product_plan>(t_product_plan.class), i);
        return this.t_product_plans;
    }

    public boolean inserter(t_product_plan ob) throws SQLException {
        Connection conn = JDBCutils.getConnection();
        String sql = "insert into t_product_plan values(?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDate(1, (Date) ob.getCreate_time());

        return false;
    }
}
