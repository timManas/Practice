package Math.PowerOfTwo;

public class PowerOfTwo {

    public static void main(String [] args) {
        int [] input = {1, 16, 3};
        for (int i : input)
            System.out.println("IsPowerTwo: " + isPowerOfTwo(i) + "\n");
    }

    public static boolean isPowerOfTwo(int n) {


        double result = Math.log10(n) / Math.log10(2);
        System.out.println("Result: "  + result);


        return result % 1 == 0;
    }
}
