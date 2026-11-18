from ast import List


def main():
    solution = Solution()

    input = [[112, 131, 411], [2536, 1613, 3366, 162], [51, 71, 17, 24, 42]]

    for nums in input:
        print("Max Pair Sum: ", solution.maxSum(nums), "\n")

    return

class Solution:
    def maxSum(self, nums: List[int]) -> int:
        print("nums: ", nums, "\n")

        # Find the largest digit
        largestMap = {}
        for num in nums:
            characters = list(str(num))

            largest = 0
            for character in characters:
                digit = int(character)
                largest = max(digit, largest)
            print("largest: ", largest)


            if largest in largestMap:
                newList = largestMap.get(largest)
                newList.append(num)
            else:
                largestMap[largest] = [num]

        print("largestMap: ", largestMap)

        maxSum = 0
        for key, val in largestMap.items():

            if len(val) == 1:
                continue
            val.sort(reverse=True)
            print("key: ", key, "   val: ", val)


            sum = val[0] + val[1]

            maxSum = max(sum, maxSum)



        return -1 if maxSum == 0 else maxSum


if __name__ == "__main__":
    main()