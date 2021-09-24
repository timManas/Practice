package Lists.RankTransformArray;

import java.util.*;

public class RankTransformArray {
    public static void main(String [] args) {
        int [] arr = {40,10,20,30};
        int [] output = arrayRankTransform(arr);
        for (int i : output)
            System.out.println(i);

        System.out.println();

        int [] arr2 = {100,100,100};
        int [] output2 = arrayRankTransform(arr2);
        for (int i : output2)
            System.out.println(i);

        System.out.println();

        int [] arr3 = {37,12,28,9,100,56,80,5,12};
        int [] output3 = arrayRankTransform(arr3);
        for (int i : output3)
            System.out.println(i);


    }

    public static int[] arrayRankTransform(int[] arr) {

        // Step1 - Create output
        int [] output = new int [arr.length];

        // Step2 - Create set and sort using treeset
        Set<Integer> set = new TreeSet<>();
        for (int i=0; i < arr.length; i++)
            set.add(arr[i]);

        // Step3 - Create output Array
        List<Integer> list = new ArrayList<>(set);
        for (int i=0; i < arr.length; i++) {
            output[i] = Collections.binarySearch(list, arr[i]) + 1;
        }
        return output;
    }
}
