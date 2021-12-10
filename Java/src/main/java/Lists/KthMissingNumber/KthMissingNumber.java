package Lists.KthMissingNumber;

import java.util.ArrayList;
import java.util.List;

public class KthMissingNumber {
    public static void main(String [] args) {
        int [] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println("Find Kth positive number: " + findKthPositive(arr, k));

        int [] arr1 = {1,2,3,4};
        int k1 = 2;
        System.out.println("Find Kth positive number: " + findKthPositive(arr1, k1));

        int [] arr2 = {1,2};
        int k2 = 2;
        System.out.println("Find Kth positive number: " + findKthPositive(arr2, k2));


    }

    public static  int findKthPositive(int[] arr, int k) {
        int kthPositiveNum = 0;
        List<Integer> missingNumList = new ArrayList<>();

        int arrIndex = 0;
        for (int i=1; i <= arr[arr.length -1]; i++) {
            System.out.println("i: " + i);

            if (i == arr[arrIndex]) {
                ++arrIndex;
                continue;
            }

            missingNumList.add(i);
        }

        System.out.println("MissingNum List: " + missingNumList);
        if (!missingNumList.isEmpty()) {
            return missingNumList.get(k-1);
        }

        int counter = 0;
        while (counter < k) {
            kthPositiveNum = arr[arrIndex-1] + 1;
            ++counter;
        }

        return kthPositiveNum + 1;
    }
}
