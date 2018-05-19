/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase > 0) {
            StringBuilder sb = new StringBuilder(input.next());
            int index = 0;
            int sindex = 0;
            while(index < sb.length()) {
                int index2 = index;
                while(index2 < sb.length() && sb.charAt(index2) != '.') {
                    index2++;
                }
                //sindex = index2;
                if(index2 == sb.length() || sb.charAt(index2) == '.') {
                    sindex = index2+1;
                    index2--;
                }
                if(index2 > index) {
                    //reverse logic  012.
                    int count = index2-index;
                    int last = index2;
                    while(count > 0) {
                        char c = sb.charAt(index2-1);
                        sb.deleteCharAt(index2-1);
                        sb.insert(last, c);
                        index2--;
                        count--;
                        //System.out.println(c + " " + " checking sb " + sb.toString());
                    }
                }
                index = sindex;

            }
            System.out.println(sb.toString());
            testcase--;
        }
		
	}
}