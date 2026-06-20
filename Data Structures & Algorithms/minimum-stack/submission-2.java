class MinStack {

    Deque <Integer> stack = new ArrayDeque<>();
    Deque <Integer> minStack = new ArrayDeque<>();
    int curMin = Integer.MAX_VALUE;

    public MinStack() {

    }
    
    public void push(int val) {
        stack.push(val);
        if(curMin >= val){
            minStack.push(val);
            curMin = val;
        }
        

    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
            if(minStack.isEmpty()){
                curMin = Integer.MAX_VALUE;
            }
            else{
            curMin = minStack.peek();
            }
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
