class MyStack {

    private final Deque<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue.offerLast(x);
        for(int i = queue.size() - 1; i > 0; i -= 1){
            queue.offerLast(queue.pollFirst());
        }
    }
    
    public int pop() {
        return queue.pollFirst();
    }
    
    public int top() {
        return queue.peekFirst();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */