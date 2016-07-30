import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
         
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
            res.add(node.val);
        }
        return res;
    }
}