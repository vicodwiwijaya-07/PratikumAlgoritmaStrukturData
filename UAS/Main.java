package UAS;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MEMBANGUN STRUKTUR FOLDER BINAARY TREE ===");
        FolderTree tree = new FolderTree("Root");
        
        // Menambahkan sesuai struktur soal (Gambar)
        tree.tambahNode(tree.root, "Root", "Dokumen", "kiri");
        tree.tambahNode(tree.root, "Root", "Gambar", "kanan");
        tree.tambahNode(tree.root, "Dokumen", "Tugas", "kiri");
        tree.tambahNode(tree.root, "Dokumen", "Surat", "kanan");
        
        // Pada gambar, Foto ada di sebelah kanan dari Gambar (atau bisa dikiri, kita asumsikan kanan)
        tree.tambahNode(tree.root, "Gambar", "Foto", "kanan"); 
        
        System.out.println("Struktur berhasil dibuat!\n");

        // MENCETAK TRAVERSAL 
        System.out.println("=== 1. HASIL TRAVERSAL ===");
        System.out.print("Preorder (Root-Kiri-Kanan)  : ");
        tree.preOrder(tree.root);
        
        System.out.print("\nInorder (Kiri-Root-Kanan)   : ");
        tree.inOrder(tree.root);
        
        System.out.print("\nPostorder (Kiri-Kanan-Root) : ");
        tree.postOrder(tree.root);
        System.out.println("\n");

        // MENCETAK PARENT & CHILD 
        System.out.println("=== 2. MENCARI PARENT & CHILD ===");
        System.out.println(tree.getChild(tree.root, "Dokumen"));
        System.out.println("Parent dari 'Foto' adalah : " + tree.getParent(tree.root, "Foto", null));
        System.out.println();

        // UJI COBA TAMBAH NODE BARU 
        System.out.println("=== 3. MENGUJI TAMBAH NODE ===");
        System.out.println("Menambahkan folder 'Video' ke dalam 'Gambar' (posisi kiri)...");
        tree.tambahNode(tree.root, "Gambar", "Video", "kiri");
        System.out.print("Cek Traversal Preorder Baru : ");
        tree.preOrder(tree.root);
        System.out.println("\n");

        // UJI COBA HAPUS NODE 
        System.out.println("=== 4. MENGUJI HAPUS NODE ===");
        System.out.println("Menghapus folder 'Dokumen' (beserta Tugas & Surat di dalamnya)...");
        tree.hapusNode(tree.root, "Dokumen");
        System.out.print("Cek Traversal Preorder Setelah Dihapus: ");
        tree.preOrder(tree.root);
        System.out.println("\n ");


        // MENJAWAB PERTANYAAN ANALISIS 
        System.out.println("=== 5. JAWABAN PERTANYAAN ANALISIS ===");
        System.out.println("Traversal yang paling tepat untuk menghapus folder beserta isinya adalah POSTORDER (Kiri - Kanan - Root).");
        System.out.println("Alasan: Ini harus menghapus isi folder (child) dari bagian terdalam terlebih dahulu");
        System.out.println("sebelum menghapus folder luarnya (parent). Jika parent dihapus duluan (seperti Preorder),");
        System.out.println("maka ini akan kehilangan akses ke child-nya.");
        System.out.println("\n ");
    }
}