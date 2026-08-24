def main():
    input = [4, 30]
    solution = Solution()
    for num in input:
        print(str(solution.countEven(num)) + "\n")

class Solution:
    def countEven(self, num: int) -> int:
        count = 0

        for i in range(1, num + 1):
            print(" i: " + str(i))

            sum = 0
            for j in str(i):
                print("     j: " + j)
                sum += int(j)

            if sum % 2 == 0:
                count += 1

        return count

if __name__ == "__main__":
    main()