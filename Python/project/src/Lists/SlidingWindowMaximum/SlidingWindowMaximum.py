from collections import deque
import copy

class Solution(object):
    def maxSlidingWindow(self, nums, k):

        if k == 1:
            return nums

        output = []
        max = float('-inf')
        windowDeque = deque()

        # Traverse Nums input Array
        startIndex = 0
        endIndex = k;

        while startIndex < k:
            current = nums[startIndex]
            windowDeque.append(current)
            if max < current:
                max = current

            startIndex += 1
        output.append(max)

        print("Max: ", max, "   Current: ", current)

        while endIndex < nums.__len__():
            current = nums[endIndex]
            windowDeque.append(current)
            if windowDeque.__len__() >= k:
                windowDeque.popleft()
                max = self.fetchMax(windowDeque)
                output.append(max)

            print("Max: ", max, "   Current: ", current)
            endIndex += 1




        return output

    def fetchMax(self, windowDeque):
        tempQueue = copy.copy(windowDeque)

        max = float('-inf')
        while tempQueue.__len__() > 0:
            current = tempQueue.popleft()
            if max < current:
                max = current


        return max


def main():
    # nums = [1, 3, -1, -3, 5, 3, 6, 7]
    # k = 3
    # nums = [1, -1]
    # k = 1
    # nums = [7, 2, 4]
    # k = 2

    nums = [-9361, -750, -8435, -5590, -5835, 2958, -3942, -8209, -8241, -9307, 7999, 9777, -6045, 1362, -4022, 7045, -1351,
     9610, -4192, -267, -2120, 6657, -9405, -7549, 8074, 3222, -5563, 204, 2999, 3961, -6798, -53, 2349, -6533, -223,
     1033, 7369, -6896, -1756, -127, 6161, -7878, 9644, 2595, -1269, 8314, 8815, -7448, 9973, 9797, 1802, -6681, 6742,
     -2199, 795, 6579, 2676, 9505, -3383, -4465, 6993, 1317, 6608, -8496, -512, -100, 5136, 686, -2667, 1892, -2416,
     4272, 1011, -6260, 5780, -2764, -7807, 3267, 833, -8811, -4751, 7541, -2562, 5043, -7245, -2427, -6331, 147, -2974,
     759, -2200, -9467, 6092, 9013, -6563, 3810, -4710, -9420, -9173, -7326, 1120, -5794, 3928, 7327, 3017, -8873, 6524,
     -7972, -769, -1121, 3126, -1586, -2184, -6868, 6536, -3325, -9561, -7140, -9483, 2271, -6239, -128, 6595, -6159,
     3560, -6865, -8249, 1165, 5062, -7508, 3492, -1801, 9877, 4857, 6104, -7193, 9776]
    k = 3

    solution = Solution()
    output = solution.maxSlidingWindow(nums, k)
    print("Max Sliding Window: ", output)


if __name__ == '__main__':
    main()