package Strings.SmallestPanlindromicReArrangement;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SmallestPanlindromicReArrangement {
    public static void main(String [] args) {
        String [] input = {"z", "babab", "daccad", "daccadd", "yey", "nhdhn"};
        for (String val : input)
            System.out.println("SmallestPal: " + smallestPalindrome(val) + "\n");
    }

    private static String smallestPalindrome(String input) {
        String [] charArr = input.split("");
        Arrays.sort(charArr);
        System.out.println("CharrArray: " + Arrays.toString(charArr) );

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();

        Map<String, Integer> map = new TreeMap<>();


        for (int i=0; i<charArr.length; i++) {
            String current = charArr[i];
            int count = 1;
            if (map.containsKey(current))
                count = map.get(current) + 1;
            map.put(current, count);
        }
        System.out.println("map: " + map);

        // Find Odd Count
        String oddStr = null;
        int oddCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String str = entry.getKey();
            int count = entry.getValue();
            if (count % 2 != 0) {
                oddStr = str;
                oddCount = count;
                break;
            }
        }
        System.out.println("Odd One: " + oddStr + "     oddCount: " + oddCount);

        // Start with OddCount
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String str = entry.getKey();
            int count = entry.getValue();

            if (str.equalsIgnoreCase(oddStr)) {
                for (int i=0; i<count; i++)
                    sb.append(str);
                continue;
            }

            for (int i=0; i<count; i+=2) {
                firstHalf.append(str);
                secondHalf.append(str);
            }
        }

        System.out.println("firstHalf: " + firstHalf + "    secondHalf: " + secondHalf.reverse());
        String output = firstHalf + sb.toString() + secondHalf;



        return output;
    }



}
