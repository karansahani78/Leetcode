/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                // fount the meeting point now we need to find the starting point of the cycle keep slow as the duplicate value  
                ListNode startingPoint = head;
                while(startingPoint!=slow){
                    slow = slow.next;
                    startingPoint=startingPoint.next;

                }
                return startingPoint;
            }
        }
        return null;
        
    }
}