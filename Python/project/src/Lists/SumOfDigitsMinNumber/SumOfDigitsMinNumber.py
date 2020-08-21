class Solution(object):
    def sumOfDigits(self, arr):

        # Step1 - Create variable for smallest number
        minNum = arr[0]

        # Step 2 - Traverse List
        for num in arr:
            if minNum > num:
                minNum = num

        # Step3 - Find the sum of the min number
        total = 0
        for letter in str(minNum):
            print(letter)
            total += int(letter)
        print ("Total: " + str(total))

        # Step4 - Return 0 if odd, else 1
        if total % 2 == 0:
            return 1

        return 0


def main():
    #A = [34,23,1,24,75,33,54,8]
    A = [99,77,33,66,55]
    solution = Solution()
    output = solution.sumOfDigits(A)
    print("Output: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Super easy


Solution
1. Traverse array
2. Find the smallest num
3. Find the sum of the smallest Num
4. Return 0 if even, 1 if odd

'''