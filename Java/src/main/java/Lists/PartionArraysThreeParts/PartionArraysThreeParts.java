package Lists.PartionArraysThreeParts;

public class PartionArraysThreeParts {
    public static void main(String [] args) {
        //{0,2,1,-6,6,7,9,-1,2,0,1}, {3,3,6,5,-2,2,5,1,-9,4}
        int [][] input = {{0,2,1,-6,6,-7,9,1,2,0,1}};
        for (int [] i : input)
            System.out.println("Can split equal 3 parts: " + canThreePartsEqualSum(i) + "\n");
    }

    /**
     Uses Brute Force method ...Dont see another choice so far
     Seperate into three different partitions
     */
    public static boolean canThreePartsEqualSum(int[] arr) {

        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = 0;
        int start3 = 0;
        int end3 = 0;
        int total1 = 0;
        int total2 = 0;
        for (int i=0; i<arr.length - 2; i++) {
            end1 = i;
            if (start1 == start2) {
                total1 = arr[start1];
            } else {
                total1 += arr[end1];
            }

            for (int j=i+1; j < arr.length - 1; j++) {
                start2 = i+1;
                end2 = j;

                if (start1 == start2) {
                    total2 = start2;
                } else {
                    total2 += arr[end2];
                }




                start3 = j+1;
                end3 = arr.length - 1;

                System.out.println("start1: " + start1 + " end1: " + end1 + " total1: " + total1 +
                                    "|start2: " + start2 + " end2: " + end2 + " total2: " + total2 +
                                    "|start3: " + start3 + " end3: " + end3);






                int total3 = 0;


            }
            System.out.println();
        }


        return true;
    }

}
