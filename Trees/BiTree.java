package Trees;

import java.util.ArrayList;
import java.util.List;

public class BiTree{
    Node root;
    int size;

    public BiTree(){ 
        this.root = null;
        this.size = 0;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
        size++;
    }
    public void add(Node node){
        if(!this.root.hasLeft()){
            this.root.left = node;
            node.parent = root;
        }else if(!root.hasRight()){
            this.root.right = node;      
            node.parent = root;          
        }
        size++;
    }

    // Retorna o Nó
    public Node getNode(){
        return this.root;
    }
    // retorna o número de nodes na árvore
    public int size(){
        return this.size;
    }
    //testa se a árvore é vazia
    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }else{
            return false;
        }
    }
    // retorna nodes em ordem preorder
    public String preOrder() {
        StringBuilder result = new StringBuilder();
        preOrderRecursive(root, result);
        return result.toString().trim();
    }

    private void preOrderRecursive(Node currentNode, StringBuilder result) {
        if (currentNode != null) {
            result.append(currentNode.value).append(" ");
            preOrderRecursive(currentNode.left, result);
            preOrderRecursive(currentNode.right, result);
        }
    }

    // percurso inorder
     public String inOrder() {
        StringBuilder result = new StringBuilder();
        inOrderRecursive(root, result);
        return result.toString().trim();
    }

    private void inOrderRecursive(Node currentNode, StringBuilder result) {
        if (currentNode != null) {
            inOrderRecursive(currentNode.left, result);
            result.append(currentNode.value).append(" ");
            inOrderRecursive(currentNode.right, result);
        }
    }

    //retorna nodes em ordem postorder
    public String postOrder() {
        StringBuilder result = new StringBuilder();
        postOrderRecursive(root, result);
        return result.toString().trim();
    }

    private void postOrderRecursive(Node currentNode, StringBuilder result) {
        if (currentNode != null) {
            postOrderRecursive(currentNode.left, result);
            postOrderRecursive(currentNode.right, result);
            result.append(currentNode.value).append(" ");
        }
    }

    //Conta o n de nós
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }

        int leftCount = countNodes(currentNode.left);
        int rightCount = countNodes(currentNode.right);

        return leftCount + rightCount + 1; // Conta o próprio nó
    }
    
    //Conta o n de filhos folha
    public int countLeaves() {
        return countLeaves(root);
    }
    private int countLeaves(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }

        if (currentNode.left == null && currentNode.right == null) {
            return 1; // É uma folha
        }

        int leftLeaves = countLeaves(currentNode.left);
        int rightLeaves = countLeaves(currentNode.right);

        return leftLeaves + rightLeaves;
    }

    //retorna a altura da raiz
    public int height() {
        return height(root);
    }
    //retorna a altura do node
    public int height(Node currentNode) {
        if (currentNode == null) {
            return -1; // Árvore vazia tem altura -1
        }

        int leftHeight = height(currentNode.left);
        int rightHeight = height(currentNode.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    //retorna o node root da árvore
     public Node ret_Root() {
        return root;
    }
    // retorna o pai do nó
    public Node parent(Node node) {
        if (node == null || node == root) {
            return null; // Não há pai para a raiz ou para um nó nulo
        }
        return findParent(root, node);
    }
    // Acha o pai do nó 
    private Node findParent(Node currentNode, Node targetNode) {
        if (currentNode == null) {
            return null; // Nó não encontrado
        }

        if ((currentNode.left == targetNode) || (currentNode.right == targetNode)) {
            return currentNode; // Nó pai encontrado
        }

        Node leftResult = findParent(currentNode.left, targetNode);
        if (leftResult != null) {
            return leftResult;
        }

        Node rightResult = findParent(currentNode.right, targetNode);
        return rightResult;
    }
    //imprime o dado armazenado no pai
    public void imprime_Parent(Node node) {
        Node parentNode = parent(node);
        if (parentNode != null) {
            System.out.println("Pai: " + parentNode.value);
        } else {
            System.out.println("Nó raiz, não possui pai.");
        }
    }
    //retorna o filho esquerdo de um nó
    public Node left(Node node) {
        return node != null ? node.left : null;
    }
    //retorna o filho direito de um nó
    public Node right(Node node) {
        return node != null ? node.right : null;
    }
    //testa se o nó tem filho a esquerda
    public boolean hasLeft(Node node) {
        return node != null && node.left != null;
    }
    //testa se o nó tem filho a direita
    public boolean hasRight(Node node) {
        return node != null && node.right != null;
    }
    //retorna o número de ancestrais do node
    public int depth(Node node) {
        if (node == null || node == root) {
            return 0;
        }
        return 1 + depth(parent(node));
    }   
    //retorna uma coleção dos nodes da árvore
    public void listNodes() {
        List<Node> nodes = new ArrayList<>();
        collectNodes(root, nodes);
        for (Node node : nodes) {
            System.out.print(node.value + " ");
        }
        System.out.println();
    }
    private void collectNodes(Node node, List<Node> nodes) {
        if (node != null) {
            nodes.add(node);
            collectNodes(node.left, nodes);
            collectNodes(node.right, nodes);
        }
    }
    //altera o dado em um determinado node
    public void replace(int v, int e) {
        Node node = search(v);
        if (node != null) {
            node.value = e;
        }
    }
    //procura um nó 
    public Node search(int value) {
        return searchRecursive(root, value);
    }
    private Node searchRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.value == value) {
            return currentNode;
        }

        Node leftResult = searchRecursive(currentNode.left, value);
        if (leftResult != null) {
            return leftResult;
        }

        return searchRecursive(currentNode.right, value);
    }
    public String hasIt(int value) {
        Node node = new Node(value);
        String result = "Sim" ;
        if (search(value) == null ){
            result = "Não";
            return result;
        }else{
            int a = search(value).value;
            if(node.value == a) {
            return result;
            }else{
            result = "Não";
            return result;
            }
        }
    }
      
    public int findMax() {
        return findMax(root);
    }

    private int findMax(Node currentNode) {
        if (currentNode == null) {
            
            return -1;
        }

        int leftMax = findMax(currentNode.left);
        int rightMax = findMax(currentNode.right);

        return Math.max(Math.max(leftMax, rightMax), currentNode.value);
    }
    
    public int findMin() {
        return findMin(root);
    }

    private int findMin(Node currentNode) {
        if (currentNode == null) {
            
            return Integer.MAX_VALUE;
        }

        int leftMin = findMin(currentNode.left);
        int rightMin = findMin(currentNode.right);

        return Math.min(Math.min(leftMin, rightMin), currentNode.value);
    }
    public double average() {
        int sum = calculateSum(root);
        return (double) sum / size;
    }

    private int calculateSum(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }

        int leftSum = calculateSum(currentNode.left);
        int rightSum = calculateSum(currentNode.right);

        return leftSum + rightSum + currentNode.value;
    }
    public int countNullNodes() {
        return countNullNodes(root);
    }

    private int countNullNodes(Node currentNode) {
        if (currentNode == null) {
            return 1; // Conta o nó null
        }

        int leftNulls = countNullNodes(currentNode.left);
        int rightNulls = countNullNodes(currentNode.right);

        return leftNulls + rightNulls;
    }
}

/* 
Uma árvore binária é própria se cada nó tem 0 ou 2 filhos.
Em uma árvore binária própria cada nó interno tem exatamente 2 filhos.
Uma árvore é imprópria se não for própria, ou seja, a árvore tem pelo menos um
nó com apenas um filho
Uma árvore binária é:
Uma árvore que consiste de apenas um nó, ou
Uma árvore cuja raiz tem um par ordenado de filhos, onde cada qual é uma árvore
binária.
*/