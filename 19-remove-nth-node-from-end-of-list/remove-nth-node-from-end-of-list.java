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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode>stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        // Pop `n` times to reach the target node
        for(int i=0; i<n; i++){
            stack.pop();
        }
        // If stack is empty, it means we are removing the head
        if (stack.isEmpty()) {
            return head.next;
        }
        // findn out the previouse node then linked it with nex.next to skip the nth node
        ListNode previouseNode = stack.peek();
        previouseNode.next = previouseNode.next.next;
        return head;
        
    }
}