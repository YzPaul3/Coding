/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
Arrays.copyOfRange(boolean[] original, int from, int to)
original -- 这是该数组从该范围要被复制。

from -- 这是该范围的要复制的初始索引(包括)。

to -- 这是该范围的要复制的最终索引(不包括)。

*/

import java.util.Arrays;
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) return false;
        int len = sequence.length;
        int root = sequence[len - 1];
        int i = 0;
        for(; i < len -1; i++){
            if(sequence[i] > root) break;
        }
        int j = i;
        for(; j < len -1; j++){
            if(sequence[j] < root) return false;
        }
        boolean left = true;
        if (i > 0) 
            left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        boolean right = true;
        if (i < len -1)
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, len-1));
        return left&&right;
    }
}

