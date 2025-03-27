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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp = head;
        ListNode front = null;
        ListNode back =null;
        while(temp!=null){
            front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
            
        }
        return back;
    }
}