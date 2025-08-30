class MyHashSet<T> {
    private int SIZE=7;
    private LinkedList<T>[]bucket;
   

    public MyHashSet() {
        bucket = new LinkedList[SIZE];
        for(int i=0; i<SIZE; i++){
            bucket[i]= new LinkedList<>();
        }    
    }
    private int hash(T key){
        return Math.abs(key.hashCode()) %SIZE;
    }
    
    public void add(T key) {
        int index = hash(key);
        if(!bucket[index].contains(key)){
            bucket[index].add(key);
        }
        
    }
    
    public void remove(T key) {
        int index = hash(key);
        bucket[index].remove(key);
        
    }
    
    public boolean contains(T key) {
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