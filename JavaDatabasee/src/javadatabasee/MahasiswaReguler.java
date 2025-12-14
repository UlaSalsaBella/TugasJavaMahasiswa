package javadatabasee;

public class MahasiswaReguler extends Mahasiswaa {

    public MahasiswaReguler(String nim, String nama, int sks, int tahunMasuk) {
        super(nim, nama, sks, tahunMasuk);
    }

    @Override
    public double hitungBiayaKuliah() {
        return sks * 150000;
    }
}
