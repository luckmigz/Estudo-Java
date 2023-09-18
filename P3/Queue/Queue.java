package P3.Queue;


public class Queue {
    int size; 
    Node head;
    Node tail;

    public Queue(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    public void inqueue(int index){
        Node node = new Node(index);

        if(this.size== 0){
            this.head = node;
            this.tail = node;
            this.size++;
        }else{
            this.tail.next = node;
            this.tail = node;
            this.size++;
        }
    }
    public int dequeue(){
        int t; 
        if(this.size== 0){
            System.out.println("Fila Vazia");
            return -1;
        }else{
            if(this.size== 1){
                t = this.head.index; 
                this.head = null;
                this.tail = null;
                this.size--;
                return t;
            }else{
                t = this.head.index;
                this.head = this.head.next;
                this.head.prev = null;
                this.size--;
                return t;
            }
        }
    }
    public void display(){
        Node node;
        node = this.head;
    
        if(this.size == 0){
            System.out.println("Fila Vazia");
        }else{
            System.out.println("(");
            while( node != null ){
                System.out.println(node.index+ " ");
                node = node.next;
            }
            System.out.println(")"+ "\n");
        }
    }
}
