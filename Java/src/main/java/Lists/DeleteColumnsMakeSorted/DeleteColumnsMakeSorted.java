package Lists.DeleteColumnsMakeSorted;

public class DeleteColumnsMakeSorted {
    public static void main (String [] args) {
//        String [][] inputs = {{"cba","daf","ghi"}, {"a","b"}, {"zyx","wvu","tsr"}, {"rrjk","furt","guzm"}};
        String [][] inputs = { {"rrjk","furt","guzm"}};
        for (String [] strs : inputs)
            System.out.println("Min Deletion size: " + minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        int minDeletetionSize = 0;

        // Step1 - Loop through each letter
        for (int i=0; i < strs[0].length(); i++) {
            char lastChar = '\n';

            // Step2 - Loop through each word
            for (String word : strs) {
                char currentLetter = word.charAt(i);

                // Step3 - Break loop if current letter is smaller than the last
                if (lastChar > currentLetter) {
                    minDeletetionSize++;
                    break;
                }
                lastChar = currentLetter;
            }
        }

        return minDeletetionSize;
    }
}
