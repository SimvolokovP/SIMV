package Hash;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(1,"2");
        hashTable.put(2,"4");
        hashTable.put(2,"8");
        hashTable.put(4,"9");
        hashTable.remove(4);
        System.out.println(hashTable);

        }
    }
