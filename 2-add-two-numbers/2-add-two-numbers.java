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
        ListNode temp1=l1,temp2=l2,temp3=null,head=null;
        int add=0,carry=0;
        while(temp1!=null || temp2!=null || carry!=0){
            int a=(temp1==null?0:temp1.val);
            int b=(temp2==null?0:temp2.val);
             add=a+b+carry;
            int num1=add%10;
            if(head==null){
                head=new ListNode(num1);
                temp3=head;
            }
            else{
                temp3.next=new ListNode(num1);
                temp3=temp3.next;
            }
            carry=add/10;
            temp1=(temp1==null?null:temp1.next);
            temp2=(temp2==null?null:temp2.next);
        }
        return head;
    }
}