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
    public ListNode reverseKGroup(ListNode head, int k) {
        // find out if k node available or not 
        int length =0;
        ListNode temp = head;
        while(temp!=null && length<k){
            temp = temp.next;
            length++;
        
        }
        // now then reverse till the kth node if length==k then we have to reverse them
        if(length==k){
            ListNode current = head;
            ListNode next = null;
            ListNode prev =null;
            for(int i=0; i<k; i++){
                next = current.next;
                current. next = prev;
                prev = current;
                current = next;
            }
            // one kth group is now reversed now next kth group should reverse so call the reverse function directly
            head.next = reverseKGroup(current,k);
            return prev;
            
        }
         //If fewer than k nodes are left, return head (no reversal
        return head;
        
    }
}