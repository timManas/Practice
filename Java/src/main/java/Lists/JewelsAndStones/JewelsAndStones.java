package Lists.JewelsAndStones;

import java.util.regex.Pattern;

public class JewelsAndStones {

    public static void main(String [] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println("NumJewelsInStone: " + numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;

        for (int i=0; i < S.length(); i++) {
            char letter = S.charAt(i);
            if (J.contains(String.valueOf(letter))) {
                ++count;
            }
        }

        return count;
    }

}
