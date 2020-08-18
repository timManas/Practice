import random
import string

class Solution:
    def generateTheString(self, n: int) -> str:

        # Step1 - Create output Variable
        output = ""

        # Step2 - Create set
        charSet = set([])

        count = 0

        # Step3 - Fetch Random Letter
        characterList = string.ascii_lowercase
        letter = characterList[random.randint(0, 25)]
        print("Current Letter: ", letter)

        # Step4 - Check if Even. Add one random letter
        if n % 2 == 0:
            output += letter
            count += 1
            charSet.add(letter)

        # Step 5 - Find a new Random Letter
        while letter in charSet:
            letter = characterList[random.randint(0, 25)]

        # Step6 - Continue to append output String with same random letter
        # Note - This should be odd # of times
        while count < n:
            output += letter
            charSet.add(letter)
            count += 1


        return output

def main():
    list = [78]
    solution = Solution()

    for n in list:
        output = solution.generateTheString(n)
        print("Output: " + output + "\n")


if __name__ == '__main__':
    main()

'''
Note
- Kind of a dumb question

Solution
1. Check if n is odd or even
2. If even, then we add one random letter to make remainder odd # 
3. Append a new Random letter until count is same as n

'''