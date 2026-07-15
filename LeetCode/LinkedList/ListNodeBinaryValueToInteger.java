public class ListNodeBinaryValueToInteger {
    int sum = 0;
    int c = -1;

    public int getDecimalValue(ListNode head) {
        if (head == null)
            return 0;

        ListNode temp = head.next;

        getDecimalValue(temp);
        c++;
        if (head.val == 1) {
            int t = 1;
            for (int i = 1; i <= c; i++) {
                t = t * 2;
            }
            sum = sum + t;
        } else if (c == 0 && head.val == 1)
            sum = sum + 1;
        return sum;
    }

}

// Another eassy way above is taking space and time
/*
 * public int getDecimalValue(ListNode head)
 * {
 * int ans=0;
 * whie(head!=null)
 * {
 * ans=ans*2+head.val;
 * head=head.next;
 * }
 * return ans;
 * }
 */
