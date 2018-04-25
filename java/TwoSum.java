import java.util.*;
class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int tmp: nums) {
            set1.add(tmp);

        }
        for(int i=0; i < nums.length; i++) {
            int tmp = target - nums[i];
            

            if(set1.contains(tmp)) {
                
                for(int j = i+1; j < nums.length; j++) {
                    if(nums[j] == tmp) {
                        return new int[] {i, j};

                    }
                }
            }
        }
        return new int[2];
        
    }
    public static void main(String args[]) {
        TwoSum1 ts = new TwoSum1();
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3, 3} , 6)));
    }
}