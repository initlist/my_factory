package top.ngago.dao;

import top.ngago.entity.t_product;

import java.sql.*;
import java.util.List;

public class t_product_dao extends BaseDML {
    List<Object> t_products = null;

    @Override
    public List<Object> search(int i) throws SQLException {
        Connection conn = JDBCutils.getConnection();
        String sql = "select * from t_product limit(?-1)*5,5";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, i);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            t_products.add(new t_product(rs.getInt("id"),
                    rs.getInt("flag"),
                    rs.getTime("create_time"),
                    rs.getInt("create_userid"),
                    rs.getTime("update_time"),
                    rs.getInt("update_userid"),
                    rs.getString("product_num"),
                    rs.getString("product_name"),
                    rs.getString("product_img_url"),
                    rs.getInt("factory_id")));

        }
        JDBCutils.close(rs, stmt, conn);
        return t_products;
    }

    public boolean inserter(t_product ob) throws SQLException {
        Connection conn = JDBCutils.getConnection();
        String sql = "insert into t_product values(?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDate(1, (Date) ob.getCreate_time());

        return false;
    }
}
