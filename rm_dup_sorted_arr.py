class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        index = 0
        count = 0
        while(index <= len(nums)-1):
            last_index = -1
            last_index = self.findLastIndex(nums, index)
            nums[count] = nums[index]

            if(index == last_index):
                index += 1
            else:
                index = last_index + 1
            count += 1

        return count

    def findLastIndex(self, nums, index):
        start = index + 1
        end = len(nums)
        if(start >= end):
            return index
        while (start < end):
            if(nums[start] != nums[index]):
                return start - 1
            start += 1
        return start - 1

    # def slideArrayBy(self, nums, start, count):
    #     if(count == 0):
    #         return nums
    #     end = len(nums)
    #     for



if __name__ == "__main__":
    # nums = [1,2,3,4,5,5,5,5,6,6,6,9]
    nums = [1,1]
    temp = Solution()
    print(temp.findLastIndex(nums, 0))

    print(temp.removeDuplicates(nums))
