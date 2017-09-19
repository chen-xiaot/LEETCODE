package Design;

import java.util.Stack;

//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> Returns -3.
//minStack.pop();
//minStack.top();      --> Returns 0.
//minStack.getMin();   --> Returns -2.

// Stack<>() already have push() pop() peek() 


public class No155MinStack {

	long min;
    Stack<Long> stack;
    
    /** initialize your data structure here. */
    public No155MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0L);
            min = x;
        }
        else {
            stack.push(x - min);
            if (x < min) min = x;
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        
        long pop = stack.pop();
        
        if (pop < 0) min -= pop; //If negative, increase the min value
    }
    
    public int top() {
        long peek = stack.peek();
        if (peek > 0) {
            return (int)(min + peek);
        }
        else return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
