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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root==null) return result;
        findPath(root, "", result);
        return result;

        
    }
    private void findPath(TreeNode node, String currentPath, List<String> result){
        currentPath = currentPath+node.val;
        if(node.left==null && node.right==null){
            result.add(currentPath);
            return;
        }
        if(node.left!=null){
             findPath(node.left, currentPath + "->", result);
        }
        if(node.right!=null){
            findPath(node.right, currentPath+ "->", result);
        }
    }
}