import math

class Solution(object):
    def consecutiveNumbersSum(self, N):
        counter = 1
        numberSet = set()

        while counter < N:
            mid = math.floor(N / counter)
            total = self.calculateTotal(mid - counter, mid + counter)




            counter += 1

        return numberSet.__len__() - 1


def main():
    input = [5, 9, 15]
    solution = Solution()

    for num in input:
        print("Current: ", num)
        output = solution.consecutiveNumbersSum(num)
        print("Number of Consecutive Num Sum: ", output)


if __name__ == '__main__':
    main()