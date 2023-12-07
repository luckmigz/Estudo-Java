package hashtable;

public class SList {

    private Node head;

    public SList() {
        head = null;
    }

    public void insertBeginning(int key) {
        Node novo = new Node(key);
        novo.next = head;
        head = novo;
    }

    public void prints() {
        Node current = head;
        while (current != null) {
            System.out.println(current.key);
            current = current.next;
        }
    }

    private class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            next = null;
        }
    }
}
