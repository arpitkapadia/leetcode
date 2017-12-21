class MaximumSubArray {
  public int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] > max) {
        max = nums[i];
      }
      int temp = nums[i];
      for(int j = i+1; j < nums.length; j++) {
        temp += nums[j];
        if(max < temp) {
          max = temp;
        }
      }
    }
    return max;
  }
  public static void main(String args[]) {
    int [] nums = {-1,-4, 3, -1};
    System.out.println(new MaximumSubArray().maxSubArray(nums));
  }
}
