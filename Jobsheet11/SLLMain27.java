package Jobsheet11;

import java.util.Locale;
import java.util.Scanner;

public class SLLMain27 {
    public static void main(String[] args) {
        SingleLinkedList27 sll = new SingleLinkedList27();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Mahasiswa27 mhs1 = new Mahasiswa27("21212203", "Dirga", "4D", 3.6);
        Mahasiswa27 mhs2 = new Mahasiswa27("22212202", "Cintia", "3C", 3.5 );
        Mahasiswa27 mhs3 = new Mahasiswa27("232122201", "Bimon", "2B", 3.8 );
        Mahasiswa27 mhs4 = new Mahasiswa27("242122000", "Alvaro", "1A", 4.0 );

        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.addLast(mhs4);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2); 
        sll.print();


    //Meminta input dari keyboard
        System.out.println("=== Tambah Data Mahasiswa dari Keyboard ===");
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();

        //Masukkan data dari keyboard tadi ke object Mahasiswa baru
        Mahasiswa27 mhsBaru = new Mahasiswa27(nim, nama, kelas, ipk);

        // Tambahkan ke dalam Linked List (misalnya kita taruh di akhir)
        sll.addLast(mhsBaru);

        // Tampil hasilnya
        System.out.println("\n--- Isi Linked List Setelah Ditambah ---");
        sll.print();

    }
}
