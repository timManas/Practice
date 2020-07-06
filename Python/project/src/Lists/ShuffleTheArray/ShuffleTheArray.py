def main():
    nums = [2,5,1,3,4,7]
    n = 3
    solution = Solution()
    shuffle = solution.shuffle(nums, n)
    print(shuffle)


class Solution(object):
    def shuffle(self, nums, n):
        # Step1: Create output Variable
        output = []

        # Step2: Find the midpoint
        mid = nums.__len__() / 2

        # Step3: Traverse list until midpoint
        i = 0
        while i < mid:
            print(nums[i],  "   ", nums[int(i + mid)])

            # Step4: Append i & (i+midpoint)
            output.append(nums[i])
            output.append(nums[int(i + mid)])
            i += 1
        return output



if __name__ == '__main__':
    main()


'''
Solution
- Traverse only from 0 to midpoint
- Each traversal, we add i & (i+midpoint) to the output list
- Return the output list
'''