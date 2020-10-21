class Solution(object):
    def consecutiveNumbersSum(self, N):
        counter = 0
                

        return counter


def main():
    input = [5, 9, 15]
    solution = Solution()

    for num in input:
        output = solution.consecutiveNumbersSum(num)
        print("Number of Consecutive Num Sum: ", output)


if __name__ == '__main__':
    main()