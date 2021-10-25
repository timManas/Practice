package Math.ConvertIntegersToSumOfTwoNonZero;

public class ConvertIntegersToSumOfTwoNonZero {

    public static void main(String [] args) {
        int [] input = {2, 11, 10000, 69, 1010};
        for (int i : input)
            System.out.println("Non Zero: " + getNoZeroIntegers(i));
    }


    public static int[] getNoZeroIntegers(int num) {
        int [] output = new int[2];

        int prevX = 0;
        int prevY = 0;
        for (int i=num; i > (num / 2); i--) {

            int x = prevX == 0 ? i-1 : i-1;
            int y = prevY == 0 ? 1 : prevY+1;

            System.out.println("i: " + i + "  x: " + x + "  y: " + y);

            // Check if x or y contains 0
            if (!String.valueOf(x).contains("0") && !String.valueOf(y).contains("0")) {
                output[0] = x;
                output[1] = y;
                break;
            }

            prevX = x;
            prevY = y;

        }

        return output;
    }
}
