import java.util.*;
class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        // Map<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
        // for(int i=0; i<s.length(); i++) {
        //     if(map.containsKey(s.charAt(i))) {
        //         ArrayList<Integer> tmp = map.get(s.charAt(i));
        //         tmp.add(i);
        //     } else {
        //         ArrayList<Integer> tmp = new ArrayList<Integer>();
        //         tmp.add(i);
        //         map.put(s.charAt(i), tmp);
        //     }
        // }
        // System.out.println(map);

        String reverseS = new StringBuilder(s).reverse().toString();
        //int limit = Integer.MAX_VALUE;
        Map<Integer, Integer> map = this.longestCommonSubstringForPalindrome(s, reverseS);
        for(int key : map.keySet()) {
            if(isPalindrome(s.substring(map.get(key) - key, map.get(key))))
            {
                return s.substring(map.get(key) - key, map.get(key));
            }
        }
        return "";

    }

    public boolean isPalindrome(String s) {
        int last = s.length()-1;
        int first = 0;
        while(first <= last) {
            if(!(s.charAt(first) == s.charAt(last))) {
                return false;
            }
            first++;
            last--;

        }
        return true;
    }
    public Map<Integer, Integer> longestCommonSubstringForPalindrome(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        ArrayList<Integer> out = new ArrayList<Integer>();
        int [][] table = new int[m+1][n+1];
        for(int j = 0; j < m+1; j++) {
            table[j][0] = 0;
        }

        for(int i = 0; i < n+1; i++) {
            table[0][i] = 0;
        }
        int maxV = 0;
        int maxI = 0;
        int maxJ = 0;
        for(int i = 1; i < m+1; i++) {
            for(int j = 1; j < n+1; j++) {
                String t1 = s1.substring(0, i);
                String t2 = s2.substring(0, j);
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                } else {
                    table[i][j] = 0;
                }
                map.put(table[i][j], i);

                // if(table[i][j] > maxV) {
                //     maxV = table[i][j];
                //     maxI = i;
                //     maxJ = j;
                // }
            }
        }
        // out.add(maxI);
        // out.add(maxJ);
        // out.add(maxV);
        return map;
        // if(maxV > 0) {
        //     return s1.substring(maxI-maxV,maxI);
        // }
        // return "";


    }


        //Longest common substring between two strings

    public String longestCommonSubstring(String s1, String s2, int limit) {
        int m = s1.length();
        int n = s2.length();
        int [][] table = new int[m+1][n+1];
        for(int j = 0; j < m+1; j++) {
            table[j][0] = 0;
        }

        for(int i = 0; i < n+1; i++) {
            table[0][i] = 0;
        }
        int maxV = 0;
        int maxI = 0;
        int maxJ = 0;
        for(int i = 1; i < m+1; i++) {
            for(int j = 1; j < n+1; j++) {
                String t1 = s1.substring(0, i);
                String t2 = s2.substring(0, j);
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                } else {
                    table[i][j] = 0;
                }

                if(table[i][j] > maxV && table[i][j] < limit) {
                    maxV = table[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        if(maxV > 0) {
            return s1.substring(maxI-maxV,maxI);
        }
        return "";


    }

    public static void main(String args[]) {
        LongestPalindromeSubstring sl = new LongestPalindromeSubstring();
        System.out.println("answer is " + sl.longestPalindrome("babad"));

        //System.out.println(sl.longestCommonSubstring("kapkapkapad", "kapadiarp"));
    }
}   