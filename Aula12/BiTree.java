package Aula12;


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

    public Node getNode(){
        return this.root;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.value == value) {
            return true;
        }

        boolean foundLeft = searchRecursive(currentNode.left, value);
        boolean foundRight = searchRecursive(currentNode.right, value);

        return foundLeft || foundRight;
    }
    public void preOrder() {
        preOrderRecursive(root);
    }

    private void preOrderRecursive(Node currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.value + " ");
            preOrderRecursive(currentNode.left);
            preOrderRecursive(currentNode.right);
        }
    }

    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node currentNode) {
        if (currentNode != null) {
            inOrderRecursive(currentNode.left);
            System.out.print(currentNode.value + " ");
            inOrderRecursive(currentNode.right);
        }
    }

    public void postOrder() {
        postOrderRecursive(root);
    }

    private void postOrderRecursive(Node currentNode) {
        if (currentNode != null) {
            postOrderRecursive(currentNode.left);
            postOrderRecursive(currentNode.right);
            System.out.print(currentNode.value + " ");
        }
    }
    public int findMax() {
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node currentNode) {
        if (currentNode == null) {
            
            return -1;
        }

        int leftMax = findMaxRecursive(currentNode.left);
        int rightMax = findMaxRecursive(currentNode.right);

        return Math.max(Math.max(leftMax, rightMax), currentNode.value);
    }
    
    public int findMin() {
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node currentNode) {
        if (currentNode == null) {
            
            return Integer.MAX_VALUE;
        }

        int leftMin = findMinRecursive(currentNode.left);
        int rightMin = findMinRecursive(currentNode.right);

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
}

