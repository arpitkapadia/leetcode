class Solution:
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # print(s)
        s = "".join(s.split('\n'))
        s = "".join(s.split(' '))
        if (not len(s)):
            return True

        index1 = 0
        index2 = len(s) - 1

        while (s[index1].upper() == s[index2].upper()):
            index1 += 1
            index2 -= 1
            if (index1 == index2):
                return True

            return self.isPalindrome(s[1:len(s) - 1])

        if (not s[0].isalnum()):
            i = 0
            while (not s[i].isalnum()):
                i += 1
                if (i >= len(s)):
                    i = len(s)
                    break
            return self.isPalindrome(s[i:])

        if (not s[len(s) - 1].isalnum()):
            i = len(s) - 1
            while (not s[i].isalnum()):
                i -= 1
                if (i < 0):
                    i = -1
                    break
            return self.isPalindrome(s[:i + 1])
        return False
if __name__=='__main__':
    st = Solution()
    print(st.isPalindrome(input()))