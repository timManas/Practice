package Strings.CheckIfStringIsPrefixArray;

public class CheckIfStringIsPrefixArray {
    public static void main(String [] args) {
        String s = "iloveleetcode";
        String [] words = {"i","love","leetcode","apples"};
        System.out.println("IsPrefixString: " + isPrefixString(s, words));

        String s1 = "iloveleetcode";
        String [] words1 = {"apples","i","love","leetcode"};
        System.out.println("IsPrefixString: " + isPrefixString(s1, words1));

        String s2 = "a";
        String [] words2 = {"aa", "aaa", "banana"};
        System.out.println("IsPrefixString: " + isPrefixString(s2, words2));

        String s3 = "z";
        String [] words3 = {"z"};
        System.out.println("IsPrefixString: " + isPrefixString(s3, words3));
    }

    public static boolean isPrefixString(String target, String[] words) {

        // Step1 - Create strinbuild to check the prefix size
        StringBuilder targetStrBuilder = new StringBuilder(target);

        // Step2 - Traverse words array
        for (int i=0; i<words.length; i++) {
            String word = words[i];

            // Check if strinbuilder is empty. Means we finally matched all the words and can stop loop
            if (targetStrBuilder.length() == 0)
                return true;

            // Check if the word is smaller than the target
            if (word.length() > targetStrBuilder.length())
                return false;

            String subString = targetStrBuilder.substring(0, word.length());

            // Return false if doesent match
            if (!word.equalsIgnoreCase(subString))
                return false;

            // Delete the substring from the strinbuilder if matches
            targetStrBuilder.delete(0, word.length());
        }


        return targetStrBuilder.length() <= 0;
    }
}
