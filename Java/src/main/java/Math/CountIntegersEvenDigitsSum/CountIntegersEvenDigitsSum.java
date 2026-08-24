package Math.CountIntegersEvenDigitsSum;

public class CountIntegersEvenDigitsSum {

    public static void main(String [] args) {
        int [] input = {4, 30};
        for (int i : input) System.out.println("countEven: " + countEven(i) + "\n");
    }

    public static int countEven(int num) {
        int count = 0;

        for (int i=1; i<=num; i++) {

            String val = String.valueOf(i);

            int total = 0;
            for (char letter : val.toCharArray()) {
                int digit = Integer.valueOf(letter);
                total += digit;
            }

            if (total % 2 == 0)
                ++count;

        }

        return count;
    }
}
