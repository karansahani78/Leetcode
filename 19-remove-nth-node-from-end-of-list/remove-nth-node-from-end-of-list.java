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
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        if(len==n){
            return head.next;
        }
        ListNode temp =head;
        for(int i=0; i<len-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
        
    }
}