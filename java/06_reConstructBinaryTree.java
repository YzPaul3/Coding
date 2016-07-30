/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConBibaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
    public TreeNode reConBibaryTree(int [] pre, int preleft, int preright, int [] in, int inleft, int inright) {
        if (preleft > preright || inleft > inright) return null;
        // 新建一个TreeNode, 值为前序遍历的第一个值
        TreeNode root = new TreeNode(pre[preleft]);
        // 对中序数组进行输入边界的遍历
        for(int i = inleft; i <= inright; i++){
            if (pre[preleft] == in[i]){
                root.left = reConBibaryTree(pre, preleft+1, preleft+i-inleft, in, inleft, i -1 );  // i-inleft为步长
                root.right = reConBibaryTree(pre, preleft+i-inleft+1, preright, in, i+1, inright);
            }
        }
        return root;
    }
}