package Node;



public class Node {
    
    public String data;
    public int item; 
    private Node next; 
    private Node prev;
    private int key;

    public Node(String data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(int item){
        this.item = item;
        this.next = null;
        this.prev = null;
    }

    public Node(String data, int key){
        this.key = key;
        this.data = data;
        this.next = null;
        this.prev = null;
    }  

    public Node(int item,int key){
        this.key = key;
        this.item = item;
        this.next = null;
        this.prev = null;
    }  


    // Seters 
    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setItem(int item) {
        this.item = item;
    }
    public void setKey(int key) {
        this.key = key;
    }

    //Getters
    public Node getNext() {
        return next;
    }
    public String getData() {
        return data;
    }
    public int getItem() {
        return item;
    }
    public Node getPrev() {
        return prev;
    }
    public int getKey() {
        return key;
    }
    
    // Methods

    public void insert(int item){
        Node newNode = new Node(item);
        newNode.next = this.next;
        this.next = newNode;
    }
    public void insert(String data){
        Node newNode = new Node(data);
        newNode.next = this.next;
        this.next = newNode;
    }
    public void insert(int item, int key){
        Node newNode = new Node(item,key);
        newNode.next = this.next;
        this.next = newNode;
    }
    public void insert(String data, int key){
        Node newNode = new Node(data, key);
        newNode.next = this.next;
        this.next = newNode;
    }

    public void update(int item){
        this.item = item;
    }
    public void update(String data){
        this.data = data;
    }
    public void update(int item, int key){
        if(this.key == key){
            this.item = item;
        }else{}
    }
    public void update(String data,int key){
        if(this.key == key){
            this.data = data;
        }else{}
    }

   

}
