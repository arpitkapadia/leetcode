import math
class Solution:
    '''


    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        if (n == 0):
            return 1.0
        num = 1.0
        flag = False
        if (n > 0):
            flag = True
        while (n != 0):
            if (flag):
                num = x * num
                n -= 1
            else:
                num = num / x
                n += 1

        return num
    '''
    def myPow(self, x, n):
        if(n == 1):
            return x

        if(n % 2 == 0):
            tmp = self.myPow(x, math.floor(n / 2))

            return tmp ** 2
        else:
            tmp = self.myPow(x, math.floor(n / 2))

            return (tmp ** 2) * x

if __name__=='__main__':
    st = Solution()
    print(st.myPow(3, 1))


