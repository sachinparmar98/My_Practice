class MixProgram {
  /**
   * @due to rain this program on hold ;
   */
  public static void main(String[] args) {
    MixProgram mp = new MixProgram();

    // System.out.println(mp.countBinaryOnceDigit(2));

  }

  // function for how many once digit in given number binary digit
  public int countBinaryOnceDigit(int n) {
    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;
    }
    return count;

  }

  // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
  public ListNode deleteDuplicates(ListNode head) {
    ListNode duplicate = new ListNode();
    ListNode Head = duplicate;
    if (head == null || head.next == null)
      return head;
    int c = head.val;
    while (head.next != null) {
      if (head.next.val == c)
        head = head.next;
      else {
        c = head.next.val;
      }
    }

  }

  class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  