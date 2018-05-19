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
		    int n = input.nextInt();
		    int k = input.nextInt();
		    int[] arr = new int[n];
		    int i = 0;
		    while(i < n) {
		        arr[i] = input.nextInt();
		        i++;
		    }
		    int count = 0;
		    for(int i = n-1; i > 0; i--) {
		        for(int j = i-1; j >= 0; j--) {
		            if(arr[i] < arr[j]) {
		                int tmp = arr[j];
		                arr[j] = arr[i];
		                arr[i] = tmp;
		            }
		        }
	            System.out.println(arr[i]);
	            count++;
	            
	            if(count == k) {
	                break;
	            }
		  
		        
		    }
		    
		    test--;
		    
		    
		}
	}
}