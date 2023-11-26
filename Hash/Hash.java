package Hash;
import java.util.LinkedList;

public class Hash<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double LOAD_FACTOR_THRESHOLD = 0.7;
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public Hash() {
        table = new LinkedList[DEFAULT_CAPACITY];
        size = 0;
    }

    public Hash(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    private void resize(int newCapacity) {
        LinkedList<Entry<K, V>>[] newTable = new LinkedList[newCapacity];
        for (LinkedList<Entry<K, V>> list : table) {
            if (list != null) {
                for (Entry<K, V> entry : list) {
                    int index = hash(entry.getKey());
                    if (newTable[index] == null) {
                        newTable[index] = new LinkedList<>();
                    }
                    newTable[index].add(entry);
                }
            }
        }
        table = newTable;
    }

    private void rehashIfNeeded() {
        if ((double) size / table.length >= LOAD_FACTOR_THRESHOLD) {
            resize(table.length * 2);
        }
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
        size++;

        rehashIfNeeded();
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            table[index].removeIf(entry -> entry.getKey().equals(key));
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String displayTable() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                stringBuilder.append("Bucket ").append(i).append(": ");
                for (Entry<K, V> entry : table[i]) {
                    stringBuilder.append("[").append(entry.getKey()).append(" - ").append(entry.getValue()).append("] ");
                }
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public void rehash() {
        resize(DEFAULT_CAPACITY);
    }
}
