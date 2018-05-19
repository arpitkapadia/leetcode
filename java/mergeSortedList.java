/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null, tmp = null;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                if(head == null) {
                    head = new ListNode(l1.val);
                    tmp = head;
                } else {
                    tmp.next = new ListNode(l1.val);
                    tmp = tmp.next;
                }
                l1 = l1.next;
            } else {
                if(head == null) {
                    head = new ListNode(l2.val);
                    tmp = head;
                } else {
                    tmp.next = new ListNode(l2.val);
                    tmp = tmp.next;

                }
                l2 = l2.next;
            }
        }

        while(l1 != null) {
            tmp.next = new ListNode(l1.val);
            l1 = l1.next;
            tmp = tmp.next;
        }
        while(l2 != null) {
            tmp.next = new ListNode(l2.val);
            l2 = l2.next;
            tmp = tmp.next;
        }

        return head;
        
    }
}