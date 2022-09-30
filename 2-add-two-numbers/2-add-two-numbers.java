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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp3=null,head=null;
        int add=0,carry=0;
         temp3=new ListNode(0,null);
         head=temp3;
        while(l1!=null || l2!=null || carry!=0){
            int a=(l1==null?0:l1.val);
            int b=(l2==null?0:l2.val);
            add=a+b+carry;
            int num1=add%10;  
            temp3.next=new ListNode(num1);
            temp3=temp3.next;
            carry=add/10;
            l1=(l1==null?null:l1.next);
            l2=(l2==null?null:l2.next);
        }
        return head.next;
    }
}