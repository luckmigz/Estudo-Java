package HashTable;


import java.util.LinkedList;

public class HashTable {
    private static final int DEFAULT_CAPACITY = 26; // Para letras de A a Z
    private LinkedList<String>[] table;
    private int size;

    public HashTable() {
        table = new LinkedList[DEFAULT_CAPACITY];
        size = 0;
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String name) {
        return name.toUpperCase().charAt(0) - 'A'; // Retorna o índice baseado na letra inicial
    }

    public void insert(String name) {
        int index = hash(name);
        if (!table[index].contains(name)) {
            table[index].add(name);
            size++;
        }
    }

    public int search(String name) {
        int index = hash(name);
        int attempts = 0;
        for (String student : table[index]) {
            attempts++;
            if (student.equalsIgnoreCase(name)) {
                return attempts; // Retorna o número de tentativas
            }
        }
        return 0; // Retorna 0 se não encontrado
    }

    public String displayTable() {
        if (size == 0) {
            return "VAZIA";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (!table[i].isEmpty()) {
                stringBuilder.append("Índice ").append(i).append(": ");
                for (String name : table[i]) {
                    stringBuilder.append(name).append(", ");
                }
                // Remove a última vírgula e espaço
                stringBuilder.setLength(stringBuilder.length() - 2);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
