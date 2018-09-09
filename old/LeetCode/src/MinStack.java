import java.util.Stack;

/**
 *   Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.


 * 155. Min Stack
 * https://leetcode.com/problems/min-stack/
 * @author abhigupta
 *
 */
public class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack ;
    
    Stack<Integer> mstack;

    public MinStack() {
        stack = new Stack<Integer>();
        mstack = new Stack<Integer>();

    }
    
    public void push(int x) {
        stack.push(x);
        if(mstack.isEmpty() || mstack.peek()>= x) {
           mstack.push(x); 
        }
        
    }
    
    public void pop() {
        int ans = stack.pop();
        if(ans == mstack.peek()) {
            mstack.pop();
        }
       
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */