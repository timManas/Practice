class Solution(object):
    def maxNumberOfApples(self, arr):
        count = 0
        weight = 5000

        # Step1 - Sort input Array
        arr.sort()
        print("Sorted: ", arr)

        # Step2 - Traverse through sorted Array
        for currentNum in arr:

            # Step3 - If weight is less than currentNum, update weight
            if weight - currentNum >= 0:
                count += 1
                weight = weight - currentNum


        return count

def main():
    arr = [100, 200, 150, 1000]
    arr2 = [900, 950, 800, 1000, 700, 800]

    solution = Solution()
    output = solution.maxNumberOfApples(arr)
    print("Max Num Apples: ", output)

    output = solution.maxNumberOfApples(arr2)
    print("Max Num Apples: ", output)

if __name__ == '__main__':
    main()

'''
Notes
- Super Easy


Solution
1. Sort the input array
2. Create a variable to keep track of remaining weight
3. Traverse the input array:
    - If the weight - current Element > 0:
        Update Counter
        Update Weight
4. Return counter

'''