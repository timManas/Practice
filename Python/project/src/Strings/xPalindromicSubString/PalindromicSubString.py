class Solution(object):
    def countSubstrings(self, inputString):

        # Step1 = Create output variable
        count = 0

        # Step2 - Check if inputString is blank
        if inputString == "":
            return count

        # Step3 - Traverse each letter one by one
        for index in range(inputString.__len__()):
            print("Current Number: ", inputString[index])

            # Step4 - Calculate when odd length
            count += self.fetchSubString(inputString, index, index)

            # Step5 - Calculate when even length
            count += self.fetchSubString(inputString, index, index + 1)
        return count

    '''
        Traverse left Index moving to the LEFT
        Traverse Right Index moving to the RIGHT
    '''
    def fetchSubString(self, inputString, leftIndex, rightIndex):
        count = 0

        # Step1 - Move left Index to the left & Move Right Index to the right
        while leftIndex >= 0 and rightIndex < inputString.__len__():

            # Step1 - Increment counter only if letters are the same on both ends
            if inputString[leftIndex] == inputString[rightIndex]:
                count += 1
                leftIndex -= 1
                rightIndex += 1

        return count


def main():
    input = ["abc", "aaa"]
    solution = Solution()
    for s in input:
        output = solution.countSubstrings(s);
        print("Num of Palindromic SubString: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- This was hard 8/10 hard
- The trick requires one loop to through each letter one by one
    - Another loop to calculate the palindrome starting from the letter moving OUTWARDS ...

Solution
1. Traverse inputString letter by letter
2. For each letter, we create two calls:
    - One for a palindrome of odd length
    - One for a palindrome of even length
3. We create two pointers leftIndex and RightIndex:
    - LeftIndex moves to left until we reach the beginning
    - RightIndex moves to right until we reach the end of the String
    
Why are we doing this ?
- Because we need to start from the middle ...and move outwards
- Compare the leftIndex and RightIndex are the same. If not, then they are NOT palindromes
- Continue doing this UNTIL we reach the last letter


'''