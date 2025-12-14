package javadatabasee;

public class MahasiswaInternasional extends Mahasiswaa {

    public MahasiswaInternasional(String nim, String nama, int sks, int tahunMasuk) {
        super(nim, nama, sks, tahunMasuk);
    }

    @Override
    public double hitungBiayaKuliah() {
        return sks * 300000;
    }
}

