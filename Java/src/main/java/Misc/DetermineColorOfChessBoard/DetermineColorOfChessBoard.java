package Misc.DetermineColorOfChessBoard;

public class DetermineColorOfChessBoard {

    public static void main (String [] args) {
        String [] input = {"a1", "h3", "c7"};
        for (String coordinates : input)
            System.out.println("IsSquareWhite: " + squareIsWhite(coordinates));
    }

    public static boolean squareIsWhite(String coordinates) {
        // Split coordinates into Row and Col
        char col = coordinates.charAt(0);
        char row = coordinates.charAt(1);


        // Split
        if (row % 2 == 1) { // Odd Row
            if (col == 'b' || col == 'd' || col == 'f' || col == 'h' )
                return true;
        } else {    // Even roW
            if (col == 'a' || col == 'c' || col == 'e' || col == 'g' )
                return true;
        }

        return false;
    }
}
