class Solution(object):
    def isToeplitzMatrix(self, matrix):

        # Step1 - Traverse  matrix element one by one
        for row in range(matrix.__len__()):
            for col in range(matrix[row].__len__()):
                print("Current: ", matrix[row][col])

                # Step2 - Find the diagonal
                diagonal = self.fetchDiagonal(matrix, row, col)

                # Step3 - Check if current == diagonal
                if matrix[row][col] != diagonal:
                    return False

        return True

    def fetchDiagonal(self, matrix, row, col):

        if row == matrix.__len__() - 1:         # Check if row is at the last element
            return matrix[row][col]

        elif col == matrix[row].__len__() - 1:  # Check if col is the last
            return matrix[row][col]


        return matrix[row + 1][col + 1]     # return the diagonal



def main():
    matrix = [
        [1, 2, 3, 4],
        [5, 1, 2, 3],
        [9, 5, 1, 2]
    ]

    matrix2 = [
        [1, 2],
        [2, 2]
    ]
    solution = Solution()
    output = solution.isToeplitzMatrix(matrix)
    print("Is Toeplitz Matrix: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Easy peasy
- Trick is to traverse one by one and find its diagonal
- diagonal is the matrix[row + 1][col + 1]

Solution
1. Traverse elements in matrix one by one
2. Find diagonal
3. Check if diagonal == current matrix element
    > Return false is not
    > Continue is true
4. If we reach end, we return true

'''