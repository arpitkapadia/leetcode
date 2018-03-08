class Solution:
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        last = len(nums)-1
        if(len(nums) == 1):
            if(nums[0] == val):
                return 0
            else:
                return 1
        for index in range(len(nums)):
            if index > last:
                return last + 1
            if(nums[index] == val):
                while(last >= index):
                    if(nums[last] != val):
                        nums[index], nums[last] = nums[last], nums[index]

                        last -= 1
                        break
                    last -= 1

            print(nums, index, last)
        return last + 1
if __name__ == '__main__':
    nums = [4, 5]
    print(Solution().removeElement(nums, 5))