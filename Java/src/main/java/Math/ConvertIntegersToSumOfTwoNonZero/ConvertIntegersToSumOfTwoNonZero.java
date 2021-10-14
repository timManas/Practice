package Math.ConvertIntegersToSumOfTwoNonZero;

public class ConvertIntegersToSumOfTwoNonZero {

    public static void main(String [] args) {
        int [] input = {2, 11, 10000, 69, 1010};
        for (int i : input)
            System.out.println("Non Zero: " + getNoZeroIntegers(i));
    }


    public static int[] getNoZeroIntegers(int num) {
        int [] output = new int[2];

        for (int i=num; i > (num / 2); i--) {


            int x = i-1;
            int y = i-x;
            System.out.println("i: " + i + "    x: " + x + "    y: " + y);



        }

        return output;
    }
}
