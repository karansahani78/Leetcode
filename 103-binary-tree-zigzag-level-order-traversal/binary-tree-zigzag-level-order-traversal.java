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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = q.poll();

                if (leftToRight) {
                    currentLevel.addLast(currentNode.val); // left → right
                } else {
                    currentLevel.addFirst(currentNode.val); // right → left
                }

                if (currentNode.left != null) q.add(currentNode.left);
                if (currentNode.right != null) q.add(currentNode.right);
            }

            ans.add(currentLevel);
            leftToRight = !leftToRight; // flip direction for next level
        }

        return ans;
    }
}
