package Math.SmallestDivisibleDigitalProduct;

public class SmallestDivisibleDigitalProduct {

    public static void main(String [] args) {
        int [][] input = {{10, 2}, {15,3}};
        for (int [] i : input)
            System.out.println("Smallest Number: " + smallestNumber(i[0], i[1]) + "\n");
    }

    public static int smallestNumber(int n, int t) {


        while (n <= 100) {

            int product = 1;
            for (char c : String.valueOf(n).toCharArray()) {
                int digit = c - '0';

                product *= digit;
            }

            if (product % t == 0)
                return n;

            ++n;
        }


        return 0;
    }
}
