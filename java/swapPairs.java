/**
 * Definition for singly-linked list.*/
 import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode tmp = head;
        head = null;
        ListNode prev = null;
        while(tmp != null && tmp.next != null) {

            if(head == null) {
                ListNode x = tmp.next;
                tmp.next = x.next;
                x.next = tmp;
                tmp = tmp.next;
                head = x;
                prev = head.next;
                continue;

            }
            ListNode x = tmp.next;
            tmp.next = x.next;
            x.next = tmp;
            prev.next = x;
            prev = tmp;
            tmp = tmp.next;

        }

        return head;
    }
    public static void displayLinkedList(ListNode l) {
        while(l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }
    public static void main(String args[]) {
        Solution s = new Solution();
        ListNode head = null, tmp = null;

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        while(count > 0) {
            if(head == null) {
                head = new ListNode(input.nextInt());
                tmp = head;
            } else {
                tmp.next = new ListNode(input.nextInt());
                tmp = tmp.next;
            }
            count--;
        }
        displayLinkedList(head);
        System.out.println("After ");
        displayLinkedList(s.swapPairs(head));
    }
}