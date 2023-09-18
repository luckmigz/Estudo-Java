package P3.LinkedList;

// Def do nó da lista ligada 
public class Node {
    int value;
    Node next;
    
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

// Criação da classe da lista ligada

class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

//Inserir um elemento no fim da lista
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

// Deletar um elemento da lista 
    public void remove(int value) {
        if(head == null){
            return;
        }if(head.value == value){
            head = head.next;
            return;
        }
        
        Node current = head;
        while (current.next != null &&  current.next.value != value){
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }

    }

    // mostrar o valor da lista
    public void show(){
        Node current = head;
        
        while(current.next != null){
            System.out.println( current.value );
            current = current.next;
            
            
        }
        System.out.println(current.value );
    }

    public int linSearch(int[] array, int key){
        int n = array.length;
        int a = -1;
        for(int i = 0; i < n; i++){
            if(array[i] == key){
                a = i;
                return a;
            }
            a = -1; 
        }
        return a; 
    }
}

