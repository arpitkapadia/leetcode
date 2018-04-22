class Solution:
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        index = 0
        while(index < len(numbers)):
            tmp = target - numbers[index]
            val = 0
            val = self.binarySearch(numbers, tmp, index+1, len(numbers)-1)
            if(val != -1):
                return [index+1, val+1]
            index += 1


    def binarySearch(self, numbers, target, start, end):
        mid = (end + start) // 2
        if(start > end):
            return -1
        if(numbers[mid] > target):
            return self.binarySearch(numbers, target, start, mid -1)
        elif(numbers[mid] < target):
            return self.binarySearch(numbers, target, mid + 1, end)
        else:
            return mid



if __name__ == '__main__':
    st = Solution()
    print(st.twoSum([3,24,50,79,88,150,345], 200))
    print(st.binarySearch([1,2,3], 8, 0, 2))