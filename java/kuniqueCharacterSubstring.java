// Longest K unique characters substring
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test > 0) {
            String s = input.next();

            int k = input.nextInt();
            System.out.println(lengthOfLongestSubstring(s, k));
            test--;
        }



	}

    public static int lengthOfLongestSubstring(String s, int k) {
        if(k <= 0) {
            return 0;
        }
        int i = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<Character>();
        for(int j = 0; j < s.length(); j++) {
            System.out.println(set + " " + i + " " + j);
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));

            }
            if(set.size() > k) {
                while(set.size() > k) {
                    set.remove(s.charAt(i));
                    i++;
                }
                j = i-1;
                set.clear();

            }
            maxLength = Math.max(maxLength, j-i+1);

        }
        return maxLength;

    }
}