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
    public ListNode rotateRight(ListNode head, int k) {
        // if linkedlist is empty
        if(head==null || head.next==null || k==0){
            return head;
        }
        // count the length
        int length =1;
        ListNode tail = head;
        while(tail.next!=null){
             tail = tail.next;
             length++;
        }
        // normalize the k 
        k = k% length;
        if(k==0) return head;
        
        // make the list circular 
        tail.next = head;
        //Find new tail (at length - k) and new head
        ListNode newTail = head;
        for(int i=1; i<length-k; i++){
            newTail = newTail.next;
        }
        // newHead 
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}