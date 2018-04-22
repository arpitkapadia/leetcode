#Awesome solution
class Solution(object):
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        res = 0
        for i in range(len(s)):
            for j in range(i, len(s)):
                if s[i:j+1] == s[i:j+1][::-1]:
                    res += 1
        return res

'''import math
class Solution:
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        palindrome_map = {}
        for string in self.getSubString(s):
            if(string in palindrome_map):
                if(palindrome_map[string]):
                    count += 1
            else:
                palindrome_map[string] = self.isPalindrome(string)
                if(palindrome_map[string]):
                    count += 1
        return count



    def getSubString(self, s):
        if(len(s) <= 1):
            return [s]
        index1 = 0
        out = []
        while(index1 < len(s)):
            index2 = len(s)
            #out.append(s[index1])
            while(index2 > index1):
                out.append(s[index1:index2])
                index2 -= 1
            index1 += 1
        return out


    def isPalindrome(self, s):
        mid = len(s) // 2

        if(len(s) <= 1):
            return True

        if(len(s) %2 == 0):
            if (s[:mid] == s[mid:][::-1]):
                return True
        else:
            if (s[:mid] == s[mid+1:][::-1]):
                return True


        return False

'''

if __name__ == '__main__':
    st = Solution()
    print(st.getSubString("aaa"))
    print(st.countSubstrings("dbabcccbcdbbbadabbdabaabcbbabaacdadcdbbbbdddbcbbbcbcabacacdaadaadcdccbacdaadadcbaacabbddabdadcabbccadacadaaacbbddaaababacaabbbacaccbcbbabddbbcccaaacbcdcabcbacdbddcdcadaaadcbccbbcabbcbdaadcbddaacacdadacbbdabcdcdadccaccdbdddddcabdbcdbaadacadadbabdcdbbadaacdbadcdabdbbcabbbdaacaaaaadcaabaaaadabaaddcaabdddcbcadcbdbbdbcbcdbadcadacbbcdccddaccccacbacaacbbdadadcacabdabadbbcdbcaaccdbdcabcadbacbccddbabbdacbcbbcbcabcacdaacccaadcdbdccabcaaacaddadcabacdccaaaddaaadbccdbbcccdddababcdbcddcbdddbbbdaadaccbcaabbcbdbadbabbacdbbbdaaccdcabddacadabcccacdabacbcdbcbdabddacacbdbcaacacaabbaaccddabaadbbaabaddbcacbacdbbbacdccabbcdbbbdbdbbcacabdddbdbaaabbcdcbabcbbbccdcdcdcaaddadccbabbacaddcaddcadcdccaccacabbaababdbbcbdcdccccccdadbdbdcdbdadcdcacdaabaacabaacdacdbaaccadbcddbdccabbcabcadcbdadbcdadbbbccacbcbbcaaaabdacbadacaadcadaacdacddcbbabdacacaabccdaccbbcbbcbcaacdabdcbcdbccdbcbcbddaacdacaaaddcaddcadccacbaddbbbccbbbcbbcbadcabbccbbaadaacacabddbdbddcadbdaaccadbcccabdcdbadbbacbcbbcdcabcddcddddabddbdabdcabdbdbbbcdbcdabbdcb"))
    print(st.isPalindrome("aaa"))

