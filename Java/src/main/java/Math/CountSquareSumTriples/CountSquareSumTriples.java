package Math.CountSquareSumTriples;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CountSquareSumTriples {
    public static void main(String [] args) {
        int [] input = {5 , 10};
        for (int i : input)
            System.out.println("Count Triples: " + countTriples(i));
    }

    public static int countTriples(int n) {
        int count = 0;

        // Step1 - Create list of all squares from 0 to n+1
        List<Integer> list = new ArrayList<>();
        for (int i=0; i <= n; i++) {
            list.add(i*i);
        }

        // Step2 - Create two pointers which point to the a b
        // The check if c exists
        for (int i=1; i<list.size();i++) {
            for (int j=i+1; j<list.size(); j++) {
                int a = list.get(i);
                int b = list.get(j);

                System.out.println("a: " + a + "    b: " + b);
                int c = a + b;

                // Step3 - Check if list contains c
                if (list.contains(c))
                    count+= 2;
            }
        }

        return count;
    }
}

/**
 Notes
 - This is the ugliest solution ever but it works

 */