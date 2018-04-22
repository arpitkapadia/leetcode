class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        index2 = 1
        index1 = 0
        if (len(prices) < 2):
            return 0
        profit = 0
        while (index2 < len(prices)):
            print(index1 , index2, profit)
            while (index2 + 1 < len(prices) and (prices[index2] > prices[index1]) and (prices[index2 + 1] > prices[index2])):
                index2 += 1
            if (prices[index2] > prices[index1]):
                profit += (prices[index2] - prices[index1])
                index1 = index2 + 1
                index2 = index1 + 1
                continue
            index1 += 1
            index2 = index1 + 1
            print("end ", index1 , index2, profit)


        return profit



if __name__ == '__main__':
    st = Solution()
    while(input() != "exit"):
        prices = list(map(int, input().split(',')))
        print(st.maxProfit(prices))