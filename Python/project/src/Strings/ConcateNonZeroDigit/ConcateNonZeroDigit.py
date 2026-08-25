def main():
    input = [10203004, 1000, 0]
    solution = Solution()
    for x in input:
        print("sum: " + str(solution.sumAndMultiply(x)) + "\n")



class Solution:
    def sumAndMultiply(self, n: int) -> int:
        sum = 0
        strVal = ""

        if n == 0:
            return 0

        for i, x in enumerate(str(n)):
            print(i, x)
            if (int(x) != 0):
                strVal += x
                sum += int(x)

        print(strVal)

        return sum * int(strVal)


if __name__ == '__main__':
    main()