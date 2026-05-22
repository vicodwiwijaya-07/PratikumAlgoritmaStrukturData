package Jobsheet11;

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

    public void tampilIinformasi (){
        // System.out.println(nama);
        // System.out.println(nim);
        // System.out.println(kelas);
        // System.out.println(ipk);
        System.out.printf("%-15s %-15s %-10s %s\n", nama, nim, kelas, ipk);
    }

}
