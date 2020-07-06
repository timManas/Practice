def main():
    candies = [2,3,5,1,3]
    extraCandies = 3
    solution = Solution()
    output = solution.kidsWithCandies(candies, extraCandies)
    print("Output: ",  output)


class Solution(object):
        def kidsWithCandies(self, candies, extraCandies):
            print("Finding Kids with Greates Candies Number")


            # Step1 : Create output list
            outputList = []

            # Step2: Find the max number in list
            maxCandies = max(candies)

            # Step3: Traverse the list & check if numCandies + extracandies will be more than max candies
            for numCandies in candies:
                if int(numCandies + extraCandies) >= maxCandies:
                    outputList.append(bool(1))
                    continue

                outputList.append(bool(0))

            return outputList

if __name__ == '__main__':
    main()

'''
Solution
- Very simple actually

How 
- Find the max value
- Traverse each value in list
    > Add true if the numOfCandies + extraCandies is greater or equal to the maxCandies in list
- Return output List

'''