package Strings.MergeStringAlternatively;

public class MergeStringAlternatively {
    public static void main (String [] args) {
//        String word1 = "abc", word2 = "pqr";
        String word1 = "ab", word2 = "pqrs";
        System.out.println("Merged Alternately: " + mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int length = word1.length() < word2.length() ? word2.length() : word1.length();

        int i = 0;
        while (i < length) {
            try {
                char word1Char = word1.charAt(i);
                sb.append(word1Char);
            } catch (Exception e) {
            }

            try {
                char word2Char = word2.charAt(i);
                sb.append(word2Char);
            } catch (Exception e) {
            }
            i++;
        }

        return  sb.toString();
    }
}
