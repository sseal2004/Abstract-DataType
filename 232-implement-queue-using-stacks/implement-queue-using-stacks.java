class MyQueue {
    //LOGIC
    //Stack 1 containing the elements pushing is done at the top but after pop it gets stored in Stack 2 and now again pop it and store it into Stack1 if Stack2 is not empty.
    Stack<Integer> first;
    Stack<Integer> second ;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop(){
         if (empty()) {
            throw new RuntimeException("Queue is empty");
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int remove = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return remove;
    }
    
    public int peek() {
            while(!first.isEmpty()){
            second.push(first.pop());
        }
        int display = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return display;
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
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