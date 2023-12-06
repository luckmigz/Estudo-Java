package Lists;

import Node.Node;

public class FIFO {
    private Node[] queueArray;
    private int front;
    private int rear;
    private int capacity;

    public FIFO(int capacity) {
        this.capacity = capacity;
        this.queueArray = new Node[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("A fila está cheia. Não é possível adicionar mais elementos.");
        } else {
            Node newNode = new Node(item);
            rear = (rear + 1) % capacity;
            queueArray[rear] = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia. Não é possível realizar dequeue.");
        } else {
            Node dequeuedNode = queueArray[front];
            int dequeuedItem = dequeuedNode.getItem();
            queueArray[front] = null;
            front = (front + 1) % capacity;
            return dequeuedItem;
        }
    }

    public void printQueue() {
        System.out.println("Fila (FIFO): ");
        int count = 0;
        int i = front;
        while (count < size()) {
            System.out.println("Valor: " + queueArray[i].getItem());
            i = (i + 1) % capacity;
            count++;
        }
        System.out.println(" ");
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return size() == capacity;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else if (front <= rear) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1;
        }
    }

    public void printQueueWithIndex() {
        System.out.println("Fila (FIFO): ");
        int count = 0;
        int i = front;
        while (count < size()) {
            System.out.println("Índice: " + i + " - Valor: " + queueArray[i].getItem());
            i = (i + 1) % capacity;
            count++;
        }
        System.out.println(" ");
    }

}
