/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA =headA;
        ListNode pB = headB;
        while(pA!=pB){
            if(pA==null){
                pA = headB;
            } else {
                // update pA
                pA = pA.next;
            }
            if(pB==null){
                pB = headA;
            } else {
                // update pB
                pB=pB.next;
            }
        }
        return pA;
        
    }
}