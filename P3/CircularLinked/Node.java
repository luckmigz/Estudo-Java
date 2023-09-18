package P3.CircularLinked;

public class Node {
    int key;
    Node next;
  

    public Node(int key){
        this.key = key;
        this.next = this; 
    }
}
class CircularLinked {
    Node head;

    public CircularLinked(){
        this.head = null;
    }

    public void add(int index){
        Node node = new Node(index);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
    }
      public void remove(int index) {
        if (head == null) {
            return;
        }
        if (head.key == index) {
            if (head.next == head) {
                head = null;
            } else {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                head = head.next;
                current.next = head;
            }
        } else {
            Node current = head;
            while (current.next != head && current.next.key != index) {
                current = current.next;
            }
            if (current.next != head) {
                current.next = current.next.next;
            }
        }
    }

    // Método para exibir os elementos da lista
    public void display() {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.print(current.key + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}