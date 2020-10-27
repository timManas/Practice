from collections import deque

class Solution(object):
    def maxSlidingWindow(self, nums, k):
        output = []
        max = 0
        windowDeque = deque()

        # Traverse Nums input Array
        startIndex = 0
        endIndex = k;

        while startIndex < k:
            current = nums[startIndex]


            if max < current:
                max = current

            windowDeque.append(nums[startIndex])
            startIndex += 1

        print("Max: ", max, "   Current: ", current)
        output.append(max)


        while endIndex < nums.__len__():
            current = nums[endIndex]
            if max < current:
                max = current

            output.append(max)
            print("Max: ", max, "   Current: ", current)
            if windowDeque.__len__() == k:
                windowDeque.popleft()
            windowDeque.append(nums[endIndex])


            endIndex += 1



        return output

def main():
    # nums = [1, 3, -1, -3, 5, 3, 6, 7]
    # k = 3
    nums = [1, -1]
    k = 1
    solution = Solution()
    output = solution.maxSlidingWindow(nums, k)
    print("Max Sliding Window: ", output)


if __name__ == '__main__':
    main()