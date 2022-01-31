package Misc.GuessNumHigherOrLower;

public class GuessNumHigherOrLower {

    public static void main(String [] args) {
//        int n = 10;
//        int p = 6;
//        System.out.println("Guess Number: " + guessNumber(n, p));
//
//        int n1 = 1;
//        int p1 = 1;
//        System.out.println("Guess Number: " + guessNumber(n1, p1));
//
//        int n2 = 2;
//        int p2 = 1;
//        System.out.println("Guess Number: " + guessNumber(n2, p2));
//
//        int n3 = 2;
//        int p3 = 2;
//        System.out.println("Guess Number: " + guessNumber(n3, p3));

        int n4 = 2126753390;
        int p4 = 1702766719;
        System.out.println("Guess Number: " + guessNumber(n4, p4));
    }

    public static int guessNumber(int n, int p) {



        int guessResult = -1;
        int pick = 0;
        int start = 0;
        int end = n;
        int mid = (start + end) / 2;

        while (guessResult != 0 || start < end) {
            guessResult = guess(mid, p);
            System.out.println("mid: " + mid + "    guessResult: " + guessResult);


            if (guessResult == -1) {        // mid is lower
                end = mid - 1;
                mid = (start + end) / 2;
            } else if (guessResult == 0) {
                pick = mid;
                break;
            } else if (guessResult ==  1) {     // mid is higher
                start = mid + 1;
                end = n;
                mid = (start + end) / 2;
            }
        }

        return pick;
    }

    private static int guess(int guess, int pick) {
        if (guess < pick)
            return 1;
        if (guess > pick)
            return -1;

        return 0;
    }

}
