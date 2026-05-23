package CM2;

public class NodePesanan27 {
    Pesanan27 pesanan;
    NodePesanan27 prev, next;

    public NodePesanan27 (NodePesanan27 prev, Pesanan27 pesanan, NodePesanan27 next) {
        this.prev = prev;
        this.pesanan = pesanan; 
        this.next = next;
    }
}