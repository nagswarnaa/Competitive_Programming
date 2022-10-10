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
        ListNode slow=head,fast=head;
        if(head==null || fast.next==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        if(slow==fast && fast.next!=null){
           slow=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return slow; 
        }
        return null;
    }
}