class Solution:
    def findLongestChain(self, pairs):
        """
        :type pairs: List[List[int]]
        :rtype: int
        """
        pairs = sorted(pairs, key=lambda x: x[1])
        print(pairs)
        index = 1
        pre = 0
        count = 1
        while (index < len(pairs)):
            while(index < len(pairs) and pairs[index][1] <= pairs[pre][1]):
                if(pairs[index][0] < pairs[pre][0]):
                    pairs[pre][0] = pairs[index][0]
                index += 1

            if(index < len(pairs) and pairs[index][0] > pairs[pre][1]):

                count += 1
                pre = index
            index = index + 1
        return count





if __name__ == '__main__':
    st = Solution()
    print(st.findLongestChain([[9,10],[-9,9],[-6,1],[-4,1],[8,10],[7,10],[9,10],[2,10]]))