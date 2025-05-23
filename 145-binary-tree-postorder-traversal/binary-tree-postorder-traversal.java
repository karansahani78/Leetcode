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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Stack<TreeNode>stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            result.add(currentNode.val);
            if(currentNode.left!=null){
                stack.push(currentNode.left);
            }
            if(currentNode.right!=null){
                stack.push(currentNode.right);
            }
        }
        Collections.reverse(result);
        return result;
        
    }
}