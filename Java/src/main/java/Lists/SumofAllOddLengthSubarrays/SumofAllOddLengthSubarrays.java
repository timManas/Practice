package Lists.SumofAllOddLengthSubarrays;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SumofAllOddLengthSubarrays {
    public static void main(String [] args) {
        int [] arr = {1,4,2,5,3};
        System.out.println(("Sum of Odd Length SubArrays: " + sumOddLengthSubarrays(arr)));
    }

    public static int sumOddLengthSubarrays(int[] arr) {

        // Step1 - Create variable
        int total = 0;          // Describes the total
        int subArrLength = 1;   // Describes the increments of the SubArray size. Ex: 1,3,5,7,9 ..etc

        // Step2 - Traverse from 1,3,5,7 .. until the arr.length
        while(subArrLength <= arr.length) {
            int subTotal = 0;
            Deque<Integer> queue = new LinkedList<>();

            // Step3 - Traverse the input array one by one
            int i=0;
            while(i < arr.length) {

                // Step4 - Add to queue if SubArray size is smaller than target odd SubArray length
                if (queue.size() < subArrLength) { // Is smaller. Just add
                    queue.addLast(arr[i]);
                    subTotal += arr[i];

                } else {
                    int first = queue.removeFirst();
                    subTotal -= first;

                    queue.addLast(arr[i]);
                    subTotal += arr[i];
                }

                // Step5 - Check if SubArrayLength is reached. Add SubTotal amount to total
                if (queue.size() == subArrLength) {
                    System.out.println("arr[i]: " + arr[i] + "      queue: " + queue + "    SubTotal: " + subTotal);
                    total += subTotal;
                }

                i++;
            }

            // Increase Increment by 2 to traverse Odd
            System.out.println();
            subArrLength += 2;
        }

        return total;
    }
}

/**

 Notes
 - This was suppose to be "EASY" but Hell nahhh B

 Solution:
 1. Create look which increments from 1,3,5,7 ..until it reaches the length of the input array
 2. Traverse the input array one by one
 3. Add Or Remove elements in the SubArray one by one
 4. If SubArray reached desired length, we calculate the SubTotal and add that to the Total amount
 5. Repeat until the Subarray length <= Input Array

 */
