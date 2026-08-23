from typing import List


def main():
    s = "abcdefghi"
    k = 3
    fill = "x"
    solution = Solution()
    print("DivideStr: " + str(solution.divideString(s, k, fill)) + "\n")

    s = "abcdefghij"
    k = 3
    fill = "x"
    solution = Solution()
    print("DivideStr: " + str(solution.divideString(s, k, fill)) + "\n")

class Solution:
    def divideString(self, s: str, k: int, fill: str) -> List[str]:
        output = []

        current = ""
        for i in range(0, len(s)):
            print("i: " + str(i) + "    s[i]: " + s[i])
            current += s[i]

            if len(current) == k:
                output.append(current)
                print("     Added: " + current)
                current = ""



        while len(current) != 0 and len(current) < k:
            current += fill
            if len(current) == k:
                output.append(current)


        return output

if __name__ == "__main__":
    main()