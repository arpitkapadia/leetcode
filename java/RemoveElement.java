import java.util.Arrays;
class RemoveElement
{
    public int removeElement(int[] nums, int val)
    {
        int index1 = 0;
        int index2 = 0;
        if(nums.length == 1)
        {
          if(nums[0] == val)
          {
            nums[0] = -1;
            return 0;
          }
          else
          {
            return 1;
          }
        }
        while(index2 < nums.length)
        {
            if(nums[index2] == val)
            {
                index2++;
                while(index2 < nums.length)
                {
                    if(nums[index2] != val)
                    {
                        nums[index1] = nums[index2];

                        System.out.println(Arrays.toString(nums));
                        index1++;
                        index2++;
                        break;
                    }
                    index2++;
                }
            }
            else
            {
              System.out.println(Arrays.toString(nums));

              index2++;
              index1++;
            }
        }
        return index1;
    }
    public static void main(String args[])
    {
      int count = Integer.parseInt(args[0]);
      int [] nums = new int[count];
      int i = 1;
      while(i <= count)
      {
        nums[i-1] = Integer.parseInt(args[i]);
        i++;
      }
      int target = Integer.parseInt(args[count + 1]);

      RemoveElement rm = new RemoveElement();
      System.out.println(rm.removeElement(nums, target));
    }
}
