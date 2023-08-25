package Math.CountSortedVowels;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountSortedVowels {

    public static void main(String [] args) {
        int [] input = {1,2,33};
        for (int i : input)
            System.out.println("count vol String: " + countVowelStrings(i) + "\n");
    }

    public static int countVowelStrings(int n) {
        int count = 0;

        if (n <= 1) return 5;


        int [] d = new int[n];
        d[0] = 0;
        d[1] = 5;

        Map<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("e", 1);
        map.put("i", 1);
        map.put("o", 1);
        map.put("u", 1);

        for (int i=2; i<=n; i++) {
            System.out.println("i: " + i);

            int total = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {

            }


            System.out.println("    arrays: " + Arrays.toString(d));

        }



        return count;
    }
}
