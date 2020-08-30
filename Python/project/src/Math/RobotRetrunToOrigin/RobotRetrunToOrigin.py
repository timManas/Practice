class Solution(object):
    def judgeCircle(self, moves):
        areaCoveredX = 0
        areaCoveredY = 0

        for move in moves:

            if move == 'U':
                areaCoveredY += 10
            elif move == 'D':
                areaCoveredY += -10
            elif move == 'L':
                areaCoveredX += -10
            elif move == 'R':
                areaCoveredX += 10

            print("move: " + move + "       AreaCoveredX: " + str(areaCoveredX) + "       AreaCoveredY: " + str(areaCoveredY))


        return True if areaCoveredX == 0 and areaCoveredY == 0 else False



def main():
    movedArr = ["UD", "LL", "UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL"]
    solution = Solution()

    for moves in movedArr:
        output = solution.judgeCircle(moves)
        print("Back to Origin ? ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Super Easy

Solution
1. Create variable to keep track of X and Y
2. Increment X if U, Decrement X if D
    Increment Y if R, Decrement Y if L
3. Check if X and Y are both zero, return true. Return false otherwise


'''