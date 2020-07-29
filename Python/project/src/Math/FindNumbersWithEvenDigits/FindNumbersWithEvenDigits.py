def main():
    nums = [12,345,2,6,7896]
    solution = Solution()
    output = solution.findNumbers(nums)
    print("Number Of Digits which are even: " + str(output))


class Solution:
    def findNumbers(self, nums):

        # Step1 - Create output variable
        count = 0

        # Step2 - Traverse num list
        for number in nums:

            # Step3 - Fetch the number of Characters in each letter
            numCharacters = str(number).__len__()
            print("Current Num: ", number, "    numChar: ", numCharacters)

            # Step4 - If even, then add to count
            if numCharacters % 2 == 0:
                count += 1

        return count

if __name__ == '__main__':
    main()

'''
Notes
- Really Simple

Solution
1. Travere the list
2. For each number, convert to String and find number of characters in each String
3. If num Of characters is even, then add to count 

'''