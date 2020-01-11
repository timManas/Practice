package Strings.LongestCommonPrefix;

public class LongestCommonPrefix {

    public static void main (String [] args) {
//        String [] input = {"flower","flow","flight"};
//        String [] input = {"dog","racecar","car"};
        String [] input = {"c", "c"};

        System.out.println("Longest Comm Prefix: " + longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        String lcp = "";
        StringBuilder sb = new StringBuilder();

        if (strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        int index = 0;
        boolean isWordCompleted = false;
        while (!isWordCompleted) {

            // Place all letters into charArray for comparison
            boolean lettersMatch = false;
            char [] charArray = new char[strs.length];
            for (int i=0; i < strs.length; i++) {
                System.out.println("Index: " + index + "    String: " + strs[i]);

                if (index >= strs[i].length()) {
                    isWordCompleted = true;
                    break;
                }
                charArray[i] = strs[i].charAt(index);
            }

            // Check if all characters all the same
            char prevLetter = charArray[0];
            for (char letter : charArray) {
                if (letter != prevLetter || letter == 0) {
                    lettersMatch =  false;
                    break;
                }
                lettersMatch = true;
            }

            if (lettersMatch) {
                sb.append(prevLetter);
            } else {
                System.out.println(sb.toString());
                return sb.toString();
            }

            index++;
        }

        lcp = sb.toString();


        return lcp;
    }


}
