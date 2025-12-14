package javadatabasee;

public abstract class Mahasiswaa {
    protected String nim;
    protected String nama;
    protected int sks;
    protected int tahunMasuk;

    public Mahasiswaa(String nim, String nama, int sks, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
        this.tahunMasuk = tahunMasuk;
    }

    public abstract double hitungBiayaKuliah();
}
