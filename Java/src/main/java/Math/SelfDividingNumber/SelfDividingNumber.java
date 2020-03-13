package Math.SelfDividingNumber;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public static void main(String [] args) {
        int left = 1;
        int right = 22;
        ArrayList<Integer> list = (ArrayList<Integer>) selfDividingNumbers(left, right);
        System.out.println(list);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();

        int count = left;
        // Traverse List one at a time
        outer:
        while(count <= right) {
            String str = String.valueOf(count);
            if (str.contains("0")) {
                ++count;
                continue;
            }

            for (int i=0; i < str.length(); i++) {
                char letter = str.charAt(i);
                int number = Integer.parseInt(String.valueOf(letter));
                if (count % number != 0) {
                    ++count;
                    continue outer;
                }
            }

            list.add(count);

            ++count;
        }


        return list;
    }

}

/**
 Solution
 - Run time is O(N) because technically we are goign through each individual letters in one row
 - We traverse through each number
    > For every number, we split it up into each character
    > if the count % number !=0 ... i.e it is NOT divisible by itself, we continue
        > If it is == 0, then we add to the list to be outputted
 */
