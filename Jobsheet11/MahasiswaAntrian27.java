package Jobsheet11;

public class MahasiswaAntrian27 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaAntrian27(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void print() {
        System.out.printf("NIM: %-12s | Nama: %-15s | Keperluan: %s\n", nim, nama, keperluan);
    }
}