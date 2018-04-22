class Solution(object):
    def convertToTitle(self, n):
        """
        :type n: int
        :rtype: str
        """
        if(n < 1):
            return ""
        tmp = 65
        char_map = {}
        for i in range(0, 26):
            char_map[i] = chr(tmp+i)

        # to convert 100 = 26*3 = 78 and remainder is 22
        result = []
        num = n
        while num > 0:
            result.append(char_map[(num-1)%26])
            num = (num-1) // 26
        result.reverse()
        return ''.join(result)
    
if __name__ == '__main__':
    st = Solution()

    print(st.convertToTitle(702))




