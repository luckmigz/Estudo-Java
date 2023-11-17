package P4.Heap;

public class HeapMain {
    public static void main(String[] args) {
        String[] array = {"apple", "orange", "banana", "grape", "cherry"};
        StringHeap stringHeap = new StringHeap(array.length);

        stringHeap.buildHeap(array);
        stringHeap.displayHeap();

        stringHeap.insert("watermelon");
        stringHeap.displayHeap();

        stringHeap.heapSort();
        stringHeap.displayHeap();

        int[] intArray = {12, 11, 13, 5, 6, 7};

        Heap heap = new Heap(intArray.length);

        heap.buildHeap(intArray);
        heap.displayHeap();

        heap.insert(10);
        heap.displayHeap();

        heap.heapSort();
        heap.displayHeap();
    }
}
