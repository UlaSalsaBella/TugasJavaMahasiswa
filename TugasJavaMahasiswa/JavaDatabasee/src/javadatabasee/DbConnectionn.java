package javadatabasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnectionn {
    private static final String URL = "jdbc:postgresql://localhost:5432/Kulyeahh";
    private static final String USER = "postgres";
    private static final String PASSWORD = "salsa03";
    
    public DbConnectionn(){
        
    }
    
    public static Connection connect(){
        try {
            //1.  Buat koneksi ke DB
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println("Berhasil");
            
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(JavaDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void close(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbConnectionn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
