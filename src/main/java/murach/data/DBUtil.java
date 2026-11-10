package murach.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Cấu hình kết nối Supabase PostgreSQL Cloud
    private static final String URL = "jdbc:postgresql://aws-0-ap-southeast-1.pooler.supabase.com:5432/postgres?sslmode=require";
    private static final String USERNAME = "postgres.ffqnocdggmmbyhmseqai";
    private static final String PASSWORD = "4Nhan4Bang16@";  // Điền mật khẩu database Supabase của bạn vào đây

    static {
        try {
            // Nạp Driver PostgreSQL
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}

