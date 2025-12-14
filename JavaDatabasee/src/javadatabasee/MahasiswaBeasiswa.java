package javadatabasee;

public class MahasiswaBeasiswa extends Mahasiswaa {

    public MahasiswaBeasiswa(String nim, String nama, int sks, int tahunMasuk) {
        super(nim, nama, sks, tahunMasuk);
    }

    @Override
    public double hitungBiayaKuliah() {
        return sks * 150000 * 0.5;
    }
}
