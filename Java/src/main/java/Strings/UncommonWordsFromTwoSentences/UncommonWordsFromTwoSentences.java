package Strings.UncommonWordsFromTwoSentences;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UncommonWordsFromTwoSentences {
    public static void main (String [] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        String [] output = uncommonFromSentences(s1, s2);
        for (String i : output)
            System.out.print(i + "," ) ;

        System.out.println();

        String s3 = "apple apple", s4 = "banana";
        String [] output2 = uncommonFromSentences(s3, s4);
        for (String i : output2)
            System.out.print(i + "," ) ;

    }

    public static String[] uncommonFromSentences(String string1, String string2) {

        // Step1 - Create set to store words
        Set<String> completeSet = new LinkedHashSet<>();    // Stores all the words
        Set<String> uniqueSet = new LinkedHashSet<>();      // Stores ONLY unique words

        // Step2 - Split the words by spaces
        String [] words1 = string1.split(" ");
        String [] words2 = string2.split(" ");

        // Step3 - Fill in the sets for string1
        for (int i=0; i<words1.length; i++) {

            if (completeSet.contains(words1[i])) {
                uniqueSet.remove(words1[i]);
            } else {
                uniqueSet.add(words1[i]);
            }

            completeSet.add(words1[i]);
        }

        // Step3b - Fill in the sets for string2
        for (int i=0; i<words2.length; i++) {
            if (completeSet.contains(words2[i])) {
                uniqueSet.remove(words2[i]);
            } else {
                uniqueSet.add(words2[i]);
            }

            completeSet.add(words2[i]);
        }

        // Step4 - Convert to Array
        String [] uncommonArr = new String[uniqueSet.size()];
        List<String> list = new ArrayList<>(uniqueSet);
        for (int i=0; i < list.size(); i++) {
            uncommonArr[i] = list.get(i);
        }

        return uncommonArr;
    }
}
