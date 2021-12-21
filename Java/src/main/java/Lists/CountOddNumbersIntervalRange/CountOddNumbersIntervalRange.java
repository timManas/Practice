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
    }

    public static int countOdds(int low, int high) {
        int count = 0;

        while (low <= high) {

            if (low == high && low % 2 == 1 && high % 2 == 1) {
                ++count;
                break;
            }

            if (low % 2 == 1)
                ++count;
            if (high % 2 == 1)
                ++count;

            low++;
            high--;
        }

        return count;
    }
}
