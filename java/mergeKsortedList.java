/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        int numOfList = lists.length;
        int i = 0;
        ListNode head = null, tmp = null;
        
        while(true) {
            i = 0
            //ArrayList<Integer> list = new ArrayList<Integer>();
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            
            while(i < lists.length) {
                if(lists[i] != null) {
                    map.put(lists[i].val, i);
                }
            }
            int minVal = Collections.min(map.keySet());
            int index = map.get(minVal);
            lists[index] = lists[index].next;
            
            if(head == null) {
                head = new ListNode(minVal);
                tmp = head;
            } else {
                tmp.next = new ListNode(minVal);
                tmp = tmp.next;
            }

        }
        
        
    }
}