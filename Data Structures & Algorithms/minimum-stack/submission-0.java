class MinStack {

    Deque <Integer> stack = new ArrayDeque<>();

    public MinStack() {

    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int curMin = Integer.MAX_VALUE;
        for(int i : stack){
            curMin = Math.min(i, curMin);
        }
        return curMin;
    }
}