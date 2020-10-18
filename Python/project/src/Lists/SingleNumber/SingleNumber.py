class Solution(object):
    def singleNumber(self, nums):

        # Step1 - Create Set
        numberSet = set()

        # Step2 - Traverse Num Array
        for num in nums:
            print("Current Set: ", num)

            # Step3 - If num is duplicate, remove from set
            if num in numberSet:
                numberSet.remove(num)
            else:
                numberSet.add(num)

        # Step3 - Return first element
        return numberSet.pop()

def main():
    nums = [2,2,1]
    nums = [4,1,2,1,2]
    solution = Solution()
    output = solution.singleNumber(nums)
    print("Single Number is: ", output)

if __name__ == '__main__':
    main()


'''
Notes
- Pretty Easy


Solution
1. Create a set to keep track of all numbers
2. Traverse through nums array
3. If current num already exists in set, then we remove it
    > If not, then add it to set
4. Continue until we reach the end
5. Return first element



'''