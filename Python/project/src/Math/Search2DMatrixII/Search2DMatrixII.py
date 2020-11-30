class Solution(object):

    # Uses Search Space Reduction
    def searchMatrix(self, matrix, target):
        row = matrix.__len__() - 1
        col = 0

        while row >= 0 and col < matrix[0].__len__():
            current = matrix[row][col]
            print("Current: ", current )

            if current == target:
                return True
            elif current < target:
                col += 1
            elif current > target:
                row -= 1

        return False

    # Uses Binary Search
    def searchMatrix_BinarySearch(self, matrix, target):

        for row in range(matrix.__len__()):
            if self.findTarget(matrix[row], target, 0, matrix[row].__len__()):
                return True

        return False

    def findTarget(self, matrix, target, start, end):
        isFound = False

        if start >= end:
            return False

        middle = int((start + end) / 2)
        if matrix[middle] == target:
            return True
        elif matrix[middle] > target:                                       # Check Left Side
            isFound = self.findTarget(matrix, target, start, middle)
        elif matrix[middle] < target:                                       # Check Right Side
            isFound = self.findTarget(matrix, target, middle + 1, end)

        return isFound

    def searchMatrix_BruteForceSolution(self, matrix, target):
        for row in range(matrix.__len__()):
            for col in range(matrix[row].__len__()):
                print("Current: ", matrix[row][col])
                if matrix[row][col] == target:
                    return True
                elif matrix[row][col] > target:
                    break
            print()

        return False




def main():
    matrix = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24],
              [18, 21, 23, 26, 30]]
    target = 5
    solution = Solution()
    output = solution.searchMatrix(matrix, target)
    print("IsValuePresent: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- My solution but its not the best solution apparently 
- Here we presented two ways of finding the target element: BruteForce & Binary Search

Solution
1. BruteForce
- Traverse input matrix, if we encounter a number greater than target we move to the next row

2. Binary Search
- Recursively find the middle element
- If middle > target, we search Left Part of List
- If middle < target, we search Right Part of List
- If middle == target, we return True  

3. Search Space Reduction
- Start from the bottom Left of the input array
- Use a while loop to traverse
- If current == target, return true
- If current > target, row--
- if current < target, col++
Note: In order to use this Algorithm, the Matrix needs to be sorted both horizontally and vertically like this 
[[1, 4, 7, 11, 15], 
 [2, 5, 8, 12, 19], 
 [3, 6, 9, 16, 22], 
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]]
'''