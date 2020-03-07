package Math.SubractProductAndSum;

public class SubractProductAndSum {

    public static void main(String [] args) {
        int count = 234;
        System.out.println("Total: " + subtractProductAndSum(count));
    }

    public static int subtractProductAndSum(int n) {
        int total = 0;
        String [] digit = String.valueOf(n).split("");

        if (digit.length == 1)
            return n;

        int sumTotal = 0;
        int productTotal = 1;

        for (String i : digit) {
            int num = Integer.valueOf(i);

            // Calculate Sum
            sumTotal += num;

            // Calculcate Product
            productTotal *= num;
        }

        // Calculate total
        total = productTotal - sumTotal;

        return total;
    }
}
