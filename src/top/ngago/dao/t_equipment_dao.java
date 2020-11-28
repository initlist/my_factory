package top.ngago.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.ngago.entity.t_equipment;

import java.sql.SQLException;
import java.util.List;

public class t_equipment_dao {
    private List<t_equipment> t_equipments;

    public List<t_equipment> search(int i) throws SQLException {
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        String sql = "select * from t_equipment where id=?";
        t_equipments = template.query(sql, new BeanPropertyRowMapper<t_equipment>(t_equipment.class), i);
        return this.t_equipments;
    }
}
