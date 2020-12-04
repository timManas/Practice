class Solution(object):
    def findLength(self, A, B):

        # Step1 - Create output variable
        maxLength = 0

        # Step2 - Create a dp with all 0's
        dp = [[0 for i in range(A.__len__())] for j in range(B.__len__())]

        # Step3 - Traverse the input array backwards
        for i in range(A.__len__() - 1, -1, -1):
            for j in range(B.__len__() - 1, -1, -1):

                # Step4 - If we get a match, update the dp[][] matrix
                if A[i] == B[j]:
                    print("Match")
                    if (i+1) >= A.__len__() or (j+1) >= B.__len__():            # If we match at the end, we set it to 1
                        dp[i][j] = 1
                    else:
                        dp[i][j] = dp[i+1][j+1] + 1                             # We increment the one before
                        maxLength = max(maxLength, dp[i][j])

            print()

        print("dp:", dp)

        return maxLength



def main():
    # A = [1, 2, 3, 2, 1]
    # B = [3, 2, 1, 4, 7]

    A = [1, 0, 0, 0, 1]
    B = [1, 0, 0, 1, 1]
    solution = Solution()
    output = solution.findLength(A,B)
    print("Maximum Length of SubArray: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Very difficult ...10/10
- Uses Dynamic programming
- Trick is to use a multi dimensional array similar to ...find maximalSquare

Solution
- Create empty multidimensional array
- Traverse the both input array in reverse
- If we encounter a match, we increment the dp[i][j] = dp[i+1][j+1] + 1
    > we are at the Edge, we just set it to dp[i][j] = 1


'''