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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key<root.val){
            // proceed left subtree
            root.left = deleteNode(root.left,key);
        }else if(key>root.val){
            root.right = deleteNode(root.right,key);
        }else{
            // not found then
            if(root.left==null){
                return root.right;
            }else if(root.right==null){ 
             return root.left;

        }else{ 

        TreeNode successor =findMin(root.right);
        // now replace the root with this new smallest value in right
        root.val = successor.val;
        // Step 5: Delete the successor node from right subtree
        root.right = deleteNode(root.right,successor.val);
    }
     }
       return root;
    }
    // find the min from left subtree to as per the property of bst and then it will help to find the successor i.e. smallest value in right subtree to make it new root
    public  TreeNode findMin(TreeNode node){
        while(node.left!=null){
            // go as deep as possible
            node =node.left;
        }
        return node;
    }
}