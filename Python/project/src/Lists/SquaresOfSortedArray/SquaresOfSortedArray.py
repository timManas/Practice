class Solution(object):
    def sortedSquares(self, input):
        output = []

        for i in input:
            output.append(i * i)

        output.sort()
        return output

def main():
    A = [-4,-1,0,3,10]
    solution = Solution()
    output = solution.sortedSquares(A)
    print("Sorted List:", output)


if __name__ == '__main__':
    main()

'''
Note
- This was a joke. Nothing special about it

Solution
1. Traverse input
2. Append i*i into list
3. Sort list
4. Return list

'''