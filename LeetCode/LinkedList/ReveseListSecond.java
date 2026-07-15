public class ReveseListSecond {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right)return head;
            ListNode dummy=newListNode(-1,head); 
            ListNode cur=head,pre=head;
            int i=1;
            
                 int k=0;
            while(cur!=null)
            {
                   
               
         
                if(i<left)
                {
                pre=cur;
                cur=cur.next;
                }
                else
                {k++;
                    ListNode temp=cur;
                    pre.next=cur.next;
                    temp.next=cur.next.next;
                   cur.next=cur.next.next;
                   perv.next.next=temp;
                 //   cur=cur.next;      
                    if(k==right-left)break;
                }
                i++;
            }
           return dummy.next;
    }
}
