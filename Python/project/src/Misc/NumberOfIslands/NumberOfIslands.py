class Solution(object):
    def numIslands(self, grid):
        numIslands = 0

        return numIslands

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
    output = solution.numIslands(grid)
    print("Number of Islands: ", output)

if __name__ == '__main__':
    main()