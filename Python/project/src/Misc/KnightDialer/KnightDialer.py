class Solution(object):
    def knightDialer(self, input):
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
            return None
        if row > 3 or col > 2:
            return None


        traversedNum = grid[row][col]
        if traversedNum == '*' or traversedNum == '!':
            return current


        current = "".join([current, traversedNum])
        print("Position: ", traversedNum, "     Current: ", current)


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
            numberSet.add(upRight)
            numberSet.add(rightUp)
            numberSet.add(rightDown)
            numberSet.add(downRight)
            numberSet.add(downLeft)
            numberSet.add(leftDown)
            numberSet.add(leftUp)
            numberSet.add(upLeft)


def main():
    inputList = [1,2,3,4,3131]
    solution = Solution()

    # for i in inputList:
    #     output = solution.knightDialer(i)
    #     print("Output: ", output, "\n")

    print("Output: ", solution.knightDialer(4))

if __name__ == '__main__':
    main()