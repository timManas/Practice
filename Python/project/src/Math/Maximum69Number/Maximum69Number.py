class Solution(object):
    def maximum69Number (self, num):

        # Step1 - Create output variable
        largest69 = num

        # Step2 - Traverse list
        for digit in range(str(num).__len__()):

            # Step3 - Fetch each digit in num starting from 0 to length
            strDigit = str(num)[digit]
            print("i: ", digit, "     num[i]: ", strDigit)

            # Step4 - Check if 6 ... convert it to 9
            if strDigit == '6':
                strDigit = '9'

            # Step5 - Convert str to list for comparison
            number = list(str(num))
            number[digit] = strDigit
            print("Replaced Number: ", number)

            # Step6 - Check if number is greater than largest69
            if (largest69 < int("".join(number))):
                largest69 = int("".join(number))


        return largest69

def main():
    num = 9669
    solution = Solution()
    output = solution.maximum69Number(num)
    print("Max 69: " + str(output))

if __name__ == '__main__':
    main()

'''
Notes
- Easy
- Hardest part of this of this problem was converting between str to int
- Strings are immutable
- Better to convert string to list for modification 

Solution
1. Convert num to String 
2. Traverse string by each digit
3. For each digit, if we are 6, convert it to 9
4. Check if digit is larger than largest69
    > True - Set largest69 to number
5. Repeat until we reach the end  of the string

'''