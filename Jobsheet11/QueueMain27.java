package Jobsheet11;

import java.util.Scanner;

public class QueueMain27 {
    public static void menu() {
        System.out.println("\n======================================");
        System.out.println("  SISTEM ANTRIAN UNIT KEMAHASISWAAN");
        System.out.println("======================================");
        System.out.println("1. Tambah Antrian Mahasiswa (Enqueue)");
        System.out.println("2. Panggil Antrian Depan (Dequeue)");
        System.out.println("3. Cek Antrian Terdepan & Terakhir");
        System.out.println("4. Tampilkan Jumlah Antrian");
        System.out.println("5. Tampilkan Seluruh Antrian");
        System.out.println("6. Kosongkan Semua Antrian");
        System.out.println("7. Keluar");
        System.out.print("Pilih menu (1-7): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat antrian dengan kapasitas maksimal 10 orang
        QueueLinked27 antrian = new QueueLinked27(10); 
        int pilihan = 0;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan sisa enter / buffer

            System.out.println("--------------------------------------");
            switch (pilihan) {
                case 1:
                    // c. Mahasiswa harus mendaftarkan datanya
                    if (!antrian.isFull()) {
                        System.out.print("Masukkan NIM       : ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama      : ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Keperluan : ");
                        String keperluan = sc.nextLine();
                        
                        MahasiswaAntrian27 mhsBaru = new MahasiswaAntrian27(nim, nama, keperluan);
                        antrian.enqueue(mhsBaru);
                    } else {
                        System.out.println("Antrian penuh! Silakan tunggu ada yang selesai.");
                    }
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.cekAntrianDepanBelakang();
                    break;
                case 4:
                    antrian.tampilkanJumlah();
                    break;
                case 5:
                    antrian.printSeluruhAntrian();
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 7);
    }
}