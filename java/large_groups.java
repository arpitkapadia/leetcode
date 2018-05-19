import java.util.*;
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] arr = S.toCharArray();
        //Arrays.sort(arr);
        int count = 0;
        int i = 0;
        List<List<Integer>> outList = new ArrayList<List<Integer>>();
        while(i < S.length()) {
            count = 1;
            int j = i+1;
            while(arr[j] == arr[i]) {
                count++;
                j++;
            }
            if(count >= 3) {
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(i);
                tmp.add(j-1);
                outList.add(tmp);
            }
            i = j;
        }
        return outList;
        
    }
}