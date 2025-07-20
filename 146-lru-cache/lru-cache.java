import java.util.LinkedHashMap;

class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int cap;
    
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        cap = capacity;
    }
    
    public int get(int key) {
        return super.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        super.put(key, value);
    }
    
    protected boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
        return size() > cap;
    }
}