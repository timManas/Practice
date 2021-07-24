package Strings.IndexPairsOfStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndexPairsOfStrings {
    public static void main(String [] args) {
        String text = "thestoryofleetcodeandme";
        String [] words = {"story","fleet","leetcode"};
        int[][] output = indexPairs(text, words);

        String text2 = "ababa";
        String [] words2 = {"aba","ab"};
        int[][] output2 = indexPairs(text2, words2);


    }

    public static int [][] indexPairs(String text, String[] words) {
        // Step1 - Create a TreeSet which stores the coordinates in ordered form
        Set<String> set = new TreeSet<>();

        // Step2 - Search for substrings in the main String
        // Search for each word
        for (String word : words) {
            System.out.println("Word: " + word);

            // Step3 - Search letter by letter
            for (int i=0; i<text.length();i++) {

                int endIndex  = i + word.length() > text.length() ? text.length() : i+word.length();  // Find the last index
                String subString = text.substring(i, endIndex);
                System.out.println("SubString: " + subString);

                // Step4 - Check if substring found
                if (subString.equalsIgnoreCase(word)) {
                    String start = i < 10 ? "0" + i : String.valueOf(i);
                    String end = endIndex < 10 ? "0" + (endIndex-1)  : String.valueOf(endIndex - 1 );
                    String coordinates = start + "|" + end;
                    set.add(coordinates);
                }
            }
        }
        System.out.println("Set: " + set);

        // Step5 - Convert Set to Array
        int [][] output = new int [set.size()][2];
        List<String> list = new ArrayList<>(set);
        for (int i=0; i<list.size();i++) {
            String indexPairs = list.get(i);
            String [] indexArr = indexPairs.split("\\|");
            output[i][0] = Integer.valueOf(indexArr[0]);
            output[i][1] = Integer.valueOf(indexArr[1]);
        }


        return output;
    }
}
