package Design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection { // Đổi tên class để tránh xung đột

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // testdb là tên database
        String user = "root"; // tài khoản mặc định trong XAMPP
        String password = ""; // mật khẩu thường để trống

        Connection conn = null;

        try {
            // Nạp driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tạo kết nối đến database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");

        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy Driver JDBC!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại!");
            e.printStackTrace();
        } finally {
            // Đóng kết nối
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Đã đóng kết nối.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
