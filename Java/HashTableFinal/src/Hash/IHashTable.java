package Hash;

public interface IHashTable<K, V> {
    void put(K key, V value);
    void remove(K key);
    V get(K key);
    int size();
    void clear();
}


