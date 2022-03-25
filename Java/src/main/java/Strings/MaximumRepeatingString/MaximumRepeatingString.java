package Strings.MaximumRepeatingString;

public class MaximumRepeatingString {
    public static void main(String [] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println("Max Repeating: " + maxRepeating(sequence, word));

        String sequence1 = "ababc";
        String word1 = "ba";
        System.out.println("Max Repeating: " + maxRepeating(sequence1, word1));

        String sequence2 = "ababc";
        String word2 = "ac";
        System.out.println("Max Repeating: " + maxRepeating(sequence2, word2));
    }

    public static int maxRepeating(String sequence, String word) {
        // Step1 - Define the output value
        int max = 0;

        // Step2 - Create stringbuilder to constantly increment word ..ex: word= ab, then sb=abab on the second loop
        StringBuilder sb = new StringBuilder(word);
        while (sb.length() <= sequence.length()) {

            // If sequence does not contain the sb, then we end it here
            if (sequence.indexOf(sb.toString()) == -1) {
                break;
            }
            sb.append(word);
            max++;
        }

        return max;
    }
}
