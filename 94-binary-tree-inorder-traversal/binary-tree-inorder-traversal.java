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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Iterative 
        List<Integer>result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node!=null){
            // move to the left till node not become null
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            // then pop of current node and push it to result
            TreeNode currentNode = stack.pop();
            result.add(currentNode.val);
            // then move to the right
            node = currentNode.right;
        }
        return result;
        
    }
}