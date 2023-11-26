package Heap;

public class Main {
    public static void main(String[] args) {
      
        Heap heapMin = new Heap(10);
        Heap heapMax = new Heap(10);

      
        int[] array = {4, 10, 3, 5, 1, 8, 7};

        heapMin.buildHeap(array);
        heapMax.buildHeap(array);

        
        heapMin.insert(2);
        heapMax.insert(15);

       
        Object max = heapMax.extractMax();
        System.out.println("Max: " + max);

        
        Object min = heapMin.extractMax();
        System.out.println("Min: " + min);

       
        System.out.println("Heap Min:");
        heapMin.displayHeap();
        System.out.println("Heap Max:");
        heapMax.displayHeap();

        Heap heap = new Heap(10);
       
        // trocar o array de teste
        int[] a = {27, 18, 14, 17, 12, 13, 11, 15, 16};
        heap.buildHeap(a);
        int height = heap.calculateHeapHeight();
        
        

        System.out.println("Altura do Heap: " + height);
   
        System.out.println("Altura do Heap: " + heapMin.calculateHeapHeight());
    
        System.out.println("Altura do Heap: " + heapMax.calculateHeapHeight());
    }
}
