package Lists;

public class CListMain {
    public static void main(String[] args) {
        CList listaCircular = new CList();

        listaCircular.printList(); // Print empty list

        listaCircular.addFirst(4);
        listaCircular.printList(); 
      

        listaCircular.addFirst(2);
      
        listaCircular.printBackward(); 

        listaCircular.addEnd(3);
        listaCircular.printList(); 
       

        listaCircular.addFirst(5);
        listaCircular.printList(); 
      

        listaCircular.addFirst(8);
       
        listaCircular.printBackward(); // Print list in reverse order

       

        System.out.println("Lista antes da ordenação:");
        listaCircular.printList();

        System.out.println("Ordenação Decrescente:");
        listaCircular.sortList();
        listaCircular.printList();

        System.out.println("Ordenação Crescente:");
        listaCircular.sortListDescending();
        listaCircular.printList();
    }
}
