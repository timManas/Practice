package Math.PowerOfThree;

public class PowerOfThree {
    public static void main(String [] args) {
        int [] input = {27,0,9};
        for (int i : input)
            System.out.println("IsPowerThree: " + isPowerOfThree(i) + "\n");
    }

    public static boolean isPowerOfThree(int n) {
        double result = Math.log10(n) / Math.log10(3);
        System.out.println("Result: "  + result);


        return result % 1 == 0;
    }
}
