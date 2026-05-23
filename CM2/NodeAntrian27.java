package CM2;

public class NodeAntrian27 {
    int noAntrian;
    Pembeli27 pembeli;
    NodeAntrian27 prev, next;

    public NodeAntrian27 (NodeAntrian27 prev, int noAntrian, Pembeli27 pembeli, NodeAntrian27 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}