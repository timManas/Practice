class Solution(object):
    def numSpecialEquivGroups(self, input):
        counter = 0
        input.sort()

        return counter


def main():
    A = ["abcd","cdab","cbad", "xyzz","zzxy","zzyx"]
    solution = Solution()
    output = solution.numSpecialEquivGroups(A)
    print("Groups of Special Equivalent Strings: ", output)


if __name__ == '__main__':
    main()