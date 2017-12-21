class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while(start <= end) {
          // if(start == end) {
          //   return start;
          // }
          int mid = (start + end)/2;
          if(mid >= nums.length) {
              return nums.length;
          }
          // System.out.println(mid);
          if(nums[mid] == target) {
            return mid;
          } else if(nums[mid] > target) {
            end = mid - 1;
          } else {
            start = mid + 1;
          }
          // System.out.println("s" + start + "e" + end);

        }
        return start;

    }
    public static void main(String args[]) {
      int count = Integer.parseInt(args[0]);
      int [] nums = new int[count];
      int i = 1;
      while(i <= count) {
        nums[i-1] = Integer.parseInt(args[i]);
        i++;
      }
      int target = Integer.parseInt(args[count + 1]);

      Solution st = new Solution();
      // int [] nums = {1};
      System.out.println(st.searchInsert(nums, target));
    }
}
