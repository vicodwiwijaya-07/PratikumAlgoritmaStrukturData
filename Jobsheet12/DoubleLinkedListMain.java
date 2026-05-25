package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain {

    
    public static Mahasiswa27 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa27(nim, nama, kelas, ipk);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        DoubleLinkList27 list = new DoubleLinkList27();
        
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data ditengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data secara terbalik (Reverse)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa27 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa27 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("\nMasukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa27 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    
                    list.removeFirst(); 
                    //System.out.println("Menu hapus belum ditambahkan di DoubleLinkList27");
                    break;
                case 5:
                    
                    list.removeLast();
                    //System.out.println("Menu hapus belum ditambahkan di DoubleLinkList27");
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 0);

        
        sc.close(); 
    } 
} 