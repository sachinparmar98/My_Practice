// Using recursion
/* 
class Solution {
    int c=0;
    int k=0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null) return head;
       k++;
       removeNthFromEnd(head.next,n);
       ++c;
           if(k==n)return head=head.next;//for those condition when n==total nodes 
       if(c==n+1)//beacause remove hona wala node sa ek position aga jana ka liya
         head.next=head.next.next;
       return head;
    }
}
    */

/* 
       Complexity	Value	Reason
Time Complexity	    O(N)	Each node is visited once during recursion and processed once during backtracking.
Space Complexity	O(N)	Recursive call stack stores one stack frame for each node.

Interview Tip: If asked why the space complexity is not O(1), mention that recursive 
calls consume stack memory, so even without explicit extra data structures, recursion 
requires O(N) auxiliary space.

    */

//using loop
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (size == n) {
            return head = head.next;
        } // when total node and n is same
        temp = head;
        while (size == n + 1) {
            temp = temp.head;
            size--;
        }
        temp.next = temp.next.next;
        return head;

    }

}
// time complexity O(n)
// space complexity O(1)