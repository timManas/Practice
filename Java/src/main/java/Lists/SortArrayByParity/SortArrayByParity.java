package Lists.SortArrayByParity;

import java.util.ArrayList;

public class SortArrayByParity {

    public static void main(String [] args) {
        int [] input = {3,1,2,4};
        int [] output = sortArrayByParity(input);
        for (int i : output)
            System.out.println(i);
    }

    public static int[] sortArrayByParity(int[] inputArr) {
        int [] output = naiveSolution(inputArr);


        return output;
    }

    private static int[] naiveSolution(int[] inputArr) {
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();

        for (int i : inputArr) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        System.out.println("Odd: " + oddList);
        System.out.println("Even: " + evenList);

        evenList.addAll(oddList);
        System.out.println(evenList);

        for (int i=0; i < inputArr.length; i++) {
            inputArr[i] = evenList.get(i);
        }

        return inputArr;
    }
}
