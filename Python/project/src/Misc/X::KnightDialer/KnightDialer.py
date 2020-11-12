class Solution(object):

    def knightDialer(self, n):
        M = []
        s = 0
        for i in range(4):
            for j in range(3):
                s = (s + self.paths(M, i, j, n))

    def paths(self, M, i, j, n):

        if i < 0 or j < 0 or i >= 4 or j >= 3 or (i == 3 and j != 1):
            return 0

        if n == 1:
            return 1

        if M[n][i][j] > 0:
            return M[n][i][j]

        M[n][i][j] = (self.paths(M, i - 1, j - 2, n - 1) % max +
                        self.paths(M, i - 2, j - 1, n - 1) % max +
                        self.paths(M, i - 2, j + 1, n - 1) % max +
                        self.paths(M, i - 1, j + 2, n - 1) % max +
                        self.paths(M, i + 1, j + 2, n - 1) % max +
                        self.paths(M, i + 2, j + 1, n - 1) % max +
                        self.paths(M, i + 2, j - 1, n - 1) % max +
                        self.paths(M, i + 1, j - 2, n - 1) % max)

        return M[n][i][j]


    def knightDialer_NaiveSolution(self, input):
        numberSet = set()

        grid = [['1','2','3'],
                ['4','5','6'],
                ['7','8','9'],
                ['*','0','!']]

        for row in range(grid.__len__()):
            for col in range(grid[row].__len__()):
                current = grid[row][col]
                print("Current: ", current)

                if current == '*' or current == '!':
                    continue

                self.traverseGrid(grid, row, col, "", input, numberSet)

        return numberSet.__len__()

    def traverseGrid(self, grid, row, col, current, input, numberSet):

        if current.__len__() == input:
            return current

        if row < 0 or col < 0:
            return current
        if row > 3 or col > 2:
            return current


        traversedNum = grid[row][col]
        if traversedNum == '*' or traversedNum == '!':
            return current

        current = "".join([current, traversedNum])


        # Find the total phone #'s
        upRight = self.traverseGrid(grid, row - 2, col + 1, current, input, numberSet)
        rightUp = self.traverseGrid(grid, row - 1, col + 2, current, input, numberSet)
        rightDown = self.traverseGrid(grid, row + 1, col + 2, current, input, numberSet)
        downRight = self.traverseGrid(grid, row + 2, col + 1, current, input, numberSet)
        downLeft = self.traverseGrid(grid, row + 2, col - 1, current, input, numberSet)
        leftDown = self.traverseGrid(grid, row + 1, col - 2, current, input, numberSet)
        leftUp = self.traverseGrid(grid, row - 1, col - 2, current, input, numberSet)
        upLeft = self.traverseGrid(grid, row - 2, col - 1, current, input, numberSet)

        if current.__len__() == input:
            print("Position: ", traversedNum, "     Current: ", current)
            numberSet.add(upRight)
            numberSet.add(rightUp)
            numberSet.add(rightDown)
            numberSet.add(downRight)
            numberSet.add(downLeft)
            numberSet.add(leftDown)
            numberSet.add(leftUp)
            numberSet.add(upLeft)



def main():
    inputList = [1,2,3,4,10]
    solution = Solution()

    # for i in inputList:
    #     output = solution.knightDialer(i)
    #     print("Output: ", output, "\n")

    print("Output: ", solution.knightDialer(3131))

if __name__ == '__main__':
    main()