from typing import List


def main():

    input = [[13,25,83,77], [7,1,3,9]]

    for i, row in enumerate(input):
        solution = Solution()
        print("seperateDigits: " + str(solution.separateDigits(row)) + "\n")

class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        output = []
        print("list: " + str(nums))

        for i, num in enumerate(nums):
            numStr = str(num)
            print("     num: " + numStr)

            for j, digit in enumerate(numStr):
                print("         digit: " + str(digit))
                output.append(int(digit))



        return output


if __name__ == "__main__":
    main()