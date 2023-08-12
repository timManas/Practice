package Math.UglyNumber;

public class UglyNumber {

    public static void main(String [] args) {
        int [] input = {6,1,14,8};
        for (int i : input)
            System.out.println("isUgly: " + i + "    " + isUgly(i) + "\n");
    }

    public static boolean isUgly(int n) {
        System.out.println("n: " + n);

        // Step1 - Check edge cases
        if (n == 1)
            return true;
        if (n <= 0)
            return false;

        // Step2 - Check prime number from 2-5 and see if they are a factorial
        // Anything past 5, we return false
        int prime = 2;
        while (prime <= 5) {
            System.out.println("n: " + n + "  prime: " + prime);
            if (n % prime == 0) {
                n = n / prime;
                continue;
            }

            if (n==1)
                break;

            prime++;
        }


        return n==1;
    }
}
