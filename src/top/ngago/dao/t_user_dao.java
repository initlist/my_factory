package top.ngago.dao;

import top.ngago.entity.t_user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class t_user_dao extends BaseDML {
    List<Object> t_users = null;

    @Override
    public List<Object> search(int i) throws SQLException {
        Connection conn = JDBCutils.getConnection();
        String sql = "select * from t_user limit(?-1)*5,5";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, i);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            t_users.add(new t_user(rs.getInt("id"),
                    rs.getInt("flag"),
                    rs.getTime("create_time"),
                    rs.getInt("create_userid"),
                    rs.getTime("update_time"),
                    rs.getInt("update_userid"),
                    rs.getInt("user_status"),
                    rs.getString("user_name"),
                    rs.getString("user_real_name"),
                    rs.getString("user_passwd"),
                    rs.getString("user_job_num"),
                    rs.getString("user_phone_num"),
                    rs.getString("user_email"),
                    rs.getInt("role_id"),
                    rs.getInt("factory_id")
                    ));
        }
        JDBCutils.close(rs, stmt, conn);
        return t_users;
    }
}
