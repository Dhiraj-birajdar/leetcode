class MyStack {
    int top =-1;
    int[] stack;
    int n = 10;
    public MyStack() {
        stack = new int[n];
    }
    
    public void push(int x) {
        if(top<n-1)
            stack[++top]=x;
    }
    
    public int pop() {
        if(top>=0)
            return stack[top--];
        return -1;    
    }
    
    public int top() {
        if(top>=0)
            return stack[top];
        return -1;    
    }
    
    public boolean empty() {
        return top==-1;
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