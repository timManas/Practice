from collections import deque

class Solution(object):
    def sortArrayByParityII(self, inputArr):

        # Step1 - Create output variable
        output = []
        evenArr = deque()
        oddArr = deque()

        # Steo2 - Populate even and odd Arr
        for num in inputArr:
            if num % 2 == 0:
                evenArr.append(num)
            else:
                oddArr.append(num)

        # Step3 - Populate the output variable
        for i in range(inputArr.__len__()):
            if i % 2 == 0:
                num = evenArr.pop()
            else:
                num = oddArr.pop()

            output.append(num)

        return output



def main():
    input = [4,2,5,7]
    solution = Solution()
    output = solution.sortArrayByParityII(input)
    print("Sorted Array By Parity: ", output)

if __name__ == '__main__':
    main()

'''
Notes
- Super Easy

Solution
1. Use two stacks - One to store Odd # and another to store even #
2. Populate the output array by checking if index % 2 == 0, 
    > Pop from the respective array and place it in output 


'''