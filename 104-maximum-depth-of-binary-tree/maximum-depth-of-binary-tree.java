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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
         q.offer(root);
         int level=0;
         while(!q.isEmpty()){
            int currentLevelSize = q.size();
            while(currentLevelSize>0){
                TreeNode currentNode = q.poll();
                currentLevelSize--;
                if(currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.offer(currentNode.right);
                }
                }
                if(!q.isEmpty()){
                    level++;
            }
         }
         return (level+1);
        
    }
}