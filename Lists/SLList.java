package Lists;

import Node.Node;

public class SLList {
    
    Node head;
    int size;

    public SLList(){
        this.head = null;
        this.size = 0;
    }

    public void insertB(int item){
        Node n = new Node(item);
        if(size == 0){
            this.head = n;
            this.size++;
        } else{
            n.setNext(this.head);
            this.head = n;
            this.size++;
        }
    }

    public void insertE(int item){
        if(size == 0){
            Node n = new Node(item);
            this.head = n;
            this.size++;
        }else{
            Node n2 = this.head;
            for(int i = 1; i < size; i++){
                n2 = n2.getNext();
            }
            n2.insert(item);
            this.size++;
        }
    }

    public void deleteB(){
        if(this.head == null){
            System.out.println("Vazia");
        }else{
            this.head = this.head.getNext();
            this.size--;
        }
    }


    public void deleteE(){
        if(size == 0){
            System.out.println("Vazia");

        }else{
            if(size == 1){
                this.head = null;
                this.size--;
            }else{
                Node n = this.head;
                for(int i = 1; i < size; i++){
                    n = n.getNext();

                }
                n.setNext(null);
                this.size--;
            }
        }

    }


    public void printList(){
        System.out.println("Lista: ");
        if(size == 0){
            System.out.println("Vazia");
        }else{
            Node n = this.head; 
            for(int i = 1; i<=size; i++){
                System.out.println("Node : " + i + " Valor: " + n.getItem() );
                n = n.getNext();
            }
        }   
        System.out.println(" ");
        System.out.println("Tamanho atual : " + this.size);
        System.out.println(" ");
    }


}
