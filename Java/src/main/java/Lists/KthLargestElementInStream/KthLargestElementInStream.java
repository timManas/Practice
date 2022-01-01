package Lists.KthLargestElementInStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargestElementInStream {
    public static void main(String [] args) {

        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));   // return 4
        System.out.println(kthLargest.add(5));   // return 5
        System.out.println(kthLargest.add(10));  // return 5
        System.out.println(kthLargest.add(9));   // return 8
        System.out.println(kthLargest.add(4));   // return 8

        KthLargestB kthLargestB = new KthLargestB(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargestB.add(3));   // return 4
        System.out.println(kthLargestB.add(5));   // return 5
        System.out.println(kthLargestB.add(10));  // return 5
        System.out.println(kthLargestB.add(9));   // return 8
        System.out.println(kthLargestB.add(4));   // return 8
    }

    // Use Heap
    static class KthLargest {

        int k;
        List<Integer> list;

        public KthLargest(int k, int[] nums) {

        }

        public int add(int val) {
            return 0;
        }
    }

    // Use Brute Force Method
    static class KthLargestB {

        int k;
        List<Integer> list;

        public KthLargestB(int k, int[] nums) {

            // Step1 - initialize properties
            this.k = k;
            this.list = new ArrayList<>();
            for (int i : nums) list.add(i);
            // Step2 - Sort list
            Collections.sort(list);
            System.out.println("k: " + k);
            System.out.println("Starting List: " + list);
        }

        public int add(int val) {
            list.add(val);
            Collections.sort(list);
            System.out.println("List: " + list);
            return list.get(list.size() - k);
        }
    }
}
