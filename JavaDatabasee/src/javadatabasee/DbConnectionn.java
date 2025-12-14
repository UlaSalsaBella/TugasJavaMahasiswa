package javadatabasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionn {

    private static final String URL = "jdbc:postgresql://localhost:5432/Kulyeahh";
    private static final String USER = "postgres";
    private static final String PASSWORD = "salsa03";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Koneksi gagal: " + ex.getMessage());
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.out.println("Gagal menutup koneksi: " + ex.getMessage());
        }
    }
}
