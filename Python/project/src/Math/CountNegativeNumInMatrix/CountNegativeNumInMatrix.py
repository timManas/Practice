class Solution:
    def countNegatives(self, grid) -> int:
        count = 0

        for subArr in grid:
            for num in subArr:
                if num < 0:
                    count += 1

        return count


def main():
    grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    solution = Solution()
    output = solution.countNegatives(grid)
    print("Number of Negative #: " + str(output))


if __name__ == '__main__':
    main()


'''
Notes
- This was fucking joke 

Solution
- Traverse each number in each subArray
- If encounter negative, increment count by 1


'''