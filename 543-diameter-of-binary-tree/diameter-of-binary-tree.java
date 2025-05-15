/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxD =0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxD;
        
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        // calculate left height
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        // max D or path i.e calculating max path
        maxD= Math.max(maxD,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight) +1;
    }
}