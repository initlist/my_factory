package top.ngago.dao;


import top.ngago.entity.t_product;
import top.ngago.entity.t_product_plan;

import java.sql.*;
import java.util.List;

public class t_product_plan_dao extends BaseDML{
    List<Object> t_product_plans=null;

    @Override
    public List<Object> search(int i) throws SQLException {
        Connection conn =JDBCutils.getConnection();
        String sql = "select * from t_product_plan limit(?-1)*5,5";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, i);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            t_product_plans.add(new t_product_plan(rs.getInt("id"),
                    rs.getInt("flag"),
                    rs.getTime("create_time"),
                    rs.getInt("create_userid"),
                    rs.getTime("update_time"),
                    rs.getInt("update_userid"),
                    rs.getString("plan_seq"),
                    rs.getInt("order_id"),
                    rs.getInt("product_id"),
                    rs.getInt("plan_count"),
                    rs.getTime("delivery_date"),
                    rs.getTime("plan_start_date"),
                    rs.getTime("plan_end_date"),
                    rs.getInt("plan_status"),
                    rs.getInt("factory_id")));
        }
        JDBCutils.close(rs, stmt, conn);
        return t_product_plans;
    }
    public boolean inserter(t_product_plan ob) throws SQLException {
        Connection conn = JDBCutils.getConnection();
        String sql = "insert into t_product_plan values(?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDate(1, (Date) ob.getCreate_time());

        return false;
    }
}
