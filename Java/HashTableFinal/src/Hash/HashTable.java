package Hash;

import java.util.Arrays;
import java.util.Iterator;

public class HashTable<K, V> implements IHashTable<K, V> {
    private final int INIT_SIZE = 16;
    private final double LOAD_FACTOR = 0.75;
    private Entry[] array = new Entry[INIT_SIZE];
    private int size = 0;
    @Override
    public void put(K key, V value) {
        int elementPosition = getElementPosition(key);
        Entry entry = new Entry(key, value);
        if (array[elementPosition] != null) {
            Entry tempEntry = array[elementPosition];
            while (tempEntry.next != null) {
                tempEntry = tempEntry.next;
            }
            tempEntry.next = entry;
        } else {
            array[elementPosition] = entry;
        }
        size++;
        if (size > size * LOAD_FACTOR) {
            increaseArray(array.length * 2);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Entry[INIT_SIZE];
        size = 0;
    }

    @Override
    public V get(K key) {
        int elementPosition = getElementPosition(key);

        Entry<K, V> entry = (Entry<K, V>) array[elementPosition];
        if (entry.next == null) {
            return entry.getValue();
        } else {
            while (entry.next != null) {
                if (entry.getKey() == key) {
                    return entry.getValue();
                }
                entry = entry.next;
            }
            if (entry.getKey() == key) {

            }
        }
        return entry.getValue();
    }

    @Override
    public void remove(K key) {

        int elementPosition = getElementPosition(key);
        if (array[elementPosition] != null) {
            Entry prev = null;
            Entry<K, V> entry = (Entry<K, V>) array[elementPosition];
            while (entry != null) {
                if (entry.getKey() == key) {
                    if (prev == null) {
                        array[elementPosition] = entry.next;
                    } else {
                        prev.next = entry.next;
                    }
                    return;
                }
                prev = entry;
                entry = entry.next;
            }
        }
    }

    private void increaseArray(int arrayLength) {
        Entry[] newArray = new Entry[arrayLength];
        System.arraycopy(array, 0, newArray, 0, array.length);
        //Arrays.copyOf(array,newArray);
        array = newArray;
    }


    private int getElementPosition(K key) {
        return Math.abs(key.hashCode() % array.length);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : array) {
            if (entry != null) {
                Entry currentEntry = entry;
                while (currentEntry.next != null) {
                    {
                        stringBuilder.append(currentEntry.getValue()).append("\n");
                    }
                    currentEntry = currentEntry.next;
                }
                {
                    stringBuilder.append(currentEntry.getValue()).append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
}