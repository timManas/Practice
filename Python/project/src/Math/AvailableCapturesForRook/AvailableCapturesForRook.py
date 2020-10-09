class Solution(object):
    def numRookCaptures(self, board):

        # Step1 - Create counter to count number of pawns
        counter = 0
        rookPosition = self.fetchRookPosition(board)


        # Step2 - Traverse Left - Row should stay the same
        print("\nTraverse Left")
        for col in range(rookPosition[1], -1, -1):
            chessPiece = board[rookPosition[0]][col]
            print(chessPiece)

            if chessPiece == 'p':
                counter += 1
                break
            elif chessPiece == 'R':
                continue
            elif chessPiece != '.':        # If encountered anything else... we break
                break




        # Step3 - Traverse Right - Row should stay the same
        print("\nTraverse Right")
        for col in range(rookPosition[1], board.__len__(), 1):
            chessPiece = board[rookPosition[0]][col]
            print(chessPiece)

            if chessPiece == 'p':
                counter += 1
                break
            elif chessPiece == 'R':
                continue
            elif chessPiece != '.':        # If encountered anything else... we break
                break


        # Step4 - Traverse Up - Col should stay the same
        print("\nTraverse Up")
        for row in range(rookPosition[0], -1, -1):
            chessPiece = board[row][rookPosition[1]]
            print(chessPiece)

            if chessPiece == 'p':
                counter += 1
                break
            elif chessPiece == 'R':
                continue
            elif chessPiece != '.':        # If encountered anything else... we break
                break


        # Step5 - Traverse Down - Col should stay the same
        print("\nTraverse Down")
        for row in range(rookPosition[0], board.__len__(), 1):
            chessPiece = board[row][rookPosition[1]]
            print(chessPiece)

            if chessPiece == 'p':
                counter += 1
                break
            elif chessPiece == 'R':
                continue
            elif chessPiece != '.':        # If encountered anything else... we break
                break


        return counter







    def fetchRookPosition(self, board):
        output = []

        # Fetch the Rook Position
        for row in range(board.__len__()):
            for col in range(board[row].__len__()):
                value = board[row][col]
                if value == 'R':            # Fetch Rook Positions
                    output.append(row)
                    output.append(col)
                    break

        return output


def main():

    #board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
    #board = [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
    board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
    solution = Solution()
    output = solution.numRookCaptures(board)
    print("Number of pawns Captured: ", output)


if __name__ == '__main__':
    main()



'''
Notes
- A bit tricky but nothing to hard


Solution
1. Find the rook position
2. Traverse the graph in 4 ways:
- Traverse Up from the rook position
- Traverse Down from rook position
- Traverse Left from rook position
- Traverse Right from rook position

'''