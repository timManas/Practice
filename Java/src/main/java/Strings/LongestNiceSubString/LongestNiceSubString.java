package Strings.LongestNiceSubString;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LongestNiceSubString {
    public static void main(String [] args) {
        String [] inputs = {"YazaAay", "dDzeE", "Bb", "c", "qlERNCNVvWLOrrkAaDcXnlaDQxNEneRXQMKnrNN"};
        for (String s : inputs)
            System.out.println("Longest Nice Substring: " + longestNiceSubstring(s) + "\n");

    }

    public static String longestNiceSubstring(String string) {

        // Step1 - Fetch the Nice SubString
        String result = fetchNiceSubString(string);

        // Step2 - Split the results into Array
        String [] resultArr = result.split(" ");


        // Step3 - Find the largest and earliest occuring Substring
        int earliestOccurenceIndex = 100;
        String longestNiceSubString = "";
        for (int i=0; i < resultArr.length;i++) {

            // Step3b - Continue if we encounter a ""
            if (resultArr[i].equalsIgnoreCase(""))
                continue;

            // Step4 - Find the largest and earliest occurence
            if (longestNiceSubString.length() == resultArr[i].length()) {           // If same size ...check earliest occurence
                if (earliestOccurenceIndex > i) {
                    longestNiceSubString = resultArr[i];
                    earliestOccurenceIndex = i;
                }
            } else if (longestNiceSubString.length() < resultArr[i].length()) {     // If bigger, set new target
                longestNiceSubString = resultArr[i];
                earliestOccurenceIndex = i;
            }
        }

        return longestNiceSubString;
    }

    public static String fetchNiceSubString(String string) {
        System.out.println("string: " + string);

        // Step1 - BaseCase ...if we encounter
        if (string.equalsIgnoreCase("") || string.length() == 1)
            return "";

        // Step2 - Find the characters which are not nice by using two sets
        // Groups the characters by upper and lowercase
        // Note: When we encounter a lower character, we convert it to UPPER CASE so we can find the difference
        Set<Character> lowerSet = new TreeSet<>();
        Set<Character> upperSet = new TreeSet<>();
        for (int i=0; i<string.length(); i++) {
            char letter = string.charAt(i);

           if (Character.isUpperCase(letter)) {     // Upper Case
                upperSet.add(letter);
           } else if (Character.isLowerCase(letter)) {            // Lower case
                lowerSet.add(Character.toUpperCase(letter));
           }
        }

        System.out.println("lowerSet: " + lowerSet + "  upperSet: " + upperSet);

        // Step3 - Find the difference between the two sets
        Set<Character> mainSet;
        if (upperSet.size() > lowerSet.size()) {
            upperSet.removeAll(lowerSet);
            mainSet = upperSet;

        } else {
            lowerSet.removeAll(upperSet);
            mainSet = lowerSet;
        }

        // Step4 - If we encounter a set which is zero ...MEANS we have a NICE SubString
        if (mainSet.size() == 0)
            return string;

        // Step5 - If not, we remove all the characters which are difference
        // Replace all characters
        List<Character> uniqueList = new ArrayList<>(mainSet);
        String replaced = string;
        for (char letter : uniqueList) {
            replaced = replaced.replace(Character.toLowerCase(letter), ' ');
            replaced = replaced.replace(Character.toUpperCase(letter), ' ');
        }

        // Step6 - Split string to find the SubString
        String [] subStrings = replaced.split(" ");

        // Step7 - Use recursion on the smaller substrings
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < subStrings.length; i++) {
            sb.append(fetchNiceSubString(subStrings[i]) + ' ');
        }

        return sb.toString();
    }
}


/**
 Note
 - Holy fuck this was hard ...but this is my solution !!!!
 - Trick is to use recursion to recursively remove the not nice characters

 Solution
 1. Use recursion to find the note nice characters
    - We use a two sets and do a "removeAll" to find the difference
 2. Once we have the difference, we convert that character to a " "
 3. Split the string up based on those differences
 4. Use Recursion on the smaller substrings and results gets appended into stringbuilder

 */