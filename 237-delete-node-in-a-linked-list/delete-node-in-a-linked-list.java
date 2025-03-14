/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
   if (node == null || node.next == null) {
            return; // This case is impossible based on the problem constraints.
        }
        // Copy the value of the next node to the current node
        node.val = node.next.val;

        // Remove the next node by skipping it
        node.next = node.next.next;
    }
}