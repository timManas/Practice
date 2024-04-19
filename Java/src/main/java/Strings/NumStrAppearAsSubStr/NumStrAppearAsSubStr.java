package Strings.NumStrAppearAsSubStr;

import static java.lang.System.*;

public class NumStrAppearAsSubStr {
    public static void main(String [] args) {
       String [] patterns = {"a","abc","bc","d"};
       String word = "abc";
       System.out.println("Num String: " +  numOfStrings(patterns, word));

    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            System.out.println("pattern: " + pattern);
            if (word.contains(pattern)) count++;
        }

        return count;
    }
}
