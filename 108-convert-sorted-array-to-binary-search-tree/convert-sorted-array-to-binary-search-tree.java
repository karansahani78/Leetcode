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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0, nums.length-1);
        
    }
    private TreeNode buildTree(int[] nums, int leftNode, int rightNode){
        if(leftNode>rightNode) return null;
        int middNode = leftNode+(rightNode-leftNode)/2;
        // let's create tree using preorder
        TreeNode root = new TreeNode(nums[middNode]);
        root.left = buildTree(nums, leftNode, middNode - 1);
        root.right = buildTree(nums,middNode+1,rightNode);
        return root;
    }
}