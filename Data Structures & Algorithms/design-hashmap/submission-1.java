class ListNode {
    public int key;
    public int value;
    public ListNode next;

    public ListNode(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString(){
        return "key = " + key + " value = " + value + " next = " + next;
    }
}

class MyHashMap {
    private ListNode[] hashMap;
    private ListNode[] lastNode;

    public MyHashMap() {
        hashMap = new ListNode[1000];
        lastNode = new ListNode[1000];
    }
    
    public void put(int key, int value) {
        int hash = this.hashKey(key);
        Optional.ofNullable(this.findNodeInList(hashMap[hash], key))
            .ifPresentOrElse(
                node -> node.value = value,
                () -> {
                    ListNode newNode = new ListNode(key, value);
                    if(hashMap[hash] == null){
                        hashMap[hash] = newNode;
                        lastNode[hash] = newNode;
                    }
                    else{
                        lastNode[hash].next = newNode;
                        lastNode[hash] = newNode;
                    }
                }
            );
        
    }
    
    public int get(int key) {
        int hash = this.hashKey(key);
        return Optional.ofNullable(findNodeInList(hashMap[hash], key))
            .map(node -> node.value)
            .orElse(-1);
    }
    
    public void remove(int key) {
        int hash = this.hashKey(key);
        Optional.ofNullable(findNodeInList(hashMap[hash], key))
            .ifPresent(node -> {
                ListNode first = hashMap[hash];
                if(first == node){
                    hashMap[hash] = node.next;
                    return;
                }
                while(first.next != node) first = first.next;
                first.next = first.next.next;
            });
    }

    private int hashKey(int key){
        return key%hashMap.length;
    }

    private ListNode findNodeInList(ListNode node, int key){
        while(node != null){
            if(node.key == key) return node;
            node = node.next;
        }
        return null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */