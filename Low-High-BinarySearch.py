class Solution:
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
    def lowBinarySearch(self, nums, target, val, start, end):
        #start = 0
        #end = len(nums) - 1
        mid = int(start + (end - start)/2)
        if(start > end):
            return val
        if(nums[mid] == target):
            return self.lowBinarySearch(nums, target, mid, start, mid-1)
                    
        elif(nums[mid] < target):
            return self.lowBinarySearch(nums, target, val, mid + 1, end)
        else:
            return self.lowBinarySearch(nums, target, val, start, mid -1)

    def highBinarySearch(self, nums, target, val, start, end):
        #start = 0
        #end = len(nums) - 1

        print(start, end)
        mid = int(start + (end - start)/2)
        if(start > end):
            return val
        if(nums[mid] == target):
            return self.highBinarySearch(nums, target, mid, mid + 1, end)
                    
        elif(nums[mid] < target):
            return self.highBinarySearch(nums, target, val, mid + 1, end)
        else:
            return self.highBinarySearch(nums, target, val, start, mid -1)
                            
        
if __name__ == '__main__':
    s = Solution()
    nums = [5,7,7,8,8,10]

    print(s.lowBinarySearch(nums,8, -1,0, len(nums)-1))

    print(s.highBinarySearch(nums,8, -1,0, len(nums)-1))
