package top.ngago.dao;

import top.ngago.entity.t_product_schedule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class t_product_schedule_dao extends BaseDML{
    List<Object> t_product_schedules = null;

    @Override
    public List<Object> search(int i) throws SQLException {
        Connection conn = JDBCutils.getConnection();
        String sql = "select * from  t_product_schedule limit(?-1)*5,5";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, i);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            t_product_schedules.add(new t_product_schedule(rs.getInt("id"),
                    rs.getInt("flag"),
                    rs.getTime("create_time"),
                    rs.getInt("create_userid"),
                    rs.getTime("update_time"),
                    rs.getInt("update_userid"),
                    rs.getString("plan_seq"),
                    rs.getInt("schedule_count"),
                    rs.getInt("schedule_status"),
                    rs.getInt("plan_id"),
                    rs.getInt("product_id"),
                    rs.getInt("equipment_id"),
                    rs.getTime("start_date"),
                    rs.getTime("end_date"),
                    rs.getInt("factory_id")
                    ));
        }
        JDBCutils.close(rs, stmt, conn);
        return t_product_schedules;
    }
    }
