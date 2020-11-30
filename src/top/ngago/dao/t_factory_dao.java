package top.ngago.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_factory;
import top.ngago.entity.t_product;

import java.sql.SQLException;
import java.util.List;

public class t_factory_dao {
    private List<t_factory> t_factorys = null;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) throws SQLException {
        String sql = "select * from t_factory where id=?";
        t_factorys = template.query(sql, new BeanPropertyRowMapper<t_factory>(t_factory.class));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_factorys);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int inserter(t_factory ob) {
        //写sql语句
        String sql = "insert into t_factory(id,flag,create_time,create_userid,update_time,update_userid,bak,factory_name,factory_img_url,factory_addr,factory_url,factory_worker,factory_status) values(:id,:flag,:create_time,:create_userid,:update_time,:update_userid,:bak,:factory_name,:factory_img_url,:factory_addr,:factory_url,:factory_worker,:factory_status)";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_factory ob) {
        //写sql语句
        String sql = "update t_factory set id=:id,flag=:flag,:create_time=create_time,:create_userid=create_userid,:update_time=update_time,:update_userid=update_userid,:bak=bak,:factory_name=factory_name,:factory_img_url=factory_img_url,:factory_addr=factory_addr,:factory_url=factory_url,:factory_worker=factory_worker,:factory_status=factory_status where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_factory ob) {
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
