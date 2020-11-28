package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_factory;

import java.sql.SQLException;
import java.util.List;

public class t_factory_dao {
    private List<t_factory> t_factorys = null;

    public List<t_factory> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_factory where id=?";
        t_factorys = template.query(sql, new BeanPropertyRowMapper<t_factory>(t_factory.class));
        return this.t_factorys;
    }
}
