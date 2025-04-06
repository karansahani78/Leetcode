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
    private ListNode start;

    public boolean isPalindrome(ListNode head) {
        start = head;           // This will move from the beginning
        return checkPalindrome(head); // Start checking from the end
    }

    private boolean checkPalindrome(ListNode end) {
        if (end == null) return true;

        // Recursively go to the end of the list
        if (!checkPalindrome(end.next)) return false;

        // Compare current start and end values
        if (start.val != end.val) return false;

        // Move start pointer forward
        start = start.next;

        return true;
    }
}
