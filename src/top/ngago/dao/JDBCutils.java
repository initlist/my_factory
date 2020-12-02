package top.ngago.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * druid连接池工具类
 */
public class JDBCutils {
    //定义成员变量 DataSource
    private static DataSource ds;
    private static JdbcTemplate template;

    /**
     * 类加载时初始化连接池对象
     */
    static {
        Properties pro = new Properties();
        InputStream is = JDBCutils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            //加载配置文件
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
            template = new JdbcTemplate(ds);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取链接的方法
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static JdbcTemplate getJdbcTemplate() {
        return template;
    }

    /**
     * 关闭执行对象，归还连接对象
     *
     * @param stmt 执行对象
     * @param conn 连接对象
     */
    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭结果集对象，关闭执行对象，归还连接对象
     *
     * @param rs   结果集对象
     * @param stmt 执行对象
     * @param conn 连接对象
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
