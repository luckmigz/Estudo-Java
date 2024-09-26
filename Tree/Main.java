package Tree;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        JOptionPane.showMessageDialog(null, "Início do programa:");
        tree.printTree();  // Árvore deve estar vazia

        while (true) {
            int option = JOptionPane.showConfirmDialog(null, "Deseja inserir um nó?", "Inserir Nó", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.NO_OPTION) {
                break;
            }

            String childName = JOptionPane.showInputDialog("Digite o nome do novo nó:");
            String parentName = JOptionPane.showInputDialog("Digite o nome do nó pai (ou 'null' se for a raiz):");

            if (parentName != null && parentName.equalsIgnoreCase("null")) {
                parentName = null;
            }

            tree.insert(childName, parentName);
        }
        tree.printTree();
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}