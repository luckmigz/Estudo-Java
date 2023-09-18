package P3.DLinkedList;

public class Node {
    int key; 
    Node next; 
    Node prev; 

    public Node(int key){
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList { 
    Node head; 

    public DoublyLinkedList(){
        this.head = null; 
    }

    public void add(int index){
        Node node = new Node(index);

        if(head == null){
            head = node;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }
    
    public void remove(int index){
        if(head == null){
            return; 
        }else if(head.key == index){
            head = head.next;
            head.prev = null;      
        }else{ 
            Node current = head;

            while(current != null && current.key != index){
                current = current.next;
            }
            if(current != null){
                current.prev.next = current.next;
                if(current.next != null){
                    current.next.prev = current.prev;
                }
            }
        }
    }
    public void display() {
        Node current = head;
       while (current != null) {
            System.out.print(current.key + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }       
}
