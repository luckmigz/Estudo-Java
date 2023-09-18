package P3.Array;

import java.util.Arrays;

public class Array {
    int[] arr;
    int size;

    public Array(int n){
        arr = new int[n];
        size = 0;
    }
    public void insert(int value) {
        if (size >= arr.length) {
            // Redimensionar o array se necessário (por exemplo, dobrar o tamanho)
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[size++] = value;
    }
    public void remove(int value) {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
    }
    public void sort() {
        Arrays.sort(arr, 0, size);
    }

    // Método para exibir os elementos do array
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

