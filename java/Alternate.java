// Write a method called alternate that accepts two Lists of integers as its parameters and returns a 
// new List containing alternating elements from the two lists, in the following order:

// First element from first list
// First element from second list
// Second element from first list
// Second element from second list
// Third element from first list
// Third element from second list
// …
// If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed consecutively at the end. For example, for a first list of (1, 2, 3, 4, 5) and a second list of (6, 7, 8, 9, 10, 11, 12), a call of alternate(list1, list2) should return a list containing (1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12). Do not modify the parameter lists passed in.

import java.util.LinkedList;
import java.util.*;
class Alternate {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> list3 = new LinkedList<Integer>();
        int index = 0;
        while(index < list1.size() && index < list2.size()) {
            list3.add(list1.get(index));
            list3.add(list2.get(index));
            index++;
        }
        while(index < list1.size()) {
            list3.add(list1.get(index));
            index++;
        }
        while(index < list2.size()) {
            list3.add(list2.get(index));
            index++;
        }
        return list3;
    }
    public static int rarest(Map<String, Integer> inp) {
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        int min_val = Integer.MAX_VALUE;
        for(int i : inp.values()) {
            if(tmp.containsKey(i)) {
                int t = tmp.get(i);
                if(t+1 < min_val) {
                    min_val = t+1;
                }
                tmp.put(i, t+1);
            } else {
                if(1 < min_val) {
                    min_val = 1;
                }
                tmp.put(i, 1);
            }
        }
        int tmpv = Integer.MAX_VALUE;
        for(int i : tmp.keySet()) {
            if(tmp.get(i) == min_val) {
                if(tmpv > i) {
                    tmpv = i;
                }
            }

        }
        return tmpv;
    }


    public static void main(String args[]) {
        Map<String, Integer> inp = new HashMap<String, Integer>();
        inp.put("ak", 10);
        inp.put("dk", 20);
        inp.put("nk", 10);
        System.out.println(rarest(inp));
    }


}