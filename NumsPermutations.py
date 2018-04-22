class Solution:
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # print(" nums " , nums)
        length = len(nums)
        if (length == 2):
            return [[nums[0], nums[1]], [nums[1], nums[0]]]
        elif (length < 2):
            return [nums]
        index = 0
        out = []

        tmp = self.permute(nums[1:])

        # print("tmp" , tmp)
        for index in range(length):
            for lst in tmp:
                x = list(lst)
                x.insert(index, nums[0])
                out.append(x)
        return out
def main():
    st= Solution()
    print(st.permute([1,2,3]))

if __name__ == '__main__':
    main()