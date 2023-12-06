package Lists;

public class LIFOMain {
    public static void main(String[] args) {
        // Criando uma pilha (LIFO) com capacidade para 5 elementos
        LIFO stack = new LIFO(5);

        // Empilhando elementos na pilha
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Tentando adicionar mais elementos que a capacidade máxima
        stack.push(6);

        // Imprimindo a pilha
        stack.printStackWithIndex();

        // Removendo elementos da pilha
        System.out.println("Elemento removido: " + stack.pop());
        System.out.println("Elemento removido: " + stack.pop());

        // Imprimindo a pilha após remover elementos
        stack.printStackWithIndex();
    }
}
