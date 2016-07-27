public class Solution {
    
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right)) > 1) return false;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    
    public int TreeDepth(TreeNode pRoot) {
        if(pRoot == null) return 0;
        return TreeDepth(pRoot.left)>TreeDepth(pRoot.right)?TreeDepth(pRoot.left)+1:TreeDepth(pRoot.right)+1;
    }
}