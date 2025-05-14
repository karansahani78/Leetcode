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
    int i; Map<Integer, Integer> m = new HashMap<>();
    public TreeNode buildTree(int[] p, int[] in) {
        for (int j = 0; j < in.length; j++) m.put(in[j], j);
        return f(p, 0, in.length - 1);
    }
    TreeNode f(int[] p, int l, int r) {
        if (l > r) return null;
        int v = p[i++], x = m.get(v);
        return new TreeNode(v, f(p, l, x - 1), f(p, x + 1, r));
    }
}
