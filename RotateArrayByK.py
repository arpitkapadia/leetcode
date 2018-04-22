class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        effective = k % len(nums)
        nums[0:] = nums[len(nums)-effective:] + nums[:len(nums)-effective]
        print(nums)
if __name__ == '__main__':
    st = Solution()
    nums = list(map(int, input().split()))
    st.rotate(nums, int(input()))
    print(nums)