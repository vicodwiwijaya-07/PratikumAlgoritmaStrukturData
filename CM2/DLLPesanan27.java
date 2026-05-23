package CM2;

public class DLLPesanan27 {
    NodePesanan27 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    // Menambah data pesanan ke dalam list
    public void add(Pesanan27 p) {
        if (isEmpty()) {
            head = tail = new NodePesanan27(null, p, null);
        } else {
            NodePesanan27 newNode = new NodePesanan27 (tail, p, null);
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Algoritma Bubble Sort manual untuk mengurutkan berdasarkan namaPesanan
    public void sortPesanan() {
        if (isEmpty() || head.next == null) {
            return; // Tidak perlu di-sort jika kosong atau hanya 1 elemen
        }
        boolean swapped;
        do {
            swapped = false;
            NodePesanan27 current = head;
            while (current.next != null) {
                // Membandingkan dua string (Ascending)
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    // Tukar data pesanannya saja (swap data) tanpa memutus koneksi node-nya
                    Pesanan27 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Mencetak laporan dan menghitung total pendapatan
    public void printLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }
        
        // Panggil method sorting terlebih dahulu sebelum dicetak
        sortPesanan();

        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        NodePesanan27 tmp = head;
        int totalPendapatan = 0;
        
        while (tmp != null) {
            System.out.printf("%-15d %-20s %d\n", tmp.pesanan.kodePesanan, tmp.pesanan.namaPesanan, tmp.pesanan.harga);
            totalPendapatan += tmp.pesanan.harga;
            tmp = tmp.next;
        }
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL PENDAPATAN : Rp " + totalPendapatan);
    }
}