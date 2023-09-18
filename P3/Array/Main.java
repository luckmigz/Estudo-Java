package P3.Array;

public class Main {
    public static void main(String []args){
        Array array = new Array(10);

        array.insert(10);
        array.insert(150);
        array.insert(20);
        array.display();
        array.sort(); 
        array.display();
        array.remove(10);
        array.display();
    }
}
