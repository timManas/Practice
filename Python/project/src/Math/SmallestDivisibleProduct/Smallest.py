def main():

    input = [[10,2], [15,3]]
    solution = Solution()
    for n in input:
        print("Smallest Num: ", str(solution.smallestNumber(n[0], n[1])), "\n")

    return


class Solution:
    def smallestNumber(self, n: int, t: int) -> int:

        while n <= 100:
            # print("n: ", n)
            product = 1;
            for i in str(n):
                # print("digit: ", i)
                product *= int(i)

            if (product % t == 0):
                return n

            n += 1

        return 0

if __name__ == "__main__":
    main()