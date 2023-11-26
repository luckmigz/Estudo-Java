package Arvore;

public class Main {
    public static void main(String[] args) {
        BiTree tree = new BiTree();
        
        // Inserindo elementos na árvore
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);

        // Traversal em pré-ordem
        System.out.println("Traversal em pré-ordem:");
        tree.preOrderTraversal();
        System.out.println();

        // Traversal em pós-ordem
        System.out.println("\nTraversal em pós-ordem:");
        tree.postOrderTraversal();
        System.out.println();

        // Traversal em ordem simétrica (in-order)
        System.out.println("\nTraversal em ordem simétrica (in-order):");
        tree.inOrderTraversal();
        System.out.println();

        // Buscando um elemento na árvore
        int searchKey = 12;
        if (tree.search(searchKey)) {
            System.out.println("\nElemento " + searchKey + " encontrado na árvore.");
        } else {
            System.out.println("\nElemento " + searchKey + " não encontrado na árvore.");
        }

        // Encontrando o menor elemento na árvore
        int min = tree.findMin();
        System.out.println("\nMenor elemento na árvore: " + min);

        // Contando nós na árvore
        int count = tree.countNodes();
        System.out.println("\nQuantidade de nós na árvore: " + count);

        // Calculando a média dos elementos na árvore
        double avg = tree.calculateAverage();
        System.out.println("\nMédia dos elementos na árvore: " + avg);

        // Calculando a altura da árvore
        int height = tree.calculateHeight();
        System.out.println("\nAltura da árvore: " + height);

        // Calculando a soma dos elementos na árvore
        int sum = tree.calculateSum();
        System.out.println("\nSoma dos elementos na árvore: " + sum);
    }
}