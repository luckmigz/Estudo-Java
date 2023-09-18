package P3.Stack;

public class Node {
    int index;
    Node next; 
    Node prev; 

    public Node(){
        this.index = 0;
        this.next = null;
        this.prev = null;
    }
    public Node(int index){
        this.index = index;
        this.next = null;
        this.prev = null;
    }
}
