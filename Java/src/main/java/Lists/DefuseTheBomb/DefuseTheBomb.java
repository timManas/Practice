package Lists.DefuseTheBomb;

public class DefuseTheBomb {
    public static void main(String [] args) {
        int [] code = {5,7,1,4};
        int k = 3;
        int [] output = decrypt(code, k);
        printArr(output);

        System.out.println();

        int [] code2 = {1,2,3,4};
        int k2 = 0;
        int [] output2 = decrypt(code2, k2);
        printArr(output2);

        System.out.println();

        int [] code3 = {2,4,9,3};
        int k3 = -2;
        int [] output3 = decrypt(code3, k3);
        printArr(output3);
    }

    private static void printArr(int[] output) {
        for (int i : output)
            System.out.print(i + ",");
    }

    public static int[] decrypt(int[] code, int k) {

        // Step1 - Create output array
        int [] output = new int [code.length];

        // Step2 - Traverse code array one by one
        for (int i=0; i < code.length; i++) {
            int total = 0;              // Temporary total for each element
            int kIndex = 0;             // kIndex to keep track from 0 - k
            int j;                      // Index of the position

            // Step3 - Check If k > 0
            if (k >= 0) {
                j=i+1;

                // Step4 - Traverse left to Right circularly
                while (kIndex < k) {

                    // Reset the index to the beginning if we hit the last element
                    if (j > code.length - 1)
                        j=0;

                    // Calculate the total
                    total += code[j];

                    // Update the indexes
                    kIndex++;
                    j++;
                }
            } else { // Step3b - Check If k > 0
                j=i-1;

                // Step4 - Traverse Right to left circularly
                while (kIndex > k) {

                    // Reset the index to the beginning if we hit the last element
                    if (j < 0)
                        j = code.length - 1;

                    // Calculate the total
                    total += code[j];

                    // Update the indexes
                    kIndex--;
                    j--;
                }
            }

            // Step5 - Add total to output array
            output[i] = total;
        }

        return output;
    }
}
