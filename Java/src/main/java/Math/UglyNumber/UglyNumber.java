package Math.UglyNumber;

public class UglyNumber {

    public static void main(String [] args) {
        int [] input = {6,1,14};
        for (int i : input)
            System.out.println("isUgly: " + i + "    " + isUgly(i) + "\n");
    }

    public static boolean isUgly(int n) {
        if (n == 0 || n == 1)
            return true;

        int div = 0;
        if (n % 2 == 0) {
            while (div > 1) {
                div = n / 2;
                System.out.println("div: " + div);
            }
        }
            return true;


    }
}
