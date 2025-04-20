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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        HashSet<Integer> seen = new HashSet<>();
        ListNode temp = head;
        seen.add(temp.val);
        while(temp.next!=null){
            if(seen.contains(temp.next.val)){
                // then skip the next
                temp.next = temp.next.next;
            } else {
                seen.add(temp.next.val);
                temp = temp.next;
            }
        }
        return head;
        
    }
}