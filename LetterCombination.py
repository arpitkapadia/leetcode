class Solution:
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        tmp_str = "abcdefghijklmnopqrstuvwxyz"
        char_map = {}
        start = 0
        end = 3
        for i in range(2, 10):
            char_map[str(i)] = tmp_str[start:end]
            start = end
            end = start + 3
            if(i == 8 or i == 6):
                end += 1
        print(char_map)
        out_list = []
        char_map[str(1)] = ""
        if(len(digits) <= 1):
            return list(char_map[digits])
        elif(len(digits) >= 2):
            index1 = 0
            index2 = 1

            for char1 in char_map[digits[index1]]:
                for char2 in char_map[digits[index2]]:
                    out_list.append(char1+char2)
            index2 += 1
            while(index2 < len(digits)):
                for char1 in char_map[digits[index2]]:
                    for t in range(len(out_list)):
                        out_list[t] += char1
                index2 += 1
        return out_list





if __name__ == '__main__':
    st = Solution()
    print(st.letterCombinations("223"))