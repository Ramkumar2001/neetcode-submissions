class MyQueue {

    private final Deque<Integer> s1;
    private final Deque<Integer> s2;

    public MyQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        s1.offerFirst(x);
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            s2.offerFirst(s1.pollFirst());
        }
        int ans = s2.pollFirst();
        while(!s2.isEmpty()){
            s1.offerFirst(s2.pollFirst());
        }
        return ans;
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.offerFirst(s1.pollFirst());
        }
        int ans = s2.peekFirst();
        while(!s2.isEmpty()){
            s1.offerFirst(s2.pollFirst());
        }

        return ans;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */