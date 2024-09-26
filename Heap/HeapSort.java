package Heap;




public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Construir a árvore de max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            ajustarHeap(arr, n, i);
        }

        // Extrair elementos da árvore de max-heap um por um
        for (int i = n - 1; i > 0; i--) {
            // Mova a raiz (o maior elemento) para o final do array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Chame a função para ajustar a árvore de max-heap no heap reduzido
            ajustarHeap(arr, i, 0);
        }
    }

    public static void ajustarHeap(int[] arr, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        // Se o filho da esquerda for maior que a raiz
        if (esquerda < n && arr[esquerda] > arr[maior]) {
            maior = esquerda;
        }

        // Se o filho da direita for maior que a raiz
        if (direita < n && arr[direita] > arr[maior]) {
            maior = direita;
        }

        // Se o maior não for a raiz
        if (maior != i) {
            int troca = arr[i];
            arr[i] = arr[maior];
            arr[maior] = troca;

            // Recursivamente ajustar a subárvore afetada
            ajustarHeap(arr, n, maior);
        }
    }

    public static void imprimirArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Array de entrada:");
        imprimirArray(arr);

        heapSort(arr);

        System.out.println("Array ordenado usando o HeapSort:");
        imprimirArray(arr);
    }
}
