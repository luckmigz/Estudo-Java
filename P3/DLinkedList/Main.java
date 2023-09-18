package P3.DLinkedList;


public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(5);
        list.add(10);

        list.display();
        
        list.remove(5);
        list.display();
        
    }
}
