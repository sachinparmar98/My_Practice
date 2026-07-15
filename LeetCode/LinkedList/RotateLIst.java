class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        ListNode temp = head, t = head;
        int size = 1;// we start from 1 because we have hade node
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }

        k = k % size;
        if (k == 0)
            return head;
        while (size > k) {
            if (size-- == k + 1) {
                temp.next = head;
                head = t.next;
                t.next = null;
                return head;
            }
            t = t.next;
        }
        return head;

    }
}