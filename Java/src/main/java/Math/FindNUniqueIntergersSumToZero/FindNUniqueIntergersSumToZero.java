package Math.FindNUniqueIntergersSumToZero;

import java.util.HashSet;
import java.util.Random;

public class FindNUniqueIntergersSumToZero {

    public static void main(String [] args) {
        int n = 5;
        int [] zeroSum = sumZero(n);
        for (int i : zeroSum)
            System.out.println(i);
    }

    public static int[] sumZero(int n) {
        int [] result = new int[n];
        HashSet<Integer> set = new HashSet<Integer>();

        // Step1 - Create a Random
        Random random = new Random();

        // Step2 - Initialize the limits  ...if odd, we reduce by 1 so we can set 0 to the last. If even, we just do as normally
        int count = 0;
        int limit = n % 2 == 1 ? n-1 : n;

        // Step3 - Traverse
        while (count < limit) {

            // Step4 - Fetch random #
            int randomNum = random.nextInt(n) + 1;

            // Step5 - Repeat again if number already exists in set
            if (set.contains(randomNum))
                continue;

            // Step6 - Add the positive and negative values to the array ..ex -1 & 1 Or -2 & 2
            set.add(randomNum);
            result[count] = randomNum;
            ++count;
            result[count] = -1 * randomNum;
            ++count;
        }

        // Step7 - If odd number of n, we add zero to the last to make sure the total is zero
        if (limit < n)
            result[n-1] = 0;

        return result;
    }

}
