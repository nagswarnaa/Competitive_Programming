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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode back=head,p1=head,p2=head;
        while(p2!=null && p2.next!=null){
            back=p1;
            p1=p1.next;
            p2=p2.next.next;
        }
        back.next=p1.next;
        return head;
    }
}