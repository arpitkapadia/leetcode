import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        } else {
            if(x <= 9) {
                return true;
            } 
            int tmp = x;
            int count = 0;
            
            while(tmp > 0) {
                tmp = tmp / 10;
                count++;
                
            }
            count--;
            int start = 1;
            System.out.println(start + " " + count);
            while(x > 0) {

                int l = ((int)(x / Math.pow(10, count))) % 10;
                int r = x % 10;
                System.out.println("left " + l + " " + r);

                if(l == r) {
                    x = (int)(x % (Math.pow(10, count)));

                    count--;
                    count--;
                    x = (int)(x/10);
                } else {
                    return false;
                }
                System.out.println(start + " " + count + " " + x);

            }
            return true;
        }
        
    }

    public static void main(String args[]) {
        Solution s = new Solution();

        System.out.println(s.isPalindrome((new Scanner(System.in)).nextInt()));
    }
}