package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_daily_work;

import java.sql.SQLException;
import java.util.List;

public class t_daily_work_dao {
    private List<t_daily_work> t_daily_works;

    public List<t_daily_work> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_daily_work where id=?";
        t_daily_works = template.query(sql, new BeanPropertyRowMapper<t_daily_work>(t_daily_work.class), i);
        return this.t_daily_works;
    }
}
