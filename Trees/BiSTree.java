package Trees;

public class BiSTree {
    Node root;
    int size;

    public BiSTree() {
        root = null;
        size = 0;
    }

    public void add(int []  array){
        for (int element : array){ 
            add(element);
        }
    }

    public void add(int value) {
        root = insertRecursive(root, value);
        size++;
    }

    private Node insertRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = insertRecursive(currentNode.left, value);
            currentNode.left.parent = currentNode;
        } else if (value > currentNode.value) {
            currentNode.right = insertRecursive(currentNode.right, value);
            currentNode.right.parent = currentNode;
        }

        return currentNode;
    }

    public String preOrder() {
        StringBuilder result = new StringBuilder();
        preOrderRecursive(root, result);
        return result.toString();
    }

    private void preOrderRecursive(Node currentNode, StringBuilder result) {
        if (currentNode != null) {
            result.append(currentNode.value).append(" ");
            preOrderRecursive(currentNode.left, result);
            preOrderRecursive(currentNode.right, result);
        }
    }

    public String postOrder() {
        StringBuilder result = new StringBuilder();
        postOrderRecursive(root, result);
        return result.toString();
    }

    private void postOrderRecursive(Node currentNode, StringBuilder result) {
        if (currentNode != null) {
            postOrderRecursive(currentNode.left, result);
            postOrderRecursive(currentNode.right, result);
            result.append(currentNode.value).append(" ");
        }
    }

    public String inOrder() {
        StringBuilder result = new StringBuilder();
        inOrderRecursive(root, result);
        return result.toString();
    }

    private void inOrderRecursive(Node currentNode, StringBuilder result) {
        if (currentNode != null) {
            inOrderRecursive(currentNode.left, result);
            result.append(currentNode.value).append(" ");
            inOrderRecursive(currentNode.right, result);
        }
    }


    public String search(int value) {
        if (searchRecursive(root, value) != null) {
           return value + " esta presente";
        } else {
           return (value + " não está presente na árvore.");
        }
    }

   
    private Node searchRecursive(Node currentNode, int value) {
        if (currentNode == null || currentNode.value == value) {
            return currentNode;
        }

        if (value < currentNode.value) {
            return searchRecursive(currentNode.left, value);
        }

        return searchRecursive(currentNode.right, value);
    }

    public String findMin() {
        return String.valueOf(findMinRecursive(root));
    }

    private int findMinRecursive(Node currentNode) {
        if (currentNode == null) {
            throw new NullPointerException("A árvore está vazia.");
        } else if (currentNode.left == null) {
            return currentNode.value;
        }
        return findMinRecursive(currentNode.left);
    }

    public String countNodes() {
        return String.valueOf(size);
    }

    public String findAverage() {
        int sum = calculateSum(root);
        return String.valueOf((double) sum / size);
    }

    private int calculateSum(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }

        int leftSum = calculateSum(currentNode.left);
        int rightSum = calculateSum(currentNode.right);

        return leftSum + rightSum + currentNode.value;
    }

    public String height() {
        return String.valueOf(findHeight(root));
    }

    private int findHeight(Node currentNode) {
        if (currentNode == null) {
            return -1;
        }

        int leftHeight = findHeight(currentNode.left);
        int rightHeight = findHeight(currentNode.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public String countNullNodes() {
        return String.valueOf(countNullNodesRecursive(root));
    }

    private int countNullNodesRecursive(Node currentNode) {
        if (currentNode == null) {
            return 1;
        }

        int leftNulls = countNullNodesRecursive(currentNode.left);
        int rightNulls = countNullNodesRecursive(currentNode.right);

        return leftNulls + rightNulls;
    }

    public String printMultiplesOfTwo() {
        StringBuilder result = new StringBuilder();
        printMultiplesOfTwoRecursive(root, result);
        return result.toString();
    }

    private void printMultiplesOfTwoRecursive(Node currentNode, StringBuilder result) {
        if (currentNode != null) {
            if (currentNode.value % 2 == 0) {
                result.append(currentNode.value).append(" ");
            }
            printMultiplesOfTwoRecursive(currentNode.left, result);
            printMultiplesOfTwoRecursive(currentNode.right, result);
        }
    }

    public String sumOfElements() {
        return String.valueOf(calculateSum(root));
    }
}
