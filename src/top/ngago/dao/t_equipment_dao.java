package top.ngago.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_equipment;
import top.ngago.entity.t_product;

import java.sql.SQLException;
import java.util.List;

public class t_equipment_dao {
    private List<t_equipment> t_equipments;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) throws SQLException {
        String sql = "select * from t_equipment where id=?";
        t_equipments = template.query(sql, new BeanPropertyRowMapper<t_equipment>(t_equipment.class), i);
        ObjectMapper mapper = new ObjectMapper();

        try {
            String json = mapper.writeValueAsString(t_equipments);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int inserter(t_equipment ob) {
        //写sql语句
        String sql = "insert into t_equipment(id,flag,create_time,create_userid,update_time,update_userid,equipment_seq,equipment_name,equipment_img_url,equipment_status,factory_id) values(:id,:flag,:create_time,:create_userid,:update_time,:update_userid,:equipment_seq,:equipment_name,:equipment_img_url,:equipment_status,:factory_id)";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_equipment ob) {
        //写sql语句
        String sql = "update t_equipment set id=:id,flag=:flag,create_time=:create_time,create_userid=:create_userid,update_time=:update_time,update_userid=:create_userid,equipment_seq=:equipment_seq,equipment_name=:equipment_name,equipment_img_url=:equipment_img_url,equipment_status=:equipment_status,factory_id=:factory_id ";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_equipment ob) {
        //写sql语句
        String sql = "update t_equipment set flag = 1 where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }
}
