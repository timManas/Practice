class Solution(object):
    def removeDuplicates(self, input):

        # Step1 - Create var to store the last Str
        lastStr = input

        # Step2 - Continue iterating until we break out of loop
        while lastStr.__len__() > 0:

            # Step3 - Create var to store the removedAdj Duplicate letters
            removedAdjDup = ""

            # Step4 - Traverse each letter in lastStr
            for letter in lastStr:

                # Step5 - If we encounter, do NOT add to removedAdjDup and remove last element
                if removedAdjDup == "":
                    removedAdjDup = "".join((removedAdjDup, letter))

                elif letter == removedAdjDup[-1]:       # Compare letter to the last letter in removedAdj Str
                    removedAdjDup = removedAdjDup[:-1]

                else:
                    removedAdjDup = "".join((removedAdjDup, letter))

            # Step6 - Break Loop removedAdjDup is the same as lastStr
            if removedAdjDup == lastStr:
                break
            else:
                lastStr = removedAdjDup


        return lastStr


def main():
    S = "abbaca"
    solution = Solution()
    output = solution.removeDuplicates(S)
    print("Removed Duplicates: " + output)


if __name__ == '__main__':
    main()

'''
Notes
- Abit tricky  but not really
- Needs alot of optimization

Solution
1. Create a while which iterates forever until we break out
2. We only break out if the last Str is the same as the removedAdjDup String
3. For each letter in last Str, we add into removedAdj Dup
4. If duplicate is encountered, we do not add to removeAdjDUp string and remove last letter 

Seriously this can be optimized more


'''