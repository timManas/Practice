package Misc.MaximumScoreAfterSplittingString;



public class MaximumScoreAfterSplittingString {
    public static void main(String [] args) {
        String [] input = {"011101", "00111", "1111", "00"};
        for (String i : input)
            System.out.println("Max Score: " + maxScore(i));
    }

    public static int maxScore(String string) {

        int maxScore = 0;

        // Step1 - Traverse from each index the left and right
        for (int i=0; i < string.length(); i++) {
            String left = string.substring(0, i+1);
            String right = string.substring(i+1, string.length());

            // We do not want any empty Strings.
            if (left.equalsIgnoreCase("") || right.equalsIgnoreCase(""))
                continue;

            System.out.println("Left: " + left + "      Right: " + right);

            // Step2 - Calculate the left score
            int leftScore = left.length() - left.replace("0", "").length();

            // Step3 - Calculate the right score
            int rightScore = right.length() - right.replace("1", "").length();

            // Step4 - Calculate the maxScore
            if (maxScore < leftScore + rightScore) {
                maxScore = leftScore + rightScore;
            }

        }

        return maxScore;
    }
}
