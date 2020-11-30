package top.ngago.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_product_plan;
import top.ngago.entity.t_product_schedule;

import java.sql.SQLException;
import java.util.List;

public class t_product_schedule_dao {
    List<t_product_schedule> t_product_schedules = null;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) throws SQLException {
        String sql = "select * from t_product_schedule where id=?";
        t_product_schedules = template.query(sql, new BeanPropertyRowMapper<t_product_schedule>(t_product_schedule.class));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_product_schedules);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int inserter(t_product_schedule ob) {
        //写sql语句
        String sql = "insert into values";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_product_schedule ob) {
        //写sql语句
        String sql = "update  set  where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_product_schedule ob) {
        //写sql语句
        String sql = "update t_daily_work set flag = 1 where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }
}
