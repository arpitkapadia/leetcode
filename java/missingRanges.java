/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static final int start = 0;
    public static final int end = 999;

	public static void main (String[] args) {
		//code

        Scanner input = new Scanner(System.in);
        System.out.println(printMissingRanges(new int[] {0, 1,10,80,998, 999}));
	}

    public static String printMissingRanges(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 0) {
            return "[ 0-999 ]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[]");

        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                if(arr[i] > start+1) {
                    sb.insert(1, String.valueOf(start) +"-" + String.valueOf(arr[i]-1));
                } else if(arr[i] == 1) {
                    sb.insert(1, String.valueOf(start));
                }
                continue;
            } else if(i == arr.length-1) {
                if(arr[i-1]+2 < arr[i]) {
                    sb.insert(sb.length()-1, " " + String.valueOf(arr[i-1]+1) + "-" + String.valueOf(arr[i]-1));

                } else if(arr[i-1]+2 == arr[i]){
                    sb.insert(sb.length()-1, " " + String.valueOf(arr[i-1]+1));
                }
                if(arr[i] < end-1) {
                    sb.insert(sb.length()-1, " " + String.valueOf(arr[i]+1) +"-" + String.valueOf(end));

                } else if(arr[i] == end-1) {
                    sb.insert(sb.length()-1, " " + String.valueOf(end));

                }
                continue;
            } 
            if(arr[i-1]+2 < arr[i]) {
                sb.insert(sb.length()-1, " " + String.valueOf(arr[i-1]+1) + "-" + String.valueOf(arr[i]-1));

            } else if(arr[i-1]+2 == arr[i]){
                sb.insert(sb.length()-1, " " + String.valueOf(arr[i-1]+1));
            }

        }
        sb.insert(1," ");
        sb.insert(sb.length()-1, " ");
        return sb.toString();

    }
}