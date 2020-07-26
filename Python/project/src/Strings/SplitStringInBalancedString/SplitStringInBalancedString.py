def main():
    array = ["RLRRLLRLRL", "RLLLLRRRLR", "LLLLRRRR", "RLRRRLLRLL"]
    solution = Solution()
    for s in array:
        output = solution.balancedStringSplit(s)
        print("Output: " + str(output) + "\n")


class Solution(object):
    def balancedStringSplit(self, s):
        output = 0

        # Create Stack
        stack = []
        subString = ""

        for letter in s:
            print("Letter: " + letter)

            if stack.__len__() == 0:
                stack.append(letter)
                continue

            if stack[stack.__len__() - 1] == letter:
                stack.append(letter)

            else:
                stack.pop(stack.__len__() - 1)
                print("Current Stack: ", stack)

        return output


if __name__ == '__main__':
    main()