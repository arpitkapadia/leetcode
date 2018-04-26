/**
 * Definition for singly-linked list.*/
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }

      public String toString() {
        return String.valueOf(val);
      }
 }
 class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tmp = head;
        int carry = 0;

        while(l1 != null && l2 != null) {
            int t = l1.val + l2.val + carry;
            if(head == null) {
                head = new ListNode(t % 10);
                tmp = head;
            } else {
                tmp.next = new ListNode(t % 10);
                tmp = tmp.next;
            }
            carry = t / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int t = l1.val + carry;
            tmp.next = new ListNode(t % 10);
            carry = t / 10;
            tmp = tmp.next;
            l1 = l1.next;

        }

        while(l2 != null) {
            int t = l2.val + carry;
            tmp.next = new ListNode(t % 10);
            carry = t / 10;
            tmp = tmp.next;
            l2 = l2.next;
        }
        if(carry > 0) {
            tmp.next = new ListNode(carry);
        }

        //System.out.println(head.val + " " + head.next.val);
        return head;
    }

    public static void main(String args[]) {
        Solution ts = new Solution();

        ListNode l = new ListNode(5);
        ListNode r = new ListNode(5);
        // ListNode l1 = new ListNode(2);
        // ListNode r1 = new ListNode(2);
        // l.next = l1;
        // r.next = r1;

        System.out.println("hi" + ts.addTwoNumbers(l, r));

    }
}

// -1 --> 0