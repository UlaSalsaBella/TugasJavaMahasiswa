package javadatabasee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {

    public void insert(MahasiswaModel m) {
        String sql = "INSERT INTO mahasiswa (nim, nama, jenis, sks, biaya, tahun_masuk) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DbConnectionn.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNim());
            ps.setString(2, m.getNama());
            ps.setString(3, m.getJenis());
            ps.setInt(4, m.getSks());
            ps.setDouble(5, m.getBiaya());
            ps.setInt(6, m.tahunMasuk());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    public void update(MahasiswaModel m) {
        String sql = "UPDATE mahasiswa SET nim=?, nama=?, jenis=?, sks=?, tahun_masuk=?, biaya=? WHERE id=?";
        try (Connection conn = DbConnectionn.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNim());
            ps.setString(2, m.getNama());
            ps.setString(3, m.getJenis());
            ps.setInt(4, m.getSks());
            ps.setInt(5, m.tahunMasuk());
            ps.setDouble(6, m.getBiaya());
            ps.setInt(7, m.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("ERROR update: " + e.getMessage());
        }
    }

    public List<MahasiswaModel> getAll() {
        List<MahasiswaModel> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";

        try (Connection conn = DbConnectionn.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new MahasiswaModel(rs.getInt("id"), rs.getString("nim"), rs.getString("nama"), rs.getString("jenis"), rs.getInt("sks"), rs.getInt("tahun_masuk"), (int) rs.getDouble("biaya")));
            }
        } catch (SQLException e) {
            System.out.println("GetAll error: " + e.getMessage());
        }
        return list;
    }
}
