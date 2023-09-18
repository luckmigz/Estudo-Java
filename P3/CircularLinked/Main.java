package P3.CircularLinked;

public class Main {
    public static void main(String[] args){
        CircularLinked list = new CircularLinked();

        
        list.add(5);
        list.add(10);

        list.display();
        
        list.remove(5);
        list.display();


    }
}
