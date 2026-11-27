def main():
    solution = Solution()
    nums = [5724,111,350]
    print("Sum: ", solution.maxDigitRange(nums), "\n")

    nums = [90, 900]
    print("Sum: ", solution.maxDigitRange(nums), "\n")

    nums = [76364, 80946, 83426, 86822, 8470, 77400, 91853, 17447, 37800, 96545, 84619, 58374, 35177, 32777, 97032, 59483,
     19578, 5770, 90000, 65561, 11209, 66371, 24953, 4463, 11437, 45951, 55753, 96286, 37364, 30585, 40914, 74370,
     78195, 84824, 3592, 97757, 11186, 22197, 77593, 96587, 73024, 12818, 18252, 48610, 90339, 97032, 5513, 6493]
    print("Sum: ", solution.maxDigitRange(nums), "\n")

    return


class Solution:
    def maxDigitRange(self, nums: list[int]) -> int:
        count = 0;

        # Find Max Range
        maxRange = 0
        dict = {}
        for num in nums:
            numsList = list(str(num))
            numsList.sort()
            print("     sorted: ", numsList)
            range = abs(int(numsList[0]) - int(numsList[- 1]))
            maxRange = max(maxRange, range)
            print("         range: ", range, "       maxRange: ", maxRange )
            dict[num] = range


        for key,val in dict.items():
            if val == maxRange:
                count += key



        return count

if __name__ == "__main__":
    main()