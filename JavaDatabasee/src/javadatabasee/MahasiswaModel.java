package javadatabasee;

public class MahasiswaModel {
    private int id;
    private String nim;
    private String nama;
    private String jenis;
    private int sks;
    private double biaya;
    private int tahunMasuk;
    
    public MahasiswaModel(int id, String nim, String nama, String jenis, int sks, double biaya, int tahunMasuk) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
        this.jenis = jenis;
        this.sks = sks;
        this.biaya = biaya;
        this.tahunMasuk = tahunMasuk;
    }
    
    public MahasiswaModel(String nim, String nama, String jenis, int sks, int tahunMasuk, double biaya) {
        this(0, nim, nama, jenis, sks, tahunMasuk, biaya);
    }

    private MahasiswaModel(int i, String nim, String nama, String jenis, int sks, int tahunMasuk, double biaya) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() { return id; }
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getJenis() { return jenis; }
    public int getSks() { return sks; }
    public int getTahunMasuk() { return tahunMasuk; }
    public double getBiaya() { return biaya; }

    int tahunMasuk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
