package Jobsheet12;

public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    double ipk;

   public Mahasiswa27(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;

    }

    public void tampil(){
        System.out.println(
            "NIM    :"  + nim +
            "\nNama     :" + nama +
            "\nKelas    : " + kelas +
            "\nIPK      : " + ipk 
        );
    }

}
