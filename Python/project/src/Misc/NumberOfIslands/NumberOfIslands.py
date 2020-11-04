class Solution(object):
    def numIslands(self, grid):

        # Step1 - Create output variable
        numIslands = 0

        # Step2 - Traverse the grid one by one
        for row in range(grid.__len__()):
            for col in range(grid[row].__len__()):

                # Step3 - Update only if '1'
                if grid[row][col] == "0":
                    continue
                print("Current: ", grid[row][col])

                # Step4 - Update the counter
                numIslands += 1

                # Step5 - Set the neighbour elements to '0'
                self.traverseGrid(grid, row, col)

            print()

        return numIslands

    def traverseGrid(self, grid, row, col):
        print("Row: ", row, "   Col: ", col)

        # Step1 - Return back if element is '0'
        if grid[row][col] != "1":
            return

        # Step2 - IMPORTANT !!! Set the current element to 0
        grid[row][col] = "0"

        # Step3 - Traverse the Top, Right, Down, Left neightbours
        if row >= 1:
            self.traverseGrid(grid, row - 1, col)         # Traverse TOP

        if col != grid[row].__len__() - 1:
            self.traverseGrid(grid, row, col + 1)         # Traverse RIGHT

        if row != grid.__len__() - 1:
            self.traverseGrid(grid, row + 1, col)         # Traverse DOWN

        if col >= 1:
            self.traverseGrid(grid, row, col - 1)         # Traverse LEFT


def main():
    grid = [
        ["1", "1", "1", "1", "0"],
        ["1", "1", "0", "1", "0"],
        ["1", "1", "0", "0", "0"],
        ["0", "0", "0", "0", "0"]
    ]

    grid2 = [
        ["1", "1", "0", "0", "0"],
        ["1", "1", "0", "0", "0"],
        ["0", "0", "1", "0", "0"],
        ["0", "0", "0", "1", "1"]
    ]
    solution = Solution()
    output = solution.numIslands(grid2)
    print("Number of Islands: ", output)

if __name__ == '__main__':
    main()

'''
Notes
- Tricky but not difficult to implement
- The trick is to traverse the nodes and mark EACH visited node 0.
    > Why ? That way we can keep track of the seperate island individually

Solution
1. Traverse each element in the grid one by one
2. If we encounter 1:
    - We mark the current element to '0'
    - Use recursion to traverse the Top, Right, Down, Left
3. Return the counter  


'''