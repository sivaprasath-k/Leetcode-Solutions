class MyQueue {
    Deque <Integer> q;
    public MyQueue() {
        q=new ArrayDeque();
    }
    
    public void push(int x) {
         q.addLast(x);
    }
    
    public int pop() {
        q.removeFirst();
    }
    
    public int peek() {
        q.peekfirst();
    }
    
    public boolean empty() {
        return q.isEmpty();
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