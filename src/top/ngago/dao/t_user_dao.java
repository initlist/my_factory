package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_user;

import java.sql.SQLException;
import java.util.List;

public class t_user_dao {
    List<t_user> t_users = null;

    public List<t_user> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_user where id=?";
        t_users = template.query(sql, new BeanPropertyRowMapper<t_user>(t_user.class), i);
        return this.t_users;
    }
}
