import random

class Solution:
    def sumZero(self, n: int):

        # Step1 - Create set to store Unique numbers
        output = set([])

        # Step2 - Traverse from 0 to n
        i = 0
        while i < n:

            # Step3 - If odd, we need to add 0 to set
            if (not(0 in output)) and (n % 2 == 1):
                output.add(0)
                i += 1
                continue

            # Step4 - Find random number NOT in set
            ranNum = random.randint(1, 1000)
            while ranNum in output:
                ranNum = random.randint(1, 1000)

            # Step5 - Add random number and its negative number to the set
            output.add(ranNum)
            output.add(ranNum * -1)

            # Step6 - Increment counter by 2 since we added two numbers
            i += 2

        print("ZeroSum Total: ", self.adds2Zero(list(output)), "    Size: " , output.__len__() , "      n: " , n)

        return list(output)

    def adds2Zero(self, list):
        count = 0
        for i in list:
            count += i

        return count


def main():
    n = 188
    solution = Solution()
    output = solution.sumZero(n)
    print("UniqueNumList Zero Sum: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Easy


Solution
1. Create set
2. Traverse from 0 to n
3. Get random # not in set
4. Add random # and its negative counter part to set

'''