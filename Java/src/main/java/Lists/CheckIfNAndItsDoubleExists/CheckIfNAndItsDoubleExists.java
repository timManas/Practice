package Lists.CheckIfNAndItsDoubleExists;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExists {
    public static void main(String [] args) {
        int [][] input = {{-2,0,10,-19,4,6,-8},{10,2,5,3}, {7,1,14,11}, {3,1,7,11}};
        for (int [] i : input) {
            System.out.println("checkIfExists: " + checkIfExist(i) + "\n");
        }
    }

    public static boolean checkIfExist(int[] arr) {

        // Step1 - Sort input
        Arrays.sort(arr);

        // Step2 - Traverse each element one by one and see if we can find its double
        for (int i=0; i < arr.length; i++) {
            int current = arr[i];
            int doubleNum = current * 2;

            // Step3 - Use recursion to find the double
            int x = findElement(arr, doubleNum, 0, arr.length - 1);

            // Make sure the index of the double is not the same as i and not -1
            if (x != -1 && x != i)
                return true;
        }

        return false;
    }

    private static int findElement(int[] arr, int doubleNum, int start, int end) {

        if (start > end)
            return -1;

        int i = (start + end) / 2;
        int mid = arr[i];

        if (mid == doubleNum)
            return i;
        else if (mid < doubleNum)
            return findElement(arr,doubleNum, i + 1, end);

        return findElement(arr, doubleNum, start, i - 1);
    }
}
