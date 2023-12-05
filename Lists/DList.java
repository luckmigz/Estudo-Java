package Lists;

import Node.Node;

public class DList {
    public int size; 
    public Node head, tail;
   

    public DList(int item){
        Node node = new Node(item);
        node.setNext(null);
        node.setPrev(null);
        this.head = node;
        this.tail = node;
        size = 1;
    }   

    public DList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addEnd(int item){
        Node node = new Node(item);

        if(this.size == 0) {  
            this.head = node;
            this.tail = node;
            this.size++;
        }  
        else {  
            this.tail.setNext(node);
            
            this.tail = node;
            this.size++;
        }  
    }
    public void addBegin(int item){
        Node node = new Node(item);

        if(this.size == 0){
            this.head = node;
            this.tail = node;
            this.size++;
        }else{
            this.head.setPrev(node);
            node.setNext(this.head);
            this.head = node;
            this.size++;
        }
    }

    public void printList(){
        System.out.println("Lista: ");
        if (size == 0) {
            System.out.println("Vazia");
        } else {
            Node n = this.head;
            int i = 1;
            while (n != null) {
                System.out.println("Node : " + i + " Valor: " + n.getItem());
                n = n.getNext();
                i++;
            }
        }
        System.out.println(" ");
        System.out.println("Tamanho atual : " + this.size);
        System.out.println(" ");;
    }

    public void printBackward(){
        System.out.println("Lista: ");
        if (size == 0) {
            System.out.println("Vazia");
        } else {
            Node n = this.tail;
            int i = this.size;
            while (n != null) {
                System.out.println("Node : " + i + " Valor: " + n.getItem());
                n = n.getPrev();
                i--;
            }
        }
        System.out.println(" ");
        System.out.println("Tamanho atual : " + this.size);
        System.out.println(" ");
    }

    public void deleteFirst(){
        if(this.size == 0){
            System.out.println("Vazia");
        }else{
            if(this.size == 1){
                this.head = null;
                this.tail = null;
                this.size = 0;
            }else{
                this.head = this.head.getNext();
                this.head.setPrev(null);
                this.size--;
            }
        }
    }

    public void deleteLast() {
        if (this.size == 0)
            System.out.println("Deleção inválida. Lista vazia...");
            else {
                if (this.size == 1) {
                this.head = null;
                this.tail = null;
                this.size = 0;
                }else {
                    this.tail = this.tail.getPrev();
                    this.tail.setNext(null);
                    this.size--;
                }
            }
        }

    public void sortListDescending() {
        if (size > 1) {
            Node current = head;
            while (current != null) {
                Node index = current.getNext();
                while (index != null) {
                    if (current.getItem() > index.getItem()) {
                        int temp = current.getItem();
                        current.setItem(index.getItem());
                        index.setItem(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }

    public void sortList() {
        if (size > 1) {
            Node current = head;
            while (current != null) {
                Node index = current.getNext();
                while (index != null) {
                    if (current.getItem() < index.getItem()) {
                        int temp = current.getItem();
                        current.setItem(index.getItem());
                        index.setItem(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }

    }
}   


