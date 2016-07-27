/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
};*/
public class Solution {
    public int TreeDepth(TreeNode pRoot)
    {
        if(pRoot == null) return 0;
        return TreeDepth(pRoot.left)>TreeDepth(pRoot.right)?TreeDepth(pRoot.left)+1:TreeDepth(pRoot.right)+1;
    }
}