import NestedInteger from NestedInteger.py



class Solution(object):
    def depthSum(self, nestedList):




def main():
    solution = Solution()

    nestedList = [[1,1],2,[1,1]]
    output = solution.depthSum(nestedList)
    print ("Weight Sum: ", output, "\n")

    nestedList = [1,[4,[6]]]
    output = solution.depthSum(nestedList)
    print ("Weight Sum: ", output)


if __name__ == '__main__':
    main()