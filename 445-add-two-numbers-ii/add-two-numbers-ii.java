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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Reverse both linked lists
        l1 = reverse(l1);
        l2 = reverse(l2);

        // Create a dummy node to store the result
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        // Loop until both lists are fully traversed and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move l1 forward
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move l2 forward
            }

            // Calculate carry and add digit to the new list
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        // Reverse the result to maintain the correct order
        return reverse(dummy.next);
    }

    // Reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode front = null;
        ListNode back = null;
        while (current != null) {
            front = current.next;
            current.next = back;
            back = current;
            current = front;
        }
        return back;
    }
}
