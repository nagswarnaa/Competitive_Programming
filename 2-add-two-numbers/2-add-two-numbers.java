
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           if(l1==null && l2==null){
               return null;
           }
           if(l1==null){
            return l2;
           }
           else if(l2==null){
            return l1;
           }
           ListNode temp1=l1;
           ListNode temp2=l2;
           ListNode head=null;
           ListNode temp3=null;
           int carry=0;
           while(temp1!=null && temp2!=null){
               int i=temp1.val+temp2.val+carry;               
               int add=i%10;  
               if(head==null){
                   head=new ListNode(add);
                   temp3=head;
               }
               else{
                   temp3.next=new ListNode(add);
                   temp3=temp3.next;
               }
               carry=i/10;
               temp1=temp1.next;
               temp2=temp2.next;
           }
           if(temp1==null&& temp2!=null){
              while(temp2!=null){
              int i=temp2.val+carry;    
              int add=i%10;    
              temp3.next=new ListNode(add);
              carry=i/10;    
              temp3=temp3.next;
              temp2=temp2.next;  
              } 
             
           }
           if(temp2==null&& temp1!=null){
               while(temp1!=null){
              int i=temp1.val+carry;    
              int add=i%10;      
              temp3.next=new ListNode(add);
              carry=i/10;     
              temp3=temp3.next;
              temp1=temp1.next;
               }
           }
         if(carry!=0){
             temp3.next=new ListNode(carry);
         }
        return head;
    }
}