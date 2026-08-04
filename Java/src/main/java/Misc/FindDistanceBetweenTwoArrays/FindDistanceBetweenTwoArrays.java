package Misc.FindDistanceBetweenTwoArrays;

public class FindDistanceBetweenTwoArrays {

    public static void main(String [] args) {
        int [] arr1 = {4,5,8};
        int [] arr2 = {0,9,1,8};
        int d = 2;
        System.out.println("Find The Distance: " + findTheDistanceValue(arr1, arr2, d) + "\n");

        int [] arr3 = {1,4,2,3};
        int [] arr4 = {-4,-3,6,10,20,30};
        int d1 = 3;
        System.out.println("Find The Distance: " + findTheDistanceValue(arr3, arr4, d1) + "\n");

        int [] arr5 = {2,1,100,3};
        int [] arr6 = {-5,-2,10,-3,7};
        int d2 = 6;
        System.out.println("Find The Distance: " + findTheDistanceValue(arr5, arr6, d2) + "\n");

    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;

        outerLoop:
        for (int num1Arr : arr1) {
            System.out.println("num1Arr: " + num1Arr);

            for (int num2Arr : arr2) {
                System.out.println("    num2Arr: " + num2Arr);

                if (Math.abs(num1Arr - num2Arr) <= d)
                    continue outerLoop;
            }

            ++count;
        }

        return count;
    }
}
