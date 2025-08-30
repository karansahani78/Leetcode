class MyHashSet {
    private int SIZE=769;
    private LinkedList<Integer>[] bucket;


    public MyHashSet() {
        bucket = new LinkedList[SIZE];
        for(int i=0; i<SIZE; i++){
            bucket[i]= new LinkedList<>();
        }
        
    }
    // hash function to calculate actual bucket to put element as per their size 
    private int hash(int key){
        return key % SIZE;
    }
    
    public void add(int key) {
        int index = hash(key);
        if(!bucket[index].contains(key)){
            bucket[index].add(key);
        }
        
    }
    
    public void remove(int key) {
        int index = hash(key);
            bucket[index].remove((Integer)key);
        }
        
    public boolean contains(int key) {
        
        int index = hash(key);
        return bucket[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */