def main():
    array = ["RLRRLLRLRL", "RLLLLRRRLR", "LLLLRRRR", "RLRRRLLRLL"]
    solution = Solution()
    for s in array:
        output = solution.balancedStringSplit(s)
        print("Output: " + str(output) + "\n")


class Solution(object):
    def balancedStringSplit(self, s):


        # Step1 - Create Stack
        stackL = []
        stackR = []

        # Step2 - Create list to store all Balanced String of L & R
        subString = []
        currentString = ""

        # Step3 - Traverse the string s
        for letter in s:
            print("Letter: " + letter)

            # Step4 - Add Letter to respective stack
            if letter == 'L':
                stackL.append(letter)
            else:
                stackR.append(letter)

            # Step5- Add letter to current String.
            # Why do we need this ? Because we want to keep track of the FullString
            currentString += letter

            # Step6 - Check if both stacks have the same size.
            # Reset both stacks and add currentString to list of SubString
            if (stackL.__len__() == stackR.__len__()):
                print("Stacks are Same Size .. now Empty Both Stack | CurrentString: " + currentString)
                subString.append(currentString)
                stackL.clear()
                stackR.clear()
                currentString = ""

        print("List of All SubString: ", subString)

        return subString.__len__()


if __name__ == '__main__':
    main()


'''
Notes
- Tricky but not difficult
- Involves a bit of thinking first

Solution
1. Create two stacks to store L and R seperately
2. Use a string to keep track of the letters
3. If both stacks have the same size, we clear and reset all the parameters and Add them to list of SubString array
4. Repeat until we go through entire String S

'''