package Lists;

import Node.Node;

public class LIFO {
    private Node[] array;
    private int top;
    private int capacity;
    

    public LIFO(int capacity) {
        this.capacity = capacity;
        this.array = new Node[capacity];
        this.top = -1;
        
    }

    public void push(int item){
        if (isFull()) {
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
        } else {
            Node newNode = new Node(item);
            top++;
            array[top] = newNode;
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não é possível realizar pop.");
        } else {
            Node poppedNode = array[top];
            int poppedItem = poppedNode.getItem();
            array[top] = null;
            top--;
            return poppedItem;
        }
    }

    public void printStack() {
        System.out.println("Pilha (LIFO): ");
        for (int i = top; i >= 0; i--) {
            System.out.println("Valor: " + array[i].getItem());
        }
        System.out.println(" ");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStackWithIndex() {
        System.out.println("Pilha (LIFO): ");
        for (int i = top; i >= 0; i--) {
            System.out.println("Índice: " + i + " - Valor: " + array[i].getItem());
        }
        System.out.println(" ");
    }
}
