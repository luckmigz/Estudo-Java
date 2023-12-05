package Lists;

public class SListMain {
    public static void main(String[] args){
        SLList main = new SLList();
        main.printList();

        main.insertE(10);
        main.printList();

        main.insertE(99);
        main.printList();

        main.insertE(33);
        main.printList();

        main.insertB(44);
        main.printList();

        main.deleteE();
        main.printList();

        main.deleteB();
        main.printList();
        

    }

}
