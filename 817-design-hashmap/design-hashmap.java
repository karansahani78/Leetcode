import java.util.*;

class MyHashMap {

    // Pair class to hold key-value
    static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash table = array of lists
    private static final int SIZE = 100;  // number of buckets
    private List<Pair>[] table;

    public MyHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE; // simple hash function
    }

    // Insert or update
    public void put(int key, int value) {
        int idx = hash(key);
        List<Pair> bucket = table[idx];

        for (int i = 0; i < bucket.size(); i++) {
            Pair p = bucket.get(i);
            if (p.key == key) {  // update existing key
                p.value = value;
                return;
            }
        }
        bucket.add(new Pair(key, value)); // add new pair
    }

    // Get value
    public int get(int key) {
        int idx = hash(key);
        List<Pair> bucket = table[idx];

        for (int i = 0; i < bucket.size(); i++) {
            Pair p = bucket.get(i);
            if (p.key == key) {
                return p.value;
            }
        }
        return -1; // not found
    }

    // Remove key
    public void remove(int key) {
        int idx = hash(key);
        List<Pair> bucket = table[idx];

        for (int i = 0; i < bucket.size(); i++) {
            Pair p = bucket.get(i);
            if (p.key == key) {
                bucket.remove(i); // remove by index
                return;
            }
        }
    }

}
