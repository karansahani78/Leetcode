/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next; // Remove leading 'val' nodes
        if (head == null) return null; // If list becomes empty

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == val) temp.next = temp.next.next; // Skip node with 'val'
            else temp = temp.next; // Move forward
        }
        return head;
    }
}
