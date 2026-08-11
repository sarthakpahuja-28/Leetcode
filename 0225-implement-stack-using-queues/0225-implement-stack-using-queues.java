class MyStack {
     int count=0;
     Queue <Integer> que;
    public MyStack() {
     que =new LinkedList <>();
    }
    
    public void push(int x) {
        count++;
        que.offer(x);
        for(int i=0;i<count-1;i++){
            int y=que.peek();
            que.poll();
            que.offer(y);
        }
        
    }
    
    public int pop() {
        count--;
        return que.poll();
        
    }
    
    public int top() {
        return que.peek();
        
    }
    
    public boolean empty() {
        return que.isEmpty();
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