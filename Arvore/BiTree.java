package Arvore;

public class BiTree {
    Node root;

    public BiTree() {
        root = null;
    }
    
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
    
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
    
        return root;
    }

    public void preOrderTraversal() {
        preOrderTraversalRec(root);
    }
    
    private void preOrderTraversalRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderTraversalRec(root.left);
            preOrderTraversalRec(root.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRec(root);
    }
    
    private void postOrderTraversalRec(Node root) {
        if (root != null) {
            postOrderTraversalRec(root.left);
            postOrderTraversalRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }
    
    private void inOrderTraversalRec(Node root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inOrderTraversalRec(root.right);
        }
    }
    public boolean search(int key) {
        return searchRec(root, key);
    }
    
    private boolean searchRec(Node root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }
    
        if (key < root.key) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    public int findMin() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.key;
    }

    public int countNodes() {
        return countNodesRec(root);
    }
    
    private int countNodesRec(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodesRec(root.left) + countNodesRec(root.right);
    }

    public double calculateAverage() {
        int sum = calculateSum();
        int count = countNodes();
        if (count != 0) {
            return (double) sum / count;
        }
        return 0;
    }

    public int calculateHeight() {
        return calculateHeightRec(root);
    }
    
    private int calculateHeightRec(Node root) {
        if (root == null) {
            return 0;
        }
    
        int leftHeight = calculateHeightRec(root.left);
        int rightHeight = calculateHeightRec(root.right);
    
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public int calculateSum() {
        return calculateSumRec(root);
    }
    
    private int calculateSumRec(Node root) {
        if (root == null) {
            return 0;
        }
    
        return root.key + calculateSumRec(root.left) + calculateSumRec(root.right);
    }
}
