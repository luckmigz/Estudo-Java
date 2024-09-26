package DoubleLinked;



public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {  // Lista vazia
            head = newNode;
            tail = newNode;
        } else if (value >= head.value) {  // Inserir no início
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (value <= tail.value) {  // Inserir no final
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {  // Inserir no meio
            Node current = head;
            while (current != null && current.value > value) {
                current = current.next;
            }
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
        printList();
    }
    public void printList() {
        if (head == null) {
            System.out.println("Lista Vazia!");
        } else {
            Node current = head;
            System.out.print("Tamanho: " + size + " | Elementos: ");
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
