class MinStack {

    private Stack<Integer> stack;
    //// create another stack to only store the min values, so whenever you are pushing to the original stack you will check if it's lower than the first value passed in the original stack and iff then you push to the min stack so whenever you peek minstack it'll always be the lowest value of stack.
    public MinStack() {
        this.stack = new Stack<>();
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
        Stack<Integer> temp = new Stack<Integer>();
        int min = stack.peek();

        while(!stack.isEmpty()){
            if(stack.peek() < min){
                min = stack.peek();
            }
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return min;
    }
}
