package Jobsheet11;

public class QueueLinked27 {
    NodeAntrian27 head, tail;
    int size;
    int max; 

    public QueueLinked27(int max) {
        this.max = max;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    // d. Cek antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // d. Cek antrian penuh
    public boolean isFull() {
        return size == max;
    }

    // d. Mengosongkan antrian
    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }

    // e. Menambahkan antrian (Sama seperti addLast)
    public void enqueue(MahasiswaAntrian27 data) {
        if (isFull()) {
            System.out.println("Maaf, kapasitas antrian sudah penuh!");
        } else {
            NodeAntrian27 newNode = new NodeAntrian27(data, null);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
            System.out.println("Berhasil menambahkan " + data.nama + " ke dalam antrian.");
        }
    }

    // f. Memanggil antrian (Sama seperti removeFirst)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada yang bisa dipanggil!");
        } else {
            MahasiswaAntrian27 dataPanggilan = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            System.out.println(">>> MEMANGGIL ANTRIAN ATAS NAMA: " + dataPanggilan.nama + " <<<");
        }
    }

    // g. Menampilkan antrian terdepan dan paling akhir
    public void cekAntrianDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("--- Antrian Terdepan ---");
            head.data.print();
            System.out.println("--- Antrian Paling Akhir ---");
            tail.data.print();
        }
    }

    // h. Menampilkan jumlah mahasiswa yang masih mengantre
    public void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa yang masih mengantre saat ini: " + size + " orang.");
    }

    // Menampilkan seluruh isi antrian
    public void printSeluruhAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            NodeAntrian27 tmp = head;
            int nomor = 1;
            System.out.println("=== DAFTAR ANTRIAN SAAT INI ===");
            while (tmp != null) {
                System.out.print(nomor + ". ");
                tmp.data.print();
                tmp = tmp.next;
                nomor++;
            }
        }
    }
}