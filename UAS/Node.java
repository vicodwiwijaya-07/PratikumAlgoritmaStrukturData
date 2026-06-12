// Studi Kasus: Sistem Folder Komputer
//Kelompok 3
//Nama  :Vico Dwi Wijaya
//Absen :28

package UAS;

public class Node {
    String nama;
    Node left;
    Node right;

    // Constructor
    public Node(String nama) {
        this.nama = nama;
        this.left = null;
        this.right = null;
    }
}