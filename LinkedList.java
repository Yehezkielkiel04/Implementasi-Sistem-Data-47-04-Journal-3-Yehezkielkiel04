public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void tambahDiAwal(Buku data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void tambahDiAkhir(Buku data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    public void hapusDariAwal() {
        if (head == null) {
            System.out.println("Linked list kosong.");
            return;
        }
        head = head.next;
    }
    public void hapusDariAkhir() {
        if (head == null) {
            System.out.println("Linked list kosong.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void cetakList() {
        Node current = head;
        System.out.println("Daftar Buku:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
