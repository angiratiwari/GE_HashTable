import java.util.LinkedList;

public class HashTable<K, V> {
    private LinkedList<MyMapNode<K, V>>[] table;
    private int size;

    public HashTable(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void insert(K key, V value) {
        int index = getIndex(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        LinkedList<MyMapNode<K, V>> list = table[index];
        for (MyMapNode<K, V> node : list) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        list.add(new MyMapNode<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = getIndex(key);
        if (table[index] == null) {
            return null;
        }
        for (MyMapNode<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<MyMapNode<K, V>> list = table[index];
        if (list != null) {
            list.removeIf(node -> node.key.equals(key));
        }
    }

    public boolean contains(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }
}
