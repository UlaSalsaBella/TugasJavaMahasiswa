package javadatabasee;

import java.sql.Connection;

/**
 *
 * @author Ahmad Yusuf
 */
public class Mahasiswaa {
    int id;
    String nim;
    String nama;
    
    int tahunMasuk;
    Connection con;
    
    Mahasiswaa(int id, String nim, String nama, int tahunMasuk){
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        
        con = DbConnectionn.connect();
    }
    
    Mahasiswaa(String nim, String nama, int tahunMasuk){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
    }
}

