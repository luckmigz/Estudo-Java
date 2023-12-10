package Trees;

import javax.swing.JOptionPane;

public class BiSTreeMain {
    public static void main(String[] args) {
        BiSTree tree = new BiSTree();
        int[] elements = {3, 7, 8, 9, 10, 5};

        tree.add(elements);
        JOptionPane.showMessageDialog(null, tree.preOrder() );

        System.out.println("Travessia PreOrder:");
       

        System.out.println("Travessia PostOrder:");
        tree.postOrder();

        System.out.println("Travessia InOrder:");
        tree.inOrder();

        int k = 11;
        System.out.println(tree.search(k));

        tree.add(k);

        System.out.println(tree.search(k));

        System.out.println("Menor elemento na árvore: " + tree.findMin());

        System.out.println("Quantidade de nós na árvore: " + tree.countNodes());

        System.out.println("Média dos valores na árvore: " + tree.findAverage());

        System.out.println("Altura da árvore: " + tree.height());

        System.out.println("Quantidade de nós NULL na árvore: " + tree.countNullNodes());

        System.out.println("Valores múltiplos de dois na árvore:");
        tree.printMultiplesOfTwo();

        System.out.println("Soma dos elementos na árvore: " + tree.sumOfElements());
    }
}
