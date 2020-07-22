def main():
    nums = [1,2,3,4]
    solution = Solution()
    output = solution.decompressRLElist(nums)
    print("Output: ", output)

class Solution(object):
    def decompressRLElist(self, nums):

        # Step1: Create output variable
        output = []

        # Step2: Traverse from 0 to nums.length
        for i in range(0, nums.__len__(), 2):
            print("Current: ", nums[i], "   i+2: ", nums[i+1])

            # Step3: Fetch the frequency and value to append
            freq = nums[i]
            value = nums[i+1]

            # Step4: Append to output List
            for i in range(freq):
                output.append(value)

        return output


if __name__ == '__main__':
    main()

'''
Notes
- Easy 

Solution
- Traverse the list by two
- Fetch the freq and value to append
- Append to output list
- Thats it 

'''