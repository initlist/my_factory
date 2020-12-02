package top.ngago.dao;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_product;
import top.ngago.entity.t_product_plan;

import java.sql.*;
import java.util.List;

public class t_product_plan_dao {
    List<t_product_plan> t_product_plans = null;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) throws SQLException {
        String sql = "select * from t_product_plan where id=?";
        t_product_plans = template.query(sql, new BeanPropertyRowMapper<t_product_plan>(t_product_plan.class), i);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_product_plans);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String search() throws SQLException {
        String sql = "select * from t_product_plan";
        t_product_plans = template.query(sql, new BeanPropertyRowMapper<t_product_plan>(t_product_plan.class));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_product_plans);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }


    public int inserter(t_product_plan ob) {
        //写sql语句
        String sql = "insert into  t_product_plan(id,flag,create_time,create_userid,update_time,update_userid,plan_seq,order_id,product_id,plan_count,delivery_date,plan_start_date,plan_end_date,plan_status,factory_id) values(:id,:flag,:create_time,:create_userid,:update_time,:update_userid,:plan_seq,:order_id,:product_id,:plan_count,:delivery_date,:plan_start_date,:plan_end_date,:plan_status,:factory_id)";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_product_plan ob) {
        //写sql语句
        String sql = "update t_product_plan set id=:id,flag=:flag,create_time=:create_time,create_userid=:create_userid,update_time=:update_time,update_userid=:update_userid,plan_seq=:plan_seq,order_id=:order_id,product_id=:product_id,plan_count=:plan_count,delivery_date=:delivery_date,plan_start_date=:plan_start_date,plan_end_date=:plan_end_date,plan_status=:plan_status,factory_id=:factory_id where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_product_plan ob) {
        //写sql语句
        String sql = "update t_product_plan set flag = 1 where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }
}
