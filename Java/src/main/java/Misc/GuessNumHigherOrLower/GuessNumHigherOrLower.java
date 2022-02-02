package Misc.GuessNumHigherOrLower;

public class GuessNumHigherOrLower {

    public static void main(String [] args) {
//        int n = 10;
//        int p = 6;
//        System.out.println("Guess Number: " + guessNumber(n, p) + "\n");
//
//        int n1 = 1;
//        int p1 = 1;
//        System.out.println("Guess Number: " + guessNumber(n1, p1) + "\n");
//
//        int n2 = 2;
//        int p2 = 1;
//        System.out.println("Guess Number: " + guessNumber(n2, p2) + "\n");
//
//        int n3 = 2;
//        int p3 = 2;
//        System.out.println("Guess Number: " + guessNumber(n3, p3) + "\n");
//
//        int n4 = 2126753390;
//        int p4 = 1702766719;
//        System.out.println("Guess Number: " + guessNumber(n4, p4) + "\n");
//
//        int n5 = 3;
//        int p5 = 1;
//        System.out.println("Guess Number: " + guessNumber(n5, p5) + "\n");
//
//        int n6 = 3;
//        int p6 = 3;
//        System.out.println("Guess Number: " + guessNumber(n6, p6) + "\n");

        int n7 = 2147483647;
        int p7 = 2147483647;
        System.out.println("Guess Number: " + guessNumber(n7, p7) + "\n");
    }

    public static int guessNumber(int n, int p) {



        int guessResult = -1;
        int pick = 0;
        int start = 1;
        int end = n;
        int mid = (start + end) / 2;
        mid = mid < 0 ? (start / 2) + (end / 2) : mid;

        while (guessResult != 0 && start <= end  && mid >= 0 ) {
            guessResult = guess(mid, p);
            System.out.println("mid: " + mid + "    guessResult: " + guessResult);


            if (guessResult == -1) {        // p < mid
                end = mid;
                mid = (start + end) / 2;
                mid = mid < 0 ? (start / 2) + (end / 2) : mid;
            } else if (guessResult == 0) {
                pick = mid;
                break;
            } else if (guessResult ==  1) {     // p > mid
                start = mid + 1;
                end = n;

                mid = (start + end) / 2;
                mid = mid < 0 ? (start / 2) + (end / 2) : mid;

                if (mid > 0) {}
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
