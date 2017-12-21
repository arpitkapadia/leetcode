/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class RmDupLinkedList {

  public ListNode deleteDuplicates(ListNode head) {
      if(head == null) {
          return head;
      }
      int val = head.val;
      ListNode temp = head;
      ListNode start = head;
      // System.out.println(start.next.val);
      while(start.next != null) {
          start = start.next;

          // System.out.println("in loop " + start.val);
          if(start.val != val) {
            temp.next = start;
            val = start.val;
            temp = start;
          } else {
            temp.next = null;
          }
      }

      return head;

  }
    public static void main(String args[]) {

      ListNode l1 = new ListNode(1);
      ListNode l2 = new ListNode(1);
      l1.next = l2;

      RmDupLinkedList rm = new RmDupLinkedList();
      rm.deleteDuplicates(l1);
    }
}
