package P3.Queue;



public class Main {
    public static void main(String[] args){
        Queue x = new Queue();
        x.display();
        for(int i = 0; i < 20 ; i++ ) {
            x.inqueue(i);
            x.display();
        }
        int tamanho = x.size;
        x.display();
        for (int i = 0; i < tamanho ; i++ ) {
            System.out.println("Valor retirado: " + x.dequeue());
            x.display();
        }
        x.display();
    }
}
