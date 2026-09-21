def main():
    solution = Solution()
    input = [31, 22, 124];
    for num in input:
        print("maxProduct: ", solution.maxProduct(num), "\n")
    return


class Solution:
    def maxProduct(self, n: int) -> int:
        max = 0

        digitsArr = list(str(n))
        print(digitsArr)
        max = int(digitsArr[len(digitsArr)-1]) * int(digitsArr[len(digitsArr)-2])

        return max

if __name__ == "__main__":
    main()