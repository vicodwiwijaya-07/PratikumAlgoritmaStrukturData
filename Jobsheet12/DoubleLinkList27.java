package Jobsheet12;

public class DoubleLinkList27 {

    Node27 head;
    Node27 tail;

    public DoubleLinkList27() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa27 data) {
        Node27 newNode = new Node27(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa27 data) {
        Node27 newNode = new Node27(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa27 data) {
        Node27 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM" + keyNim + "tidak ditemukan. ");
            return;
        }

        Node27 newNode = new Node27(data);

        //jika current adalah tail, node baru ditambahkan diakhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;

        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong. ");
            return;
        }

        Node27 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        // Mulai dari belakang (tail)
        Node27 current = tail;
        System.out.println("--- Cetak Data Mundur (Reverse) ---");

        // Looping selama current tidak null (belum melewati head)
        while (current != null) {
            current.data.tampil();
            // Bergeser ke node sebelumnya menggunakan prev
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Liked List kosong.");
            return;
        }
     // Simpan data node terakhir sebelum dihapus
        Mahasiswa27 deletedData = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("--- Data Awal Berhasil Dihapus ---");
        deletedData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Liked List kosong.");
            return;
        }
    // Simpan data node terakhir sebelum dihapus
        Mahasiswa27 deletedData = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        
        System.out.println("--- Data Awal Berhasil Dihapus ---");
        deletedData.tampil();
    }
}
