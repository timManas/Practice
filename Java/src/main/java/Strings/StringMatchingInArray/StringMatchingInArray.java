package Strings.StringMatchingInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringMatchingInArray {
    public static void main(String [] args) {
        String [][] input = {{"mass","as","hero","superhero"}, {"leetcode","et","code"}, {"blue","green","bu"}};
        for (String [] words : input)
            System.out.println("String Matching: " + stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {

        // Step1 - Create the list
        List<String> outputList = new ArrayList<>();            // Store all the SubString which are present in word array
        List<String> unMatchedWordList = new ArrayList<>();     // Store all the unmatched words

        // Step2 - Sort Array by String Length
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string1.length() - string2.length();
            }
        };
        Arrays.sort(words, comparator);


        // Step3 - Traverse the sorted list
        for (int i=words.length-1; i >= 0; i--) {
            String currentWord = words[i];
            System.out.println("Current Word: " + currentWord);

            // Step4 - If Empty, we add to wordList
            if (unMatchedWordList.isEmpty()) {
                unMatchedWordList.add(currentWord);
                continue;
            }

            // Step5 - Check all the unmatchedWord List
            for (int j=0; j < unMatchedWordList.size(); j++) {
                if (unMatchedWordList.get(j).contains(currentWord)) {
                    outputList.add(currentWord);
                    break;
                }
            }
            unMatchedWordList.add(currentWord);
        }
        return outputList;
    }
}
