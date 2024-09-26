package Tree;

import javax.swing.*;

public class Tree {
    private TreeNode root;
    private int size;

    public Tree() {
        this.root = null;
        this.size = 0;
    }

    public void insert(String childName, String parentName) {
        TreeNode newNode = new TreeNode(childName);

        if (parentName == null) {
            // Caso a árvore esteja vazia, o primeiro nó inserido será a raiz
            if (root == null) {
                root = newNode;
                size++;
            } else {
                // A árvore já tem uma raiz
                JOptionPane.showMessageDialog(null, "Erro: A árvore já tem uma raiz.");
                return;
            }
        } else {
            TreeNode parentNode = findNode(root, parentName);
            if (parentNode != null) {
                parentNode.addChild(newNode);
                size++;
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Nó pai " + parentName + " não encontrado.");
                return;
            }
        }

        printTree();
    }

    private TreeNode findNode(TreeNode node, String name) {
        if (node == null) {
            return null;
        }

        if (node.name.equals(name)) {
            return node;
        }

        for (TreeNode child : node.children) {
            TreeNode found = findNode(child, name);
            if (found != null) {
                return found;
            }
        }

        return null;
    }

    public void printTree() {
        if (root == null) {
            JOptionPane.showMessageDialog(null, "Árvore vazia!");
        } else {
            StringBuilder result = new StringBuilder("Árvore em Pré-Ordem: ");
            preOrderTraversal(root, result);
            result.append("\nTamanho da árvore: ").append(size);
            JOptionPane.showMessageDialog(null, result.toString());
        }
    }

    private void preOrderTraversal(TreeNode node, StringBuilder result) {
        if (node == null) {
            return;
        }

        result.append(node.name).append(" ");
        for (TreeNode child : node.children) {
            preOrderTraversal(child, result);
        }
    }

     public int getSize() {
        return size;
    }
}
