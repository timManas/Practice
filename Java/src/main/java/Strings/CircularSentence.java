package Strings;

public class CircularSentence {
    public static void main(String [] args) {
        String [] input = {"leetcode exercises sound delightful", "eetcode", "Leetcode is cool"};
        for (String i : input)
            System.out.println("isCircular: " + isCircularSentence(i) + "\n");
    }

    public static boolean isCircularSentence(String sentence) {

        // Create Arr to store words
        String [] sentenceArr = sentence.split(" ");

        // Check if only one words ?
        if (sentenceArr.length == 1) {
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        }

        // Traverse from first to last
        for (int i=0; i<sentenceArr.length-1; i++) {
            String current = sentenceArr[i];
            String next = sentenceArr[i+1];
            System.out.println("Current: " + current + "    next: " + next);

            if (current.charAt(current.length() - 1) != next.charAt(0))
                return false;
        }

        // Check the first and last words connect
        if (sentenceArr[0].charAt(0) != sentenceArr[sentenceArr.length - 1].charAt(sentenceArr[sentenceArr.length - 1].length() - 1))
            return false;


        return true;
    }
}
