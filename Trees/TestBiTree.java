package Trees;

public class TestBiTree {
    
    public static void main(String[] args){

        BiTree tree = new BiTree();
        tree.add(0);

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        
        
        tree.add(node1);
        tree.add(node2);
        node2.add(node3);
        node2.add(node4);
        node2.add(node5);
        node2.add(node6);

        System.out.println("A árvore contém o valor 9: " + tree.hasIt(9));

        System.out.println("Percurso pós-ordem:");
        tree.postOrder();
        System.out.println();

        System.out.println("Percurso pré-ordem:");
        tree.preOrder();
        System.out.println();

        System.out.println("Percurso em ordem:");
        tree.inOrder();
        System.out.println();

        int max = tree.findMax();
        System.out.println("O valor máximo na árvore é: " + max);

       
        int min = tree.findMin();
        System.out.println("O valor mínimo na árvore é: " + min);

        
        double avg = tree.average();
        System.out.println("A média dos valores na árvore é: " + avg);

        System.out.println("Número de nós nulos na árvore: " + tree.countNullNodes());
        System.out.println("Número de nós na árvore: " + tree.countNodes());
        System.out.println("Número de folhas na árvore: " + tree.countLeaves());
        System.out.println("Altura da árvore: " + tree.height());
    }

}
