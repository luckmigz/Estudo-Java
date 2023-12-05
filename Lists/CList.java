package Lists;

import Node.Node;

public class CList {
    private int size; 
    private Node head;


    public CList(){
        this.size = 0;
        this.head = null;
    }

    public void addEnd(int item){
        Node node = new Node(item);

        if(this.size == 0) {  
            this.head = node;
            this.head.setNext(this.head);
            this.head.setPrev(this.head);
            this.size++;
        } else {  
            Node tail = this.head.getPrev();
            tail.setNext(node);
            node.setPrev(tail);
            node.setNext(this.head);
            this.head.setPrev(node);
            this.size++;
        }
    }
    public void addFirst(int item){
        Node node = new Node(item);

        if(this.size == 0) {  
            this.head = node;
            this.head.setNext(this.head);
            this.head.setPrev(this.head);
        } else {  
            Node tail = this.head.getPrev();
            node.setNext(this.head);
            node.setPrev(tail);
            tail.setNext(node);
            this.head.setPrev(node);
            this.head = node;
        }
        this.size++;
    }

    public void printList(){
        System.out.println("Lista Circular: ");
        if (size == 0) {
            System.out.println("Vazia");
        } else {
            Node current = this.head;
            int i = 1;
            do {
                System.out.println("Node : " + i + " Valor: " + current.getItem());
                current = current.getNext();
                i++;
            } while (current != this.head);
        }
        System.out.println(" ");
        System.out.println("Tamanho atual : " + this.size);
        System.out.println(" ");
    }

    public void deleteFirst(){
        if(this.size == 0){
            System.out.println("Vazia");
        } else if (this.size == 1) {
            this.head = null;
            this.size = 0;
        } else {
            Node tail = this.head.getPrev();
            this.head = this.head.getNext();
            tail.setNext(this.head);
            this.head.setPrev(tail);
            this.size--;
        }
    }
    public void deleteLast() {
        if(this.size == 0){
            System.out.println("Vazia");
        } else if (this.size == 1) {
            this.head = null;
            this.size = 0;
        } else {
            Node tail = this.head.getPrev();
            Node newTail = tail.getPrev();
            newTail.setNext(this.head);
            this.head.setPrev(newTail);
            this.size--;
        }
    }
    
    public void sortList() {
        if (size > 1) {
            boolean swapped;
            Node current;
            Node temp = null;
    
            do {
                swapped = false;
                current = head;
    
                while (current.getNext() != head) {
                    if (current.getItem() > current.getNext().getItem()) {
                        int tempValue = current.getItem();
                        current.setItem(current.getNext().getItem());
                        current.getNext().setItem(tempValue);
                        swapped = true;
                    }
                    current = current.getNext();
                }
                temp = current;
            } while (swapped);
    
            // Updating head in case of any change
            head = temp.getNext();
        }
    }

    public void sortListDescending() {
        if (size > 1) {
            boolean swapped;
            Node current;
            Node temp = null;
    
            do {
                swapped = false;
                current = head;
    
                while (current.getNext() != head) {
                    if (current.getItem() < current.getNext().getItem()) {
                        int tempValue = current.getItem();
                        current.setItem(current.getNext().getItem());
                        current.getNext().setItem(tempValue);
                        swapped = true;
                    }
                    current = current.getNext();
                }
                temp = current;
            } while (swapped);
    
            // Updating head in case of any change
            head = temp.getNext();
        }
    }
    public void printBackward() {
        System.out.println("Lista Circular (Reversa): ");
        if (size == 0) {
            System.out.println("Vazia");
        } else {
            Node current = this.head.getPrev();
            int i = size;
            do {
                System.out.println("Node : " + i + " Valor: " + current.getItem());
                current = current.getPrev();
                i--;
            } while (current != this.head.getPrev());
        }
        System.out.println(" ");
        System.out.println("Tamanho atual : " + this.size);
        System.out.println(" ");
    }
}
