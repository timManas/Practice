package Math.CountLargestGroup;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountLargestGroup {
    public static void main(String [] args) {
        int [] input = {13, 2, 15, 6, 24};
        for (int i : input)
            System.out.println("Count Largest Group: " + countLargestGroup(i));
    }

    public static int countLargestGroup(int n) {

        Map<Integer, Set<Integer>> map = new TreeMap();

        // Step1 - Populate map with the groups of integers which share the same sum
        // key = sum / value = Set
        for (int i=1; i <= n; i++) {

            // Step2 - Convert digit to String
            String digit = String.valueOf(i);
            int sum = 0;

            // Step3 - Calculate the sum by adding each digit
            for (int j=0; j < digit.length(); j++) {
                sum += Integer.parseInt(String.valueOf(digit.charAt(j)));
            }

            // Step4 - Add to set
            Set<Integer> set = new TreeSet<>();
            if (map.containsKey(sum)) {
                set = map.get(sum);
            }

            set.add(i);
            map.put(sum, set);
        }

        System.out.println(map);

        int count = 0;
        int largestSize = 0;

        // Step5 - Find the count of the largestSize
        for (Map.Entry<Integer, Set<Integer>> mapEntry : map.entrySet()) {
            Set<Integer> set = mapEntry.getValue();
            if (set.size() > largestSize) {
                largestSize = set.size();
                count = 1;
            } else if (set.size() == largestSize) {
                count++;
            }
        }


        return count;
    }
}
