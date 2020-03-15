package Lists.RobotReturnToOrigin;

public class RobotReturnToOrigin {

    public static void main(String [] args) {
        String moves = "UDL";
        System.out.println("Returned: " + judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int total = 0;

        for (int i=0; i < moves.length(); i++) {
            char letter = moves.charAt(i);
            if (letter == 'U')
                total += 1;
            else if(letter == 'D')
                total += -1;
            else if(letter == 'L')
                total += -10;
            else if (letter == 'R')
                total += 10;
        }


        return total == 0 ? true : false;
    }

}


/**
 Solution
 - Check if all moves add to 0.
 - Set U to 1, D to -1, L to -10, R to 10
 */