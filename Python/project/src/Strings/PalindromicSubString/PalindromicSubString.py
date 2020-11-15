class Solution(object):
    def countSubstrings(self, inputString):
        count = 0

        if inputString != "":
            count = self.fetchSubString(inputString)

        return count

    def fetchSubString(self, inputString):
        pass


def main():

    s = "aaa"
    solution = Solution()
    output = solution.countSubstrings(s);
    print("Num of Palindromic SubString: " + output)


if __name__ == '__main__':
    main()