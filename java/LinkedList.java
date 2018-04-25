import sun.awt.image.ImageWatched.Link;

class LinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    ListNode head;
    public LinkedList(int[] arr) {
        head = new ListNode(-1);
        ListNode tmp = head.next;

        for(int x: arr) {
            tmp = new ListNode(x);
            tmp = tmp.next;
        }
        System.out.println(head.next.val);
    }

    public static void main(String args[]) {
        LinkedList ln = new LinkedList(new int[]{12, 13});
        
    }
}