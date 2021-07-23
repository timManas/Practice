package Strings.IndexPairsOfStrings;

import java.util.Set;
import java.util.TreeSet;

public class IndexPairsOfStrings {
    public static void main(String [] args) {
        String text = "thestoryofleetcodeandme";
        String [] words = {"story","fleet","leetcode"};
        int[][] output = indexPairs(text, words);

        String text2 = "thestoryofleetcodeandme";
        String [] words2 = {"story","fleet","leetcode"};
        int[][] output2 = indexPairs(text2, words2);


    }

    public static int [][] indexPairs(String text, String[] words) {
        Set<String> set = new TreeSet<>();

        for (String word : words) {

            for (int i=0; i<text.length();i++) {
                char letter = text.charAt(i);
            }

        }
    }
}
