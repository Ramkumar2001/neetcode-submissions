class ListNode {
    public int key;
    public ListNode nextNode;

    public ListNode(int key){
        this.key = key;
        this.nextNode = null;
    }
}
class MyHashSet {

    private ListNode[] set;
    private ListNode[] lastNode;

    public MyHashSet() {
        set = new ListNode[1000];
        lastNode = new ListNode[1000];
    }
    
    public void add(int key) {
        if(contains(key)) return;
        int hash = this.hashKey(key);
        ListNode newNode = new ListNode(key);
        if(set[hash] == null){
            set[hash] = newNode;
            lastNode[hash] = newNode;
        }
        else{
            lastNode[hash].nextNode = newNode;
            lastNode[hash] = lastNode[hash].nextNode;
        }

        
    }
    
    public void remove(int key) {
        if(!contains(key)) return;
        int hash = this.hashKey(key);

        ListNode nodeToDelete = this.nodeToDelete(set[hash], key);
        if(set[hash] == nodeToDelete){
            set[hash] = set[hash].nextNode;
        }
        else{
            ListNode start = set[hash];
            ListNode curr = start;
            while(curr.nextNode != nodeToDelete) curr = curr.nextNode;
            curr.nextNode = curr.nextNode.nextNode;
        }

    }
    
    public boolean contains(int key) {
        int hash = this.hashKey(key);
        if(set[hash] == null) return false;
        ListNode itr = set[hash];

        while(itr != null){
            if(itr.key == key) return true;
            itr = itr.nextNode;
        }

        return false;
    }

    private ListNode nodeToDelete(ListNode start, int key){
        while(start != null){
            if(start.key == key) return start;
            start = start.nextNode;
        }

        return null; //no-op
    }

    private int hashKey(int key){
        return key%set.length;
    }

    private void printSet(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < set.length; i += 1){
            if(set[i] == null) continue;
            list.addAll(printLinkedList(set[i]));
        }
        System.out.println(list);
    }

    

    private List<Integer> printLinkedList(ListNode start){
        List<Integer> list = new ArrayList<>();
        while(start != null){
            list.add(start.key);
            start = start.nextNode;
        }
        return list;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */