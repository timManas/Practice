package Lists.CountOddNumbersIntervalRange;

public class CountOddNumbersIntervalRange {
    public static void main(String [] args) {
        int low = 3;
        int high = 7;
        System.out.println("CountOdds: " + countOdds(low,high));

        int low1 = 8;
        int high1 = 10;
        System.out.println("CountOdds: " + countOdds(low1,high1));

        int low2 = 327296043;
        int high2 = 769434803;
        System.out.println("CountOdds: " + countOdds(low2,high2));

        int low3 = 21;
        int high3 = 22;
        System.out.println("CountOdds: " + countOdds(low3,high3));
    }

    public static int countOdds(int low, int high) {
        int count = 0;

        // Solution # 2 - Math
        int numElementsBetweenLowHigh = (high - low) + 1;

        if (low % 2 == 0 && high % 2 == 0) {        // Both Odd
           return (numElementsBetweenLowHigh / 2);
        } else if (low % 2 == 0 && high % 2 == 1) {     // One of them is Odd and the other even
            return (numElementsBetweenLowHigh / 2);
        } else if (low % 2 == 1 && high % 2 == 0) {     // One of them is Odd and the other even
            return (numElementsBetweenLowHigh / 2);
        } else if (low % 2 == 1 && high % 2 == 1) {     // Both Even
            return (numElementsBetweenLowHigh / 2) + 1;
        }




        return count;
    }
}
