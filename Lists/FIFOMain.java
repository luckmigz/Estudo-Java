package Lists;

public class FIFOMain {
    public static void main(String[] args) {
        // Criando uma fila (FIFO) com capacidade para 5 elementos
        FIFO queue = new FIFO(5);

        // Adicionando elementos na fila
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Imprimindo a fila com índices
        queue.printQueueWithIndex();

        // Removendo elementos da fila
        System.out.println("Elemento removido: " + queue.dequeue());
        System.out.println("Elemento removido: " + queue.dequeue());

        // Imprimindo a fila após remover elementos
        queue.printQueueWithIndex();
    }
}
