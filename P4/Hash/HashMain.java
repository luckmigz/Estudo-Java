package P4.Hash;

public class HashMain {
    public static void main(String[] args) {
        Hash<String, Object> hashTable = new Hash<>();

        // Adicionando elementos
        hashTable.put("key1", 10);
        hashTable.put("key2", 20);
        hashTable.put("key3", 30);
        hashTable.put("key4", 40);
        hashTable.put("one", hashTable);


        // Exibindo a tabela
        System.out.println("Tabela após adicionar elementos:");
        System.out.println(hashTable.displayTable());

        // Testando o método get
        System.out.println("Valor para 'key2': " + hashTable.get("key2"));
        System.out.println("Valor para 'key5': " + hashTable.get("key5")); // Chave inexistente

        // Testando o método remove
        hashTable.remove("key3");
        System.out.println("\nTabela após remover 'key3':");
        System.out.println(hashTable.displayTable());

        // Testando o redimensionamento automático e rehashing
        System.out.println("\nTamanho atual da tabela: " + hashTable.size());
        hashTable.put("key5", 50); // Isso deve acionar o redimensionamento automático
        System.out.println("Tabela após adicionar 'key5':");
        System.out.println(hashTable.displayTable());
        System.out.println("Novo tamanho da tabela: " + hashTable.size());

        // Testando os métodos isEmpty e size
        System.out.println("\nEstá vazio? " + hashTable.isEmpty());
        System.out.println("Tamanho da tabela: " + hashTable.size());

        // Testando o método rehash
        hashTable.rehash(); // Redimensiona a tabela para o tamanho padrão
        System.out.println("\nTabela após rehash:");
        System.out.println(hashTable.displayTable());
    }
}
