package Lists.PartionArraysThreeParts;

public class PartionArraysThreeParts {
    public static void main(String [] args) {
        //
        int [][] input = {{0,2,1,-6,6,-7,9,1,2,0,1},{0,2,1,-6,6,7,9,-1,2,0,1}, {3,3,6,5,-2,2,5,1,-9,4}};
        for (int [] i : input)
            System.out.println("Can split equal 3 parts: " + canThreePartsEqualSum(i) + "\n");
    }

    /**
     Uses Brute Force method ...Dont see another choice so far
     Seperate into three different partitions
     */
    public static boolean canThreePartsEqualSum(int[] arr) {

        // Step1 - Calculate absolute Total
        int absTotal = 0;
        for (int i : arr) absTotal += i;
        System.out.println("absTotal: " + absTotal);

        // Step2 - In order for 3 partitions, the absTotal should be divisble by three.
        // If not, then the partitions are not equal to each other
        if (absTotal % 3 != 0)
            return false;

        // Step3 - Find out the partition amount
        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = 0;
        int start3 = 0;
        int end3 = 0;
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        // Move the 1st partition seperator
        for (int i=0; i<arr.length - 2; i++) {
            // Step4 - Calculate total for 1st Partition
            end1 = i;
            total1 = start1 == start2 ? arr[start1] : total1 + arr[end1];

            // Move the 2nd / 3rd partition seperator
            for (int j=i+1; j < arr.length - 1; j++) {
                // Step5 - Calculate total for 2nd Partition
                start2 = i+1;
                end2 = j;
                total2 = start2 == end2 ? arr[start2] : total2 + arr[end2];


                // Step6 - Calculate total for 3rd Partition
                start3 = j + 1;
                end3 = arr.length - 1;
                total3 = absTotal - total1 - total2;


                // Check if all partitions have the same size
                if (total1 == total2 && total1 == total3 && total2 == total3) {
                    System.out.println("start1: " + start1 + " end1: " + end1 + " total1: " + total1 +
                            "|start2: " + start2 + " end2: " + end2 + " total2: " + total2 +
                            "|start3: " + start3 + " end3: " + end3 + " total3: " + total3 );
                    return true;
                }

            }
            System.out.println();
            total2 = 0;
        }

        // If no match, return false
        return false;
    }

}
