package Math.PrimeNumberSetBitsBinaryRepr;

public class PrimeNumberSetBitsBinaryRepr {
    public static void main(String [] args) {
        int left = 6, right = 10;
        System.out.println("Count Prime Bits: " + countPrimeSetBits(left, right));

        int left1 = 10, right1 = 15;
        System.out.println("Count Prime Bits: " + countPrimeSetBits(left1, right1));


    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;

        // Step1 - Traverse from left to right
        while (left <= right) {

            // Step2 - Convert to String binary
            String binary = Integer.toBinaryString(left);

            // Step3 - Count occurence of 1's
            int countOccurence = binary.length() - binary.replace("1", "").length();

            // Step4 - Check if countOccurence is prime
            if (isPrime(countOccurence))
                count++;

            // Incmrement left by 1
            left++;
        }

        return count;
    }

    private static boolean isPrime(int countOccurence) {

        if (countOccurence == 1)
            return false;

        for (int i=2; i < countOccurence; i++) {
            if (countOccurence % i == 0)
                return false;
        }

        return true;
    }
}
