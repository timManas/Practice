package Math.PowerOfFour;

public class PowerOfFour {
    public static void main(String []args) {
        int [] input = {16,5,1};
        for (int i : input)
            System.out.println("IsPowerFour: " + isPowerOfFour(i) + "\n");
    }

    public static boolean isPowerOfFour(int n) {

        double result = Math.log10(n) / Math.log10(4);
        System.out.println("Result: "  + result);


        return result % 1 == 0;
    }
}
