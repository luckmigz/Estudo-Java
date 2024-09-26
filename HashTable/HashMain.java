package HashTable;

import javax.swing.*;

public class HashMain {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Exibindo a tabela inicial
        String initialDisplay = "Tabela Hash Inicial:\n" + hashTable.displayTable();
        JOptionPane.showMessageDialog(null, initialDisplay);

        String input;

        do {
            input = JOptionPane.showInputDialog(null, "Digite 'i' para inserir um nome, 'b' para buscar um nome ou 'sair' para encerrar:");

            if (input != null && input.equalsIgnoreCase("i")) {
                String name = JOptionPane.showInputDialog("Digite o nome do aluno:");
                if (name != null) {
                    hashTable.insert(name);
                    JOptionPane.showMessageDialog(null, "Tabela Hash Atual:\n" + hashTable.displayTable());
                }
            } else if (input != null && input.equalsIgnoreCase("b")) {
                String name = JOptionPane.showInputDialog("Digite o nome a buscar:");
                if (name != null) {
                    int attempts = hashTable.search(name);
                    if (attempts > 0) {
                        JOptionPane.showMessageDialog(null, "Nome '" + name + "' localizado em " + attempts + " tentativa(s).");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nome '" + name + "' não encontrado.");
                    }
                }
            }
        } while (input != null && !input.equalsIgnoreCase("sair")); // Verifica se o usuário digitou 'sair'

        JOptionPane.showMessageDialog(null, "Tabela Hash Final:\n" + hashTable.displayTable());
        System.exit(0); // Encerra a aplicação
    }
}
