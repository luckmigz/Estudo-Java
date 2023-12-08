package Lists;

public class DListMain {
    public static void main(String[] args) {  
        
        DList main = new DList();  
       
        main.addBegin("4");  
        main.addBegin("Jonatâ");  
        main.addBegin("Celton Melo");  
        main.addBegin("Robert");  
        main.addEnd("6");  
        main.addEnd("mil300eSIX.4");  
   
        main.printList();  
        main.printBackward();

        System.out.println("Lista antes da ordem decrescente: \n");
        main.printList(); 

        System.out.println("Lista depois da ordem decrescente: \n");
        main.sortListDescending();
        main.printList(); 

        System.out.println("Lista antes da ordem crescente: \n");
        main.printList(); 

        System.out.println("Lista depois da ordem crescente: \n");
        main.sortList();
        main.printList(); 


    }  
}
