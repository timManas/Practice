class Solution(object):
    def freqAlphabets(self, input):
        output = ""

        # Traverse List
        for i in reversed(range(input.__len__())):
            print (i)
       

        # Convert to String

        # Append to output


        return output


def main():
    inputList = ["10#11#12", "1326#", "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"]
    solution = Solution()

    for input in inputList:
        output = solution.freqAlphabets(input)
        print("Decrypted: " + output)


if __name__ == '__main__':
    main()