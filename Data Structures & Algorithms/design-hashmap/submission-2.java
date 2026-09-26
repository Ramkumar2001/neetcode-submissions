class MyHashMap {

    static class LinkNode {
        public int key;
        public int value;
        public LinkNode next;

        LinkNode(){
            this.key = -1;
            this.value = -1;
            this.next = null;
        }

        LinkNode(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    LinkNode[] hashMap;

    public MyHashMap() {
        hashMap = new LinkNode[1000];
        for(int i = 0; i < hashMap.length; i += 1){
            hashMap[i] = new LinkNode();
        }
    }
    
    public void put(int key, int value) {
        int bucket = hashing(key);
        LinkNode ptr = hashMap[bucket];
        while(ptr != null){
            if(ptr.key == key){
                ptr.value = value;
                return;
            }
            if(ptr.next == null) break;
            ptr = ptr.next;
        }
        ptr.next = new LinkNode(key, value);
    }
    
    public int get(int key) {
        int bucket = hashing(key);
        LinkNode ptr = hashMap[bucket];
        while(ptr != null){
            if(ptr.key == key) return ptr.value;
            ptr = ptr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int bucket = hashing(key);
        LinkNode ptr = hashMap[bucket];
        LinkNode nextPtr = ptr.next;

        while(nextPtr != null){
            if(nextPtr.key == key){
                ptr.next = nextPtr.next;
                return;
            }
            ptr = ptr.next;
            nextPtr = nextPtr.next;
        }
    }

    private int hashing(int key){
        return key % (hashMap.length);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */