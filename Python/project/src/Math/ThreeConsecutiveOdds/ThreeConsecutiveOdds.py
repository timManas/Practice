from collections import deque

class Solution(object):
    def threeConsecutiveOdds(self, arr):

        # Step1 - Create Deque
        stack = deque()

        # Step2 - Traverse list
        for num in arr:
            print("Current: ", num)

            # Step3 - If odd  ... get rid of stack
            if num % 2 == 0:
                stack.clear()
                continue

            # Step4 - Add to Stack
            stack.append(num)

            # Step5 - Check if stack length == 3 ...return true
            if stack.__len__() == 3:
                return True

        return False





def main():
    arr = [2, 6, 4, 1]
    # arr = [1, 2, 34, 3, 4, 5, 7, 23, 12]
    solution = Solution()
    output = solution.threeConsecutiveOdds(arr)
    print("Three Consecutive Odds Exists: ", output)

if __name__ == '__main__':
    main()

'''
Notes
- Super Easy

Solution
1. Create Stack
2. Traverse List
- If current num is odd, clear stack
- If off, add to stack
3. Check if current stack length == 3, return true


'''