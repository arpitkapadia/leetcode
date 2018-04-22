import re


class Solution:
    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        if (not len(num1)):
            return num2
        elif (not len(num2)):
            return num1

        flag = False
        if (num1[0] == '-' and num2[0] != '-'):
            flag = True
            num1 = num1[1:]
        elif (num2[0] == '-' and num1[0] != '-'):
            flag = True
            num2 = num2[1:]

        num1_list = list(map(int, list(num1)))
        num2_list = list(map(int, list(num2)))

        sum_list = []
        carry = 0
        for index2 in range(len(num2)):
            tmp = []
            for index1 in range(len(num1) - 1, -1, -1):
                x = (num2_list[index2] * num1_list[index1]) + carry
                tmp.insert(0, x % 10)
                carry = x // 10
            if (carry):
                tmp.insert(0, carry)
            carry = 0
            tmp = tmp + ([0] * (len(num2) - 1 - index2))
            print("tmp", tmp)

            sum_list.append(tmp)

        if (flag):

            return '-' + self.sumOfList(sum_list)
        else:
            return self.sumOfList(sum_list)

    def sumOfList(self, nums):

        # if(len(nums) == 1):
        #    return "".join(map(str, nums[0]))
        tmp = nums[0]
        carry = 0
        for index in range(1, len(nums)):

            if (len(tmp) < len(nums[index])):
                tmp = [0] * (len(nums[index]) - len(tmp)) + tmp
            elif (len(tmp) > len(nums[index])):
                nums[index] = [0] * (len(tmp) - len(nums[index])) + nums[index]

            for index_e in range(len(nums[index]) - 1, -1, -1):
                tmp_sum = tmp[index_e] + nums[index][index_e] + carry
                tmp[index_e] = tmp_sum % 10
                carry = tmp_sum // 10
            if (carry > 0):
                tmp.insert(0, carry)
                carry = 0
        out = ""
        flag = True
        for char in tmp:
            if (char == 0 and flag):
                continue
            out = out + str(char)
            flag = False

        if (not out):
            out = '0'
        return out

if __name__ == '__main__':
    st = Solution()
    print(st.sumOfList([[-1], [1, 2, 3, 6]]))

    print(st.multiply("98", "9"))




