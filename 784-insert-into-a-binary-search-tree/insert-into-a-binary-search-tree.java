class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // Base case: if current node is null, create and return a new node with val
        if (root == null) {
            return new TreeNode(val);
        }

        // If the value to insert is less than the current node's value, go to left subtree
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            // Otherwise, go to right subtree
            root.right = insertIntoBST(root.right, val);
        }

        // Return the root node after insertion
        return root;
    }
}
