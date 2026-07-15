public class SwapingNodesInLinkedList {
     public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head, first = null, last = null;
        int size = 1;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        if (size%2==1 && k==size/2+1)
            return head;
        int rev = size;
        for (int i = 1; i <= size; i++, rev--) {
            if (i == k)
                first = temp;
            if (rev == k)
                last = temp;

            temp = temp.next;
        }
        int t=first.val;
        first.val=last.val;
        last.val=t;
        return head;

    }

    }
    //Time Complexity O(n)
    //Space Complexity O(1)

// Below more relible way

class Solution {
       public ListNode swapNodes(ListNode head, int k) {
       ListNode first=head,end=head,begin=head;
          for(int i=1;i<k;i++)
          {
              first=first.next;
              begin=begin.next;
          }
    
    }}



