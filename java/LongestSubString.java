import java.util.*;
class LongestSubString {

    public int lengthOfLongestSubstringBetter(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
        // abca
        
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int max_length = 0;
        HashSet<Character> tmp_set = new HashSet<>();
        int index = 0;

        while(count < s.length()) {

            //System.out.println(index + " " + count);
            char tmp = s.charAt(count);
            if(tmp_set.contains(tmp)) {
                if(tmp_set.size() > max_length) {
                    max_length = tmp_set.size();
                }
                tmp_set.clear();
                index++;
                count = index;
                continue;

            } else {
                tmp_set.add(tmp);
            }

            count++;
        }
        if(max_length < tmp_set.size()) {
            max_length = tmp_set.size();
        }
        return Integer.valueOf(max_length);
    }

    public static void main(String args[]) {
        LongestSubString ls = new LongestSubString();
        Scanner sc = new Scanner(System.in);
        System.out.println(ls.lengthOfLongestSubstring(sc.nextLine()));
    }

}