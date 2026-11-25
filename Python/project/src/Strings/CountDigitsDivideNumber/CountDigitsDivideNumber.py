

def main():
    solution = Solution()
    input = [7, 121, 1248]
    for i in input:
        print("Num Digits: ", solution.countDigits(i), "\n")


class Solution:
    def countDigits(self, num: int) -> int:
        count = 0

        numsList = str(num)
        for k in numsList:
            print("k: ", k)
            digit = int(k)
            if num % digit == 0:
                count +=1


        return count


if __name__ == "__main__":
    main()