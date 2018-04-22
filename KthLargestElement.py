class Solution(object):
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        tmp = self.quicksort(nums, 0, len(nums)-1, k)
        if(not tmp):
            return nums[len(nums)-k]
        return tmp

    def quicksort(self, nums, start, end, k):
        if(start < end):
            pivot = self.partition(nums, 0, end)
            if(pivot == len(nums)-k):
                return nums[pivot]
            tmp = self.quicksort(nums, start, pivot-1, k)
            if(tmp):
                return tmp
            tmp = self.quicksort(nums, pivot+1, end, k)
            if(tmp):
                return tmp

            #print(nums, start, end, pivot)


    def partition(self, nums, start, end):
        i = -1
        tmp = start
        pivot = nums[end]
        #print(nums, "partition ")
        for index in range(end):
            if(nums[index] <= pivot):
                i += 1
                nums[i], nums[index] = nums[index], nums[i]
        nums[i+1], nums[end] = nums[end], nums[i+1]
        #print("partition ", i+1, nums)

        return i+1
if __name__ == '__main__':
    st = Solution()
    nums = list(map(int, input().split()))
    print(st.findKthLargest(nums, int(input())))


