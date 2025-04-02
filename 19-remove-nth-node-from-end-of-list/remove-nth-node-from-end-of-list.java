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
        // we have to find the length of list
        int length =0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        // what if we need to remove head 
        if(n==length){
            return head.next;
        }
        else {
            // reset the temp for next iteration
            temp = head;
            for(int i=1; i<length-n; i++){
                temp = temp.next;
            }
            // now we can simply skip that node 
            temp.next = temp.next.next;
        }
        return head;
        
    }
}