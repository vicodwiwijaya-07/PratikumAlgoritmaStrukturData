package CM2;

import java.util.Locale;
import java.util.Scanner;

public class MainRoyalDelish27 {
    public static void main(String[] args) {
        // Menggunakan Locale.US untuk mencegah InputMismatchException
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        DLLAntrian27 antrian = new DLLAntrian27();
        DLLPesanan27 daftarPesanan = new DLLPesanan27();

        // Data awal (Dummy) sesuai instruksi agar tidak perlu input satu per satu terus
        antrian.enqueue(new Pembeli27 ("Ainra", "08224500000"));
        antrian.enqueue(new Pembeli27 ("Danra", "08224511111"));
        antrian.enqueue(new Pembeli27 ("Sanri", "08224522222"));

        int pilihan = -1;

        do {
            System.out.println("\n=================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer / enter yang tersisa

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    
                    Pembeli27 p = new Pembeli27 (nama, hp);
                    antrian.enqueue(p);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (antrian.currentAntrianNo - 1));
                    break;
                    
                case 2:
                    antrian.print();
                    break;
                    
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian saat ini sedang kosong!");
                    } else {
                        // Keluarkan pembeli terdepan dari antrean
                        NodeAntrian27 antrianDipanggil = antrian.dequeue();
                        Pembeli27 pembeliAktif = antrianDipanggil.pembeli;
                        
                        System.out.println("--- Input Pesanan untuk " + pembeliAktif.namaPembeli + " ---");
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine(); // Bersihkan buffer
                        
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine(); // Bersihkan buffer
                        
                        Pesanan27 pesananBaru = new Pesanan27(kode, namaPesanan, harga);
                        daftarPesanan.add(pesananBaru);
                        
                        System.out.println("\n" + pembeliAktif.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                    
                case 4:
                    daftarPesanan.printLaporan();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem Royal Delish!");
                    break;
                    
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 0);
    }
}