package Hash;

public class Entry<K, V> {
    public Entry<K, V> next;
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}

