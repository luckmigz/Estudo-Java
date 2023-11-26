package Heap.Medico;

public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Construir o heap (reorganizar o array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extrair elementos do heap um por um
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz atual para o final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // chama max heapify na heap reduzida
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int left = 2 * i + 1; // esquerda = 2*i + 1
        int right = 2 * i + 2; // direita = 2*i + 2

        // Se o filho da esquerda é maior que a raiz
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // Se o filho da direita é maior que o maior até agora
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // Se o maior não é a raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente heapify a subárvore afetada
            heapify(arr, n, largest);
        }
    }

    // Teste do algoritmo
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Array ordenado é");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}