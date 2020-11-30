package top.ngago.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_product;
import top.ngago.entity.t_product_order;

import java.sql.SQLException;
import java.util.List;

public class t_product_order_dao {
    private List<t_product_order> t_product_orders = null;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) throws SQLException {
        String sql = "select * from t_product_order where id=?";
        t_product_orders = template.query(sql, new BeanPropertyRowMapper<t_product_order>(t_product_order.class), i);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_product_orders);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int inserter(t_product_order ob) {
        //写sql语句
        String sql = "insert into t_product(id,flag,create_time,create_userid,update_time,update_userid,update_time,update_userid,order_seq,order_source,product_id,product_count,end_date,order_status,factory_id,factory_yield) values(:id,:flag,:create_time,:create_userid,:update_time,:update_userid,:update_time,:update_userid,:order_seq,:order_source,:product_id,:product_count,:end_date,:order_status,:factory_id,:factory_yield)";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_product_order ob) {
        //写sql语句
        String sql = "update t_product_order set :id=id,:flag=flag,:create_time=create_time,:create_userid=create_userid,:update_time=update_time,:update_userid=update_userid,:update_time=update_time,:update_userid=update_userid,:order_seq=order_seq,:order_source=order_source,:product_id=product_id,:product_count=product_count,:end_date=end_date,:order_status=order_status,:factory_id=factory_id,:factory_yield=factory_yield where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_product_order ob) {
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
