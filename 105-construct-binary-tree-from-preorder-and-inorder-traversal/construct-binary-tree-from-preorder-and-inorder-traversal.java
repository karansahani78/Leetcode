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
    int i;
    public TreeNode buildTree(int[] p, int[] in) {
        return f(p, in, 0, in.length - 1);
    }
    TreeNode f(int[] p, int[] in, int l, int r) {
        if (l > r) return null;
        TreeNode n = new TreeNode(p[i++]);
        int m = l; while (in[m] != n.val) m++;
        n.left = f(p, in, l, m - 1);
        n.right = f(p, in, m + 1, r);
        return n;
    }
}