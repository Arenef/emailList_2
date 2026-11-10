//package murach.data;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Types;
//
//import murach.business.User;
//
//public class UserDB {
//
//    public static int insert(User user) {
//        String query = "INSERT INTO users (email, first_name, last_name, dob) VALUES (?, ?, ?, ?)";
//
//        try (Connection conn = DBUtil.getConnection();
//             PreparedStatement ps = conn.prepareStatement(query)) {
//
//            ps.setString(1, user.getEmail());
//            ps.setString(2, user.getFirstName());
//            ps.setString(3, user.getLastName());
//
//            if (user.getDob() != null) { // hoặc user.getDob() tùy tên getter trong class User
//                ps.setDate(4, new java.sql.Date(user.getDob().getTime()));
//            } else {
//                ps.setNull(4, Types.DATE);
//            }
//
//            return ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }
//}
//
