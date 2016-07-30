import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;
        for(int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);
             // 如果栈不为空，且栈顶元素等于弹出序列
            while((!stack.empty()) && (stack.peek() == popA[popIndex])){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
