import java.util.Stack;

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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        Stack<Integer> oddStack = new Stack<>();
        Stack<Integer> evenStack = new Stack<>();
        
        ListNode temp = head;
        int index = 1;

        // Separate values into odd and even stacks based on position
        while (temp != null) {
            if (index % 2 == 1) { 
                oddStack.push(temp.val); // Odd index
            } else { 
                evenStack.push(temp.val); // Even index
            }
            temp = temp.next;
            index++;
        }

        // Reset temp to head and refill values in correct order
        temp = head;

        while (!oddStack.isEmpty()) {
            temp.val = oddStack.remove(0); // Pop from front to preserve order
            temp = temp.next;
        }

        while (!evenStack.isEmpty()) {
            temp.val = evenStack.remove(0); // Pop from front to preserve order
            temp = temp.next;
        }

        return head;
    }
}
