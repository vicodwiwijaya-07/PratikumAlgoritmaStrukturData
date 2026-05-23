package CM2;

public class DLLAntrian27 {
    NodeAntrian27 head, tail;
    int currentAntrianNo = 1; 

    public boolean isEmpty() {
        return head == null;
    }

    // Menambah antrean di belakang (Enqueue)
    public void enqueue(Pembeli27 p) {
        if (isEmpty()) {
            head = tail = new NodeAntrian27(null, currentAntrianNo, p, null);
        } else {
            NodeAntrian27 newNode = new NodeAntrian27(tail, currentAntrianNo, p, null);
            tail.next = newNode;
            tail = newNode;
        }
        currentAntrianNo++;
    }

    // Menghapus dan mengambil antrean terdepan (Dequeue)
    public NodeAntrian27 dequeue() {
        if (isEmpty()) {
            return null;
        }
        NodeAntrian27 removedNode = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removedNode;
    }

    // Mencetak seluruh antrean
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-12s %-15s %s\n", "No Antrian", "Nama", "No HP");
        NodeAntrian27 tmp = head;
        while (tmp != null) {
            System.out.printf("%-12d %-15s %s\n", tmp.noAntrian, tmp.pembeli.namaPembeli, tmp.pembeli.noHp);
            tmp = tmp.next;
        }
    }
}
