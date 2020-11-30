package top.ngago.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_product_plan;
import top.ngago.entity.t_user;

import java.sql.SQLException;
import java.util.List;

public class t_user_dao {
    List<t_user> t_users = null;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) throws SQLException {
        String sql = "select * from t_user where id=?";
        t_users = template.query(sql, new BeanPropertyRowMapper<t_user>(t_user.class), i);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_users);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public t_user search(t_user ob) {
        String sql = "select * from t_user where user_name=? and user_passwd=?";
        t_user t_user = null;
        try {
            t_user = template.queryForObject(sql, new BeanPropertyRowMapper<t_user>(t_user.class), ob.getUser_name(), ob.getUser_passwd());
            return t_user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int inserter(t_user ob) {
        //写sql语句
        String sql = "insert into t_user(id,flag,create_time,create_userid,update_time,update_userid,user_status,user_name,user_real_name,user_passwd,user_job_num,user_phone_num,user_email,role_id,factory_id) values(:id,:flag,:create_time,:create_userid,:update_time,:update_userid,:user_status,:user_name,:user_real_name,:user_passwd,:user_job_num,:user_phone_num,:user_email,:role_id,:factory_id)";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_user ob) {
        //写sql语句
        String sql = "update t_user set id=:id,flag=:flag,create_time=:create_time,create_userid=:create_userid,update_time=:update_time,update_userid=:update_userid,user_status=:user_status,user_name=:user_name,user_real_name=:user_real_name,user_passwd=:user_passwd,user_job_num=:user_job_num,user_phone_num=:user_phone_num,user_email=:user_email,role_id=:role_id,factory_id=:factory_id where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_user ob) {
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
