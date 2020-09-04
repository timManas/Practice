class Solution:
    def diStringMatch(self, input):

        # Step1 - Create output variable
        output = []

        # Step2 - Create two pointers to hold values from 0 to N
        left = 0
        right = input.__len__()

        # Step3- Traverse input string
        for letter in input:

            if letter == 'I':
                count = left
                left += 1       # Increment left by 1
            else:
                count = right
                right -=1       # Decrement right by 1
            output.append(count)


        # Step4 - Add the last value not in the array
        right -=1
        output.append(left)

        return output

def main():
    S = ["IDID", "III", "DDI"]
    solution = Solution()

    for i in S:
        output = solution.diStringMatch(i)
        print("Output: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- NOT AN EASY QUESTION

Solution
1. Create two pointers left and right to hold the values from 0 - N
2. Traverse the input
3. If letter == I, add left to array. Increment left by 1
    If letter = D, add right to array. Decrement right by 1
4. At the end of the loop, add the right value



'''