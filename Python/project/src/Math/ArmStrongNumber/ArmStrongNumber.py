

class Solution(object):
    def isArmstrong(self, num):

        # Step1 - Find the num of digits in num
        numDigits = str(num).__len__()

        # Step2 - For every digit in num, we calculate the total armstrong number
        total = 0
        for strDigit in str(num):
            total += pow(int(strDigit), numDigits)
        print("Total: ", total)

        # Step3 - Return if total is equal to the input 'num'
        return total == num



def main():
    N = 153
    solution = Solution()
    output = solution.isArmstrong(N)
    print("Is ArmStrong Number: " + str(output))


if __name__ == '__main__':
    main()



'''
Notes
- Quite Easy

Solution
1. Find num of digits
2. Traverse every digit in num and calculaet the total
3. Compare the total with the input 'num'
'''