import java.util.*;
class Solution {
    public int myAtoi(String str) {
        
        StringBuilder sb = new StringBuilder("");
        str = str.trim();
        System.out.println(str + "sb" + sb.toString());

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '-') {
                sb.append(c);
            } else if(c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                if(sb.toString().compareTo("") == 0 || sb.toString().compareTo("-") == 0) {
                    return 0;
                } else {
                    break;
                }
            }
        }
        
        System.out.println(sb.toString());
        
        // String maxInt = String.valueOf(Integer.MAX_VALUE);
        // String minInt = String.valueOf(Integer.MIN_VALUE);

        long val = Long.parseLong(sb.toString());




        // System.out.println("compare to " + maxInt.compareTo(sb.toString()) + " " + minInt.compareTo(sb.toString()));
        
        if(val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } 
        return Integer.parseInt(sb.toString());
        
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("a23243"));
    }
}