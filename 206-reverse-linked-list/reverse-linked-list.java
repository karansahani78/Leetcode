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
import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        // Push all node values onto the stack
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        // Reset temp to head
        temp = head;

        // Pop values and update nodes in the list
        while (temp != null) {
            temp.val = stack.pop();
            temp = temp.next;
        }

        return head;
    }
}
