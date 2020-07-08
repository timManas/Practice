def main():
    J = "aA"
    S = "aAAbbbb"
    solution = Solution()
    output = solution.numJewelsInStones(J,S)
    print("Output: ", output)


class Solution(object):
    def numJewelsInStones(self, J, S):
        print("Starting numJewls In Stones")

        # Step1 - Create output variable
        count = 0

        # Step2 - Traverse each character in S
        for character in S:

            # Step3 - Check if character is present in J
            # Increment count if true
            if J.find(character) >= 0:
                count += 1
                print("Jewel Found: ", character)


        return count




if __name__ == '__main__':
    main()


'''
Solution
- Traverse each letter in String "S"
- Use 'find' method to check if character exists in J
    > Return true if greater than -1
    > Return false otherwise
    
    
'''