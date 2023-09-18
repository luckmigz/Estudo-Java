package P3.LinkedList;
public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(10);
        list.add(100);

        System.out.println("Valores na lista: "); 
        list.show();

        list.remove(10);
        
        System.out.println("Valores na lista: "); 
        list.show();
    }


}
