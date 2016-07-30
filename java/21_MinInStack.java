import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    int min;
    public void push(int node) {
        if(stack.empty()){
            min = node;
        }
        stack.push(node);
        if(node <= min){
            min = node;
        }
        minStack.push(min);
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        int val = stack.pop();
        stack.push(val);
        return val;
    }
    
    public int min() {
        int val = minStack.pop();
        minStack.push(val);
        return val;
    }
}

/*
每次都把当前最小元素压入辅助栈，保证辅助栈的栈顶一直都是最小元素。
当最小元素从数据栈弹出之后，同时弹出辅助栈的栈顶元素，此时辅助站的新栈顶元素就是下一个最小值。
*/