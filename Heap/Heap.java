package Heap;

public class Heap {
    private int[] heapArray;
    private int heapSize;

    public Heap(int capacity) {
        heapArray = new int[capacity];
        heapSize = 0;
    }

    public void buildHeap(int[] array) {
        heapArray = array.clone();
        heapSize = array.length;
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    public void heapify(int index) {
        int largest = index;
        int left = getLeft(index);
        int right = getRight(index);

        if (left < heapSize && compare(heapArray[left], heapArray[largest]) > 0) {
            largest = left;
        }

        if (right < heapSize && compare(heapArray[right], heapArray[largest]) > 0) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    public void heapSort() {
        for (int i = heapSize - 1; i >= 0; i--) {
            swap(0, i);
            heapSize--;
            heapify(0);
        }
    }

    public void insert(int value) {
        if (heapSize == heapArray.length) {
            System.out.println("Heap cheia.");
            return;
        }

        heapSize++;
        int index = heapSize - 1;
        heapArray[index] = value;

        while (index != 0 && compare(heapArray[getParent(index)], heapArray[index]) < 0) {
            swap(index, getParent(index));
            index = getParent(index);
        }
    }

    public int extractMax() {
        if (heapSize <= 0) {
            throw new IllegalStateException("Heap is empty.");
        }

        int max = heapArray[0];
        heapArray[0] = heapArray[heapSize - 1];
        heapSize--;
        heapify(0);
        return max;
    }

    public int[] getHeapArray() {
        return heapArray;
    }

    public void displayHeap() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heapArray[i] + " ");
        }
        System.out.println();
    }

  
    private int getParent(int i) {
        return (i - 1) / 2;
    }

    private int getLeft(int i) {
        return 2 * i + 1;
    }

    private int getRight(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

   
    private int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public int calculateHeapHeight() {
        return calculateHeapHeight(heapSize);
    }

    private int calculateHeapHeight(int size) {
        return (int) (Math.log(size) / Math.log(2));
    }
    
}
