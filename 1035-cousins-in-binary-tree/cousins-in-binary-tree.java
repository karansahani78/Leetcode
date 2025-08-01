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
    TreeNode xParent=null;
    TreeNode yParent=null;
    int xLevel=-1;
    int yLevel=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        findParentAndLevel(root,null,x,y,0);
        return (xParent!=yParent && xLevel==yLevel);
        
        
    }
    public void findParentAndLevel(TreeNode node, TreeNode parent, int x, int y,int level){
        if(node==null) return;

        if(node.val==x){
            xParent = parent;
            xLevel = level;
        }else if(node.val==y){
            yParent=parent;
            yLevel= level;
        }
        // now check ndoe.left and node.right
        findParentAndLevel(node.left, node,x,y,level+1);
        findParentAndLevel(node.right, node,x,y,level+1);
    }
}