class Solution(object):
    def islandPerimeter(self, grid):

        # Step1 - Create output variable
        perimeter = 0

        # Step2 - Traverse each number in the grid one by one
        for row in range(grid.__len__()):
            for col in range(grid[row].__len__()):

                # Step2b - Continue to next if we encounter 0
                if grid[row][col] == 0:
                    continue

                # Step3 - Fetch the Up, Down, Left and Right values
                up = 0 if row == 0 else grid[row-1][col]
                down = 0 if row == grid.__len__() - 1 else grid[row+1][col]
                left = 0 if col == 0 else grid[row][col-1]
                right = 0 if col == grid[row].__len__() - 1 else grid[row][col+1]
                print("Current: ", grid[row][col], "     Up: ", up, "    Down: ", down, "    Left:", left, "     Right:", right)

                # Step4 - Calculate the Perimeter
                perimeter += 4 - (up + down + left + right)

        return perimeter


def main():
    grid = [[0, 1, 0, 0], [1, 1, 1, 0], [0, 1, 0, 0], [1, 1, 0, 0]]
    # grid = [[1],[0]]
    solution = Solution()
    output = solution.islandPerimeter(grid)
    print("Perimeter: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Abit tricky but not too bad

Solution
1. Traverse each number by one by one
2. If we encounter a '0' we continue to the next one
3. Find the Up, down, left and right values of the current element
4. Calculate the perimeter using 4 - (up + down + left + right)
5. Continue until we through all values in the grid


'''