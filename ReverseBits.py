class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        #print("{0:032b}".format(n))
        return int("".join(reversed("{0:032b}".format(n))), 2)
if __name__ == '__main__':
    st = Solution()
    print(st.reverseBits(1))