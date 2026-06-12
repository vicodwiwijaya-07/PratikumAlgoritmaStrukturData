package UAS;

public class FolderTree {
    Node root;

    public FolderTree(String rootName) {
        root = new Node(rootName);
    }

    
    // 1. FUNGSI MENAMBAH NODE
    
    public boolean tambahNode(Node current, String namaParent, String namaBaru, String posisi) {
        if (current == null) return false;

        // Jika menemukan parent yang dicari
        if (current.nama.equals(namaParent)) {
            if (posisi.equalsIgnoreCase("kiri")) {
                if (current.left == null) {
                    current.left = new Node(namaBaru);
                    return true;
                } else {
                    System.out.println("Gagal: Posisi kiri " + namaParent + " sudah terisi!");
                    return false;
                }
            } else if (posisi.equalsIgnoreCase("kanan")) {
                if (current.right == null) {
                    current.right = new Node(namaBaru);
                    return true;
                } else {
                    System.out.println("Gagal: Posisi kanan " + namaParent + " sudah terisi!");
                    return false;
                }
            }
        }

        // Cari rekursif ke kiri dan kanan
        if (tambahNode(current.left, namaParent, namaBaru, posisi)) return true;
        return tambahNode(current.right, namaParent, namaBaru, posisi);
    }

   
    // 2. FUNGSI MENGURANGI/MENGHAPUS NODE (Beserta isinya)
    
    public boolean hapusNode(Node current, String target) {
        if (current == null) return false;

        if (current.left != null && current.left.nama.equals(target)) {
            current.left = null; // Memutus rantai, Java Garbage Collector akan membersihkan sisanya
            return true;
        }
        if (current.right != null && current.right.nama.equals(target)) {
            current.right = null;
            return true;
        }

        if (hapusNode(current.left, target)) return true;
        return hapusNode(current.right, target);
    }

    
    // 3. FUNGSI TRAVERSAL (Preorder, Inorder, Postorder)
    
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.nama + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.nama + " ");
            inOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.nama + " ");
        }
    }

    
    // 4. FUNGSI MENCETAK CHILD DARI SEBUAH NODE

    public String getChild(Node current, String target) {
        if (current == null) return null;
        
        if (current.nama.equals(target)) {
            String kiri = (current.left != null) ? current.left.nama : "[Kosong]";
            String kanan = (current.right != null) ? current.right.nama : "[Kosong]";
            return "Child dari '" + target + "' -> Kiri: " + kiri + ", Kanan: " + kanan;
        }

        String hasilKiri = getChild(current.left, target);
        if (hasilKiri != null) return hasilKiri;
        return getChild(current.right, target);
    }

    
    // 5. FUNGSI MENCETAK PARENT DARI SEBUAH NODE

    public String getParent(Node current, String target, Node parentSekarang) {
        if (current == null) return null;

        if (current.nama.equals(target)) {
            return (parentSekarang != null) ? parentSekarang.nama : "Tidak ada (Ini adalah Root)";
        }

        String hasilKiri = getParent(current.left, target, current);
        if (hasilKiri != null) return hasilKiri;
        return getParent(current.right, target, current);
    }
}