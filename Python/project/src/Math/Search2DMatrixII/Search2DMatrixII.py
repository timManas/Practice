class Solution(object):
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
    target = 25
    solution = Solution()
    output = solution.searchMatrix(matrix, target)
    print("IsValuePresent: ", output)


if __name__ == '__main__':
    main()
