package top.ngago.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_product;

import java.sql.SQLException;
import java.util.List;

public class t_daily_work_dao {
    private List<t_daily_work> t_daily_works;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) {
        String sql = "select * from t_daily_work where id=?";
        t_daily_works = template.query(sql, new BeanPropertyRowMapper<t_daily_work>(t_daily_work.class), i);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_daily_works);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String searchall() {
        String sql = "select * from t_daily_work";
        t_daily_works = template.query(sql, new BeanPropertyRowMapper<t_daily_work>(t_daily_work.class));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_daily_works);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int inserter(t_daily_work ob) {
        //写sql语句
        String sql = "insert into t_daily_work(id,flag,create_time,create_userid,update_time,update_time,schedule_id,equipment_id,equipment_seq,start_time,end_time,working_count,qualified_count,unqualified_cout,unqualified_cout,complete_flag,factory_id,bak) " +
                "values (:id,:flag,:create_time,:create_userid,:update_time,:update_time,:schedule_id,:equipment_id,:equipment_seq,:start_time,:end_time,:working_count,:qualified_count,:unqualified_cout,:unqualified_cout,:complete_flag,:factory_id,:bak)";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_daily_work ob) {
        //写sql语句
        String sql = "update t_daily_work set id=:id,flag=:flag,create_time=:create_time,create_userid=:create_userid,update_time=:update_time,update_time=:update_time,schedule_id=:schedule_id,equipment_id=:equipment_id,equipment_seq=:equipment_seq,start_time=:start_time,end_time=:end_time,working_count=:working_count,qualified_count=:qualified_count,unqualified_cout=:unqualified_cout,unqualified_cout=:unqualified_cout,complete_flag=:complete_flag,factory_id=:factory_id,bak=:bak  ";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_daily_work ob) {
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
