import java.util.*;
import java.lang.*;
import java.io.*;
class Rotate {
	public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int casei = 0;
        casei = input.nextInt();
        while(casei > 0) {
            int count = input.nextInt();
            int[] arr = new int[count];
            //System.out.println("count " + count + input.nextLine());
            int i = 0;
            while (i < count) {
                arr[i] = input.nextInt();
                i++;
            }
            //System.out.println(" before " + Arrays.toString(arr));
            i = 1;
            while(arr.length > 0) {
                rotate(arr);
                //System.out.println("After rotation " + Arrays.toString(arr));

                arr = delete(arr, i);
                i++;
            }

        casei--;

        }
    }
    public static int[] delete(int[] arr, int k) {
        if(arr.length == 1) {
            System.out.println(arr[0]);
            return new int[0];
        }
        int[] arr2 = new int[arr.length-1];

        int tmp = arr.length - k;
        if(tmp < 0) {
            tmp = 0;
        }
        for(int i = 0,j = 0; i < arr.length; i++) {
            if(i == tmp) {
                continue;
            }
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
    }
    public static void rotate(int[] arr) {
        //System.out.println("Array before coming here " + Arrays.toString(arr));

        int len = arr.length;
        int tmp = arr[len-1];
        int i = len-2;
        while(i >= 0) {
            arr[i+1] = arr[i];
            i--;
        }
        arr[0] = tmp;
        //System.out.println(Arrays.toString(arr));
    }
}