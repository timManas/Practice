
class Solution(object):
    def findWords(self, words):

        # Step1 - Create output variable
        output = []

        # Steo2 - Create sets manually
        row1Set = {'q','w','e','r','t','y','u','i','o','p'}
        row2Set = {'a','s','d','f','g','h','j','k','l'}
        row3Set = {'z','x','c','v','b','n','m'}

        # Step3 - Traverse words in wordArray
        for word in words:
            print("Current Word: " + word)

            # Step4 - Create a flag which checks if the letters exists within the set
            isInSet = True

            # Step5 - Fetch the current set
            currentSet = self.fetchSet(word, row1Set, row2Set, row3Set)

            # Step6 - Traverse each letter and check if exists in appropriate set
            for letter in word:
                letter = letter.lower()
                if letter not in currentSet:
                    isInSet = False
                    break


            # Append only if all letters exists in set
            if isInSet:
                output.append(word)


        return output

    def fetchSet(self, word, set1, set2, set3):

        if word[0].lower() in set1:
            return set1

        if word[0].lower() in set2:
            return set2

        if word[0].lower() in set3:
            return set3


def main():
    words = ["Hello", "Alaska", "Dad", "Peace"]
    solution = Solution()
    output = solution.findWords(words)
    print("Words which can be typed in one row of keyboard: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Super easy

Solution
1. Create sets for each row
2. Traverse the words array one by one
3. Check if the letters in current word are in the respective set
4. Add to outputlist list of all letters exists in th set 

'''