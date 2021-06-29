package Lists.SubstringsSizeThreeDistinctChar;

import java.util.*;

public class SubstringsSizeThreeDistinctChar {
    public static void main (String [] args) {
        String [] input =  {"xyzzaz", "aababcabc"};
        for (String s : input)
            System.out.println("Count Goodstrings: " + countGoodSubstrings(s));

    }

    public static int countGoodSubstrings(String word) {
        int count = 0;

        // Step1 - Create list of 3 letter subString
        List<String> list = new ArrayList<>();
        for (int i=0; i < word.length(); i++) {
            if (i+3 > word.length()) {
                String subSt = word.substring(i, word.length() - 1);

                // if length is smaller  than 3, we ignore. Happens on last elements
                if (subSt.length() < 3)
                    continue;

                list.add(subSt);
            } else {
                list.add(word.substring(i, i+3));
            }
        }
        System.out.println(list);

        // Step2 Check each subString
        Set<Character> set = new TreeSet<>();
        for (String subStr : list) {
            for (int i=0; i<subStr.length();i++) {
                set.add(subStr.charAt(i));
            }

            // Step3 - Increment count if size of set is 3
            if (set.size() == 3)
                count++;

            set.clear();
        }

        return count;
    }
}
