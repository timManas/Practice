class Solution(object):
    def fixedPoint(self, inputArr):

        # Step1 - Traverse list
        for i in range(inputArr.__len__()):

            # Step2 - Check if i == A[i]
            if i == inputArr[i]:
                return i


        return -1

def main():
    A = [-10,-5,0,3,7]
    A = [-10,-5,3,4,7,9]
    solution = Solution()
    output = solution.fixedPoint(A)
    print("Smalles Index where A[i]==i is: ", output)


if __name__ == '__main__':
    main()

'''
Solution
- Traverse through list and check if i == Arr[i]
- Return -1 if nothing found

'''