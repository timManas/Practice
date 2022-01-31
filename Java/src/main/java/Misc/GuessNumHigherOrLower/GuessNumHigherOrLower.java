package Misc.GuessNumHigherOrLower;

public class GuessNumHigherOrLower {

    public static void main(String [] args) {
        int n = 10;
        int p = 6;
        System.out.println("Guess Number: " + guessNumber(n, p));
    }

    public static int guessNumber(int n, int p) {

        int guessResult = -1;
        int pick = 0;
        int start = 0;
        int end = n;
        int mid = (start + end) / 2;

        while (guessResult != 0 || start < end) {

            guessResult = guess(mid, p);

            if (guessResult == -1) {
                start = mid;
                end = n;
                mid = (start + end) / 2;
            } else if (guessResult == 0) {
                pick = mid;
                break;
            } else if (guessResult ==  1) {
                start = 0;
                end = mid;
                mid = (start + end) / 2;
            }

        }

        return pick;
    }

    private static int guess(int guess, int pick) {
        if (guess < pick)
            return -1;
        if (guess > pick)
            return 1;

        return 0;
    }

}
