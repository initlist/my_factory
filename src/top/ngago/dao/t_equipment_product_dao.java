package top.ngago.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import top.ngago.entity.t_daily_work;
import top.ngago.entity.t_equipment_product;
import top.ngago.entity.t_product;

import java.sql.SQLException;
import java.util.List;

public class t_equipment_product_dao {
    private List<t_equipment_product> t_equipment_products;
    JdbcTemplate template = JDBCutils.getJdbcTemplate();

    public String search(int i) throws SQLException {
        String sql = "select * from t_equipment_product where id=?";
        t_equipment_products = template.query(sql, new BeanPropertyRowMapper<t_equipment_product>(t_equipment_product.class), i);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_equipment_products);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String search() throws SQLException {
        String sql = "select * from t_equipment_product where id=?";
        t_equipment_products = template.query(sql, new BeanPropertyRowMapper<t_equipment_product>(t_equipment_product.class));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(t_equipment_products);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int inserter(t_equipment_product ob) {
        //写sql语句
        String sql = "insert into t_equipment_product(id,equipment_id,product_id,yield,unit,factory_id) values(:id,:equipment_id,:product_id,:yield,:unit,:factory_id)";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int update(t_equipment_product ob) {
        //写sql语句
        String sql = "update t_equipment_product set id=:id,equipment_id=:equipment_id,product_id=:product_id,yield=:yield,unit=:unit,factory_id=:factory_id where id=:id";
        //将实体对象转化为BeanPropertySqlParameterSource对象
        BeanPropertySqlParameterSource sps = new BeanPropertySqlParameterSource(ob);
        //获取JdbcTemplate对象的DateSource用于构建NamedParameterJdbcTemplate对象
        JdbcTemplate template = JDBCutils.getJdbcTemplate();
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(template.getDataSource());
        //通过NamedParameterJdbcTemplate对象执行update操作
        return npjt.update(sql, sps);
    }

    public int delete(t_equipment_product ob) {
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
